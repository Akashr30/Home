package testOne;

import java.util.Collections;
import java.util.Scanner;

public class FacingTheSun {
	

	public static int facingTheSun(int[] arr) {
		int count = 0;
		int max = 0;
		for (int i = 0 ; i < arr.length;i++) {
				if (arr[i] > max) {
					max = arr[i];
					count++;
				}
		}
		return count;
		
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		for (int x = 0 ; x < Num ; x++){
		    int siz = sc.nextInt();
    		int[] arr = new int[siz];
    		for (int j = 0; j < siz;j++) {
    			arr[j] = sc.nextInt();
    		}
		
		    System.out.println(facingTheSun(arr));
		}
	}

}
