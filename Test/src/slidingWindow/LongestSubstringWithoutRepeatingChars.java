package slidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChars implements AutoCloseable {
	
	 public static int lengthOfLongestSubstring(String s) {
      
      int len = s.length();
      int max = 0;
      int window = 0 , i = 0;
      HashMap<Character,Integer> map = new HashMap<>();
      
      while (i < len) {
          
          if (map.containsKey(s.charAt(i))) {
              window = Math.max(map.get(s.charAt(i)),window);
          }
          
          max = Math.max(max, i-window+1);
          map.put(s.charAt(i),i+1);
          i++;
      }
      return max;
  }

	public static void main(String[] args) {
		
		String s = "adbccbacdf";
		lengthOfLongestSubstring(s);
//		LongestSubstringWithoutRepeatingChars obj = null;
		try (LongestSubstringWithoutRepeatingChars obj = new LongestSubstringWithoutRepeatingChars()) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
