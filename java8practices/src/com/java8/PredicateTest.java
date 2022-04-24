package com.java8;

import java.util.function.Function;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		Integer i = 11;
		
		Predicate<Integer> p = (Integer x) -> { return x < 10; };
		System.out.println(p.test(i));
		String[] s = {"deva","akash","sk","duggu"};
		Predicate<String> p1 = str -> str.contains("a");
		
		for (String s1 : s) {
			if (p1.negate().test(s1))
			System.out.println(s1+" "+p1.test(s1));
		}
		
		Function<String,String> f1 = str->str.toUpperCase();
		System.out.println(f1.apply("sk"));
		
		//------------------------------------------
		
		LongPredicate ip1 = x -> x > 10;
		System.out.println(ip1.test(100));
	}
	
}
