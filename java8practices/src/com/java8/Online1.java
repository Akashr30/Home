package com.java8;

import java.util.List;
import java.util.TreeMap;

public class Online1 {
	
	public static String getShiftedString(String s, int lhs, int rhs) {
        
        int len = s.length();
        int num1 = lhs%len;
        int num2 = rhs%len;
        
        String lhs1 = s.substring(0,num1);
        String lhs2 = s.substring(num1,len);
        String conct = lhs2+lhs1;
        
        String rhs1 = conct.substring(len-num2,len);
        String rhs2 = conct.substring(0,len-num2);
        
        conct = rhs1+rhs2;
        
        return conct;
    }

	public static void main(String[] args) {
		
		String s = "abcdef";
		int l = 10;
		int r = 10;
		System.out.println(getShiftedString(s,l,r));
		TreeMap<String,Integer> map = new TreeMap<>();
		List<Integer> arr = (List<Integer>) map.values();
	}

}
