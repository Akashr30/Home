package testOne;



import java.util.*;
class Nodde3
{
    int data;
    Nodde3 next;
    Nodde3(int d) 
    {
        data = d; 
        next = null;
    }
}
	
	
public class NthNodeFromLast
{
    Nodde3 head;  
	
	/* Function to print linked list */
    void printList(Nodde3 head)
    {
        Nodde3 temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Nodde3 at front of the list. */
    public void addToTheLast(Nodde3 node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Nodde3 temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    }
	  
     /* Drier program to test above functions */
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n = sc.nextInt();
			int k = sc.nextInt();
			NthNodeFromLast llist = new NthNodeFromLast();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Nodde3 head= new Nodde3(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Nodde3(a));
			}
          
		//System.out.println(llist.head.data);
        GfGG5 g = new GfGG5(); 
		//System.out.println(k);
		System.out.println(g.getNthFromLast(llist.head,k));
		
			t--;
		}
	}
}
	
	

/*This is a function problem.You only need to complete the function given below*/
/* Structure of node
class Nodde3
{
    int data;
    Nodde3 next;
    Nodde3(int d) {data = d; next = null; }
}
*/
class GfGG5
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    static int nthNum=0;
    static int count=0;
    int getNthFromLast(Nodde3 head, int n)
    {
        if (head == null)
            return -1;
            
         nthNum = getNthFromLast(head.next,n);
        count++;
        
        if (count == n ) {
            nthNum = head.data;
        }
        
          return nthNum;  	
    }
}