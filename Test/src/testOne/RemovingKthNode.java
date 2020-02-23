package testOne;




import java.util.*;
class Node7
{
	Node7 next;
	int data;
	
	Node7(int d)
	{
		data = d;
		next = null;
	}
}
class DeleteKthNode
{
	Node7 head;	
	
	void addToTheLast(Node7 node)
	{
		if(head == null)
		head = node;
		else
		{
			Node7 temp = head;
			while(temp.next != null)
			temp = temp.next;
			
			temp.next = node;
		} }	
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();		 
		 while(t>0)
         {
			int n = sc.nextInt();
			DeleteKthNode list = new DeleteKthNode();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node7 head= new Node7(a1);
            list.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				list.addToTheLast(new Node7(a));
			}
			int k = sc.nextInt();					  
			//System.out.println(list.head.data+" "+ k);
			list.head = new GfGG6().delete(list.head,k); 
			Node7 temp = list.head;
			while(temp!=null)
			{
				System.out.print(temp.data+ " ");
			    temp = temp.next;
			}
			System.out.println();
			t--;
		}
	}
}

/*This is a function problem.You only need to complete the function given below*/
/* Link list Node7
class Node7
{
	Node7 next;
	int data;
	Node7(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfGG6
{
    /*You are required to complete this method*/
    Node7 delete(Node7 head, int k)
    {
        
        if (head == null)
            return null;
            
        Node7 n = head;
        int count = 1;
        while (n != null) {
            if (count == k) {
            	head = null;
            	break;
            }
            if (count+1 == k && n.next != null) {
                count = 1;
                n.next = n.next.next;
                n = n.next;
                continue;
            }
            count++;
            n = n.next;
        }
        
        return head;
    }
}