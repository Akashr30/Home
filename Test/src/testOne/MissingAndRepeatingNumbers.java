package testOne;

import java.util.Arrays;
import java.util.Scanner;

public class MissingAndRepeatingNumbers {
	

	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    while (test-- > 0) {
	        
	       // int len = Integer.parseInt(sc.nextLine());
	       int len = sc.nextInt();
	       sc.nextLine();
	        String str = sc.nextLine();
	        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
	        int repeatedNum = Integer.MAX_VALUE;
	        int missingNum = -1;
	        for (int i = 0 ; i < arr.length ; i++) {
	            
	            if (arr[Math.abs(arr[i])-1] < 0) {
	                if (repeatedNum > Math.abs(arr[i])) {
                        repeatedNum = Math.abs(arr[i]);	                    
	                } 
	            } else {
	                    arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
	                }
	        }
	        
	        for (int i = 0 ; i < arr.length ; i++) {
	            if (arr[i] > 0) {
	                missingNum = i+1;
	                break;
	            }
	            
	        }
	        
	        System.out.println(repeatedNum+" "+missingNum);
	    } 
	 }


}
