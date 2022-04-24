package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubArrayOfProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        int st = 0;
        int end = 0;
        int sum = 1;
        
        while (st < nums.length && st <= end) {
            
            if (end < nums.length) {
                if (nums[end] < k)
                    res.add(1);

                sum *= nums[end];

                while (sum >= k) {
                    sum  /= nums[st++];
                } 
                if (end-st >= 1)
                	res.add(end-st);
                end++;
            } else {
            	sum  /= nums[st];
                while (sum >= k) {
                    sum /= nums[st++];
                }
                if (end-st >= 1)
                	res.add(end-st);
                st++;
            }
            
        }
        
        return res.size();
    	
    	/*if (k <= 1) return 0;
        int count = 0, left = 0, right = 0, prod = 1;
        while (right < nums.length) {
            prod *= nums[right];
            while (prod >= k) prod /= nums[left++];
            count += 1 + (right - left);
            right++;
        }
        return count;*/
    }
	
	public static void main(String[] args) {

		int[] nums = {10,5,2,6};
		int k = 1000;
		numSubarrayProductLessThanK(nums,k);
	}

}
