package leetcode;

import java.util.Arrays;

public class SecondLargestNum {
	
	public static int print2largest(int arr[],int N) 
    {
        int max1 = -1 , max2 = -1;
        
        for (int i : arr) {
        	
        	if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2 && i != max1) {
                max2 = i;
            }
        	
        }
        return max2;
    }

	public static void main(String[] args) {
		
		int n = 5;
//		String str = "14 19 18 16 10 12 7 10 10 8 5 2 18 8 2 12 9 7 1 2 5 18";
//		String str = "18 20 19 2 1 19 11 6 12 16 8 1 1 8 20 1 6 7 9";
		String str = "1 1 1 1 1";
		int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
		print2largest(arr,n);
	}

}
