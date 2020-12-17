package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

interface A {
	
	public void sum(int a , int b);
}

public class LambdasTest {

	public static void main(String[] args) {
		
		
		A a = (c,d) -> System.out.println(c+d);
		
		a.sum(5, 10);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(43);
		al.add(435);
		al.add(3);
		al.add(45);
		al.add(260);
		al.add(54);
		
		Collections.sort(al,(o1,o2) ->  -o1.compareTo(o2) );
		System.out.println(al);
		Integer[] i1 = {1,2,3,4,5,6,7};
		Arrays.stream(i1).forEach(System.out::println);
	}

}
