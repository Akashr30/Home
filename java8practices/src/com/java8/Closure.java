package com.java8;

import java.util.ArrayList;
interface Process {
	void process (int i);
}

public class Closure {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		int a = 5;
		al.add(2);
		al.add(3);
		al.add(4);
		Process p = x->  System.out.println(x+a);
		add(al,p);
		
	}

	private static void add(ArrayList<Integer> al,Process p) {
		for (int x : al)
			p.process(x);
	}

}
