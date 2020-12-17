package leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class ComplexNumbers {

	public static void main(String[] args) {
		
		String a = "1+-1i";
		String[] arr = a.split("\\+");
		System.out.println(Arrays.toString(arr));
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		map.put('c',1);
		map.put('b',2);
		map.put('g',3);
		
		for (int x : map.values()) {
			
		}
		
		
	}

}
