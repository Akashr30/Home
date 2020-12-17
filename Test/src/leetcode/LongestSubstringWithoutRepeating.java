package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
	
    public static int lengthOfLongestSubstring(String s) {
        
        /*HashSet<Character> set= new HashSet<>();
        
        int st = 0;
        int end = 0;
        int max = 0;
        while (st <= end && end < s.length()) {
            char c = s.charAt(end);
            
            if (set.contains(c)) {
                max = Math.max(max,set.size());
                set.remove(s.charAt(st));
                st++;
            }
            end++;
            set.add(c);
        }
        
        return Math.max(max, set.size());*/
    	
    	String[] arr = s.split("");
        int window = 0;
        int i = 0;
        int len = arr.length;
        Set<String> set = new HashSet<>();
        int count = 0,max = Integer.MIN_VALUE;
        
        while (i < len)  {
            
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                count++;
                i++;
            } else {
                
                set.remove(arr[window]);
                window++;
                max = Math.max(count,max);
                count--;
            }
            
        }
        
        return Math.max(count,max);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "qrsvbspk";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
