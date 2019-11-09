package testOne;

class abc {
	
	public String name;
	private int rollNo = 5;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	/*abc(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}*/
	
	
	
}


public class ConstructorAndObject {
	
	public static void main(String[] args) {
		
		abc ab = new abc();
		System.out.println(ab.getName());
		System.out.println(ab.getRollNo());
		ab.setName("A&D");
		System.out.println(ab.getName());
//		ab.rollNo = 6007;
		System.out.println(ab.getRollNo());
}
}