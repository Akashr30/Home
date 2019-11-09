package testOne;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLlist {
		
	
		static class Linkss{
			public int data;
			public Linkss next;
			static int size = 0;
			
			/*Linkss(int data){
			this.data = data;
			this.next = null;
			}*/
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
		
		/*public void add(int index,int num) {
			int count = 0;
			Linkss newNode = new Linkss();
			newNode.data = num;
			newNode.next = null;
			Linkss n2 = head;
			while (n2.next != null) {
				if (count == index-1) {
					Linkss nodeReplaced  = n2.next;
					n2.next = newNode;
					newNode.next = nodeReplaced;
					break;
				}
				count++;
				n2 = n2.next;
			}
			
		}*/
		
		/*public void getMiddleNode() {
			
			Linkss n1 = head;
			Linkss n2 = head;
			
			while (n1!=null) {
				
				if ((n2.next == null)|| (n2.next.next==null)) {
				System.out.println(n1.data);
				break;
				}
				n2 = n2.next.next;
				n1= n1.next;
			}
			
			if (n1 == null) {
				System.out.println("null");
//				break;
			}	
			
		}*/
		
	public void getNodeAt(int num) {
			int i = 0;
			Linkss n = head;
			while (!(i == num)) {
				n = n.next;
				i++;
			}
			System.out.println(n.data);
		}
	
	public void deleteNode(int num) {
		int j = 0;
		Linkss n = head;
		Linkss prev = head;
		while (j != num) {
			j++;
			prev = n;
			n = n.next;
		}
		prev.next = n.next;
		for (int z = 0 ; z < Linkss.size-1;z++) {
			getNodeAt(z);
		}
	}
	
	public static void main(String[] args) {
	
		LinkedLlist ll = new LinkedLlist();
		ll.add(5);
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
		ll.add(15);
		ll.add(16);
//		ll.getNodeAt(1);
//		ll.deleteNode(3);
		/*for (int i = 1 ; i < 1;i++ ) {
			ll.add(i);
		}
		ll.getMiddleNode();*/
		System.out.println(ll);
//		System.out.println(ll.size);
	}
}
