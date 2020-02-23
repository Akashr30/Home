package testOne;

import java.util.*;
import java.lang.*;
import java.io.*;

class KeyPair
 {
     
    public static  boolean keyPair(int[] arr,int sum,int len) {
        Arrays.sort(arr);
        
       int i = 0 ;
       int j = len-1;
       boolean flag = false;
       
       while (i < j) {
           if (arr[i]+arr[j] == sum) {
               flag = true;
               break;
           } else if (arr[i]+arr[j] > sum) {
               j--;
           } else {
               i++;
           }
       }
       
    return flag;        
    }
     
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    while (test > 0) {
	        
	        /*int n = sc.nextInt();
	        int sum = sc.nextInt();
	        sc.nextLine();*/
	        
	        String str = sc.nextLine();
	        String[] s = str.split(" ");
	        int n = Integer.parseInt(s[0]);
	        int sum = Integer.parseInt(s[1]);
	        int[] arr = new int[n];
	        for (int i = 0 ; i < n ; i++) {
	            arr[i] = sc.nextInt();
	        }
	       // sc.nextLine();
	        if (keyPair(arr,sum,n)) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	        
	        test--;
	    }
	 }
}