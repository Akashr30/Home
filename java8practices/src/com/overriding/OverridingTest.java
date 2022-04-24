package com.overriding;

interface Animal {
	default void fly() {}
	default void run() {
		System.out.println("Runs step by step");
	}
	default void swim() {}
}
//---------------------------------------------
interface BigDogs extends Animal {
	int a = 5;
	default void bigLegs() {}
	default void hugeTeeth() {
		System.out.println("Eats Meat");
	}
	default void longTail() {}
	default void run() {}
}
//-------------------------------------------
interface SmallDogs extends Animal {
	default void smallTail() {}
	default void smallTeeth() {}
}
//--------------------------------------------
 class Dog implements BigDogs {
	 int b = 10;
	void standInTwoLegs() {
		System.out.println("stands in 2 legs");
	}
	/*public void hugeTeeth() {
		System.out.println("Eats bread");
	}*/
	public void run() {
		System.out.println("Runs slowly");
	}
}
//----------------------------------------
public class OverridingTest {
	
	public static void main(String[] ar) {
		
		Dog d = new Dog();
		Animal a = new Dog();
		a.run();
		BigDogs bg = new Dog();
		bg.hugeTeeth();
		
	} 
} 