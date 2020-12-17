package com.overriding;

class Animals3 {
	
	int front;
	int back;
	
	Animals3(){}
	Animals3(int x , int y) {
		this.front = x;;
		this.back = y;
	}
	
	final void countLegs () {
		System.out.println("Parent : total legs -> "+(front+back));
	}
	
}

class Dogs3 extends Animals3 {
	
	Dogs3(){}
	Dogs3(int x , int y){
		super(x,y);
	}
	
//	void countLegs() {
//		System.out.println("Child : total legs -> "+(front+back));
//	}
}

class Octopus extends Animals3 {
	int side;
	
	Octopus(){}
	Octopus(int front , int back , int side) {
		super(front,back);
		this.side = side;
	}
}

public class OverridingTest3 {

	public static void main(String[] args) {
		Animals3 d = new Dogs3(2,2);
		d.countLegs();
	}

}
