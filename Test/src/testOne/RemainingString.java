package testOne;

import java.util.Scanner;

public class RemainingString {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
//	    sc.nextLine();
	    
	    while (test > 0) {
	        
	        String str = sc.nextLine();
//	        char[] ch = str.toCharArray();
//	        char alpha = sc.next().charAt(0);
	        String alpha = sc.nextLine();
	        int occurences = sc.nextInt();
	        sc.nextLine();
	        int count = 0;
	        int idx = -1;
	        int[] arr = new int[str.length()];
	        boolean flag = true;
	        
	        for (int i = 0 ; i < str.length() ; i++) {
	            arr[i] = str.charAt(i);
	            if (alpha.equalsIgnoreCase(Character.toString(str.charAt(i)))) {
	                count++;
	            }
	            
	            if (count == occurences) {
	                idx = i;
	                break;
	            }
	        }
	        
	        if (idx != -1) {
	            String finalStr = "";
	            while (idx+1 < str.length()) {
	                finalStr += str.charAt(idx+1);
	                idx++;
	            }
	            System.out.println(finalStr);
	        } else {
	            System.out.println("Empty string");
	        }
	        
	        test--;
	    }
	 
	 }

}
