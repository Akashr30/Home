package oops2;

import oops.TestMethods;
import oops.PrivateProperties;
import oops.ProtectedClass;

public class Test extends ProtectedClass {
	
	

	public static void main(String[] args) {
		
//		System.out.println(i);
		Test t = new Test();
//		System.out.println(i);
		
		PrivateProperties pp = new PrivateProperties();
		ProtectedClass pc = new ProtectedClass();
		pp.getX();
		System.out.println(t);
		
		String ss = "ascd";
		System.out.println(ss.substring(0, 2));
	}
}
