package treesAndGraphs;

//Java implementation to find leaf count of a given Binary tree 

/* Class containing left and right child of current 
Nodee1 and key value*/
class Nodee1 
{ 
	int data; 
	Nodee1 left, right; 

	public Nodee1(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

public class CountLeaves 
{ 
	//Root of the Binary Tree 
	Nodee1 root; 
	int count = 0;
	
	/* Function to get the count of leaf nodes in a binary tree*/
	int getLeafCount() 
	{ 
		return getLeafCount(root); 
	} 

	int getLeafCount(Nodee1 Nodee1) 
	{ 
		 if (Nodee1 == null) {
             return 0;
         }  
         
		 getLeafCount(Nodee1.left);
		 getLeafCount(Nodee1.right);
         
         if (Nodee1.left == null && Nodee1.right == null){
            count++;
         }
         
         return count;
	} 

	/* Driver program to test above functions */
	public static void main(String args[]) 
	{ 
		/* create a tree */
		CountLeaves tree = new CountLeaves(); 
		tree.root = new Nodee1(1); 
		tree.root.left = new Nodee1(2); 
		tree.root.right = new Nodee1(3); 
		tree.root.left.left = new Nodee1(4); 
		tree.root.left.right = new Nodee1(5); 
		
		/* get leaf count of the abve tree */
		System.out.println("The leaf count of binary tree is : "
							+ tree.getLeafCount()); 
	} 
} 

//This code has been contributed by Mayank Jaiswal(mayank_24) 
