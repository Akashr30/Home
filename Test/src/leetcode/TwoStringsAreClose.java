package leetcode;

import java.util.Arrays;

public class TwoStringsAreClose {
	
	public static  boolean closeStrings(String word1, String word2) {
        
	     if (word1.length() != word2.length())
	            return false;
	        
        if (!checkHasEqualChars(word1,word2))
            return false;
        
        return  isSwap(word1,word2); 
    }
    
    private static boolean isSwap(String s1 , String s2) {
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for (int i = 0 ; i < s1.length() ; i++) {
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for (int i = 0 ; i < 26 ; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        
        return true;
        
    }
    
    private static boolean checkHasEqualChars(String s1 , String s2) {
        
    	int[] arr1 = new int[26], arr2 = new int[26];
        for (char ch : s1.toCharArray())
            arr1[ch - 'a']++;
        for (char ch : s2.toCharArray())
            arr2[ch - 'a']++;
		
		// if one has a letter which another one doesn't have, dont exist
        for (int i = 0; i < 26; i++) {
            if (arr1[i] == arr2[i]) {
                continue;
            }
            if (arr1[i] == 0 || arr2[i] == 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {

		
		String s1 = "cabbba";
		String s2 = "abbccc";
		closeStrings(s1,s2);
		String s = Integer.toBinaryString(1);
		System.out.println(s);
		try {
			System.out.println("before");
			System.exit(1/0);
			System.out.println("asfasdfs");
		} finally {
			System.out.println("finally");
		}
	}

}
