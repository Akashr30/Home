package com.staticTest;

import java.util.Random;

interface StatInterf {
	public void print(int n);
}
public class StaticTest1 {
	
	private static int z = 0;
	  public static class Inner {
		 static int y = 10;
		 int x = 5;
		  int get() {
			return x+y+z;
		}
	}
	
	  
	 
	public static void main(String[] ar) {
		
		Random r = new Random();
		StatInterf asd = (n) -> {
			while (n++ < 10)
				System.out.println( r.nextInt(10));
		};
		asd.print(0);
		System.out.println();
	}

}
