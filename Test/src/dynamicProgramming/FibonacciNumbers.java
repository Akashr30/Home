package dynamicProgramming;

import java.util.Arrays;

public class FibonacciNumbers {
	// recursive approach
	/*public static int fibonacciNum(int num,int[] arr){
		
		if (num == 0) {
			return arr[0];
		}
		if (num == 1) {
			return arr[1];
		}
		
		if (arr[num] > 0) {
			return arr[num];
		}
		
		int n1 = fibonacciNum(num-1,arr);
		int n2 = fibonacciNum(num-2,arr);
		
		 return arr[num] = n1+n2;
		
	}
	
	public static void main(String[] ar) {
		
		int num = 8;
		int[] arr = new int[num+2];
		arr[0] = 0;
		arr[1] = 1;	
		fibonacciNum(num,arr);
	}
*/
	
	//Dynamic Programming
	
	public static int fibonacciNumber(int[] arr , int n ) {
		
		arr[0] = 0;
		arr[1] = 1;
		
		for (int i = 2 ; i <= n ; i ++) {
			arr[i] = arr[i-2]+arr[i-1];
		}
		
		return arr[n];
	}
	
	
	
	public static void main(String[] ar) {
		int num = 9;
		int[] arr = new int[num+2];
		System.out.println(fibonacciNumber(arr,num));;
		System.out.println(Arrays.toString(arr));
	}
}
