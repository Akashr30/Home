
package testOne;
//{ Driver Code Starts
import java.util.*;
class NodeOddEvenLinkedList {

 int data;
 NodeOddEvenLinkedList next;

 NodeOddEvenLinkedList(int d) {
     data = d;
     next = null;
 }
}


public class OddEvenLinkedList {
 NodeOddEvenLinkedList head;
 /* Linked list NodeOddEvenLinkedList*/
 /* Utility functions */
 /* Inserts a new NodeOddEvenLinkedList at front of the list. */
 public void addToTheLast(NodeOddEvenLinkedList node) {

     if (head == null) {
         head = node;
     } else {
         NodeOddEvenLinkedList temp = head;
         while (temp.next != null) {
             temp = temp.next;
         }

         temp.next = node;
     }
 }

 /* Function to print linked list */
 void printList(NodeOddEvenLinkedList head) {
     NodeOddEvenLinkedList temp = head;
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
     int value;
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while (t > 0 && sc.hasNextInt() )
     {
         int n = sc.nextInt();
         OddEvenLinkedList llist = new OddEvenLinkedList();
         //int n=Integer.parseInt(br.readLine());
         int a1 = sc.nextInt();
         NodeOddEvenLinkedList head = new NodeOddEvenLinkedList(a1);
         llist.addToTheLast(head);

         for (int i = 1; i < n && sc.hasNextInt() ; i++) {
             int a = sc.nextInt();
             llist.addToTheLast(new NodeOddEvenLinkedList(a));
         }


         NodeOddEvenLinkedList x = new gfgOddEvenLinkedList().rearrange(head);
         llist.printList(x);
         t--;
     }
 }
}// } Driver Code Ends


/*

class NodeOddEvenLinkedList {

 int data;
 NodeOddEvenLinkedList next;

 NodeOddEvenLinkedList(int d) {
     data = d;
     next = null;
 }
}
This is method only submission.
You only need to complete the below method.
*/
class gfgOddEvenLinkedList
{

// Should rearrange given linked list such that all even
// positioned Nodes are before odd positioned.
// Returns new head of linked List.
 NodeOddEvenLinkedList rearrange(NodeOddEvenLinkedList head)
 {
     if(head == null) {
         return head;
     }
     
     NodeOddEvenLinkedList odd = head;
     NodeOddEvenLinkedList even = head.next;
     NodeOddEvenLinkedList evenHead = even;
     
     
     while (even != null && even.next != null) {
         
         odd.next = odd.next.next;
         even.next = even.next.next;
         odd = odd.next;
         even = even.next;
     }
     odd.next = evenHead;
     return head;
  }
}
