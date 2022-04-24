package treesAndGraphs;

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class NodeDiagonalTreeSum{
 int data;
 NodeDiagonalTreeSum left;
 NodeDiagonalTreeSum right;
 NodeDiagonalTreeSum(int data){
     this.data = data;
     left=null;
     right=null;
 }
}

class GfGDiagonalTreeSum {
 
 static NodeDiagonalTreeSum buildTree(String str){
     
     if(str.length()==0 || str.charAt(0)=='N'){
         return null;
     }
     
     String ip[] = str.split(" ");
     // Create the root of the tree
     NodeDiagonalTreeSum root = new NodeDiagonalTreeSum(Integer.parseInt(ip[0]));
     // Push the root to the queue
     
     Queue<NodeDiagonalTreeSum> queue = new LinkedList<>(); 
     
     queue.add(root);
     // Starting from the second element
     
     int i = 1;
     while(queue.size()>0 && i < ip.length) {
         
         // Get and remove the front of the queue
         NodeDiagonalTreeSum currNode = queue.peek();
         queue.remove();
             
         // Get the current node's value from the string
         String currVal = ip[i];
             
         // If the left child is not null
         if(!currVal.equals("N")) {
                 
             // Create the left child for the current node
             currNode.left = new NodeDiagonalTreeSum(Integer.parseInt(currVal));
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
             currNode.right = new NodeDiagonalTreeSum(Integer.parseInt(currVal));
                 
             // Push it to the queue
             queue.add(currNode.right);
         }
         i++;
     }
     
     return root;
 }
 static void printInorder(NodeDiagonalTreeSum root)
 {
     if(root == null)
         return;
         
     printInorder(root.left);
     System.out.print(root.data+" ");
     
     printInorder(root.right);
 }
 
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
 
	        while(t > 0)
	        {
	            String s = br.readLine();
 	    	NodeDiagonalTreeSum root = buildTree(s);
     	    TreeDiagonalTreeSum g = new TreeDiagonalTreeSum();
			    g.diagonalSum(root);
			    System.out.println();
             t--;
         
     }
 }

}

//} Driver Code Ends


/*Complete the function below
NodeDiagonalTreeSum is as follows:
class NodeDiagonalTreeSum{
 int data;
 NodeDiagonalTreeSum left,right;
 NodeDiagonalTreeSum(int d){
     data=d;
     left=right=null;
 }
}
*/
class TreeDiagonalTreeSum {
 public static void diagonalSum(NodeDiagonalTreeSum root) 
 {
     Queue<NodeDiagonalTreeSum> q = new LinkedList<>();
     Queue<NodeDiagonalTreeSum> q2 = new LinkedList<>();
     q.add(root);
     StringBuffer sb = new StringBuffer();
     boolean flag = true;
     while (!q.isEmpty()) {
    	 
    	 if (q.peek() == null)
    		 q.poll();
    	 
         NodeDiagonalTreeSum head = q.peek();
         NodeDiagonalTreeSum n = head;
         
         while (n != null && flag) {
        	 n = n.right;
             q.add(n);
         }
//         if (n == null)
//             q.add(null);
          flag = false;
         int sum = 0;
         while (!q.isEmpty() && q.peek() != null) {
             NodeDiagonalTreeSum x = q.poll();
             sum += x.data;
             
             if (x.left != null) {
                 NodeDiagonalTreeSum lTemp = x.left;
                 q2.add(lTemp);
             }
             if (x.right != null)
                 q.add(x.right);
         }
         q = q2;
         q2 = new LinkedList<>();
         if (sum != 0)
          sb.append(sum).append(" ");
         sum = 0;
     }
     
     System.out.println(sb);
 }
}