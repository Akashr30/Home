package ans;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RemoveKDigitsFromString {
	
	public static void main(String[] ar) {
		
		String num = "10";
		int k = 1;

        
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
        
        String ans = al.get(0);
        int count = 0;
        int ansLen = ans.length();
        for (int i = 0 ; i < ansLen ; i++) {
            if (ans.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }
        
//        return ans.substring(count,ansLen);
        System.out.println(ans.substring(count,ansLen));
	}

}
