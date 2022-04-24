package com.mypractice;

class classA {
	int var1 = 5;
	public  String myFullName() {
		return "Dev";
	}
	
	public classA m1() {
		return new classA();
	}
}

interface interfaceA {
	public String myFullName();
}

public class Sample extends classA  {
	
	public int x = 5;
	
	public String myLastName() {
		return "Sena";
	}
//	@Override
	public String myWholeName() {
		return "Devasena";
	}
	
//	public Sample m1() {
//		return new Sample();
//	}
	public static void main(String[] args) {
		
		Sample obj = new Sample();
		classA a = obj.m1();
		System.out.println(a.myFullName());
	
		
	}



}
