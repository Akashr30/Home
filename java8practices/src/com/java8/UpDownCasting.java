package com.java8;

import java.util.ArrayList;


class A0 {
	
	public final int var = 10;
	int x ;
	int y ;
	  public final void m1() {
		 System.out.println("Paremt");
	 }
	  
	  public void m2() {
			 System.out.println("Paremt");
		 }
	
}

 class UpDownCasting extends A0 {
	 
	int a ;
	int b ;
	
	UpDownCasting () {
	}
	  
	
	public  void fun() {
		m1();
		super.m2();
		System.out.println(super.var);
	}
	
	
	public static void main(String[] args) {
		UpDownCasting as = new UpDownCasting();
//		as.fun();
		as.m1();
	}

}

 /*class Animal {

	  // overridden method
	  public void display(){
	    System.out.println("I am an animal");
	  }
	}

	class UpDownCasting extends Animal {

	  // overriding method
	  @Override
	  public void display(){
	    System.out.println("I am a dog");
	  }

	  public void printMessage(){

	    // this calls overriding method
	    display();

	    // this calls overridden method
	    super.display();
	  }
	}

	class Main {
	  public static void main(String[] args) {
		  UpDownCasting dog1 = new UpDownCasting();
	    dog1.printMessage();
	  }
	}*/