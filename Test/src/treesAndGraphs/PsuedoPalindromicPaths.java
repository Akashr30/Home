package treesAndGraphs;


 class TreeNode123 {
     int val;
     TreeNode123 left;
     TreeNode123 right;
     TreeNode123() {}
     TreeNode123(int val) { this.val = val; }
      TreeNode123(int val, TreeNode123 left, TreeNode123 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 


public class PsuedoPalindromicPaths {
	
	 int count ;
	    public int pseudoPalindromicPaths (TreeNode123 root) {
	        
	        if (root.left == null && root.right == null) 
	            return 1;
	        count = 0;
	        find(root, new StringBuilder());
	        return count;
	    }
	    
	    public void find(TreeNode123 root , StringBuilder sb) {
	        
	        if (root == null)
	            return;
	        sb.append(root.val);
	        if (root.left == null && root.right == null) {
	            if (get(sb))
	                count++;
	            // sb.deleteCharAt(sb.toString().length()-1);
	            return;
	        }
	         if ((root.left == null && root.right == null) || root.left != null) {
	             find(root.left,sb);
	            if (sb.toString().length() > 1)
	                sb.deleteCharAt(sb.toString().length()-1);
	         }
	        if ((root.left == null && root.right == null) || root.right != null) {
	            find(root.right,sb);
	            if (sb.toString().length() > 1)
	                sb.deleteCharAt(sb.toString().length()-1);
	        }
	    }
	    
	    public boolean get(StringBuilder sb) {
	        
	        int[] arr = new int[10];
	        String temp = sb.toString();
	        
	        for (int i = 0 ; i < temp.length() ; i++) {
	            arr[temp.charAt(i)-48]++;
	        }
	        int x = 0;
	        for (int i = 1 ; i < 10 ; i++) {
	            if (arr[i]%2 == 0)
	                continue;
	            if (arr[i]%2 == 1) {
	                x++;
	                if (x > 1)
	                    return false;
	            }
	        }
	        return true;
	    }

	public static void main(String[] args) {
		
		TreeNode123 n = new TreeNode123(2);
		n.left = new TreeNode123(1);
		n.left.right = new TreeNode123(3);
		n.left.right.right = new TreeNode123(1);
		n.left.left = new TreeNode123(1);
		n.right = new  TreeNode123(1);
//		n.right.right = new  TreeNode123(1);
		new PsuedoPalindromicPaths().pseudoPalindromicPaths(n);
	}

}
