package zohoInterviewQstns;


import java.util.*;
import java.io.*;

class LongestPalindromicSubstring {
	
	public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=extractPalindrome(s,i,i);//odd length
            count+=extractPalindrome(s,i,i+1);//even length
        }
        return count;
    }
    public int extractPalindrome(String s, int left, int right){
        int count=0;
        while(left>=0 && right<s.length()&& (s.charAt(left)==s.charAt(right))){
            left--;
            right++;
            count++;
        }
        return count;
    }
	
	
	
	public static void main(String... ad) {
		
		LongestPalindromicSubstring as = new LongestPalindromicSubstring();
		String s = "adsgmalayalamsdfgammafg";
		as.countSubstrings(s);
		
	}
	
	
}
