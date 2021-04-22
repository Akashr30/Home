package training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;


class TempLinkedList {
	
	int value;
	TempLinkedList next;
	
	public TempLinkedList() {}
	public TempLinkedList(int value, TempLinkedList next) {
		this.value = value;
		this.next = next;
	}
}



public class AboutHashMap {
	
	public static void test(TempLinkedList head) {
		
//		TempLinkedList node = head;
//		
//		while (node != null) {
//			node = node.next;	
//		}
		
		if (head == null)
			return;
		test(head.next);
		System.out.println(head.value);
	}
	

	public static void main(String[] args) {
		
		TempLinkedList obj = new TempLinkedList(1,null);
		obj.next = new TempLinkedList(2,null);
		obj.next.next = new TempLinkedList(3,null);
		obj.next.next.next = new TempLinkedList(4,null);
		obj.next.next.next.next = new TempLinkedList(5,null);
		test (obj);
		System.out.println(obj);
		
		
	}
}
