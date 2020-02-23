package testOne;

import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class DeleteDuplicateFromArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
		
//			int N = sc.nextInt();
			int a[] = {1,1,1,2, 2, 2, 2, 2,3,3,3,3,3,4,4,5,6,7,8,9,9,9 };
			/*for(int i=0; i<N; i++)
				a[i] = sc.nextInt();*/
			
			ABCD g = new ABCD();
			int n = g.remove_duplicate(a);
			
			for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
			
			System.out.println();
			
		
	}
}// } Driver Code Ends
class ABCD
{
        /*You are required to complete this function */
	int remove_duplicate(int a[])
	{
		/*Set<Integer> set = new LinkedHashSet<Integer>();
		int count = 0;
		for ( int i = 0 ; i < a.length ; i++) {
			if (!set.contains(a[i])) {
				set.add(a[i]);
				a[count] = a[i];
				count++;
			}
		}
		
		return count;*/
		
		int n = a.length;
		 
        if (n == 0 || n == 1) 
            return n; 
       
        // To store index of next unique element 
        int j = 0; 
       
        // Doing same as done in Method 1 
        // Just maintaining another updated index i.e. j 
        for (int i = 0; i < n-1; i++) 
            if (a[i] != a[i+1]) 
                a[j++] = a[i]; 
       
        a[j++] = a[n-1]; 
       
        return j; 
	}
}
