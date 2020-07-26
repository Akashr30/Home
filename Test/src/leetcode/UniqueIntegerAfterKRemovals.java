package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueIntegerAfterKRemovals {
	/*
public static int findLeastNumOfUniqueInts(int[] arr, int k) {  
	
	if(k >= arr.length) return 0;
    Map<Integer, Integer> m = new HashMap<>();
    for(int v : arr) 
    	m.put(v, m.getOrDefault(v, 0)+1);
    
    List<Integer> vals = new ArrayList<>(m.values());
    Collections.sort(vals);
    int res = vals.size(), id = 0;
    while(k > 0) {
      if(vals.get(id) > k) return res;
      k -= vals.get(id);
      id++;
        res--;
    }
    return res;
}
*/
	
	 public static int findLeastNumOfUniqueInts(int[] arr, int k) {
	        
		    /*if(k >= arr.length) return 0;
		    Map<Integer, Integer> m = new HashMap<>();
		    for(int v : arr) 
		    	m.put(v, m.getOrDefault(v, 0)+1);
		    
		    List<Integer> vals = new ArrayList<>(m.values());
		    Collections.sort(vals);
		    int res = vals.size(), id = 0;
		    while(k > 0) {
		      if(vals.get(id) > k) return res;
		      k -= vals.get(id);
		      id++;
		        res--;
		    }
		    return res; */
		        
		        
		     
			        /*Arrays.sort(arr);
			        int[] cts = uniqcountOnly(arr);
			        Arrays.sort(cts);
			        int ret = 0;
			        for(int i = 0;i < cts.length;i++){
			        	int d = Math.min(k, cts[i]);
			        	cts[i] -= d;
			        	k -= d;
			        	if(cts[i] > 0)ret++;
			        }
			        return ret;*/
		 
		   if (k  > arr.length) 
	            return -1;
	        
	        Map<Integer,Integer> set = new HashMap<>();
	        List<Integer> al = new ArrayList<>();
	        
	        for (int i = 0 ; i < arr.length ; i++) {
	            
	            if (set.containsKey(arr[i])) {
	                int count = set.get(arr[i])+1;
	                set.put(arr[i],count);
	                continue;
	            }
	            
	            if (al.contains(new Integer(arr[i]))) {
	                set.put(arr[i],1);
	                al.remove(new Integer(arr[i]));
	            } else {
	                al.add(arr[i]);
	            }
	            
	        }
	        int kCounts = k;
	        
	        for (int i = k-1 ; al.size() > 0 && i >= 0 ;  i--) {
	            al.remove(0);
	            kCounts--;
	        }
	        
	        if (kCounts != 0) {
	            Iterator<Map.Entry<Integer, Integer>> itr = set.entrySet().iterator();
	            
	           while(itr.next() != null)  {
	               
	               Map.Entry<Integer, Integer> entry = itr.next(); 
	                
	               if (entry.getValue() > kCounts)
	                   break;
	                else {
	                    kCounts -= entry.getValue();
	                    Iterator<Map.Entry<Integer, Integer>> tempentry = (Iterator<Entry<Integer, Integer>>) itr.next();
	                    set.remove(entry.getKey());
	                    itr = tempentry;
	                }   
	               
	            }
	        }
	        
	        return set.size()+al.size();
			    }
			    
				/*public static int[] uniqcountOnly(int[] a)
				{
					int n = a.length;
					int p = 0;
					int[] b = new int[n];
					int prev = Integer.MIN_VALUE;
					for(int i = 0;i < n;i++){
						if(i == 0 || a[i] != prev)p++;
						b[p-1]++;
						prev = a[i];
					}
					return Arrays.copyOf(b, p);
				}*/
		        
		    
	public static void main(String[] ar) {
		
		int[] arr = {4,4,4,3,1,1,3,3,2,2};
		int k = 3;
		System.out.println(findLeastNumOfUniqueInts(arr,k));
	}
}
