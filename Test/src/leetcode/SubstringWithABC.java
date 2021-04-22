package leetcode;

import java.util.Arrays;

public class SubstringWithABC {
	
	 public static int numberOfSubstrings(String s) {
	        int count[] = {0, 0, 0}, res = 0 , i = 0, n = s.length();
	        for (int j = 0; j < n; ++j) {
	            ++count[s.charAt(j) - 'a'];
	            while (count[0] > 0 && count[1] > 0 && count[2] > 0)
	                --count[s.charAt(i++) - 'a'];
	            res += i;
	        }
	        return res;
	    }

	public static void main(String[] args) {
		
		String s = "abcabcabc";
		numberOfSubstrings(s);
		String[] arr = s.split("");
		Arrays.sort(arr,(s1,s2) -> s1.length() - s2.length());
		int a = 'A';
		int b = 'a';
		System.out.println(a);
		System.out.println(b);
		StringBuilder sb = new StringBuilder(s);
		char c = 'i';
		char d = (char) ((char)c-32);
		System.out.println(d);
		sb.insert(0, (char)((char)s.charAt(0)-32));
		sb.deleteCharAt(1);
		System.out.println(sb.toString());
		long l = Long.valueOf("100022051");
		int x = (int)l;
		long[] df = new long[10];
		for (long ds : df) {
			
		}
		
	}

}
