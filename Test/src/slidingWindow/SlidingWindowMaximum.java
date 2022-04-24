package slidingWindow;

import java.util.Arrays;

public class SlidingWindowMaximum {
	
	public static int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] ans = new int[nums.length];
        int max = Integer.MIN_VALUE;
        int i = 0;
        int prevIdx = 0;
        int c = 0;
        for ( ; i < k ; i++) {
            if (nums[i] > max) {
                max = nums[i];
                prevIdx = i;
                ans[c] = max;
            }
        }
        c++;
        int j;
        for (j = i ; j < nums.length ; j++) {
            
            if (j-k+1 <= prevIdx) {
            	if (nums[j] > max) {
            		max = nums[j];
            		prevIdx = j;
            	}
            	ans[c++] = max;
                continue;
            } else if (j-k+1 > prevIdx) {
                if (nums[j] > nums[j-k+1]) {
                    prevIdx = j;
                    max = nums[j];
                    ans[c++] = max;
                } else {
                    prevIdx = j-k+1;
                    max = nums[j-k+1];
                    ans[c++] = max;
                }
            }
        } 
        return Arrays.copyOfRange(ans, 0, j-k+1);
    }

	public static void main(String[] args) {
		
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		maxSlidingWindow(nums,k);
	}

}
