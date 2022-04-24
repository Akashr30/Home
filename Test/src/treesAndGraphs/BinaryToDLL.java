package treesAndGraphs;

/*public class BinaryToDLL {

}
*/

import java.util.Scanner;
import java.util.*;
class Noddee1
{
	Noddee1 left, right;
	int data;
	
	Noddee1(int d)
	{
		data = d;
		left = right = null;
	}
	
}
class BT_To_DLL
{
	void inorder(Noddee1 node)
	{
		if(node==null)
			return ;
		else
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
	}
	void printList(Noddee1 head) 
    {
		Noddee1 prev = head;
        while (head != null) 
        {
            System.out.print(head.data + " ");
			prev = head;
            head = head.right;
        }
		
		System.out.println();
		while(prev != null)
		{
			System.out.print(prev.data+" ");
			prev = prev.left;
		}
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BT_To_DLL obj = new BT_To_DLL();
		//DLL d = new DLL();
		int t = sc.nextInt();
		while(t>0)
		{
			HashMap<Integer, Noddee1> hm = new HashMap<Integer, Noddee1>();
			int n = sc.nextInt();
			
			Noddee1 root = null;
			
			while(n>0)
			{
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				char lr = sc.next().charAt(0);
				
				Noddee1 parent = hm.get(n1);
				if(parent == null)
				{
					parent = new Noddee1(n1);
					hm.put(n1, parent);
					if(root == null)
					{
						root = parent;
						//d.head = root;
					}
					
				}
				
				Noddee1 child = new Noddee1(n2);
				if(lr == 'L')
					parent.left = child;
				else
					parent.right = child;
				
				hm.put(n2,child);
			n--;
			}
			
			GfG g = new GfG();
			Noddee1 node = g.bToDLL(root);
			obj.printList(node);
		t--;
		System.out.println();
		}
	}
}

/* class Noddee1
class Noddee1
{
	Noddee1 left, right;
	int data;
	
	Noddee1(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/
// This function should convert a given Binary tree to Doubly
// Linked List
class GfG
{
    Noddee1 head;
    static Noddee1 prev = null; 
    Noddee1 bToDLL(Noddee1 root)
    {
        if (root == null) {
            return null;
        }
        
         bToDLL(root.left);
         
        /*if (head == null) {
            head = root;
        } else  {
            
            Noddee1 node = head;
            
            while (node.right != null) {
                node = node.right;
            }
            Noddee1 n1 = new Noddee1(root.data);
            node.right = n1;
            n1.left = node;
        }*/
         //NOt working
         if (prev == null)  
             head = root;
         else
        { 
            root.left = prev; 
            prev.right = root; 
        } 
        prev = root; 
        
         bToDLL(root.right);
        
        return head;
    }
}