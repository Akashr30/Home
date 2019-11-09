package testOne;

import java.util.Scanner;

public class TrailingZerosFactorial {

    static String s = "";
    static int  trailingZeros (int n) {
        int count = 0; 
        
        // Keep dividing n by powers  
        // of 5 and update count 
        for (int i = 5; n / i >= 1; i *= 5) 
            count += n / i; 
  
        return count; 
    }
    
	public static void main (String[] args)
	 {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for (int i = 0 ; i < t ; i++) {
           int num = sc.nextInt();
           int count = 0;
           int str = trailingZeros (num);
           
           System.out.println(str);
       }
	 }

}
