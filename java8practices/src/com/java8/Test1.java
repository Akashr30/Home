package com.java8;

interface A1 {
	public void m1();
	public void m2();
}

interface A2 {
	public void m1();
}

public class Test1 implements A1,A2 {
	
	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.m4();
		A1 t1 = t;
		t1.m1();
		
	}
	
	public void m4() {
		System.out.println("Test m4");
	}
	
	public void m1() {
		System.out.println("Test m1");
	}
	
	public void m2() {
		System.out.println("Test m2");
	}
}
