package com.java8;

import java.util.ArrayList;
import java.util.Scanner;

class Q1 implements Cloneable {
	
	int x = 5;
	int y = 10;
	ArrayList<Integer> ar = new ArrayList<>();
	Q1(){
		ar.add(x);
		ar.add(y);
	}
	
	
	
}

public class MarkrInterface implements Cloneable {
	   int age;
	   String name;
	   public MarkrInterface (String name, int age){
	      this.age = age;
	      this.name = name;
	   }
	   public void display() {
	      System.out.println("Name of the student is: "+name);
	      System.out.println("Age of the student is: "+age);
	   }
	   public static void main (String args[]) throws CloneNotSupportedException {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your name: ");
	      String name = sc.next();
	      System.out.println("Enter your age: ");
	      int age = sc.nextInt();
	      MarkrInterface obj = new MarkrInterface(name, age);
	      MarkrInterface obj2 = (MarkrInterface) obj.clone();
	      obj2.display();
	   }
	}