package com.linkedList.problems;

import java.util.Iterator;
import java.util.LinkedList;

class ListNode {
	
	int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
}

public class AddTwoNumbersII {
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al2 = new LinkedList<>();
        
        while (l1 != null || l2 != null) {
            
            if (l1 != null) {
                al1.add(0,l1.val);
                l1 = l1.next;
            }
            
            if (l2 != null) {
                al2.add(0,l2.val);
                l2 = l2.next;
            }
        }
        ListNode ans = null;
        ListNode node = null;
        int rem = 0;
        int sum = 0,n1 = 0,n2 =0;
        int q = 0;
        Iterator i1 = al1.iterator();
        Iterator i2 = al2.iterator();
        while (i1.hasNext() || i2.hasNext()) {
        	sum = 0; 
            if (i1.hasNext()) {
                sum += (int)i1.next();
            }
            
            if (i2.hasNext()) {
                sum += (int)i2.next();
            }
            
            ans = node;
            sum += q;
            rem = (sum)%10 ;
            node = new ListNode(rem);
            node.next = ans;
//            ans = node;
            q = (sum)/10;
            
        } 
        return ans;
    }

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(5);
//		l1.next = new ListNode(2);
//		l1.next.next = new ListNode(3);
//		l1.next.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(5);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(7);
		
		addTwoNumbers(l1,l2);
	}

}
