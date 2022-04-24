package treesAndGraphs;



//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class NodeConnectNodesAtSameLevel{
 int data;
 NodeConnectNodesAtSameLevel left;
 NodeConnectNodesAtSameLevel right;
 NodeConnectNodesAtSameLevel nextRight;
 NodeConnectNodesAtSameLevel(int data){
     this.data = data;
     left=null;
     right=null;
     nextRight = null;
 }
}

class GfGConnectNodesAtSameLevel {
 
 static NodeConnectNodesAtSameLevel buildTree(String str){
     
     if(str.length()==0 || str.charAt(0)=='N'){
         return null;
     }
     
     String ip[] = str.split(" ");
     // Create the root of the tree
     NodeConnectNodesAtSameLevel root = new NodeConnectNodesAtSameLevel(Integer.parseInt(ip[0]));
     // Push the root to the queue
     
     Queue<NodeConnectNodesAtSameLevel> queue = new LinkedList<>(); 
     
     queue.add(root);
     // Starting from the second element
     
     int i = 1;
     while(queue.size()>0 && i < ip.length) {
         
         // Get and remove the front of the queue
         NodeConnectNodesAtSameLevel currNode = queue.peek();
         queue.remove();
             
         // Get the current node's value from the string
         String currVal = ip[i];
             
         // If the left child is not null
         if(!currVal.equals("N")) {
                 
             // Create the left child for the current node
             currNode.left = new NodeConnectNodesAtSameLevel(Integer.parseInt(currVal));
             // Push it to the queue
             queue.add(currNode.left);
         }
             
         // For the right child
         i++;
         if(i >= ip.length)
             break;
             
         currVal = ip[i];
             
         // If the right child is not null
         if(!currVal.equals("N")) {
                 
             // Create the right child for the current node
             currNode.right = new NodeConnectNodesAtSameLevel(Integer.parseInt(currVal));
                 
             // Push it to the queue
             queue.add(currNode.right);
         }
         i++;
     }
     
     return root;
 }
 public static void printInorder(NodeConnectNodesAtSameLevel root)
 {
     if(root == null)
         return;
         
     printInorder(root.left);
     System.out.print(root.data+" ");
     
     printInorder(root.right);
 }
 
 public static void printSpecial(NodeConnectNodesAtSameLevel root)
 {
    if (root == null)
      return;
 
    NodeConnectNodesAtSameLevel next_root=null;
 
    while (root != null)
    {
       System.out.print(root.data+" ");
 
       if( root.left!=null && next_root==null )
         next_root = root.left;
       else if( root.right!=null && next_root==null  )
         next_root = root.right;
 
       root = root.nextRight;
    }
    
    printSpecial(next_root);
 }
 
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
 
	        while(t > 0){
	            String s = br.readLine();
 	    	NodeConnectNodesAtSameLevel root = buildTree(s);
     	    TreeConnectNodesAtSameLevel g = new TreeConnectNodesAtSameLevel();
			    g.connect(root);
             printSpecial(root);
             System.out.println();
             printInorder(root);
             System.out.println();
             t--;
         
     }
 }

}

//} Driver Code Ends


//User function Template for Java

class TreeConnectNodesAtSameLevel
{
 public static void connect(NodeConnectNodesAtSameLevel root)
 {
     Queue<NodeConnectNodesAtSameLevel> q = new LinkedList<>();
     Queue<NodeConnectNodesAtSameLevel> q1 = new LinkedList<>();
     Queue<NodeConnectNodesAtSameLevel> q2 = new LinkedList<>();
     q.add(root);
     
     while (!q.isEmpty()) {
         
         NodeConnectNodesAtSameLevel temp = q.peek();
         
         
         if (temp != null && temp.left != null )
             q1.add(temp.left);
             
         if (temp != null && temp.right != null )
             q1.add(temp.right);
             
         q.poll();
         
         NodeConnectNodesAtSameLevel prev = null;
         NodeConnectNodesAtSameLevel temp1 = null;
         boolean flag = false;
         while (q.isEmpty() && !q1.isEmpty()) {
             
             if (prev == null && !q1.isEmpty()) {
                 prev = q1.poll();
             }
             
           
             
              temp1 = q1.poll();
             
             prev.nextRight = temp1;
             
             q2.add(prev);
             prev = temp1;
//             q2.add(temp1);
//             prev = q1.poll();
             flag = true;
         }
         
         if (q.isEmpty() && flag) {
        	 q2.add(temp1);
	         q = q2;
	         q2 = new LinkedList<>();
	         flag = false;
         }
         
     }
     
     
     
 }
}