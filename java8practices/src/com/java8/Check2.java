package com.java8;

public class Check2 {
	public static int b1 = 5;
	private static int b = 5;
	
	public static  class Inner {
		public static void m1() {
			System.out.println("inner m1"+b+b1);
		}
	}

	public static void main(String[] args) {
		
		
		/*Check2 a = new Check2();
		Inner a1 = a.new Inner();
		a1.m1();*/
		
		/*Inner ch = new Check2.Inner();
		ch.m1();
		Check2.Inner.m1();
		int x = ch.a;*/
		
		/*Check2.Inner c = new Check2.Inner();
		int x = c.a;
		c.m1();*/
		
		// if inner class is non static
		/*Check2 c = new Check2();
		Inner a1 = c.new Inner();*/
		
		/*Check2.Inner obj = new Check2.Inner();
		obj.m1();
		//or
		Check2.Inner.m1();*/
		
		
	}

}
