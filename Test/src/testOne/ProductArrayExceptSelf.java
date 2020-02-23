package testOne;

import java.util.Queue;

public class ProductArrayExceptSelf {
	
	public static void main(String[] args) {
		
		int[] nums = {2,4,5,6};
		int N = nums.length;
		
		int[] outputArr = new int[N];
		outputArr[0] = 1;
		
		for (int i = 1 ; i < N ;i++) {
			outputArr[i] = nums[i-1]* outputArr[i-1];
		}
		
		int R = 1 ;
		for (int i = N-1; i >= 0 ; i--) {
			outputArr[i] = outputArr[i] * R;
			R = R*nums[i];
		}
		
		for (int i : outputArr)
		System.out.print(i+" ");
		
		
	}

}
