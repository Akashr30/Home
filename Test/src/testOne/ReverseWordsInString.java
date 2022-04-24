package testOne;

import java.util.*;
import java.lang.*;
import java.io.*;


class ReverseWordsInString
 {
     
     public static void reverseWords(String[] arr) {
         
         StringBuilder sb = new StringBuilder();
         
         for (int i = arr.length-1 ; i >=0 ; i--) {
             sb.append(arr[i]).append(".");
         }
         
         String s = sb.toString();
         if (s.length() > 0)
         s = s.substring(0,s.length()-1);
         
         System.out.println(s);
     }
     
     
	public static void main (String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        // sc.nextLine();
        
        while (test > 0) {
            
            String str = sc.nextLine();
            String[] arr = str.split("\\.");
            reverseWords(arr);
            
            test--;
        }
	 }
}