package testOne;

import java.util.Scanner;
import java.math.BigInteger;

public class SumOfLargeNumbers {


    static int count = 0;
    static void recur (int num , int[] arr) {
    	count = 0;
       if (num == 0)
           return;
           
            recur (num/10,arr);
           int rem = num % 10;
           arr[count] = rem;
           count++;
   }
   
   static String CheckSummation (char[] arr1 , char[] arr2) {
       
       int i = arr1.length-1;
       int j = arr2.length-1;
       int i1 = 0;
       int j1 = 0;
       int sum = 0;
       int tempNum = 0;
       int tempCarry = 0;
       StringBuffer sb = new StringBuffer();
       StringBuffer sb1 = new StringBuffer();
       while (i > -1 || j > -1) {
           
           if (i > -1) {
//               i1 = Integer.parseInt(String.valueOf(arr1[i]));
        	   i1 = arr1[i]-'0';
               sb1.append(arr1[i]);
           } else {
               i1 = 0;
           }
           
           if (j > -1) {
//               j1 = Integer.parseInt(String.valueOf(arr2[j]));
               j1 = arr2[j]-'0';
           } else {
               j1 = 0;
           }
           
           sum = i1+j1;
           
           if (sum < 10 && tempCarry == 0) {
               sb.append(sum);
           } else {
               tempCarry = tempCarry+sum;
               tempNum = tempCarry%10;
               sb.append(tempNum);
               tempCarry = tempCarry/10;
           }
           i--;
           j--;
       }
       String str = sb.toString();
       String tempStr = "";
       if (sb.length() == arr1.length ) {
           for (int x = str.length()-1 ;  x >= 0 ; x-- ) {
               tempStr += str.charAt(x);
           }
           // return tempStr;
       } else {
           String str1 = sb1.toString();
            for (int x = str1.length()-1 ; x >= 0 ; x-- ) {
               tempStr += str1.charAt(x);
           }
       }
       
        return tempStr;
       
   }
    
	public static void main (String[] args)
	 {
       Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();
       sc.nextLine();
       for (int i = 0 ; i < test ; i++) {
           
           String num1 = sc.nextLine();
           String num2 = sc.nextLine();
//           int len1 = num1.length();
//           int len2 = num2.length();
           char [] num1Arr = num1.toCharArray();
           char[] num2Arr = num2.toCharArray();
           BigInteger num11 = sc.nextBigInteger();
	         BigInteger num21 = sc.nextBigInteger();
	         
	         BigInteger sum = num11.add(num21);
//           recur(num1,num1Arr);
//           recur(num2,num2Arr);
           System.out.println (CheckSummation (num1Arr,num2Arr));
       }
	 }
}