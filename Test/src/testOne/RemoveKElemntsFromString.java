package testOne;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RemoveKElemntsFromString {
	
	public static String check() {
		
		String num = "5337";
		int k = 2;

        
        if (num.length() <= 0)
//            return "0";
        	System.out.println(0);
        
        if (num.length() == k) {
//            return "0";
        	System.out.println(0);
        }
        int len = num.length();
        ArrayList<String> al = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        //1432219
        for (int i = 0 ; i < len ; i++) {
            
            if (i+k <= len) {
                String str1 = num.substring(0,i);
                String str2 = num.substring(i+k,len);
                sb.append(str1).append(str2);
                
                al.add(sb.toString());
                sb.setLength(0);
            } else {
                break;
            }
            
        }
        
        Collections.sort(al, new Comparator<String>(){
           
            public int compare(String str1 , String str2) {
                BigInteger b1 = new BigInteger(str1);
                BigInteger b2 = new BigInteger(str2);
                return b1.compareTo(b2);
            }
        });
        
        String ans ="" ;
        int count = 0;
        int ansLen = 0;
//        int ansLen =
        String temp = "";
        boolean flag = false;
 /*       for (int i = 0 ; i < al.size();i++) {
        	
        	 temp = al.get(i);
        	 ansLen = temp.length();
	        for (int j = 0 ; i < ansLen ; i++) {
	            if (temp.charAt(j) == '0') {
	                count++;
	                flag = true;
	            } else {
	                break;
	            }
	        }
	        
	        
        }*/
       boolean isFlag = false; 
        for (int i = 0 ; i < al.size(); i++) {
        	
        	String temp1 = al.get(i);
        	
        	for (int j = 0 ; j < temp1.length() ; j++) {
        		
        		if (temp1.charAt(j) == '0') {
        			count++;
        		} else {
        			isFlag = true;
        			break;
        		}
        	}
        	
        	if (count == temp1.length()) {
        		
        		return "0";
        	} else if (count != temp1.length()) {
        		
        		return temp1.substring(count,temp1.length());
        	} else {
        		return temp1;
        	}
        	
        	
        }
        
        
        return "";
	}
	
	public static void main(String[] argss) {
		System.out.println(check());
	}

}
