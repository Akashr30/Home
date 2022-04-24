package treesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

//Java program to find height of tree 

//A binary tree node 
class HeightNode 
{ 
	int data; 
	HeightNode left, right; 

	HeightNode(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

class HeightOfTree 
{ 
	HeightNode root; 

	/* Compute the "maxDepth" of a tree -- the number of 
	nodes along the longest path from the root node 
	down to the farthest leaf node.*/
	int maxDepth(HeightNode node) 
	{
		HeightNode temp = node;
		HeightNode mirror = find(temp);
		
		return 1;
	} 
	
	private HeightNode find(HeightNode root) {
		
		 if (root == null)
	            return null;
	        
		 HeightNode lhs = find(root.left);
		 HeightNode rhs = find(root.right);
	        root.left = rhs;
	        root.right = lhs;
	        
	        return root;
	}
	/* Driver program to test above functions */
	public static void main(String[] args) 
	{ 
		HeightOfTree tree = new HeightOfTree(); 

		tree.root = new HeightNode(1); 
		tree.root.left = new HeightNode(2); 
		tree.root.right = new HeightNode(3); 
		tree.root.left.left = new HeightNode(4); 
		tree.root.left.right = new HeightNode(5); 

		System.out.println("Height of tree is : " + 
									tree.maxDepth(tree.root)); 
	} 
} 

//This code has been contributed by Mayank Jaiswal(mayank_24) 

