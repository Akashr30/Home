package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringTest {
	
	static int i = 0;
	
	StringTest(int c){
		i = c;
	}
	
	public String toString() {
		return "StringTest@"+(++i);
	}

	public static void main(String[] args) {
		
		String s = new String("abc");
		System.out.println(s);
		s.concat("def");
		System.out.println(s.intern());
		StringTest df = new StringTest(10);
		System.out.println(df);
		StringTest df1 = new StringTest(20);
		System.out.println(df1);
		StringTest df2 = new StringTest(30);
		System.out.println(df2);
		
		Integer[] arr = {1,2,3,45,6,8,7,9};
		List<Integer> al = Arrays.asList(arr);
		Arrays.sort(arr,0,5);
		Collections.sort(al , new Comparator<Integer>(){

			@Override
			public int compare(Integer o1 , Integer o2) {
				
					if (o1%2 == 0 && o2%2 == 0) {
						return Integer.compare(o1, o2);
					} else if (o1%2 != 0 && o2 %2 != 0) {
						return -Integer.compare(o1, o2);
					} else if (o1%2 == 0 && o2 %2 != 0) {
						return -1;
					} else if (o1%2!=0 && o2 %2 == 0) {
						return 1;
					} else 
						return 0;
			}
		});
		
		System.out.println(al);
	}

}
