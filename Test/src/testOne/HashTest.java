package testOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTest {
		
	/*class HashNode<T> {
		T data ;
		HashNode next = null;
		
		HashNode(){}
		
		HashNode(T num , HashNode node){
			this.data = num;
			this.next = node;
		}
//	}
		public void add(Integer n) {
			HashNode addNode = new HashNode();
			HashNode head = null;
			HashNode n1 = null;
			if (head == null) {
				head.data = n;
				head.next = addNode;
			} else {
				n1 = head;
				while (n1.next != null) {
					n1 =   n1.next;
				}
			}
		}
	}*/
	
	

	public static void main(String[] args) {
		
		/*Hashtable <Integer,Integer> ht = new Hashtable<Integer,Integer>();
		ht.put(1, 1);
		ht.put(1,2);
		ht.put(1, 3);
		System.out.println(ht);
		HashMap hm = new HashMap();
		*/
		
		/*ArrayList<Integer> bucket = new ArrayList<>();
		bucket.add(5);
		bucket.add(5);*/
		
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(1);
		
		
			System.out.println(hs.toArray()[1]);
		
		
	}

}
