package oops;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

interface List1 {
	
	public void m1();
	public void m2();
	public void list();
	public void count();
	public void show();
}

interface Queue1 {
	

	public void pop();
	public void peek();
	
}

class Linked implements List1,Queue1{

	@Override
	public void m1() {
		
	}

	@Override
	public void m2() {
		
	}

	@Override
	public void list() {
		
	}

	@Override
	public void count() {
		
	}

	@Override
	public void show() {
		
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void peek() {
		// TODO Auto-generated method stub
		
	}
	
	public void monster() {
		
	}
	
}

public class OverridingConcepts {
	
	public static void main(String[] ar) {
		
		
		LinkedList obj = new LinkedList();
		
		List1 l1 = new Linked();
		
	}

}
