package dynamicProgramming;

import java.util.Scanner;

public class LongSubArrayDivisibleByK {
	
	public static void main(String[] ar) {
		
		/* Scanner sc = new Scanner(System.in);
		 int test = Integer.parseInt(sc.nextLine());*/
		
//		int a[] = {2, 7, 6, 1, 4, 5};
		// int n = 3;
		/*int a[] = {55 ,100 ,33 ,61};
		int n = 12;*/
		
		/*int a[] = {57, 44 ,92, 28, 66 ,60 ,37, 33, 52 ,38, 29, 76, 8 ,75, 22};
		int n = 8;*/
		
		int a[] = {4,5,0,-2,-3,-1};
		int n = 5;
		int[] arr = new int[a.length];
		arr[0] = a[0];
		int idx = 0;
		if (arr[0]%n ==0)
			idx++;
		
		for (int i = 1 ; i < arr.length ; i++ ) {
			arr[i] = arr[i-1]+a[i];
			if ((arr[i])%n == 0) {
				if (idx <= i)
					idx = i;
			}
			
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			
			for (int j = i+1 ; j < arr.length ;j++) {
				if ((arr[j] - arr[i])%n == 0) {
					if (idx <= j)
						idx = j;
				}
			}
		}
		
		System.out.println(idx);
		
	}

}
