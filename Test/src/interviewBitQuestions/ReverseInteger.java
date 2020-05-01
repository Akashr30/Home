package interviewBitQuestions;

import java.util.InputMismatchException;

public class ReverseInteger {
	
	public static void main(String[] a) {
		
		int ans = 0;
		try {
            int A = 1146467285;
	        String str = A+"";
	        String symbol = "";
	        StringBuilder sb = new StringBuilder();
	        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
	            symbol = str.charAt(0)+"";
	            str = str.substring(1,str.length());
	        }
	        
	        str = symbol+""+sb.append(str).reverse().toString();
	        
	        ans =  Integer.parseInt(str);
	        
	        } catch (NumberFormatException e) {
	        	ans = 0;
	        	System.out.println(ans);
	        } catch (Exception e) {
	            ans = 0;
	        }
		
	}

}
