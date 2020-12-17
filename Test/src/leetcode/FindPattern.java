package leetcode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindPattern {
	
	 private static String find(String s) {
	        
	        Map<Character,Integer> map = new LinkedHashMap<>();
	        StringBuilder sb = new StringBuilder();
	        for (char c : s.toCharArray())
	            map.put(c,map.getOrDefault(c,0)+1);
	        
	        for (int x : map.values())
	            sb.append(x);
	        
	        return sb.toString();
	    }
	    
	    
	    public static List<String> findAndReplacePattern(String[] words, String pattern) {
	    
	        
	        List<String> al = new ArrayList<>();
	        String pat = find(pattern);
	        for (String s : words) {
	        	String temp = find(s);
	            if (pat.equals(temp)) {
	                al.add(s);
	            }
	        }
	        
	        return al;
	    }

	public static void main(String[] args) {
		
		String[] val = {"badc","abab","dddd","dede","yyxx"};
		String s = "baba";
		findAndReplacePattern(val,s);
	}

}
