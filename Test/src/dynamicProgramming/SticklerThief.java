package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SticklerThief {
	

	public static void main (String[] args)
	 {
    	Scanner sc = new Scanner(System.in);
    	int test = Integer.parseInt(sc.nextLine());
    	
    	while (test-- > 0) {
    	    
    	    int len = Integer.parseInt(sc.nextLine());
    	    String str = sc.nextLine();
    	    int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
    	    if (len == 1) {
    	        System.out.println(str);
    	    } else if (len <= 2) {
    	        System.out.println(Math.max(arr[0],arr[1]));
    	    } else {
        	    int[] dp = new int[arr.length];
        	    dp[0] = arr[0];
        	    dp[1] = Math.max(arr[0],arr[1]);
        	    
        	    for (int i = 2 ; i < arr.length ; i++) {
        	        dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        	    }
        	    
        	    System.out.println(dp[arr.length -1]);
    	    }
    	}
	 }


}
