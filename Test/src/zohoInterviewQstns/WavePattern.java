package zohoInterviewQstns;

import java.util.Arrays;
import java.util.Scanner;

public class WavePattern {

	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);

		int len = Integer.parseInt(sc.nextLine());
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}*/
		 int[] arr = {10,5,6,2,20,3,100,80};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i = i + 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}

		StringBuilder sb = new StringBuilder();
		for (int c : arr)
			sb.append(c).append(",");

         String s = sb.toString();
         s = s.substring(0,s.length()-1);
         System.out.println(s);
	}

}
