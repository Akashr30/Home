package com.java8;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalPractice {

	public static void main(String[] args) {
		
		int[] arr = {2,5,4,0,6,4,7,8,5};
		String[] as = {"","",""};
		Integer intt = null;
		OptionalInt obj = Arrays.stream(arr).filter(x -> x<2).findAny();
		Optional<String> adf = Arrays.stream(as).findAny();
//		System.out.println(obj.ifPresent(int::new));
		int val = obj.orElse(-1);
		System.out.println(val);
				
	}

}
