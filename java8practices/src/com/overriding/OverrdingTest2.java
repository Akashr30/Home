package com.overriding;

abstract class Animal1 {
	abstract void fly();
	abstract void run();
	abstract void swim();
	abstract void hasLegs();
}

abstract class BigDogs1 extends Animal1 {
	
	abstract void bite();
	public void run () {
		System.out.println(" Runs slowly");
	}
	 public void fly() {}
	 public void swim() {}
	 public void hasLegs() {}
}

abstract class SmallDogs1 extends Animal1 {
	
	abstract void bite();
	public void run () {
		System.out.println(" Runs slowly");
	}
	 public void fly() {}
	 public void swim() {}
}

class Dog1 extends BigDogs1 {

	@Override
	void bite() {
		
	}

	@Override
	public void hasLegs() {}
	
}

class Cat extends Animal1 {

	@Override
	void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void hasLegs() {
		// TODO Auto-generated method stub
		
	}
	
}

public class OverrdingTest2 {

	public static void main(String[] args) {
		
	}

}
