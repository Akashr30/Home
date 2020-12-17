package com.java8;

interface Checkkk {
	
	public void print(int x , int y) ;
	
}


public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		
		Checkkk ch = new Checkkk() {

			@Override
			public void print(int x, int y) {
				System.out.println(x+y);
			}
		};
		
		Checkkk chs = (x,y) -> System.out.print(x+y);
		
		ch.print(5, 8);
		chs.print(5, 55);
	}
}
