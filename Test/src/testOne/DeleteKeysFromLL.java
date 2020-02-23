package testOne;

import java.util.*;
class Nodee5
{
	int data;
	Nodee5 next;
	
	Nodee5(int d)
	{
		data = d;
		next = null;
	}
}
class DeleteKeysFromLL
{
	Nodee5 head;
	void printList(Nodee5 head)
    {
        Nodee5 temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
	public void addToTheLast(Nodee5 node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Nodee5 temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    }
	
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t  =sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			DeleteKeysFromLL llist = new DeleteKeysFromLL();
			int a1 = sc.nextInt();
			Nodee5 head = new Nodee5(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Nodee5(a));
			}
			int x = sc.nextInt();
			  GFGG g = new GFGG(); 
			Nodee5 result = g.deleteAllOccurances(llist.head, x);
			llist.printList(result);
		t--;
		}
	}
}

/*This is a function problem.You only need to complete the function given below*/
/* Linked list Nodee5
class Nodee5
{
	int data;
	Nodee5 next;
	
	Nodee5(int d)
	{
		data = d;
		next = null;
	}
}*/
class GFGG
{
    Nodee5 deleteAllOccurances(Nodee5 head, int x)
    {
        if (head == null) {
            return null;
        }        
        Nodee5 node = head;
        while (node.next != null ) {
        	
        	if (node.data == x && node.next != null) {
        		node.data = node.next.data;
        		node.next = node.next.next;
        		continue;
        	} 
            
        	while (node.next != null && node.next.data == x) {
	                node.next = node.next.next;
	                if (node == null)
	                	break;
        	}
           if (node.next != null)
            node = node.next;
        }
        
        return head;
     }
}