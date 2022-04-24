package leetcode;

public class RepeatedSubstringPattern {
	
	public static boolean repeatedSubstringPattern(String s) {  
        
		/*int n = s.length();
        int mid = n/2;
        
        while (mid >= 1) {
            
            String temp = s.substring(0,mid);
            int num = mid;
            int st = num;
            while (true && num <= n && mid > 0) {
                
                int end = num+mid;;
                String str = "";
                if (end <= n)
                    str = s.substring(st,end);
                if (st >= n)
                	return true;
                
                if (!temp.equals(str))
                    break;
                
                st += mid;
                num = end;
            }
            mid--;
        }
       return false;*/
		
		/*int n = s.length();
        for(int l = n / 2; l > 0; l--) {
            if(n % l == 0) {
                int i = 0;
                while(i + l < n && s.charAt(i) == s.charAt(i +  l))
                    i++;
                if(i + l == n)
                    return true;
            }
        }
        return false;
    */
	  	/*int[] prefix = kmp(s);
        int len = prefix[s.length()-1];
        int n = s.length();
        return (len > 0 && n%(n-len) == 0);*/
		
		  String str = s + s;
	        return str.substring(1, str.length() - 1).contains(s);
	
	}
	
	/*private static int[] kmp(String s){
        int len = s.length();
        int[] res = new int[len];
        char[] ch = s.toCharArray();
        int i = 0, j = 1;
        res[0] = 0;
        while(i < ch.length && j < ch.length){
            if(ch[j] == ch[i]){
                res[j] = i+1;
                i++;
                j++;
            }else{
                if(i == 0){
                    res[j] = 0;
                    j++;
                } else {
                    i = res[i-1];
                }
            }
        }
        return res;
    }*/

	public static void main(String[] args) {
		
//		String str = "abcabcabcabc";
//		String str = "aba";
		String str = "aaaababababab";
//		String str= "aaa";
//		String str = "abasdgsdfhgsdfhgfghfsdghsdfdghsdfgsdftghsdfgsfdgsdfgsdfgsdfgsdfgdfsgsdfgb";
		System.out.println(repeatedSubstringPattern(str));
	}

}
