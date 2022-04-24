package com.java8;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final public class FinalTest {
	
	 void m1() {
		System.out.println("asadsd");
	}
	public void m2() {
		System.out.println("asadsd");
	}
	protected void m3() {
		System.out.println("asadsd");
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		FinalTest ft = new FinalTest();
		Class a = ft.getClass();
		Method[] me = a.getMethods();
		for (Method x : me)
		System.out.println(x.getName());
	}

}
