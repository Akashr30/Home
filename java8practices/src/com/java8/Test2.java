package com.java8;

import java.util.Arrays;

public class Test2 {
	
	private Test2() {
		
	}
	
	public static String longestPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        if (sb.append(s).toString().equals(sb.reverse().toString()))
            return s;
        
        int n = s.length();
        int max = 0;
        String ans = "";
        for (int i = 0 ; i < n ; i++) {
            
            for (int j = i+1 ; j <= n ; j++) {
            	System.out.println(s.substring(i,j));
                sb.append(s.substring(i,j));
                String temp = sb.toString();
                
                if (temp.equals(sb.reverse().toString())) {
                    
                    if (temp.length() > max) {
                        max = temp.length();
                        ans = temp;
                        
                    }
                    
                }
                sb.setLength(0);
            } 
        }
        return ans;
    }

	public static void main(String[] args) {
		
		String s = "OurCompanyisAltimetrikirtemitlAisaverygoodCompany";
		String temp = s.substring(9,10);
		System.out.println("ans is "+temp);
		Test2 f = new Test2();
		System.out.println(f.longestPalindrome(s));
		int[] arr = new int[] {1,2,3};
		int[] a = Arrays.copyOf(arr,5);
		int[] c = Arrays.copyOfRange(a, 0, 4);
		for (int i = 0 ; i < c.length ; i++) {
			System.out.println(c[i]);
		}
		System.out.print(10*20+"ABC");
		System.out.println("DEF"+10*20);
//		Integer.parseInt("10.87");
		int b = 96;
		System.out.println(b>>4);
		System.out.println(b>>>4);
		int e = 0;
		if (e++ >= 0) {
			System.out.println("e"+e);
		}
		int q = -4;
		System.out.println(q>>1);
		int y = 4;
		System.out.println(y>>2);
//		System.out.println(1+2==+3+++5);
		byte z = 5;
		System.out.println(z<<4);
		String s1 = "x y z";
		String[] arrrr = s1.split("\\s");
		for (String s11 : arrrr)
			System.out.println(s11);
	}

}
