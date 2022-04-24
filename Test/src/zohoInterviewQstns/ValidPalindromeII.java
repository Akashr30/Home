package zohoInterviewQstns;

public class ValidPalindromeII {
	
public boolean validPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        String str = sb.reverse().toString();
        sb.reverse();
        if (sb.toString().equals(str))
            return true;
        
        int len = s.length();
        
        for (int i = 0 ; i < len ; i++) {
            
            char temp = s.charAt(i);
            sb.deleteCharAt(i);
            
            if (isP(sb.toString()))
                return true;
            else 
                sb.insert(i,temp);
        }
        
        return false;
    }
    
    public boolean isP(String s) {
        int len = s.length();
        int mid = len/2;
        int i = 0 , j = 0;
        if (s.length()%2 == 0) {
            i = mid-1;
            j = mid;
        } else {
            i = mid;
            j = mid;
        }
        
        while (i >= 0 && j < len) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else 
                return false;
        }
        return true;
    }

	public static void main(String[] args) {
		
		String s = "tebbem";
		System.out.println(new ValidPalindromeII().validPalindrome(s));

	}

}
