package leetcode;

import java.util.TreeMap;

public class ClosestPerson {
	//Note : can be optimized to single pass soltn
	
	//with treemap
    public int maxDistToClosest(int[] seats) {
        
        TreeMap<Integer,Integer> zeros = new TreeMap<>();
        int c = 0;
        for (int i : seats) {
            if (i == 1)
                zeros.put(c,i);
            c++;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < seats.length ; i++) {
            
            if (seats[i] == 0) {
            	Integer near = zeros.floorKey(i);
                Integer far = zeros.ceilingKey(i);
                if (near == null && far != null) {
                    max = Math.max(max,far-i);
                } else if (near!= null && far == null) {
                    max = Math.max(max, i - near);
                } else {
                    int temp = Math.min(i-near , far-i);
                    max = Math.max(max,temp);
                }
            }
            
        } 
        
        return max;
    }

	public static void main(String[] args) {
		
		ClosestPerson cp = new ClosestPerson();
		int[] arr = {1,0,0,0,0,0,0,0,0,1,0,1};
		System.out.println(cp.maxDistToClosest(arr));
	}

}
