package testOne;

import java.util.Scanner;

interface test {

	void m1();
	void m2();
}

public class InterfaceConcepts implements test{
	
		public void m1 () {
			System.out.println("m1");
		}
		
		public void m2 () {
			System.out.println("m2");
		}
		
		public void m3() {
			System.out.println("m3");
		}
		
		public void m4() {
			System.out.println("m4");
		}
		
		public static void main(String[] avsdzf) {
			
			InterfaceConcepts ic = new InterfaceConcepts();
			ic.m1();
			
			test t1 = new InterfaceConcepts();
			t1.m1();
			t1.m2();
			
			
		}
}