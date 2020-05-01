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
		
		/*int maxx = 0;
		
		if (node == null) {
			return 0;
		}
		
		int left = maxDepth(node.left);
		int right = maxDepth(node.right);
		
		if (left > right) {
            maxx = left;
        } else if (right > left ) {
            maxx = right;
        } else {
            maxx = left;
        }
		
		return 1+maxx;*/
		
	/*	Level order traversal
	 * 	Queue<HeightNode> q = new LinkedList();
		q.add(node);
		
		while (!q.isEmpty() ) {
			HeightNode temp = q.poll();
			if (temp != null) {
				if (temp.left != null) {
					q.add(temp.left);
				}
				if (temp.right != null) {
					q.add(temp.right);
				}
			}
			System.out.println(q.poll());
		}*/
		
		return 1;
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

