package leetcodeWeeklyContestDiscussion;

import java.util.HashMap;

public class GoodWayString {
	
	static HashMap<Character,Integer> h1 = new HashMap<>();
	static HashMap<Character,Integer> h2 = new HashMap<>();
	
    public static int numSplits(String s) {
        
        int n = s.length();
        int count = 0;
        
        if (n == 0 || n == 1)
            return n;
//        HashMap<Character,Integer> h1 = new HashMap<>();
//        HashMap<Character,Integer> h2 = new HashMap<>();
        
        if (n > 2) {
            for (int i = 0 ; i < n ; i++) {
                
                if (h2.containsKey(s.charAt(i))) {
                    h2.put(s.charAt(i),h2.getOrDefault(s.charAt(i),0)+1);
                } else {
                    h2.put(s.charAt(i),1);
                }
            }
        }
        
        for (int i = 0 ; i < n-1 ; i++) {
            
            String str1 = s.substring(0,i+1);
            String str2 = s.substring(i+1,n);
            
            if (h1.containsKey(s.charAt(i))) {
                h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
            } else {
                h1.put(s.charAt(i),1);
            }
            
            if (h2.containsKey(s.charAt(i))) {
                int val = h2.get(s.charAt(i))-1;
                if (val == 0)
                    h2.remove(s.charAt(i));
                else 
                    h2.put(s.charAt(i),val);
            }
            
            if (str1.length() > 0 && str2.length() > 0 && h1.size() == h2.size()) {
                count++;
            }
        }
        
        return count;
    }

	public static void main(String[] args) {

		String s = "aaaaa";
		System.out.print(numSplits(s));
	}

}


//public boolean has(String str1 , String str2) {
 
//  int max = Math.max(str1.length() , str2.length());

 
//  for (int i = 0 ; i < max ; i++) {
     
//      if (i < str1.length()) {
//          h1.add(str1.charAt(i));
//      }
     
//      if (i < str2.length()) {
//          h2.add(str2.charAt(i));
//      }
     
//  }
 
//  return h1.size()== h2.size();
 
//}