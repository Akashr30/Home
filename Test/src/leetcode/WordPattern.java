package leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	
	public static boolean wordPattern(String pattern, String str) {
        
        /*String[] arr = str.split(" ");
        int n = pattern.length();
        if (arr.length != n)
            return false;
        //abba
        // "dog cat cat fish"
        String[] ans = new String[26];
        for (int i = 0 ; i < n ; i++) {
            int val = pattern.charAt(i) - 96;
            if (ans[val] == null) {
                ans[val] = arr[i];
            } else if (ans[val] != null && !ans[val].equals(arr[i])) {
                return false;
            }
        }
        return true;*/
		
		String[] arr = str.split(" ");
        int n = pattern.length();
        if (arr.length != n)
            return false;

       /* String[] ans = new String[26];
        ans[pattern.charAt(0) - 96] = arr[0];
        for (int i = 1 ; i < n ; i++) {
            int val = pattern.charAt(i) - 96;
            if (ans[val] == null)
                ans[val] = arr[i];
            
            if (pattern.charAt(i) != pattern.charAt(i-1)) {
                if (arr[i].equals(arr[i-1]) || !ans[val].equals(arr[i])) {
                    return false;
                }
            } else if (pattern.charAt(i) == pattern.charAt(i-1)) {
                if (!arr[i].equals(arr[i-1])) {
                    return false;
                }
            }
        }
        return true;*/
        HashMap<Character,String> res = new HashMap<>();
        res.put(pattern.charAt(0),arr[0]);
        for (int i = 1 ; i < n ; i++) {
            
        	char c = pattern.charAt(i);
            if (res.containsKey(c)) {
        		if (!res.get(c).equals(arr[i]) ) {
        			return false;
        		} 
        	} else {
        			if (res.containsValue(arr[i])) {
        				return false;
        			}
                    res.put(c,arr[i]);
        		}
        }
        // ans 2
        /*Map map = new HashMap();
        for (Integer i = 0; i < pattern.length(); i++)
            if (map.put(arr[i], i) != map.put(pattern.charAt(i), i))
                return false;*/
		return true;
    }

	public static void main(String[] args) {
		
		String a = "abba";
		String b = "dog cat cat fish";
		/*String a = "abc";
		String b = "dog cat dog";*/
		wordPattern(a,b);
		
		
	}

}
