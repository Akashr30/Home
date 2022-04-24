package com.overriding;

 abstract class Person {
	int a ;
	Person(int a) {
		this.a = a;
	}
	abstract void tellMeYourName();
	void m1() {
		System.out.println("parent m1");
	}
}

 interface Interf {
	
	int z = 0;
	
} 

public class AbstractCheck extends Person {
	
	AbstractCheck() {
		super(5);
	}
	
	void m1() {
		System.out.println("m1");
	}
	
	@Override
	void tellMeYourName() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		Person abs = new AbstractCheck();
		abs.m1();
//		Interf.z = 5; Not possible to reassign variables in interface as the are public static final
		
	}
}
