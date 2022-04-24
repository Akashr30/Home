package testOne;

import java.util.Scanner;

public class PanagramChecking {
	

	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    
	    int test = Integer.parseInt(sc.nextLine());
	    while (test > 0) {
	     
	     String str = sc.nextLine();
	     str = str.replaceAll("\\s","").toLowerCase();
	     char[] chArr = str.toCharArray();
	     int[] arr1 = new int[27];
	     for (int i = 0 ; i < chArr.length ; i++) {
	         arr1[chArr[i] - 'a']++;
	     }
	     boolean flag = true;
	     for (int j = 0 ; j < arr1.length-1 ; j++) {
	         if (arr1[j] == 0) {
               flag = false;
	         }
	     }
        if (flag) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
	        test--;
	    }
	 
	 }


}
