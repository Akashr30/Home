package dynamicProgramming;

import java.util.Scanner;

public class ConsecutiveOnesNotAllowed {
	

    static int count;
    
    static void zerosAndOnes(int len , String str, int i) {
        
        if (str.length() == len) {
        	System.out.println(str);
            count++;
            count = count % 1000000007;
            return;
        }
        
         zerosAndOnes(len , str+"0",++i);
         if (str == "")
        	 zerosAndOnes(len , str+"1",++i); 
         
         if (str.length() >= 1 && str.charAt(str.length()-1) != '1')
            zerosAndOnes(len , str+"1",++i);
        
        return;
    }
    
	public static void main (String[] args)
	 {
    	 Scanner  sc = new Scanner(System.in);
         int test = Integer.parseInt(sc.nextLine());
    	        
            while (test-- > 0) {
                
                int len = Integer.parseInt(sc.nextLine());
                count = 0;
                zerosAndOnes(len,"",0);
                System.out.println(count);
            }
	 }


}
