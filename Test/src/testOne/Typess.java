package testOne;

 interface test1{
	 int x = 5;
	 void get();
	 void putt();
	
}


public class Typess implements test1 {
	
	public static void main (String[] args) {
		
		int y = 10;
		test1 t = new Typess();
		Typess t1 = new Typess();
		
	}

	public void get() {
			System.out.println("getmethod");
	}

	@Override
	public void putt() {
		System.out.println("Putmethod");		
	}

}
