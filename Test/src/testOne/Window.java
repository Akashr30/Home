package testOne;
//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.HashMap;

class CountELements {
 public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while (t > 0) {
         int n = sc.nextInt();
         int k = sc.nextInt();
         int a[] = new int[n];
         for (int i = 0; i < n; i++) a[i] = sc.nextInt();
         // int k = sc.nextInt();

         GfGCountElements g = new GfGCountElements();
         g.countDistinct(a, k, n);
         System.out.println();

         t--;
     }
 }
}
class GfGCountElements {
 void countDistinct(int A[], int k, int n) {
     
     if (k > n) {
         
         System.out.println(-1);
         return;
     }
     
     Queue<Integer> queue =  new PriorityQueue<>(); 
     StringBuffer sb = new StringBuffer();
     Set<Integer> set = new HashSet<>();
     for (int i = 0 ; i < k ; i++) {
         queue.add(A[i]);
         set.add(A[i]);
     }
     sb.append(set.size()+" ");
     for (int i = k ; i < n ; i++) {
         
         int temp = queue.poll();
         if (!queue.contains(temp)) {
             set.remove(temp);
         }
         queue.add(A[k]);
         if (!set.contains(A[k])) {
             set.add(A[k]);
         }
         
         sb.append(set.size()+" ");
     }
     
     System.out.print(sb);
     
 }
}
/*1
7 4
1 2 1 3 4 2 3*/

class CountELements {
	
	public static void main (String[] ar) {
		
		int[] arr = {1,2,1,32,4,5,6,1};
		Queue<Integer> q = new PriorityQueue<>();
		for (int i = 0 ; i < arr.length ; i++) {
			q.add(arr[i]);
		}
		int temp = q.poll();
	}
}
