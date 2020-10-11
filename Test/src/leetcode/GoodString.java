package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GoodString {
	 public static String makeGood(String s) {
	        
	        char[] c = s.toCharArray();
	        List<Character> res = new ArrayList<>();
	        StringBuffer sb = new StringBuffer();
	        for (char x : c)
	            res.add(x);
	        
	        // find(res,0,1);
	        int i = 0;
	        boolean flag = false;
	        int prev = res.size();
	        while (true) {
	            
	            if ( i < res.size()-1 && Character. toUpperCase(res.get(i+1))== Character. toUpperCase(res.get(i)) &&
	                ((Character.isUpperCase(res.get(i+1)) && Character.isLowerCase(res.get(i))) 
	                || (Character.isLowerCase(res.get(i+1)) && Character.isUpperCase(res.get(i))))) {
	                flag = true;
	                res.remove(i+1);
	                res.remove(i);
	            }
	            
	            if (i >= res.size()-1) {
	                i = -1;
	                flag = false;
	                if (prev == res.size()) {
	                    break;
	                } else {
	                    prev = res.size();
	                }
	            }
	            i++;
	        }
	        
	        for (char z : res)
	            sb.append(z);
	        
	        return sb.toString();
	    }
	 
	 public static void main(String[] ar) {
		 
		 String s = "djrDdRJD";
		 makeGood(s);
	 }
}
