package leetcode;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class BinaryTreefromInorderAndPostOrder {
	
	   public static TreeNode buildTreeUtil(int[] in, int ins, int ine, int[] post, int posts, int poste) {
	        
	        if(ins>ine || posts>poste) return null;
	        
	        int rval=post[poste]; // root value
	        TreeNode root = new TreeNode(rval);
	        
	        int i=ins;
	        while(in[i] != rval) 
	        	i++;
	        int temp = posts+i-ins;
	        root.right = buildTreeUtil(in, i+1, ine, post, posts+i-ins, poste-1);
	        int temp1 = posts+i-(ins+1);
	        root.left = buildTreeUtil(in, ins, i-1, post, posts, posts+i-(ins+1));
	        return root;
	        
	    }
	    
	    public static TreeNode buildTree(int[] in, int[] post) {
	        return buildTreeUtil(in, 0, in.length-1, post, 0, post.length-1);
	    }

	public static void main(String[] args) {
		
		int[] in = {9,3,15,20,7};
		int[] post = {9,15,7,20,3};
		buildTree(in,post);
	}

}
