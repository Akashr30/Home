package testOne;


import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class LongestConsecutiveSubsequence
{
 // Driver Code
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    
		    // Making object of GfG	
			GfGLIS g = new GfGLIS();
			
			System.out.println(g.findLongestConseqSubseq(a, n));
		
		t--;
		}
	}
}// } Driver Code Ends


class GfGLIS
{
 // Function to find Longest Consecutive Subsequence
 int findLongestConseqSubseq(int arr[], int n)
 {
     
	    Arrays.sort(arr);
	    int count = 0;
	    int max = 0;
	    
	    for (int i = 1 ; i < arr.length ; i++) {
	        
	        if (arr[i] == arr[i-1]+1) {
	            count++;
	        } else {
	            if (count  > max) {
	                max = count;
	            }
	            count = 0;
	        }
	    }
	    
	    return max;
	    
 }
}

