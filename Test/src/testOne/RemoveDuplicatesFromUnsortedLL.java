package testOne;


//{ Driver Code Starts
/* package whatever; // don't place package name! */
import java.util.*;
class NodeRemoveLL
{
 int data;
 NodeRemoveLL next;
 NodeRemoveLL(int d) {
     data = d; 
     next = null;
 }
}

class RemoveDuplicatesFromUnsortedLL
{
 NodeRemoveLL head;  

	public void addToTheLast(NodeRemoveLL node) 
	{

	  if (head == null) 
	  {
	    head = node;
	  }
	  else{
	   NodeRemoveLL temp = head;
	   while (temp.next != null)
		temp = temp.next;

	   temp.next = node;
	  }
	}

   void printList()
 {
     NodeRemoveLL temp = head;
     while (temp != null)
     {
        System.out.print(temp.data+" ");
        temp = temp.next;
     }  
     System.out.println();
 }
	
	/* Drier program to test above functions */
	public static void main(String args[])
 {
    
     
     /* Constructed Linked List is 1->2->3->4->5->6->
        7->8->8->9->null */
      Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		  
		 while(t>0)
      {
			int n = sc.nextInt();
			RemoveDuplicatesFromUnsortedLL llist = new RemoveDuplicatesFromUnsortedLL();
			int a1=sc.nextInt();
			NodeRemoveLL head= new NodeRemoveLL(a1);
         llist.addToTheLast(head);
         for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new NodeRemoveLL(a));
			}
		//llist.printList();	
         GfGRemoveLL g = new GfGRemoveLL();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
     t--;		
     }
 }
}
//} Driver Code Ends
/* The structure of linked list is the following
class NodeRemoveLL
{
 int data;
 NodeRemoveLL next;
 NodeRemoveLL(int d) {
     data = d; 
     next = null;
 }
}
*/

class GfGRemoveLL
{
 // Function to remove duplicates from the given linked list
 public NodeRemoveLL removeDuplicates(NodeRemoveLL head) 
 {
     Set<Integer> set = new HashSet<Integer>();
     
     NodeRemoveLL n = head;
     NodeRemoveLL prev = null;
     while (n != null) {
         
         if (!set.contains(n.data)) {
             set.add(n.data);
             prev = n;
         } else {
        	 prev.next = n.next;
         }
        
         n = n.next;
     }
     return head;
 }
}
