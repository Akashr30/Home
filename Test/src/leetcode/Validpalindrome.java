package leetcode;

public class Validpalindrome {
	
	public static boolean isPalindrome(String s) {
        
        // s = s.replaceAll("[^a-zA-Z0-9]","");
        // s.replaceAll("\\s","");
        StringBuffer sb = new StringBuffer();
        s= s.toLowerCase();
        for (int i=0 ; i < s.length() ; i++ ) {
            char c = s.charAt(i);
            if (( c > 96 && c < 122) 
                ||(c >=65 && c < 90)
                || Character.isDigit(c))
                sb.append( c);
        }
        
        return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }
	
	public static void main(String[] ar) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
}
