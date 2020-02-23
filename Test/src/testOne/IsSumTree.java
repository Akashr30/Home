package testOne;

import java.util.*;
import java.lang.Integer;
import java.util.HashMap;
import java.lang.Math;
import java.io.*;

// A Binary Tree node
class Nodeee
{
    int data;
    Nodeee left, right;

    Nodeee(int item)
    {
        data = item;
        left = right = null;
    }
}


class IsSumTree
{
	
	
    // driver function to test the above functions
    public static void main(String args[])
    {
		
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		//Nodeee root=null;
		
		for(int i=0;i<2000;i++);
        while (t > 0)
        {
            HashMap<Integer, Nodeee> m = new HashMap<Integer, Nodeee> ();
            int n = sc.nextInt();

            Nodeee root=null;

            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);

                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Nodeee parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Nodeee(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }

                Nodeee child = new Nodeee(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
		
            GfGGG3 g = new GfGGG3();
			boolean b = g.isSumTree(root);
			if(b==true)
				System.out.println(1);
			else
				System.out.println(0);
            t--;
			
        }
    }
}// } Driver Code Ends
/* A Binary Tree node
class Nodeee
{
    int data;
    Nodeee left, right;

    Nodeee(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class GfGGG3
{
    // Incomplete 
    boolean flag = false;
    int sum = 0;
	boolean isSumTree(Nodeee node)
	{
        int left = 0;
        int right = 0;
        /*if (node == null) {
            flag = true;
            return flag;
        }
        
        if (node.left != null )
        	left += node.left.data;
        isSumTree(node.left);
        left += right;
        if (node.right != null )
        	right += node.right.data;
        isSumTree(node.right);
        right += left;
//        right += node.data;
        
        if (node.data ==(left+right) && left > 0 && right > 0) {
            flag = true;
        } else {
            flag = false;
        }*/
        
        if (node == null || (node.left == null && node.right == null)) {
            flag = true;
            return flag;
        }
        
        isSumTree(node.left);
        left += node.left.data;
        
        isSumTree(node.right);
        right += node.right.data;
        
        if (node.data == (left+right)){
            sum += left+right;
            flag = true;
        } else 
           flag = false;
        
       return flag;
        
	}
}
