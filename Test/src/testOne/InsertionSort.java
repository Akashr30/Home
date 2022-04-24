package testOne;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
//		int[] arr = {9,8,5,7,3,2,5,3,2,3,4,1,3,6,9,7,8,1,11,6,0};
		int arr[] = { 12, 11, 13, 5, 6 };
		System.out.println(arr.length);
		int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
	}

}
