package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;
/*
public class RodCutting {

    
    public static void rodMaxValue(int[] rodValues , int len) {
        
        int[] arr = new int[len+1];
        
       for (int i = 0 ; i < arr.length; i++) {
    	   
    	   int cons = arr[i];
    	   
    	   for (int j = 1 ; j < rodValues.length+1 ; j++) {
    		   if (i+j < len+1)
    		   arr[j+i] = cons+rodValues[j-1];
    	   }
       }
        
        
        
    } 
     
     
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
//	    int test = Integer.parseInt(sc.nextLine());
	    
//	    while (test-- > 0) {
	        
	        int len = 5;
	        String str = "1 3 5 6 7";
	        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
	        rodMaxValue(arr,len);
//	    }
	 }


}*/

//A Dynamic Programming solution for Rod cutting problem 
class RodCutting 
{ 
	/* Returns the best obtainable price for a rod of 
	length n and price[] as prices of different pieces */
	static int cutRod(int price[],int n) 
	{ 
		int val[] = new int[n+1]; 
		val[0] = 0; 

		// Build the table val[] in bottom up manner and return 
		// the last entry from the table 
		for (int i = 1; i<=n; i++) 
		{ 
			int max_val = Integer.MIN_VALUE; 
			for (int j = 0; j < i; j++) {
				int count  = i-j-1;
				int val1 = price[j] + val[i-j-1];
				max_val = Math.max(max_val, price[j] + val[i-j-1]); 
			}
				
			val[i] = max_val; 
		} 

		return val[n]; 
	} 

	/* Driver program to test above functions */
	public static void main(String args[]) 
	{ 
		//int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
   	int arr[] = new int[] {1,3,5,6,7};
		int size = arr.length; 
		System.out.println("Maximum Obtainable Value is " + 
							cutRod(arr, size)); 
	} 
} 
/* This code is contributed by Rajat Mishra */

