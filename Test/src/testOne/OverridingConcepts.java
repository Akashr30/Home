package testOne;

class ParentOne{
	
	void m1() {
		System.out.println("parent method");
	}
	
	void m2 () {
		System.out.println("parent method 2");
	}
}

public class OverridingConcepts extends ParentOne{
	
	void m1 () {
		System.out.println("child method");
	}
	
	public static void main (String[] args) {
		
	/*	OverridingConcepts oc = new OverridingConcepts();
		oc.m1();*/
		
		ParentOne  oc = new OverridingConcepts();
		oc.m1();
		oc.m2();
		
	}

}
