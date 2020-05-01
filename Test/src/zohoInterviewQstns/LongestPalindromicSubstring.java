package zohoInterviewQstns;


import java.util.*;
import java.io.*;

class LongestPalindromicSubstring {
 // Driver program to test above function
 public static void main(String[] args) throws IOException {
//     BufferedReader br =
//         new BufferedReader(new InputStreamReader(System.in));
//     int tc = Integer.parseInt(br.readLine().trim());
//     while (tc-- > 0) {
//         String str = "rfkqyuqfjkxy";
	 String str = "aaaabbaa";
         Solution sln = new Solution();
         System.out.println(sln.longestPalindrome(str));
//     }
 }
}
class Solution {
 
 public String longestPalindrome( String str) {
     
     int len = str.length();
     String[] s = str.split("");
//     String[] arr = new String[len];
     StringBuffer sb = new StringBuffer();
//     arr[0] = s[0];
     ArrayList<String> al = new ArrayList<>();
//     al.add(0+","+arr[0]);
     int max = 0;
     
   /*  for (int i = 1 ; i < len ; i++) {
         sb.append(arr[i-1]).append(s[i]);
         if (sb.toString().equalsIgnoreCase(sb.reverse().toString()) && sb.toString().length() > max) {
             al.clear();
             max = sb.toString().length();
             al.add(i+","+sb.toString());
         } else if (sb.toString().equalsIgnoreCase(sb.reverse().toString()) && sb.toString().length() == max) {
             String[] t1 = al.get(0).split(",");
             if (Integer.parseInt(t1[0]) > i) {
                 al.clear();
                 al.add(i+","+sb.toString());
             }
            //  al.add(i+","+sb.toString());
         }
         arr[i] = sb.toString();
         sb.setLength(0);
     }*/
     sb.setLength(0);
     int j = 0;
     while (j < len) {
	     for (int i = j ; i < len ; i++) {
	         
	    	 sb.append(s[i]);
//	         String temp = sb.toString().substring(i,arr[i].length());
	         
	         if (sb.toString().equalsIgnoreCase(sb.reverse().toString()) && sb.toString().length() > max) {
	             al.clear();
	             max = sb.toString().length();
	             al.add(j+","+sb.toString());
	         } else if (sb.toString().equalsIgnoreCase(sb.reverse().toString()) && sb.toString().length() == max) {
             String[] t1 = al.get(0).split(",");
                 if (Integer.parseInt(t1[0]) > j) {
                     al.clear();
                     al.add(j+","+sb.toString());
                 }
            //  al.add(i+","+sb.toString());
            }
	     }
	     sb.setLength(0);
	     j++;
	     
	     if (len - j < max)
            break;
 	}
 	String ans = "";
 	if (al.size() > 0) {
     String[] a =  al.get(0).split(",");
     ans = a[1];
 	}
     
     return ans;
 }
}