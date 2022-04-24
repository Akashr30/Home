package zohoInterviewQstns;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumOccurences {

	public static void main(String[] args) {
		
//		String str = "occurences"; 
		String str = "abcdefghijklmn";
//		String str = "Mississippi";
		int max = 0;
		int count = 0;
		int idx = -1;
		
		Map <Integer,Integer> map = new HashMap<>();
		for (int i = 0 ; i < str.length() ; i++) {
			
			char ch = str.charAt(i);
			for (int j = 0 ; j < str.length() ; j++) {
				if (ch == str.charAt(j)) {
					count++;
					 idx = j;
				}
			}
			if (count > max) {
				
				max = count;
				map.clear();
				map.put(idx, max);
				count = 0;
				idx = 0;
			} else if (count == max) {
				for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
					if (entry.getKey() > idx) {
						map.clear();
						map.put(idx, count);
						break;
					}
				}
				count = 0;
				idx = 0;
			} else {
				count = 0;
				idx = 0;
			}
		}
		
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
		System.out.println("counts = "+entry.getValue()+" And character is "+str.charAt(entry.getKey()));
		
		
	}

}
