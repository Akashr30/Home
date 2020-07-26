package binarysearchtrees;

//{ Driver Code Starts
import java.util.*;
import java.io.*;

class NodeRootToLeafpathSum {
 int val;
 NodeRootToLeafpathSum left;
 NodeRootToLeafpathSum right;
 NodeRootToLeafpathSum(int data) {
     this.val = data;
     left = null;
     right = null;
 }
} class GfG {
 public static NodeRootToLeafpathSum buildTree(String str) {

     if (str.length() == 0 || str.charAt(0) == 'N') {
         return null;
     }

     String ip[] = str.split(" ");
     // Create the root of the tree
     NodeRootToLeafpathSum root = new NodeRootToLeafpathSum(Integer.parseInt(ip[0]));
     // Push the root to the queue

     Queue<NodeRootToLeafpathSum> queue = new LinkedList<>();

     queue.add(root);
     // Starting from the second element

     int i = 1;
     while (queue.size() > 0 && i < ip.length) {

         // Get and remove the front of the queue
         NodeRootToLeafpathSum currNode = queue.peek();
         queue.remove();

         // Get the current node's value from the string
         String currVal = ip[i];

         // If the left child is not null
         if (!currVal.equals("N")) {

             // Create the left child for the current node
             currNode.left = new NodeRootToLeafpathSum(Integer.parseInt(currVal));
             // Push it to the queue
             queue.add(currNode.left);
         }

         // For the right child
         i++;
         if (i >= ip.length) break;

         currVal = ip[i];

         // If the right child is not null
         if (!currVal.equals("N")) {

             // Create the right child for the current node
             currNode.right = new NodeRootToLeafpathSum(Integer.parseInt(currVal));

             // Push it to the queue
             queue.add(currNode.right);
         }
         i++;
     }

     return root;
 }

 public static void main(String[] args) throws IOException {
     BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));

     int t = Integer.parseInt(br.readLine().trim());

     while (t-- > 0) {
         String s = br.readLine();
         NodeRootToLeafpathSum root = buildTree(s);
         int sum = Integer.parseInt(br.readLine().trim());
         Tree tr = new Tree();
         if (tr.hasPathSum(root, sum)) {
             System.out.println(1);
         } else {
             System.out.println(0);
         }
     }
 }
}// } Driver Code Ends


/*
//A Binary Tree node
class NodeRootToLeafpathSum{
 int data;
 NodeRootToLeafpathSum left;
 NodeRootToLeafpathSum right;
 NodeRootToLeafpathSum(int data){
     this.data = data;
     left=null;
     right=null;
 }
}
*/

class Tree {
 /*you are required to complete this function */
	static boolean flag ;
    public boolean hasPathSum(NodeRootToLeafpathSum node, int sum) {
        
        if (node == null)
            return false;
        
        if (sum ==0)
            return false;
        flag = false;   
        findSum(node,sum,0);
        return flag;
        //  if (node == null) 
        //     return sum == 0; 
        // return hasPathSum(node.left, sum - node.val) ||  
        //        hasPathSum(node.right, sum - node.val);
        
    }
    
    static void findSum (NodeRootToLeafpathSum node,int sum,int total) {
        
        
        if (node == null) {
            return ;
        }
        if(node.left == null && node.right == null){
            flag = (node.val+total == sum);
             return ;
        }
       
        
         findSum(node.left,sum,total+node.val);
         findSum(node.right,sum,total+node.val);
        
        return;
    }    
}