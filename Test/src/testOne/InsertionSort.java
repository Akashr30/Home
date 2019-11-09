package testOne;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] a = {9,8,5,7,3,2,5,3,2,3,4,1,3,6,9,7,8,1,11,6,0};
		int min = 0;
		int idx  = 0;
		int j =0;
		System.out.println(a.length);
		for(int i = 0 ; i < a.length-1;i++) {
			if (a[i] > a[i+1]) {
				min = a[i+1];
				a[i+1] = a[i];
				j = i ;
				
				while (j>=0) {
					if (j==0) {
						a[j]= min;
						break;
					}
					if (a[j-1] > min) {
						a[j]= a[j-1];
						j = j-1;
					} else {
						a[j]= min;
						break;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
	}

}
