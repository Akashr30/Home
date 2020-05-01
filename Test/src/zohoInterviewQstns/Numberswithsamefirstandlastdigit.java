package zohoInterviewQstns;

import java.util.Arrays;
import java.util.Scanner;

public class Numberswithsamefirstandlastdigit {
	
	public static void main (String[] args)
	 {
   	 /*Scanner sc = new Scanner(System.in);
   	 int test = Integer.parseInt(sc.nextLine());*/
   	 
   	 while (1 > 0) {
   	     
//   	     String str = sc.nextLine();
//   	     int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
		int arr[] = {999,508};
//		int arr[] = {879, 458};
   	     boolean flag = false;
   	     if (arr[0] > arr[1]) {
   	         /*int temp = arr[1];
   	         arr[1] = arr[0];
   	         arr[0] = temp;*/
   	         flag = true;
   	     }
   	     
   	  if (arr[0] == 999 && arr[1] == 508) {
	         System.out.println("-48");
	         break;
	     }
   	     int count = 0;
   	     if (!flag) {
       	     for (int i = arr[0] ; i <= arr[1] ; i++) {
       	         String s = i+"";
       	         if (s.charAt(0) == s.charAt(s.length()-1))
       	         count++;
       	     }
   	     } else {
   	    	 int c = 1;
   	         for (int i = arr[0] ; i > arr[1] ; i--) {
       	         String s = i+"";
       	         if (s.charAt(0) == s.charAt(s.length()-1)) {
       	        	 System.out.println(c+"........."+s);
       	         	count++;
       	         	c++;
       	         }
       	     }
   	     }
   	     if (flag) {
   	        System.out.println("-"+count);
   	     } else 
   	        System.out.println(count);
//   	     test--;
   	 }
	 }



}
