package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {
	 static Boolean a;
	 
	 
	 public boolean find (int n) {
		 System.out.println("Checked : "+n);
		 return n%2 == 0;
	 }
	 public boolean find (double n) {
		 System.out.println("Checked : "+n);
		 return n%2 == 0;
	 }
	 public static void println(int num) {
		 System.out.println("value is "+num);
	 }
	 
	public static void main(String[] args) {
		
		String[] arr= {"1","2","3","4"};
		int[] arr1= {2,4,6,8,10,18,19,21};
		double[] arr2= {2,4,6,8,10,18,19,21};
		StreamsTest obj =  new StreamsTest();
		Arrays.stream(arr1).filter(obj::find).findAny().ifPresent(StreamsTest::println);
		Arrays.stream(arr1).filter(new StreamsTest()::find).forEach(StreamsTest::println);
		int a1 = Arrays.stream(arr1).filter(new StreamsTest()::find).findAny().getAsInt();
		double a2 = Arrays.stream(arr2).filter(new StreamsTest()::find).findAny().getAsDouble();
//		Arrays.stream(arr1).filter(new StreamsTest()::find).forEach(StreamsTest::println);
		StreamsTest st = new StreamsTest();
		try {
			a = true;
			if (a) {
				System.out.println("dfadf");
			}
		} catch (Exception e) {
			throw e;
		}
		long count = Arrays.stream(arr).count();
		System.out.println(count);
		int sum = Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
		System.out.println(sum);
		double sd = Arrays.stream(arr).mapToInt(Integer::parseInt).average().getAsDouble();
		System.out.println(sd);
		Arrays.stream(arr).mapToInt(Integer::parseInt).filter(x->x%2==0).forEach(System.out::println);
		Arrays.stream(arr).mapToInt(Integer::parseInt).map(x -> x+10).forEach(System.out::println);
		Arrays.stream(arr).mapToInt(Integer::parseInt).filter(x-> x%2==0).forEach(System.out::println);
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter:54 " + s);
	        return true;
	    });
//		int[] qw = {1,2,3,4,5};
//		int[] res = Arrays.asList(qw).stream().sorted((o1,o2) -> -o1.compareTo(o2)).toArray();
		Integer[] are = new Integer[] {1,5,6,4,7,8,9,3};
		Arrays.stream(are).filter(x -> x%2 == 1).forEach(System.out::println);
		IntStream s1 = Stream.of("1","2","3","4","456","556").mapToInt(Integer::parseInt).filter(x -> x%2 == 0);
		s1.forEach(System.out::println);
	}

}
