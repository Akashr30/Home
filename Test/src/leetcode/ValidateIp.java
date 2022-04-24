package leetcode;

import java.util.ArrayList;

public class ValidateIp {
	
public static String validIPAddress(String ip) {
        
        if (ip.contains("."))  {
            
            String[] arr = ip.split("\\.");
            
            if (arr.length != 4)
                return "Neither";
            
            for (int i = 0 ; i < arr.length ; i++) {
                
                if (Integer.parseInt(arr[i]) > 255)
                    return "Neither";
                
                if (Integer.parseInt(arr[i]) < 10 && (arr[i].length() == 2 || arr[i].length() ==3 )) 
                    return "Neither";
                
                if ((Integer.parseInt(arr[i]) < 100 && Integer.parseInt(arr[i]) >= 10) 
                    && (arr[i].length() == 3 )) 
                    return "Neither";
            }
            
            return "IPv4";
        } else if  (ip.contains(":")) {
            
            String[] arr = ip.split(":");
            
             if (arr.length != 8  || ip.charAt(ip.length()-1)==':')
                return "Neither";
            
            
            for (int i = 0 ; i < arr.length ; i++) {
                
                if (arr[i].length() == 0 || arr[i].length() >= 5)
                    return "Neither";
                int prev = -100;
                int curr = 0;
                for (int x = 0 ; x < arr[i].length() ; x++) {
                    
	        		if( Character.isDigit(arr[i].charAt(x))) {
	                    continue;
	                } else {
                        if (arr[i].charAt(x)-'a' >= 0 && arr[i].charAt(x)-'a' < 26 ) {
                            curr = 1;
                        } else 
                            curr = 0;
                        
                        if (prev==0 && curr == 1)
                            return "Neither";
                        
                        prev = curr;
                    }
                }
            }
            
            
            
            return "IPv6";
        } else {
            
            return "Neither";
        }
        
    }

	public static void main(String[] ar) {
		String str = "20EE:FGb8:85a3:0:0:8A2E:0370:7334";
//		String str = "2001:0db8:85a3:0000:0:8A2E:0370:733a";
//		String str = "2001:0db8:85a3:0000:0:8A2E:0370:733a";
//		"20EE:Fb8:85a3:0:0:8A2E:0370:7334"
		System.out.println(validIPAddress(str));
		int a = 'A';
		int b = 'a';
		int c = 'h';
		int d = 'X';
		System.out.println(c-a);
		System.out.println(d-a);
		System.out.println(a-b);
	}

}
