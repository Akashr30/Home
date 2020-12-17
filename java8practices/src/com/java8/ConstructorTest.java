package com.java8;

import java.util.ArrayList;
import java.util.List;

class TestA {
	
	int a;
	int b;
	TestA(){}
	private TestA(int x , int y) {
		a = x;
		b = y;
	}
	
}



final class Constructorss {
	
	private int a;
	private int b;
	List<Integer> al;
	Constructorss(){}
	public Constructorss(int x,int y,ArrayList<Integer> al1) {
		a = x;
		b = y;
		al = al1;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public List<Integer> getAl() {
//		return al;
		return new ArrayList<>(al);
	}
}


public class ConstructorTest {
	
	public static void main(String[] ar) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(52);
		al.add(523);
		al.add(532);
		Constructorss s = new Constructorss(1,2,al);
		List<Integer> check = s.getAl();
		check.add(1000);
		
	}
}