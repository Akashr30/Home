package testOne;

import java.util.Scanner;

class Node1
{
	int data;
	Node1 next;
	Node1 prev;
	Node1(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}
class DLinkedList
{
	
	Node1 newNode1(Node1 head, int data)
	{
		Node1 p;
		Node1 temp = new Node1(data);
		if(head == null)
		return temp;
		p = head;
		while(p.next != null)
		{
			p = p.next;
		}
		p.next = temp;
		temp.prev = p;
		return head;
	}
	
	
	void printList(Node1 Node1)
	{
		Node1 temp = Node1;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		while(temp.prev != null)
		{
			temp = temp.prev;
		}
		
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DLinkedList DLL = new DLinkedList();
		int t = sc.nextInt();
		
		while(t>0)
		{
			Node1 temp;
			Node1 head = null;
			int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				int x = sc.nextInt();
				head = DLL.newNode1(head,x);
			}
			int pos = sc.nextInt();
			int data = sc.nextInt();
			
			DoubleLLinkedList g = new DoubleLLinkedList();
		    g.addNode1(head,pos,data);
			
			DLL.printList(head);
			while(head.next != null)
			{
				temp = head;
				head = head.next;
			}
		t--;
		}
	}
}

class DoubleLLinkedList
{
void addNode1(Node1 head, int pos, int data)
	{
        Node1 n  = head ;
        int count = 0 ;
        Node1 prevv = null;
        Node1 nextt = null;
        
        while (n.next!=null && count != pos){
            prevv = n.prev;
            nextt = n.next;
            n = n.next ;
            if (pos == 1 && count == pos-1) {
            	prevv = nextt.prev;
            }
            
            count++;
        }
        
        Node1 n1 = new Node1(data);
        n1.prev = prevv;
        n1.next = n.next;
        n.next = n1;
        
	}
}
