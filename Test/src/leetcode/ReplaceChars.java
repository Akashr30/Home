package leetcode;

public class ReplaceChars {
	
	public String modifyString(String s) {
	
	if (s.equals("?"))
		return "a";
	if (s.length()==0)
		return "";
        
	    char[] ch = s.toCharArray();
	    
	    for (int i = 0 ; i < ch.length ; i++) {
	        
	        if (ch[i] == '?') {
	            for (int j = 0 ; j < 26 ; j++) {
	                
	                if (i == 0 && ch[i+1] != 96+j) {
	                    ch[i] = (char) (96+j);
	                    break;
	                } else if (i == ch.length-1 && ch[i-1] != 96+j) {
	                    ch[i] = (char) (96+j);
	                    break;
	                } else if (ch[i-1] != 96+j && ch[i+1] != 96+j) {
	                    ch[i] = (char) (96+j);
	                    break;
	                }
	                
	            }
	        }
	    }
        
        return new String(ch);
    }
	
	public static void main(String[] args) {
		ReplaceChars df = new ReplaceChars();
//		String s = "??yw?ipkj?";
		String s = "?h";
//		String s = "c?q?c";
//		String s = "?lk???vq";
//		String s = "????????????????????????????????????????????????????????????????????????????????????????????????????";
		System.out.println(df.modifyString(s));
	}

}
