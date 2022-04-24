package leetcode;

public class MaxRepeatingSubString {
	
    public static int maxRepeating(String seq, String word) {
        
        int st = 0;
        int end = word.length() , len = seq.length();
        int count = 0;
        
        while (end <= len) {
            
            String temp = seq.substring(st,end);
            if (temp.equals(word)) {
                count++;
                st += word.length();
                end += word.length();
                continue;
            } 
            st++;
            end++;
        }
        return count;
    }

	public static void main(String[] args) {
		
		String seq = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
		String word = "aaaba";
		maxRepeating(seq,word);		

	}

}
