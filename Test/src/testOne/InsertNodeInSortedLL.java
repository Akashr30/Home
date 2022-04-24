package testOne;


import java.util.*;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
		
public class InsertNodeInSortedLL
{
    Node head;  
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    }
	  
     /* Drier program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
			int n = sc.nextInt();
            InsertNodeInSortedLL llist1 = new InsertNodeInSortedLL(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist1.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist1.addToTheLast(new Node(a));
			}
		    llist1.head= head;
			a1=sc.nextInt();
		    GFG obj=new GFG();
			Node start=obj.sortedInsert(llist1.head,a1);
		    llist1.printList(start);
		}
	}
}

/*This is a function problem.You only need to complete the function given below*/
/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
//sortedInsert method should return the head of the modified linked list.
class GFG
{
	Node sortedInsert(Node head1,int key)
	{
	    boolean hasEnter = false;
		Node node = head1;
		 if (node == null || node.data >= key) {
		        Node n1 = new Node(key);
		        n1.next = node;
		        return n1;
		    }
		    
		  
	    
	    while (node.next != null) {
	        
    	    if (!(node.next.data <= key) ) {
    	        Node newKey = new Node(key);
    	        Node nextt = node.next;
    	        newKey.next = nextt;
    	        node.next = newKey;
    	        hasEnter = true;
    	        break;
    	    } 
	        node = node.next;
	    }
	    
	    if (!hasEnter) {
	        Node n1 = new Node(key);
	        node.next = n1;
	    }
	    
	    return head1;
	}
}