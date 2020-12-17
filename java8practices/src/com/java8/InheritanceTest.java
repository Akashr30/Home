package com.java8;

class I1 {
	
	int no;
	String name;
	I1(){}
	I1(int no,String name) {
		this.no = no;
		this.name = name;
	}
	
	void m1() {
		System.out.println("parent m1");
	}
	void m2() {
		System.out.println("parent m2");
	}
	void m3() {
		System.out.println("parent m3");
	}
}

public class InheritanceTest extends I1 {
	
	int a1;
	int a2;
	InheritanceTest(){}
	InheritanceTest(int a1, int no ,String name,int a2){
		super(no,name);
//		this.no = no;
//		this.name = name;
		this.a1 = a1;
		this.a2 = a2;
	}
	
	void m3() {
		System.out.println("child m3");
	}
	
	void m4() {
		System.out.println("child m3");
	}

	public static void main(String[] args) {
		
		I1 it = new InheritanceTest();
		InheritanceTest it1 = new InheritanceTest();

	}

}
