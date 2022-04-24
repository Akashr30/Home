package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostCommonWord {
	
	public static String mostCommonWord(String paragraph, String[] banned) {
	        
	        HashMap<String,Integer> words = new HashMap<>();
	        
	        paragraph = paragraph.replaceAll("[^a-zA-Z\\s-]", " ").toLowerCase();
	        System.out.println(paragraph);
	        String[] arr = paragraph.split(" ");
	        
	        for (String x : arr) {
	        	
	        	if(x.matches("^\\s*$"))
	        		continue;
	        	
	        	if (words.containsKey(x)) {
	        		words.put(x,words.getOrDefault(x, 0)+1);
	        	} else
	        		words.put(x, 1);
	        }
	        
	        for (String x : banned) {
	        	if (words.containsKey(x))
	        		words.remove(x);
	        }
	        int max = Integer.MIN_VALUE;
	        String nonB= "";
	        for (Map.Entry<String,Integer> map :words.entrySet()) {
	        	if (map.getValue() > max) {
	        		max = map.getValue();
	        		nonB = map.getKey();
	        	}
	        }
	       return nonB;
	    }
	public static void main(String[] ar) {
		
//		String para ="Bob hit a ball, the hit BALL flew far after it was hit.";
//		String[] banned = {"hit"};
//		String para = "a.";
//		String[] banned = {};
		String para = "a, a, a, a, b,b,b,c, c";
		String[] banned = {"a"};
		System.out.print(mostCommonWord(para,banned));
	}
}
