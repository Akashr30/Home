package com.linkedList.problems;

 class ListNodeSwaps {
	       int val;
	       ListNodeSwaps next;
	       ListNodeSwaps() {}
	       ListNodeSwaps(int val) { this.val = val; }
	       ListNodeSwaps(int val, ListNodeSwaps next) { this.val = val; this.next = next; }
	   }

public class SwapNodesInPairs {
	
 /*   public static ListNodeSwaps swapPairs(ListNodeSwaps head) {
        
        ListNodeSwaps root = new ListNodeSwaps(-1,head);
        ListNodeSwaps n = root.next;
        ListNodeSwaps prev = null;
        
        while (n != null && n.next != null) {
            
            ListNodeSwaps temp = n.next;
            n.next = temp.next;
            temp.next = n;
            n = temp;
            
            if (prev == null) {
                prev = n.next;
            } else {
                prev.next = n;
                prev = n.next;
            }
            
            if (n.next != null)
                n = n.next.next;
            else 
                n = n.next;
        }
        
        return root.next;
    }*/
	
	 public static ListNodeSwaps swapPairs(ListNodeSwaps head) {
	        if ((head == null)||(head.next == null))
	            return head;
	        ListNodeSwaps n = head.next;
	        head.next = swapPairs(head.next.next);
	        n.next = head;
	        return n;
	    }

	public static void main(String[] args) {
		
		ListNodeSwaps obj = new ListNodeSwaps(1);
		obj.next = new ListNodeSwaps(2);
		obj.next.next = new ListNodeSwaps(3);
		obj.next.next.next = new ListNodeSwaps(4);
		obj.next.next.next.next = new ListNodeSwaps(5);
		obj.next.next.next.next.next = new ListNodeSwaps(6);
		obj.next.next.next.next.next.next = new ListNodeSwaps(7);
		obj.next.next.next.next.next.next.next = new ListNodeSwaps(8);
		swapPairs(obj);
	}

}
