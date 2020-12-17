package leetcode;

public class CountAndSay {
	// in complete
    public static String countAndSay(int n) {
        
        if (n-- == 1)
            return "1";
        
        StringBuilder sb = new StringBuilder("1");
        while ( n-- > 0) {
        
            String str = sb.toString();
            sb.setLength(0);
            
            for (int i = 0 ; i < str.length() ;) {
                int count = 1;
                char c = str.charAt(i);
                int j = i+1;
                if ( j <= str.length()) {
	                for ( ; j < str.length() ; j++) {
	                    if (str.charAt(j) == c)
	                        count++;
	                    else {
	                        i = j-1;
	                        break; 
	                    }
	                }
	                sb.append(count).append(c);
	                 i++;
                } else 
                	i++;
            }
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		
		int n = 4;
		System.out.println(countAndSay(n));

	}

}
