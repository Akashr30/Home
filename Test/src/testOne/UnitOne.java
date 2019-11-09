package testOne;

//this keyword in constructor
/*class Test {
		
//		int var1 = 0;
//		
//		Test(){
//			System.out.println("Default constructor is called");
//		}
//		Test(int a){
//			this();
//			this.var1 = a ;
//			System.out.println("paramter constructor called."+" the value passed is :"+var1);
//		}
	UnitOne obj2;
	Test(UnitOne obj){
		this.obj2 = obj;
		
		obj2.display();
	}
}
*/
public  class UnitOne {
	
	int x = 5;
	
//	Test obj1 = new Test(null);
	
	void display () {
		System.out.println("The value is "+ x);
	}
	
	static {
		System.out.println("static Check");
	}
	 strictfp static void main(String[] args) {
		
//		Test obj1 = new Test();
//		Test obj2 = new Test(5);
		
		UnitOne obj3 = new UnitOne();
		System.out.println("----------------------");
		System.out.println("main maethod args is : "+args);
		System.out.println("------------wrapper and primitive----------");
		Integer I = new Integer (10);
		System.out.println(I.getClass().getName());
		String s = Long.toBinaryString(15);
		System.out.println("Binary string is : "+s);
		int a1 = 65;
		Integer a = new Integer(a1);
		System.out.println("Boxing : "+a);
	}

}
