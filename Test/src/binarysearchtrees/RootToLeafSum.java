package binarysearchtrees;

class NodeRootToLeafSum 
{ 
	int data; 
	NodeRootToLeafSum left, right; 
	
	NodeRootToLeafSum(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

class RootToLeafSum 
{ 
	NodeRootToLeafSum root; 
	static int total;
	int treePathsSum(NodeRootToLeafSum root) {
//		 total = 0;
	        
	        return sumOf(root,0);
	}
	
	static int sumOf(NodeRootToLeafSum root,int value) {
		
		/* if (root == null)
	            return;
	     
		 if (root.left == null && root.right == null)
			 total += Integer.parseInt(str.length() > 0 ? str+root.data : "0");
		 
	        sumOf(root.left,str+root.data);
	        sumOf(root.right,str+root.data);*/
		
		  if (root == null)
	            return 0;
	        
	        value  = value*10+root.data;
	            
	        if (root.left == null && root.right == null)
	            return value;
	            
	        return sumOf(root.left,value)+sumOf(root.right,value);
	}
	

	public static void main(String args[]) 
	{ 
		RootToLeafSum tree = new RootToLeafSum(); 
		tree.root = new NodeRootToLeafSum(6); 
		tree.root.left = new NodeRootToLeafSum(3); 
		tree.root.right = new NodeRootToLeafSum(5); 
		tree.root.right.right = new NodeRootToLeafSum(4); 
		tree.root.left.left = new NodeRootToLeafSum(2); 
		tree.root.left.right = new NodeRootToLeafSum(5); 
		tree.root.left.right.right = new NodeRootToLeafSum(4); 
		tree.root.left.right.left = new NodeRootToLeafSum(7); 
		
		System.out.print("Sum of all paths is " + 
								tree.treePathsSum(tree.root)); 
	}	 
} 

//This code has been contributed by Mayank Jaiswal 
