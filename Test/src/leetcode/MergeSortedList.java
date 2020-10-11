package leetcode;

//{ Driver Code Starts
import java.util.*;

class MergeListsNode
{
 int data;
 MergeListsNode next;
 MergeListsNode(int d) {
     data = d; 
     next = null;
 }
}


class MergeLists
{
 MergeListsNode head;



/* Function to print linked list */
public static void printList(MergeListsNode head)
 {
     
     while (head!= null)
     {
        System.out.print(head.data+" ");
        head = head.next;
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
			MergeListsNode head1 = new MergeListsNode(sc.nextInt());
         MergeListsNode tail1 = head1;
         for(int i=0; i<n1-1; i++)
         {
             tail1.next = new MergeListsNode(sc.nextInt());
             tail1 = tail1.next;
         }
			MergeListsNode head2 = new MergeListsNode(sc.nextInt());
         MergeListsNode tail2 = head2;
         for(int i=0; i<n2-1; i++)
         {
             tail2.next = new MergeListsNode(sc.nextInt());
             tail2 = tail2.next;
         }
			
			LinkedList obj = new LinkedList();
			MergeListsNode head = obj.sortedMerge(head1,head2);
			printList(head);
			
			t--;
			
      }
 }
}
//} Driver Code Ends


/*
Merge two linked lists 
head pointer input could be NULL as well for empty list
MergeListsNode is defined as 
 class MergeListsNode
 {
     int data;
     MergeListsNode next;
     MergeListsNode(int d) {data = d; next = null; }
 }
*/

class LinkedList
{
	 MergeListsNode sortedMerge(MergeListsNode n1, MergeListsNode n2) {
		 
	       return n1; 
	} 
}

