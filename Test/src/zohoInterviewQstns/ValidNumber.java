package zohoInterviewQstns;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ValidNumber {
	
	public static int isValidNumber(String A) {

        
        int ans = 0;
        String str = A;
        str = str.replaceAll("\\s","");
        String[] arr = str.split("\\.");
        
        if (str.contains(".")) {
            if (arr.length != 2 ) {
                return 0;   
            }
            
            if (arr[1].charAt(0) == 'e') {
                return 0;
            }
        }
        
        
        try {
            BigDecimal bigDecimal = new BigDecimal(str);
            ans = 1;
        } catch (NumberFormatException e) {
            ans = 0;
        } catch (Exception e1) {
            ans = 0;
        }
        
        return ans;
    
    
	}
	
	public static void main (String[] arg) {
		
		String A = "2.3e10";
//		String A = "2.";
		
		System.out.println(isValidNumber(A));
		
	}

}
