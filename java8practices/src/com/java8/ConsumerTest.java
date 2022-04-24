package com.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerTest {
	
	public static void main(String[] ar) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(4);
		Consumer<Integer> c = x-> {
			int temp = x+10;
			al2.add(temp);
			System.out.println(temp);
		};
		add(al,c);
		al2.stream().forEach(System.out::println);
	}

	private static void add(ArrayList<Integer> al, Consumer<Integer> c) {
		for (int x : al)
			c.accept(x);
	}
	
}
