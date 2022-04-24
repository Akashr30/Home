package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
	
	 public static int[] topKFrequent(int[] nums, int k) {
	        
	        if (k == nums.length) 
	            return nums;
	        
	        Map<Integer,Integer> map = new HashMap<>();
	        int[] arr = new int[nums.length];
	        int c = 0;
	        for (int i : nums) {
	            map.put(i,map.getOrDefault(i,0)+1);
	        }
	        
	        List<Map.Entry<Integer, Integer>> tempMap = new LinkedList<>(map.entrySet());
	        
//	         Collections.sort(tempMap, new Comparator<Map.Entry<Integer,Integer>>(){
//	            
//	             public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
//	                 return o2.getValue().compareTo(o1.getValue());
//	             }
//	         });
	        
	        Collections.sort(tempMap,(o1, o2) -> o2.getValue().compareTo(o1.getValue()));
	        
//	         for (Map.Entry<Integer,Integer> entry : ((Map<Integer, Integer>) tempMap).entrySet()) {
	        	 for (Map.Entry<Integer,Integer> entry : tempMap) {
	             if (c == k)
	                 break;
	             
	             arr[c++] = entry.getKey();
	         }
	         
	        return Arrays.copyOfRange(arr,0,c);
	        
	    }
	 
	 public static void main(String[] ar) {
		 
		 int[] arr = {1,1,1,2,2,3};
		 int k = 2;
		 int[] a = topKFrequent(arr,k);
		 for (int x :a) {
			 System.out.print(x);
		 }
	 }
}
