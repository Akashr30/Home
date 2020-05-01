package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	
	public static void main(String[] ar) {
		
//		String[] arr = {}
		String s1 = "a";
		String s2 = "app";
		int len = s1.length();
		s1 = s1.substring(0,len);
		System.out.println(s1);
		 Map<String,Integer> mp = new HashMap<>();
		 mp.put("aa", 2);
		 mp.put("aaa", 3);
		 int sum = 0;
		 Iterator<Map.Entry<String, Integer>> itr = mp.entrySet().iterator();
		 while (itr.hasNext()) {
	            Entry <String, Integer> entry = itr.next();
	            
	            if (entry.getKey().contains("0")) {
	                sum += entry.getValue();
	            }
	        }
	}

}
