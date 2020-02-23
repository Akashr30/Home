package testOne;


import java.util.*;
class Node5
{
	int data ;
	Node5 next;
	Node5(int d)
	{
		data = d;
		next = null;
	}
}
class Delete_Node
{
	Node5 head;
	
	void printList(Node5 head)
	{
		Node5 tnode = head;
		while(tnode != null)
		{
			System.out.print(tnode.data+ " ");
			tnode = tnode.next;
		}
		System.out.println();
	}
	
	void addToTheLast(Node5 node)
	{
		
		if(head == null)
		{
			head = node;
		}else
		{
			Node5 temp = head;
			while(temp.next != null)
			temp = temp.next;
			
			temp.next = node;
		}
	}
	
	Node5 search_Node(Node5 head, int k)
	{
		Node5 current = head;
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
			Delete_Node llist = new Delete_Node();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node5 head= new Node5(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node5(a));
			}
			
			int k = sc.nextInt();
			Node5 del = llist.search_Node(llist.head,k);
			
			GfG1 g = new GfG1();
			if(del != null && del.next != null)
			{
				g.deleteNode(del);
			}
			llist.printList(llist.head);
		t--;
		}
	}
}


/*This is a function problem.You only need to complete the function given below*/

// This function should delete node from linked list. The function
// may assume that node exists in linked list and is not last node
// node: reference to the node which is to be deleted
class GfG1
{
    void deleteNode(Node5 node)
    {
       Delete_Node dn = new Delete_Node();
        
            
       /*node = node.next;
       dn.head = node;
       */
       while(node.next.next != null){
    	   node.data = 22;
    	   node = node.next;
    	   }
    	   node.data = node.next.data;
    	   node.next = null;
       
      /*  node = node.next;
       while (node.next != null) {
    	   node.data = node.data;
    	   node = node.next;
       }*/
//    	 node = node.next;
    	/*while (node.next != null) {
    		node.data = node.data;
    		node = node.next;
    	}
    	node.data = node.data;
		node = node.next;*/
    }
}
