package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {

	public static void main(String[] args) {
		
		
		Function<String[],List<Boolean>> f1 = str -> {
			
			String cons = "abc";
			String cons2 = "abc";
			List<Boolean> arr = new ArrayList<>();
			
			Predicate<String> p1 = s -> str[0].toLowerCase().equalsIgnoreCase(cons);
			 arr.add(p1.test(str[0]));
			 arr.add(p1.test(str[1]));
			 
			 return arr;
		};
		String[] arr = {"abc","abc"};
		System.out.println("abc : "+f1.apply(arr).get(0));
		System.out.println("abc : "+f1.apply(arr).get(1));
		
		Function<Integer,Integer> f2 = num1 -> 2*num1;
		Function<Integer,Integer> f3 = num2 -> 2*5;
		
		System.out.println(f2.compose(f3).apply(2));
		
	}

}
