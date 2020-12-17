package com.java8;

public class Check1 {
	static boolean[] arr = new boolean[3];
	int count = 0;
	
	static void fun() {
		arr[0] = true;
		arr[1] = true;
		if (arr[0] && arr[3-1] |arr[1]) {
			System.out.println("sdf");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check1 c = new Check1();
		Check1.fun();
	}

}
