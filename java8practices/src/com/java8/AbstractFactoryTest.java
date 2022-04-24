package com.java8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


class AA1 {
	
	public String s ;
	
	
	AA1() {
		s = AA1.m3Final();
	}
	
	public void m1() {
		System.out.println("privaet m1");
	}
	private static String  m3Final() {
		return "Hellow";
	}
	public void m2() {
		System.out.println("parent m2");
	}
	
	private void m4() {
		System.out.println("privaet m4");
	}
	
	
}

public class AbstractFactoryTest extends AA1 {
	
	protected String test = "sdgsdgf";
	
	public AbstractFactoryTest(){
		super();
	}
	
	public  void m1() {
		System.out.println("Child m1");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		
		AbstractFactoryTest abx = new AbstractFactoryTest();
//		System.out.println(abx.s);
		int[] arr = new int[10];
		arr[0] = 5;
		arr[1] = -2;
		arr[2] = 3;
		int sum = Arrays.stream(arr).filter(x -> x > 0).sum();
		System.out.println(sum);
	}

}
