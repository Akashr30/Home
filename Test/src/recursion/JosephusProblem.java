package recursion;


//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
/*
class JosephusProblem {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    Josephus obj=new Josephus();
		    
		    int n,k;
		    n=sc.nextInt();
		    k=sc.nextInt();
		    
		    System.out.println(obj.josephus(n,k));
		    
		    
		}
		
	}
}

//} Driver Code Ends
class Josephus
{
public int josephus(int n, int k)
 {
     int[] arr = new int[n];
     int count = 0;
     int idx = 0;
     boolean flag = true;
     
     while (flag) {
         
         for (int i = 0 ; i <= n ; i++) {
             
             if (i < n && arr[i] == 1)
                 continue;
             
             if (i == n) {
                 for (int j = 0 ; j < n ; j++) {
                     if (arr[j] == 0) {
                         i = j;
                         break;
                     }
                 }
             }
             
             idx++;
             
             if (idx == k) {
                 arr[i] = 1;
                 count++;
                 idx = 0;
             }
             
             if (count >= n-1) {
                 flag = false;
                 break;
             }
             
         }
         
     }
     
     int ans = 0;
     for (int i = 0 ; i < arr.length ; i++) {
         if (arr[i] == 0) {
            ans = i+1;
            break;
         }
     }
     
     return ans;
     
 }

}
*/

// Recursive method

//Java code for Josephus Problem 
import java.io.*; 

class JosephusProblem { 

	static int josephus(int n, int k) 
	{ 
		int x = 0;
	if (n == 1) 
		return 1; 
	else {
		/* The position returned by josephus(n - 1, k) 
		is adjusted because the recursive call 
		josephus(n - 1, k) considers the original 
		position k%n + 1 as position 1 */
		 x = (josephus(n - 1, k) + k-1) ;
	}
		return  x % n + 1;
	} 

//Driver Program to test above function 
	public static void main(String[] args) 
	{ 
		int n = 5; 
		int k = 2; 
		System.out.println("The chosen place is " + josephus(n, k)); 
	} 
} 

//This code is contributed by Prerna Saini 

