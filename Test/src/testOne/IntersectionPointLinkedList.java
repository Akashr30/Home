package testOne;


//{ Driver Code Starts
import java.util.*;


class NodeY
{
 int data;
 NodeY next;
 NodeY(int d) {
     data = d; 
     next = null;
 }
}
	
class IntersectionPointLinkedList
{
 NodeY head = null;  
	NodeY tail = null;

public void addToTheLast(NodeY node) 
{

if (head == null) {
head = node;
tail = head;
} else {
//NodeY temp = head;
//while (temp.next != null)
 //temp = temp.next;

//temp.next = node;
tail.next=node;
tail = node;
}
}

/* Function to print linked list */
 void printList()
 {
     NodeY temp = head;
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
			int n3 = sc.nextInt();
			IntersectionPointLinkedList llist1 = new IntersectionPointLinkedList();
		    IntersectionPointLinkedList llist2 = new IntersectionPointLinkedList();
			IntersectionPointLinkedList llist3 = new IntersectionPointLinkedList();
			
				int a1=sc.nextInt();
				NodeY head1= new NodeY(a1);
				NodeY tail1= head1;
				llist1.addToTheLast(head1);
				for (int i = 1; i < n1; i++) 
				{
					int a = sc.nextInt(); 
					llist1.addToTheLast(new NodeY(a));
				}
			
			
				int b1=sc.nextInt();
				NodeY head2 = new NodeY(b1);
				NodeY tail2 = head2;
				llist2.addToTheLast(head2);
				for (int i = 1; i < n2; i++) 
				{
					int b = sc.nextInt(); 
					llist2.addToTheLast(new NodeY(b));
				}
				
				int c1=sc.nextInt();
				NodeY head3= new NodeY(c1);
				NodeY tail3=head3;
				llist3.addToTheLast(head3);
				for (int i = 1; i < n3; i++) 
				{
					int c = sc.nextInt(); 
					llist3.addToTheLast(new NodeY(c));
				}
				
				if (tail1 != null)
				tail1.next = head3;
				if (tail2 != null)
				tail2.next = head3;
				
				Intersect obj = new Intersect();
				System.out.println(obj.intersectPoint(llist1.head, llist2.head));
			t--;			
      }
 }
}

//} Driver Code Ends
/* NodeY of a linked list
class NodeY {
int data;
 NodeY next;
 NodeY(int d)  { data = d;  next = null; }
}
Linked List class
class LinkedList
{
 NodeY head;  // head of list
}
This is method only submission.  You only need to complete the method. */
class Intersect
{
 ArrayList<NodeY> head1 = new ArrayList<NodeY>();
 ArrayList<NodeY> head2 = new ArrayList<NodeY>();
 int ans = -1;
	int intersectPoint(NodeY headA, NodeY headB)
	{
     if (headA == null && headB == null)
         return ans;
         
     NodeY nodeA = headA;
     NodeY nodeB = headB;
     int max = 0;
     int x = 0;
     int j = 0;
     while (nodeA != null || nodeB != null) {
         
         if (nodeA != null) {
             head1.add(nodeA);
             System.out.println("NodeA value "+(++x)+" : "+nodeA);
             nodeA = nodeA.next;
         }
         
         if (nodeB != null) {
             head2.add(nodeB);
             System.out.println("NodeB value "+(++j)+" : "+nodeB);
             nodeB = nodeB.next;
         }
         
     }
     
     if (head1.size() >= head2.size()) {
         max = head1.size();
     } else {
         max = head2.size();
     }
     for (int i = max-1 ; max-1 >= 0 ; i--) {
        /* if (flag) {
        	 flag = false;
        	 continue;
         }*/
         if (!head1.get(i).equals(head2.get(i))) {
             ans = head1.get(i+1).data;
             break;
         }
         
     }
     
     return ans;
	}
}

