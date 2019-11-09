package testOne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

class Parent {
	
	final void gett() {
		System.out.println("gets parent");
	}
	
	void putt() {
		System.out.println("drops parent");
	}
}

public class Polymorphism extends Parent{
		void getts() {
			System.out.println("gets child");
		}
		public static void main(String[] args) {
		
			Parent p = new Polymorphism();
			ArrayList al = new ArrayList();
			if (al instanceof Set) {
				System.out.println("yes");
			} else
				System.out.println("no");
			
		}
}
