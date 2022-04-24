package testOne;

import java.util.Scanner;

public class EaseArray {
	public static void main (String[] args)
	 {/*
       Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();
       sc.nextLine();
       while (test > 0) {
           
           int len = sc.nextInt();
           int[] arr = new int[len];
           for (int i = 0 ; i < len ; i++) {
               arr[i] = sc.nextInt();
           }
           
           int i = 1;
           int j = len-1;
           int idx1 = 0;
           int idx2 = 0;
            int[] arr1 = new int[len];
           while (i < len) {
               
               if (arr[i-1] > 0 && arr[i] != arr[i-1]) {
                   arr1[idx1] = arr[i-1];
                   idx1++;
               } else if (arr[i] == arr[i-1]) {
                   int temp = arr[i-1]*2;
                   arr[i] = 0;
                   if (temp > 0) {
                       arr1[idx1] = temp;
                       idx1++;
                   }
               }
               i++;
           }
           if (arr[len-1] != 0) {
               arr1[idx1] = arr[len-1];
           }
           for (int a : arr1)
           System.out.print(a+" ");
           
           System.out.println();
           test--;
       }
	 */

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test > 0) {
            
            int len = sc.nextInt();
            // int[] arr = new int[len];
            sc.nextLine();
            String str1 = sc.nextLine();
            String[] arr = str1.split(" ");
            /*for (int i = 0 ; i < len ; i++) {
                arr[i] = sc.nextInt();
            }*/
            
            int i = 1;
            int j = len-1;
            int idx1 = 0;
            int idx2 = 0;
             int[] arr1 = new int[len];
            while (i < len) {
                int num1 = Integer.parseInt(arr[i-1]);
                int num2 = Integer.parseInt(arr[i]);
                if (num1 > 0 && num2 != num1) {
                    arr1[idx1] = num1;
                    idx1++;
                } else if (num2 == num1) {
                    int temp = num1*2;
                    arr[i] = "0";
                    if (temp > 0) {
                        arr1[idx1] = temp;
                        idx1++;
                    }
                }
                i++;
            }
            if (Integer.parseInt(arr[len-1]) != 0) {
                arr1[idx1] = Integer.parseInt(arr[len-1]);
            }
            StringBuffer sb = new StringBuffer();
            for (int a : arr1)
                sb.append(a+" ");
            
            System.out.println(sb.toString());
            test--;
        }
	 
	 }
}
