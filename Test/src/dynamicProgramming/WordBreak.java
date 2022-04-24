package dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordBreak {
	
	static HashMap<String,Boolean> map = new HashMap<>();
    public static boolean wordBreak(String s, List<String> wordDict) {
        
        if (wordDict.contains(s))
            return true;
        
        if (map.containsKey(s))
            return map.get(s);
        
        
        for (int i = 1 ; i <= s.length() ; i++) {
            String temp = s.substring(i);
            
            if (wordDict.contains(s.substring(0,i)) && wordBreak(temp,wordDict)) {
                map.put(s,true);
                return true;
                
            }
        }
        map.put(s,false);
        return false;
    }


	public static void main(String[] args) {
		
		String s = "catsanddog";
		List<String> wordDict = Arrays.asList(new String[]{"cats", "dog", "sand", "and", "cat"});
		wordBreak(s,wordDict);

	}

}
