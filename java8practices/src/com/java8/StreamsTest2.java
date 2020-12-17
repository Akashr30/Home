package com.java8;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,1,1,1};
		Stream<Integer> s = Stream.of(arr[0],arr[1],arr[2],arr[3],1,1,3,4,4);
		Set<Integer> set = IntStream.of(arr).boxed().collect(Collectors.toSet());
		Set<Integer> set2 = s.collect(Collectors.toSet());
	}

}
