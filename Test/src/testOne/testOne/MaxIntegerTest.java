package testOne.testOne;

public class MaxIntegerTest {
	
	public static int atoi() {
		
		String A = "V515V 5793K 627 23815945269 1 1249794L 631 8755 7";
		String[] arr = A.split(" ");
	    char[] ch = arr[0].toCharArray();
	    int startIdx = 0;
	    boolean startFlag = true;
	    String conct = "";
	    int ans = 0;
	    String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#!$%^&*()_-=+[]{}'?/;:";
	    boolean skipStart = true;
	    for (int i = 0 ; i < ch.length ; i++) {
	        if ((ch[0] == '-' || ch[0] == '+')  && startFlag) {
	            startIdx = i;
	            conct += ch[0];
	            startFlag = false;
	            continue;
	        }
	        /*if (str.indexOf(ch[0]) >= 0) {
	            return 0;
	        }*/
	        
	        if (startFlag) {
              startIdx = i;
              startFlag = false;
	        }
	        
	        if (str.indexOf(ch[i]) == -1) {
	            conct += ch[i];
	        } else {
	            break;
	        }
	    }
	    
        try {
        	if (conct.length() > 0)
             ans = Integer.parseInt(conct);
        	else 
        		ans = 0;
        } catch (NumberFormatException e) {
            if (conct.charAt(0) == '-') {
                ans = Integer.MIN_VALUE;
            } else {
                ans = Integer.MAX_VALUE;
            }
        } catch (Exception e1) {
            ans = 0;
        }
        
	      
	    
	     return ans; 
		
	
		
	}
	
	
	public static void main(String[] ar) {
		
		System.out.println(atoi());
	}
}
