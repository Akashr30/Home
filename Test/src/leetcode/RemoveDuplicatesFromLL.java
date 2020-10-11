package leetcode;

import java.util.Scanner;
class RemoveDuplicatesFromLLNode
{
	int data;
	RemoveDuplicatesFromLLNode next;
	
	RemoveDuplicatesFromLLNode(int d)
	{
		data = d;
		next = null;
	}
}
class RemoveDuplicatesFromLL
{
	RemoveDuplicatesFromLLNode head;
	public static void printList(RemoveDuplicatesFromLLNode head)
 {
     RemoveDuplicatesFromLLNode temp = head;
     while (temp != null)
     {
        System.out.print(temp.data+" ");
        temp = temp.next;
     }  
     System.out.println();
 }

	
	public static void main(String args[])
 {
      Scanner sc = new Scanner(System.in);
		 int t  =sc.nextInt();
		 while(t>0)
      {
			int n = sc.nextInt();
			int a1 = sc.nextInt();
			RemoveDuplicatesFromLLNode head = new RemoveDuplicatesFromLLNode(a1);
			RemoveDuplicatesFromLLNode tail = head;
         for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				tail.next = new RemoveDuplicatesFromLLNode(a);
				tail = tail.next; 
			}
			int x = sc.nextInt();
			  RemoveDuplicatesFromLLGfG g = new RemoveDuplicatesFromLLGfG(); 
			RemoveDuplicatesFromLLNode result = g.deleteAllOccurances(head, x);
			printList(result);
		t--;
		}
	}
}// } Driver Code Ends


/* Linked list RemoveDuplicatesFromLLNode
class RemoveDuplicatesFromLLNode
{
	int data;
	RemoveDuplicatesFromLLNode next;
	
	RemoveDuplicatesFromLLNode(int d)
	{
		data = d;
		next = null;
	}
}*/

class RemoveDuplicatesFromLLGfG
{
	 private static RemoveDuplicatesFromLLNode remove(RemoveDuplicatesFromLLNode node , int val) {

	        while (node != null && node.data == val) {
	            node = node.next;
	        }

	        return node;
	    }
	
 public static RemoveDuplicatesFromLLNode deleteAllOccurances(RemoveDuplicatesFromLLNode head, int val)
 {
	 
	 if (head == null || head.next == null)
         return head;
     
     int temp = head.next.data;
     RemoveDuplicatesFromLLNode h1=new RemoveDuplicatesFromLLNode(0);
     h1.next = head;
     RemoveDuplicatesFromLLNode prev = null;
     RemoveDuplicatesFromLLNode n = h1;
     while (n != null) {
         
         while (n != null && n.next != null &&  n.data == n.next.data) {
        	 RemoveDuplicatesFromLLNode t1 = remove(n,n.data);
             // n.next = t1;
//             if (t1 != null)
        	 if (prev == null)
        		 prev = t1;
        	 else
                 prev.next = t1;
             
             n = prev;
         }
         prev = n;
         n = n.next;
     }
     
     return head.data == temp ? head.next : head;
 }
}

