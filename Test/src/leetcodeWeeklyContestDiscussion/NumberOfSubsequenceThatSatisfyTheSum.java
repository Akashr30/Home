package leetcodeWeeklyContestDiscussion;

import java.util.Arrays;

public class NumberOfSubsequenceThatSatisfyTheSum {
	
/*	public static int numSubseq(int[] A, int target) {
        Arrays.sort(A);
        int res = 0, n = A.length, l = 0, r = n - 1, mod = (int)1e9 + 7;
        int[] pows = new int[n];
        pows[0] = 1;
        for (int i = 1 ; i < n ; ++i)
            pows[i] = pows[i - 1] * 2 % mod;
        while (l <= r) {
            if (A[l] + A[r] > target) {
                r--;
            } else {
                res = (res + pows[r - l++]) % mod;
            }
        }
        return res;
    }*/

	private static final int MOD = 1000000007;
	public static int numSubseq(int[] nums, int target) {
	    long[] modPow = new long[nums.length + 1];
	    modPow[0] = 1;
	    for (int i = 1; i < modPow.length; i++) {
	        modPow[i] = 2 * modPow[i-1] % MOD;
	    }
	    
	    Arrays.sort(nums);
	    int low = 0;
	    int high = nums.length -1;
	    long result = 0;
	    while (low <= high) {
	        if (nums[low] + nums[high] > target) {
	            high--;
	        } else {
	            long curPower = modPow[high-low];
	            result += curPower%MOD;
	            low++;
	        }
	    }
	    result = result%MOD;
	    return (int) result;
	}
	
	public static void main(String[] ar) {
		
		int[] nums = {5,3,6,7};
		int k = 9;
		System.out.println(numSubseq(nums,k));
	}
}
