package testOne;

//{ Driver Code Starts
import java.util.*;

class NodeDeleteWithoutHeadPointer
{
	int data ;
	NodeDeleteWithoutHeadPointer next;
	NodeDeleteWithoutHeadPointer(int d)
	{
		data = d;
		next = null;
	}
}

class DeleteWithoutHeadPointer
{
	NodeDeleteWithoutHeadPointer head;
	
	void printList(NodeDeleteWithoutHeadPointer head)
	{
		NodeDeleteWithoutHeadPointer tnode = head;
		while(tnode != null)
		{
			System.out.print(tnode.data+ " ");
			tnode = tnode.next;
		}
		System.out.println();
	}
	
	void addToTheLast(NodeDeleteWithoutHeadPointer node)
	{
		
		if(head == null)
		{
			head = node;
		}else
		{
			NodeDeleteWithoutHeadPointer temp = head;
			while(temp.next != null)
			temp = temp.next;
			
			temp.next = node;
		}
	}
	
	NodeDeleteWithoutHeadPointer search_Node(NodeDeleteWithoutHeadPointer head, int k)
	{
		NodeDeleteWithoutHeadPointer current = head;
		while(current != null)
		{
			if(current.data == k)
				break;
			current = current.next;
		}
	return current;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			DeleteWithoutHeadPointer llist = new DeleteWithoutHeadPointer();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			NodeDeleteWithoutHeadPointer head= new NodeDeleteWithoutHeadPointer(a1);
         llist.addToTheLast(head);
         for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new NodeDeleteWithoutHeadPointer(a));
			}
			
			int k = sc.nextInt();
			NodeDeleteWithoutHeadPointer del = llist.search_Node(llist.head,k);
			
			GFGDeleteWithoutHeadPointer g = new GFGDeleteWithoutHeadPointer();
			if(del != null && del.next != null)
			{
				g.deleteNode(del);
			}
			llist.printList(llist.head);
		t--;
		}
	}
}


//} Driver Code Ends
/*This is a function problem.You only need to complete the function given below*/

//This function should delete node from linked list. The function
//may assume that node exists in linked list and is not last node
//node: reference to the node which is to be deleted
class GFGDeleteWithoutHeadPointer
{
 void deleteNode(NodeDeleteWithoutHeadPointer n)
 {
	 if (n.next == null) {
         n = null;
         return ;
     }
     
//	 NodeDeleteWithoutHeadPointer n = head;
	 NodeDeleteWithoutHeadPointer temp = null;
     while (n != null) {
         
    	  temp = n.next;
         
         n.next = temp.next;
         temp.next = n;
         
         n = temp;
         
         if (n.next != null && n.next.next == null) {
             n.next = null;
         } 
             n = n.next;
         
     }
     
     n = temp;
     return ;
	 
 }
}
