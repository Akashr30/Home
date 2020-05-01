package testOne;

import java.util.ArrayList;
import java.util.Scanner;

public class UglyNumbers {
	

	public static void main (String[] args)
	 {
    	 Scanner sc = new Scanner(System.in);
    	 int test = Integer.parseInt(sc.nextLine());
    	 
    	 while (test-- > 0) {
    	     
	        int len = Integer.parseInt(sc.nextLine());
    	     
    	   //  int[] arr = new int[len];
    	   ArrayList<Long> set = new ArrayList<>();
    	   set.add((long) 1);
	       long n = 2;
    	   int idx = 0;  
    	   boolean flag = false;
    	   System.out.println("Start time"+System.currentTimeMillis());
    	     while (set.size() < len) {
    	         
    	         long i = n;
    	         while (i > 0) {
    	             
    	             if (set.contains(i)) {
    	            	flag = true;
    	                break;
    	             }
    	             if (i % 5 == 0) {
    	                 i = i/5;
    	                 continue;
    	             } else if (i % 3 == 0) {
    	                 i = i/3;
    	                 continue;
    	             } else if( i % 2 == 0) {
    	                 i = i/2;
    	                 continue;
    	             } else {
    	                 break;
    	             }
    	             
    	         }
    	         
    	         if (flag) {
    	            set.add(n);
    	            flag = false;
    	         }
    	         n++;
    	         idx++;
    	     }
    	   System.out.println(set.get(len-1)); 
    	   System.out.println("End Time"+System.currentTimeMillis());
    	 }
	 }


}
