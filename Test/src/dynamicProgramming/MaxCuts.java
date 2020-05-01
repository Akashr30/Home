package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class MaxCuts {
	
	
	/*static int x;
    static int y;
    static int z;
    static int maxCuts = 0;
    
    public static void countCuttedSeg(int total , int xyz , int idx ,int sum) {
        
    	sum += xyz;
    	
        if (sum > total)
            return;
            
        if (sum == total && idx >= maxCuts) {
            maxCuts = idx;
            return;
        }
        
        
        idx++;
        countCuttedSeg(total,x,idx,sum);
        countCuttedSeg(total,y,idx,sum);
        countCuttedSeg(total,z,idx,sum);
        
    }
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    while (test-- > 0) {
	        
	        int total = Integer.parseInt(sc.nextLine());
	        String str = sc.nextLine();
	        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
	        x = arr[0];
	        y = arr[1];
	        z = arr[2];
	        countCuttedSeg(total , 0 , 0 , 0);
	        System.out.println(maxCuts);
	        maxCuts = 0;
	    }
	    
	 }*/

	
	// Function that returns 
	// the maximum number 
	// of segments possible 
/*	static int findMaximum(int l, int p, 
						int q, int r) 
	{ 

		// Array to store the 
		// cut at each length 
		int dp[] = new int[l + 1]; 

		// All values with -1 
		for(int i = 0; i < l + 1; i++) 
		dp[i] = -1; 
		

		// if length of rod is 0 
		// then total cuts will 
		// be 0 so, initialize 
		// the dp[0] with 0 
		dp[0] = 0; 

		for (int i = 0; i <= l; i++) 
		{ 

			// if certain length 
			// is not possible 
			if (dp[i] == -1) 
				continue; 

			// if a segment of 
			// p is possible 
			if (i + p <= l) 
				dp[i + p] = Math.max(dp[i + p], 
									dp[i] + 1); 

			// if a segment of 
			// q is possible 
			if (i + q <= l) 
				dp[i + q] = Math.max(dp[i + q], 
									dp[i] + 1); 

			// if a segment of 
			// r is possible 
			if (i + r <= l) 
				dp[i + r] = Math.max(dp[i + r], 
									dp[i] + 1); 
		} 

		// return value corresponding 
		// to length l 
		return dp[l]; 
	} 

	// Driver Code 
	public static void main (String[] args) 
	{ 
		int l = 22, p = 3, 
			q = 2, r = 4; 

		// Calling Function 
		int ans = findMaximum(l, p, q, r); 
		System.out.println( ans); 
	}

*/

	

    static int x;
    static int y;
    static int z;
     
	public static int maxCuts (int len,int[] arr) {
		
		if (len < 0) {
			return -1;
		}
		if (arr[len] > 0) {
			return arr[len];
		}
		if (len == 0) {
			return 1;
		}
		
		arr[len] = Math.max(arr[len],maxCuts(len-x,arr)+1);
		arr[len] = Math.max(arr[len],maxCuts(len-y,arr)+1);
		arr[len] = Math.max(arr[len],maxCuts(len-z,arr)+1);
		
		if (arr[len] > 0) {
			return arr[len];
		} else 
			return -1;
	}
	
	public static void main(String[] ar) {
		
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		sc.nextLine();
		while (test-- > 0) {
		
    		int len = sc.nextInt();
    		sc.nextLine();
    		String str = sc.nextLine();
    		int[] arr1 = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
    		x = arr1[0];
    		y = arr1[1];
    		z = arr1[2];
    		int[] arr = new int[len];
    		maxCuts (len-1,arr);
    		System.out.println(arr[len-1]);
		}
		
	}



}
