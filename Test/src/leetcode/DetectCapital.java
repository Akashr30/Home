package leetcode;

public class DetectCapital {
	
    public static boolean detectCapitalUse(String word) {
        
        
        int caps = -1;
        int caps2 = 0;
        int others = 0;
        int count = 0;
        int a = Math.abs(12-96);
        for (int i = 0 ; i < word.length();i++) {
            int val = word.charAt(i);
            if (val < 96) {
                    if (caps == -1)
                        caps = i;
                count++;
            }
            
        }
        
        if (count == word.length()) {
            return true;
        } else  if (caps == 0) 
            return true;
        else 
            return false;
        
    }
	

	public static void main(String[] args) {
		
		String s = "USA";
		detectCapitalUse(s);
	}

}
