package leetcode;

import java.util.*;

class NodeReorderList {
 int data;
 NodeReorderList next;
 NodeReorderList(int d) {
     data = d;
     next = null;
 }
}

public class ReorderList {
 NodeReorderList head; // head of lisl
 NodeReorderList last; // last of linked list

 /* Linked list NodeReorderList*/

 /* Utility functions */

 /* Inserts a new NodeReorderList at front of the list. */
 public void addToTheLast(NodeReorderList node) {

     if (head == null) {
         head = node;
         last = head;
     } else {
         // NodeReorderList temp = head;
         // while (temp.next != null) temp = temp.next;

         last.next = node;
         last = last.next;
     }
 }
 /* Function to print linked list */
 void printList() {
     NodeReorderList temp = head;
     while (temp != null) {
         System.out.print(temp.data + " ");
         temp = temp.next;
     }
     System.out.println();
 }

 /* Drier program to test above functions */
 public static void main(String args[]) {

     /* Constructed Linked List is 1->2->3->4->5->6->
        7->8->8->9->null */
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while (t > 0) {
         int n = sc.nextInt();
         ReorderList llist = new ReorderList();

         int a1 = sc.nextInt();
         NodeReorderList head = new NodeReorderList(a1);
         llist.addToTheLast(head);
         for (int i = 1; i < n; i++) {
             int a = sc.nextInt();
             llist.addToTheLast(new NodeReorderList(a));
         }

         llist.head = new GfgReoderList().reorderlist(llist.head);

         llist.printList();

         t--;
     }
 }
}// } Driver Code Ends


/* Following is the Linked list node structure */

/*class NodeReorderList
{
 int data;
 NodeReorderList next;
 NodeReorderList(int d) {
     data = d;
     next = null;
 }
}*/

class GfgReoderList {
	 NodeReorderList reorderlist(NodeReorderList head) {
		 
		 if (head == null)
	            return null;
	        
	        
	        NodeReorderList n = head;
	        NodeReorderList slow = head;
	        NodeReorderList fast = head;
	        
	        while (fast.next!= null && fast.next.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        
	        NodeReorderList mid = slow;
	        while (mid.next != null) {
	            // NodeReorderList prev = mid;
	            NodeReorderList midNext = mid.next;
	            mid.next = mid.next.next;
	            midNext.next = mid;
	            mid = midNext;
	            mid = mid.next;
	        }
	        
	        return null;
	 }
}
