package testOne;

import java.util.Arrays;
import java.util.Scanner;

public class MaxIndex {
    
    public static int maxIndex (int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int max = 0;
        while (i < j) {
            
            if (arr[i] > arr[j]) {
                j--;
                continue;
            }
            
            if (arr[j] >= arr[i]) {
                if (j-i > max) {
                    max = j-i;
                }
                i++;
                j = arr.length-1;
            }
        }
        
        return max;
    }
     
     
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    while (test > 0) {
	        
	        int len = Integer.parseInt(sc.nextLine());
	        String str = sc.nextLine();
	        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
	        System.out.println(maxIndex(arr));
	        test--;
	    }
	 }
}
