package dynamicProgramming;

import java.util.Scanner;

public class DecodeMessages {
	
	public static int decode(char[] arr ,int n) {
		
		if (n == 0 || n==1) {
			return 1;
		}
		int count  = 0;
		
		if (arr[n-1] > '0')
			count = decode(arr,n-1);
			
			if (arr[n-2] == '1' || ( arr[n-1] < '7' && arr[n-2] =='2')) {
				count += decode(arr,n-2);
			}
		
		return count;
		
	}
	
	
	public static void main(String[] ar) {
		
		String str = "123";
		char[] arr = str.toCharArray();
		System.out.println(decode(arr,arr.length-1));
	}
}
