package testOne;

/*public class MergeSortedLinkedList {

}*/

//{ Driver Code Starts
import java.util.*;

class Node11
{
 int data;
 Node11 next;
 Node11(int d) {
     data = d; 
     next = null;
 }
}


class MergeSortedLinkedList
{
 Node11 head;

 public void addToTheLast(Node11 node)
 {

   if (head == null) {
        head = node;
       } else {
        Node11 temp = head;
        while (temp.next != null)
         temp = temp.next;
     
        temp.next = node;
     }
 }


/* Function to print linked list */
 void printList()
 {
     Node11 temp = head;
     while (temp != null)
     {
        System.out.print(temp.data+" ");
        temp = temp.next;
     }  
     System.out.println();
 }
	
	 

  /* Driver program to test above functions */
 public static void main(String args[])
 {
    
      
     /* Constructed Linked List is 1->2->3->4->5->6->
        7->8->8->9->null */
      Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
      {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			MergeSortedLinkedList llist1 = new MergeSortedLinkedList();
			MergeSortedLinkedList llist2 = new MergeSortedLinkedList();
			
				int a1=sc.nextInt();
				Node11 head1= new Node11(a1);
				llist1.addToTheLast(head1);
				if (sc.hasNextInt())
				for (int i = 1; i < n1; i++) 
				{ 
					//int a;

					 int a = sc.nextInt(); 
					llist1.addToTheLast(new Node11(a));
				}
			
			
				int b1=sc.nextInt();
				Node11 head2 = new Node11(b1);
				llist2.addToTheLast(head2);
				if (sc.hasNextInt()) 
				for (int i = 1; i < n2; i++) 
				{
					//int b;
					
					 int b = sc.nextInt(); 
					llist2.addToTheLast(new Node11(b));
				}
				llist1.head= new LinkedList11().sortedMerge(llist1.head,llist2.head);
				llist1.printList();
			
			t--;
			
      }
 }
}
//} Driver Code Ends
/*This is a function problem.You only need to complete the function given below*/
/*
Merge two linked lists 
head pointer input could be NULL as well for empty list
Node11 is defined as 
 class Node11
 {
     int data;
     Node11 next;
     Node11(int d) {data = d; next = null; }
 }
*/
class LinkedList11
{
 Node11 finalNode = null;
 
 Node11 sortedMerge(Node11 A, Node11 B) {
 
    /* Node11 nA = headA;
     Node11 nB = headB;
     Node11 temp = null;
     
     if (nA.data >= nB.data) {
         finalNode = nB;
         temp = nA;
     } else {
         finalNode = nA;
         temp = nB;
     }
     Node11 n = finalNode;
     Node11 num = null;
     while (n != null) {
         
         if (temp.data >= n.data ) {
             num = temp;
//             num.next = null;
             temp = temp.next;
         
             if (temp == null) {
                 break;
             } else {
                 Node11 others = n.next;
                 num.next = others;
                 n.next = num;
                 n = n.next;
             }
         } else {
             n = n.next;
         }
         
     }
 return finalNode;*/
	 
	 if(A == null) return B; 
     if(B == null) return A; 
       
     if(A.data < B.data)  
     { 
         A.next = sortedMerge(A.next, B); 
         return A; 
     } 
     else 
     { 
         B.next = sortedMerge(A, B.next); 
         return B; 
     } 
} 
}