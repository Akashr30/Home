package testOne;

 abstract class Test123{
	 
	protected static int x = 5;
	
	 static void m1 ( ) {
		 
		System.out.println("abc"+x);
	}
	
}

public class AbstractConcepts extends Test123 {
	
	public static void main (String[] args) {
		
		m1();
		AbstractConcepts ac = new AbstractConcepts();
		System.out.println(ac.x);
	}

}
