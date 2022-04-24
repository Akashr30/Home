package treesAndGraphs;

//Java program to check children sum property 

/* A binary tree node has data, pointer to left child 
and a pointer to right child */
class Nodee2 
{ 
	int data; 
	Nodee2 left, right; 

	public Nodee2(int d) 
	{ 
		data = d; 
		left = right = null; 
	} 
} 

class BinaryTree 
{ 
	Nodee2 root; 
	static int l1 = 0;
    static int r1 = 0;
	/* returns 1 if children sum property holds for the given 
	node and both of its children*/
	int isSumProperty(Nodee2 node) 
	{ 
		
		 /*left_data is left child data and right_data is for right 
		child data*/
		int left_data = 0, right_data = 0; 

		// If node is NULL or it's a leaf node then 
//		return true 
		if (node == null
				|| (node.left == null && node.right == null)) 
			return 1; 
		else
		{ 
			
//			 If left child is not present then 0 is used 
//			as data of left child 
			if (node.left != null) 
				left_data = node.left.data; 

//			 If right child is not present then 0 is used 
//			as data of right child 
			if (node.right != null) 
				right_data = node.right.data; 

//			 if the node and both of its children satisfy the 
//			property return 1 else 0
			if ((node.data == left_data + right_data) 
					&& (isSumProperty(node.left)!=0) 
					&& isSumProperty(node.right)!=0) 
				return 1; 
			else
				return 0; 
		} 
		

        
        /*if (node == null) {
            return 0;
        }
        
          if (node.left == null) {
            l1 = 0;
        } else if (node.left != null) {
            l1 = node.left.data;
        }
        
        if (node.right == null) {
            r1 = 0;
        } else if (node.right != null) {
            r1 = node.right.data;
        }
        
        if (!(node.data == l1+r1))
            return 0;
        
        isSumProperty(node.left);
        isSumProperty(node.right);
        
      
        
        return 1;
        */
		
	} 
	
	/* driver program to test the above functions */
	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Nodee2(10); 
		tree.root.left = new Nodee2(8); 
		tree.root.right = new Nodee2(2); 
		tree.root.left.left = new Nodee2(6); 
		tree.root.left.right = new Nodee2(2); 
		tree.root.right.right = new Nodee2(1); 
		if (tree.isSumProperty(tree.root) != 0) 
			System.out.println("YES -- The given tree satisfies children"
					+ " sum property"); 
		else
			System.out.println(" NO --The given tree does not satisfy children"
					+ " sum property"); 
	} 
} 
