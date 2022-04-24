package dynamicProgramming;

import java.util.HashMap;
import java.util.HashSet;

public class PalindromicSubStrings {
	
	int count = 0;
    public int countSubstrings(String s) {
        
        find(s,0,new HashSet<>(),new StringBuilder());
        return count;
    }
    
    private void find(String s , int st, HashSet<String> map , StringBuilder sb) {
        
        
        for (int i = st ; i < s.length() ; i++) {
            
            String temp = s.substring(st,i+1);
            sb.append(temp);
            if (temp.equals(sb.reverse().toString())) {
//                map.put(temp,true);
            	map.add(temp);
                count++;
                sb.setLength(0);
                continue;
            } 
            sb.setLength(0);
            find(s,i+1,map,sb);            
        }
    }

	public static void main(String[] args) {
		
		String s = "abc";
		new PalindromicSubStrings().countSubstrings(s);
	}

}
