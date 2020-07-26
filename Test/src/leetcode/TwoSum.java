package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	 public static int[] twoSum(int[] nums, int target) {
	        
	        /*Arrays.sort(nums);
	        int i = 0 , r = nums.length-1;*/
	        int[] ar = new int[2];
	        Map<Integer,Integer>set = new HashMap<>();
	        int c = 0;
	        for (int x : nums) {
	            if (set.containsKey(x)) {
	                ar[0] = set.get(x);
	                ar[1] = c;
	                return ar;
	            } else {
	                set.put(target-x,c);
	            }
	            c++;
	        }
	    
	        return ar;
	        
	    }

	 public static void main(String[] ar) {
		 int[] a = {3,2,4};
		 int k = 6;
		 twoSum(a,k);
	 }
}
