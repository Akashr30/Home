package testOne;

import testOne.LinkedLlist.Linkss;

public class LinkedListNthNode {
	
	static class Linkss{
		public int data;
		public Linkss next;
		static int size = 0;

		Linkss(){
			size++;
		}
	}
	
	Linkss head;
	
	
	public void add(int num) {
		
		Linkss newNode = new Linkss();
		newNode.data = num;
		newNode.next=null;
		if (head == null) {
			head = newNode;
		} else {
			Linkss n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = newNode;
		}
	}
	
	
	public static void main(String[] args) {
		
		LinkedLlist ll = new LinkedLlist();
		/*ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		ll.add(10);
		ll.add(11);
//		ll.add(2,99);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);*/
//		ll.add(16);
		for (int i = 1 ; i < 9;i++ ) {
			ll.add(i);
		}
		System.out.println(ll);
	}
}
