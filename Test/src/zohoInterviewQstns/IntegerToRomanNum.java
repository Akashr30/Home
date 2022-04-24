package zohoInterviewQstns;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRomanNum {
	
	public static void main (String[] a) {

		int A = 999;
        
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"I");
        // map.put(4,"IV");
        map.put(5,"V");
        // map.put(9,"IX");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        boolean flag = true;
        StringBuffer sb = new StringBuffer();
        
        
            
            if (A >= 1000) {
                
                int quotient = A/1000;
                int rem = A%1000;
                
                for (int i = 0 ; i < quotient ; i++) {
                    sb.append(map.get(1000));
                }
                
                A = rem;
                
            } 
            if (A < 1000 && A >= 100) {
                
                int quotient = A/100;
                int rem = A%100;
                
                if (quotient == 4) {
                    sb.append(map.get(100)).append(map.get(500));
                } else if (quotient == 9) {
                    sb.append(map.get(100)).append(map.get(1000));
                } else if (quotient >= 5 ) {
                    sb.append(map.get(500));
                    for (int i = 0 ; i < quotient-5 ; i++) {
                        sb.append(map.get(100));
                    }
                    
                } else {
                    for (int i = 0 ; i < quotient ; i++) {
                        sb.append(map.get(100));
                    }
                }
                
                A = rem;
                    
            } 
            
            if (A < 100 && A >= 10) {
                
                int quotient = A/10;
                int rem = A%10;
                
                if (quotient == 4) {
                    sb.append(map.get(10)).append(map.get(50));
                } else if (quotient == 9) {
                    sb.append(map.get(10)).append(map.get(100));
                } else if (quotient >= 5 ) {
                    sb.append(map.get(50));
                    for (int i = 0 ; i < quotient-5 ; i++) {
                        sb.append(map.get(10));
                    }
                    
                } else {
                    for (int i = 0 ; i < quotient ; i++) {
                        sb.append(map.get(10));
                    }
                }
                
                A = rem;
                
            } 
            
            if (A > 0 && A < 10) {
                
                if (A == 4) {
                    sb.append(map.get(1)).append(map.get(5));
                } else if (A == 9) {
                    sb.append(map.get(1)).append(map.get(10));
                } else if (A >= 5 ) {
                    sb.append(map.get(5));
                    for (int i = 0 ; i < A-5 ; i++) {
                        sb.append(map.get(1));
                    }
                    
                } else {
                    for (int i = 0 ; i < A ; i++) {
                        sb.append(map.get(1));
                    }
                }
            }
            
            
        
        System.out.println(sb.toString()); 
        
        
    
	}
	

}
