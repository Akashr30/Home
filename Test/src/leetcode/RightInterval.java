package leetcode;

import java.util.Map;
import java.util.TreeMap;

public class RightInterval {
	
	 /*public static int[] findRightInterval(int[][] intervals) {
		 
		   if (intervals.length == 1)
            return new int[]{-1};
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for (int i = 0 ; i < intervals.length ; i++) {
            map.put(intervals[i][0],i);
        }
        
        int[] arr = new int[intervals.length];
        
        for (int i = 0 ; i < intervals.length ; i++) {
            Integer key = binary(intervals[i][1],intervals);
            arr[i] = key == null ? -1 : map.get(key);
        }
        
        return arr;
	 }	  
	 
	 private static int binary(int n,int[][] intervals) {
	        
	        int i = 0 , j = intervals.length;
	        
	        while (i < j) {
	            
	            int mid = (i+j)/2;
	            
	            if (mid > n) {
	                j = mid-1;
	            } else {
	                i = mid+1;
	            }
	            
	            if (intervals[mid][0] == n)
	                return intervals[mid][1];
	        }
	        
	        return j+1 < intervals.length ? intervals[j+1][1] : -1;
	    }*/
		 
		 /*HashMap<int[][],Integer> res = new HashMap<>();
		 int[] arr = new int[intervals.length];
		 HashMap<int[][],Integer> res2 = new HashMap<>();
		 HashMap<Integer,int[][]> res3 = new HashMap<>();
		 Arrays.fill(arr,-1);
		 
		 for (int i = 0 ; i < intervals.length ; i++) {
			 res.put(new int[][]{{intervals[i][0]},{intervals [i][1]}},i);
		 }
		 
		 Arrays.sort(intervals,new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[1]);
			}
		 });
		 
	        int c = 0;
	        for (int i = 0 ; i < intervals.length ; i++) {
	        	res2.put(new int[][] {{intervals[i][0]},{intervals[i][1]}},i);
	        	res3.put(i,new int[][] {{intervals[i][0]},{intervals[i][1]}});
	        }
	        
	        for (Map.Entry<int[][],Integer> map : res.entrySet()) {
	        	
	        	int[][] key = map.getKey();
        		int temp = res2.get(key)+1;
        		if (temp <= res.size()-1) {
        			int[][] z = res3.get(temp);
        			int ans = res.get(z);
        			arr[c] = ans;
        			c++;
        		}
	        }
	        return arr;
	    }*/
	

    static int[][] asd;
    public static int[] findRightInterval(int[][] intervals) {
        
        if (intervals.length == 1)
            return new int[]{-1};
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for (int i = 0 ; i < intervals.length ; i++) {
            map.put(intervals[i][0],i);
        }
        
        asd  = new int[intervals.length][2];
        int c = 0;
        for (Map.Entry<Integer,Integer> x : map.entrySet()) {
            asd[c][0] = x.getKey();
            asd[c++][1] = x.getValue();
        }
        
        int[] arr = new int[intervals.length];
        
        for (int i = 0 ; i < intervals.length ; i++) {
            int key1 = binary(intervals[i][1],asd);
            /*Integer key = map.get(key1);
            arr[i] = key == null ? -1 : key;*/
            arr[i] = key1;
        }
        
        return arr;
    }
    
    private static int binary(int n,int[][] intervals) {
        
        int i = 0 , j = intervals.length-1;
        
        while (i <= j) {
            
            int mid = (i+j)/2;
            
            if (intervals[mid][0] > n) {
                j = mid-1;
            } else {
                i = mid+1;
            }
            
            if (intervals[mid][0] == n)
                return intervals[mid][1];
        }
        
        return j+1 < intervals.length ? intervals[j+1][1] : -1;
    }

	public static void main(String[] args) {

		int[][] arr = 
				{ {3,4}, {5,8},{2,3}, {1,2} };
		findRightInterval(arr);
	}

}
