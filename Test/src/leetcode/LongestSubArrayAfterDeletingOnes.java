package leetcode;

import java.util.ArrayList;

public class LongestSubArrayAfterDeletingOnes {
	
	   public static int longestSubarray(int[] nums) {
	        
	        ArrayList<Integer> al = new ArrayList<>();
	        int sum = 0;
	        for (int i = 0 ; i < nums.length ; i++) {
	            if (nums[i] == 1) {
	                sum += 1;
	            } else {
	            	if (sum != 0) {
	                    al.add(sum);
	            		sum = 0;
	            		al.add(0);
	            	} else {
		                al.add(0);
	            	}
	            }
	        }
	        al.add(sum);
	        if (!al.contains(0)) {
	            return sum-1;
	        }
	        if (al.size() == 2) 
	            return Math.max(al.get(0),al.get(1));
	        
	        int maxx = 0;
	        int add = 0;
	        /*for (int i = 0 ; i < al.size()-2;i++) {
	            
	            if (al.get(i) != 0 && al.get(i+1) == 0 && al.get(i+2) != 0) {
	                add = al.get(i)+al.get(i+2);
	                maxx = Math.max(add,maxx);
	            }            
	            
	        }*/
	        
	        int key = 0;
	        for (int i = 0 ; i < al.size() ; i++) {
	            
	            if (al.get(i) != 0) {
	                add += al.get(i);
	                key = i;
	            } else if (add != 0 && al.get(i) == 0) {
	                
	                if (i+1 < al.size() && al.get(i+1) != 0) {
	                    add += al.get(i+1);
	                    maxx= Math.max(add,maxx);
	                    add = add - al.get(key);
	                } else {
	                    maxx = Math.max(add,maxx);
	                }
	                
	            }
	            
	        }
	        
	        return maxx;
	    }

	
	public static void main (String[] ar) {
		
//		int[] arr = {1,1,0,1};
		int[] arr = {0,1,1,1,0,1,1,0,1};
//		int[] arr = {1,0,0,0,0};
		System.out.println(longestSubarray(arr));
	}

}
