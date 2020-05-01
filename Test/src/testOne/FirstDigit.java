package testOne;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class FirstDigit {
	

	public static void main (String[] args)
	 {
         /*Scanner sc = new Scanner(System.in);
    	 int test = Integer.parseInt(sc.nextLine());*/
    	 
//    	 while (test > 0) {	 
    	    
//    	    int len = Integer.parseInt(sc.nextLine());
    	    String str = "8";
//    	    int[] mat = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
    	    String[] mat = str.split(" ");
//    	    long ans = 1;
    	    BigInteger ans = new BigInteger(mat[0]);
    	    for (int i = 1 ; i < mat.length ; i++) {
    	        BigInteger bi = new BigInteger(mat[i]);
    	        ans = ans.multiply(bi);
    	    }
    	    
    	    String s = ans.toString();
    	    
    	    System.out.println(s.charAt(0));
    	    
    	    /*test--; 
    	 }   */
    	    double  S = 0;
    	      S = S + Math.log10(8 * 1.0); 
    	    
            // fractional(s) = s - floor(s) 
            double fract_S = S - Math.floor(S);
            int ans1 = (int)Math.pow(10, fract_S);
	 }


}
