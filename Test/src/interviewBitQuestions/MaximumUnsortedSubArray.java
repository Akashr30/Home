package interviewBitQuestions;

import java.util.Arrays;

public class MaximumUnsortedSubArray {

	public static void main(String[] args) {
		
//		int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
//		int[] arr = {0, 1, 15, 25, 6, 7, 30, 40, 50};
//		int[] arr = {1, 2, 3, 4, 5};
//		int[] arr = {6, 14, 14, 15};
//		int[] arr = {1, 1, 4, 6, 8, 8, 13, 13, 13, 14, 17, 18, 14};
		int[] arr = {1, 3, 2, 4, 5};
		
	/*	int start = -1;
		int end = -1;
		boolean startFlag = true;
		int max = -1;
		int min = -1;
		boolean minFlag = true;
		for (int i = 1 ; i < arr.length ; i++) {
			
			if (arr[i-1] <= arr[i] && arr[i] <= max) {
				continue;
			} else {
				if (startFlag) {
					start = i;
					max = arr[i];
					startFlag = false;
					continue;
				}
				if (arr[i] >= max) {
					max = arr[i];
				} else if (min >= arr[i] || minFlag){
					minFlag = false;
					min = arr[i];
				}
				end = i;
			}
			
		}
		if (min != -1 && end == -1) {
			end = arr.length-1;
			min = max;
		}
		
		
		int startIdx = 0;
		if (start > 0)
		for (int i = 1 ; i <= start ; i++) {
			if (arr[i-1] >= min && min <= arr[i]) {
				startIdx = i ;
				break;
			}
		}
		
		System.out.println(startIdx+"......" +end);
		*/
		
		int[] arr1 = arr.clone();
		Arrays.sort(arr1);
		int min = -1;
		int max = -1;
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i] != arr1[i] && min == -1) {
				min = i;
			} else if (arr[i] != arr1[i] && min != -1) {
				max = i;
			}
		}
		
		System.out.println(min+"......" +max);
	}

}
