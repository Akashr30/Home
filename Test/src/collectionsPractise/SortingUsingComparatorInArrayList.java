package collectionsPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUsingComparatorInArrayList {
	
	public static void main(String[] ar) {
		
		List <String> al = new ArrayList<>();
		
		/*al.add("ABf");	// print based on length
		al.add("A");
		al.add("AB");
		al.add("XYX");
		al.add("ABcdf");
		al.add("Asdfg");
		al.add("ABf");
		al.add("aadsfg");
		al.add("abc");
		al.add("xyz");
		al.add("fgch");
		al.add("dgb");
		al.add("a");*/
		
		al.add("a");		// To print in order with mixed cases
		al.add("RSTUV");
		al.add("abcde");
		al.add("A");
		al.add("WXYZ");
		al.add("AA");
		al.add("aa");
		al.add("wxyz");
		al.add("aa");
		al.add("rstuv");
		al.add("ABCDE");
		al.add("aa");
		
		
//		Collections.sort(al);
		
		
		
		Collections.sort(al, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				/*if (s1.length() > s2.length()) {
					return 1;
				} else if (s1.length() < s2.length()) {
					return -1;
				} else {
					 return s1.toLowerCase().compareTo(s2.toLowerCase());
				}*/
				
				return s1.toLowerCase().compareTo(s2.toLowerCase());
//				else return 0;
//				return s1.compareTo(s2);
			};
		});
		
		
		System.out.println(al);
		
	}

}
