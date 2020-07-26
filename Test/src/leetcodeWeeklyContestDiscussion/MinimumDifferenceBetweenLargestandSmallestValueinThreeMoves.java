package leetcodeWeeklyContestDiscussion;

import java.util.Arrays;

public class MinimumDifferenceBetweenLargestandSmallestValueinThreeMoves {
	
	public static int minDifference(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        if(n <= 4)return 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i+n-4 < n;i++){
        	int num = i+n-4;
        	int sub = a[i+n-4] - a[i];
        	min = Math.min(min, sub);
        }
        return min;
    }
	 
	   /* Arrays.sort(nums);
	    int t = 3;
	    int n = nums.length-1;
	    int min = nums[0];
	    while (t > 0 && nums.length > 3) {
	        nums[n] = min;
	        n--;
	        t--;
	    }
	   return nums[n]-min;*/
	
	public static void main(String[] ar) {
		
		int[] arr = {6,6,0,1,1,4,6};
		minDifference(arr);
	}
}
