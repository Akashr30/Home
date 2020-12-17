package com.overriding;

import java.util.Arrays;
import java.util.Stack;

class P {
	 
	 static void m1() {
		 System.out.println("parent m1");
	 }
	 
 }
 
 class C extends P {
	 static void m1 () {
		 System.out.println("child m1");
	 }
 }
 
public class Overriding1   {

	public static void main(String... args) {
		
		P p = new P();
		p.m1();
		P p1 = new C();
		p1.m1();
		C c = new C();
		c.m1();
		Stack<int[]> stack = new Stack<>();
		int[][] intervals = new int[1][1];
		Arrays.sort(intervals,(o1,o2)->Integer.compare(o1[0],o2[0]));
	}

}
