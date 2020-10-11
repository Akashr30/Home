package treesAndGraphs;

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class CheckIfSubtreeNode{
 int data;
 CheckIfSubtreeNode left;
 CheckIfSubtreeNode right;
 CheckIfSubtreeNode(int data){
     this.data = data;
     left=null;
     right=null;
 }
}

class CheckIfSubtreeGFG {
 
 static CheckIfSubtreeNode buildTree(String str){
     
     if(str.length()==0 || str.charAt(0)=='N'){
         return null;
     }
     
     String ip[] = str.split(" ");
     // Create the root of the tree
     CheckIfSubtreeNode root = new CheckIfSubtreeNode(Integer.parseInt(ip[0]));
     // Push the root to the queue
     
     Queue<CheckIfSubtreeNode> queue = new LinkedList<>(); 
     
     queue.add(root);
     // Starting from the second element
     
     int i = 1;
     while(queue.size()>0 && i < ip.length) {
             
         // Get and remove the front of the queue
         CheckIfSubtreeNode currNode = queue.peek();
         queue.remove();
             
         // Get the current node's value from the string
         String currVal = ip[i];
             
         // If the left child is not null
         if(!currVal.equals("N")) {
                 
             // Create the left child for the current node
             currNode.left = new CheckIfSubtreeNode(Integer.parseInt(currVal));
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
             currNode.right = new CheckIfSubtreeNode(Integer.parseInt(currVal));
                 
             // Push it to the queue
             queue.add(currNode.right);
         }
         i++;
     }
     
     return root;
 }
 static void printInorder(CheckIfSubtreeNode root){
     if(root == null)
         return;
         
     printInorder(root.left);
     System.out.print(root.data+" ");
     
     printInorder(root.right);
 }
 
	public static void main (String[] args) throws IOException {
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
	        while(t-- > 0){
	            String tt= br.readLine();
	            CheckIfSubtreeNode rootT = buildTree(tt);
	            
	            String s= br.readLine();
	            CheckIfSubtreeNode rootS = buildTree(s);
	           // printInorder(root);
	            
	            CheckIfSubtreeTree tr=new CheckIfSubtreeTree();
	            boolean st=tr.isSubtree(rootT, rootS);
	            if(st==true){
	                System.out.println("1");
	            }else{
	                System.out.println("0");
	            }
	        }
	}
}// } Driver Code Ends


//User function Template for Java

/*complete the given function*/

/* class CheckIfSubtreeNode{
 int data;
 CheckIfSubtreeNode left,right;
 CheckIfSubtreeNode(int d)
 {
     data=d;
     left=null;
     right=null;
 }
}*/

//3 4 5 1 2 N N 0
//4 1 2

class CheckIfSubtreeTree {
 public static boolean isSubtree(CheckIfSubtreeNode t, CheckIfSubtreeNode s) {
	 Queue<CheckIfSubtreeNode> q = new LinkedList<>();
     q.add(t);
     boolean flag = false;
     boolean check = true;
     while (!q.isEmpty()) {
         
         int n = q.size();
         for (int i = 0 ; i < n ; i++) {
             
             CheckIfSubtreeNode temp = q.peek();
             
             if (temp.data == s.data){
                 flag = find(q.peek(),s);
             } 
                 
             if (temp.left != null)
                 q.add(temp.left);
             
             if (temp.right != null)
                 q.add(temp.right);
                 
             
             q.poll();
         }
         
         if (flag)
             return true;
     }
     return flag;
 }
 
 private static boolean find(CheckIfSubtreeNode q,CheckIfSubtreeNode q1 ) {
     
     if (q  == null && q1 == null)
         return true;
     
     if (q  == null || q1 == null)
         return false;
     
    return q.data == q1.data && find(q.left,q1.left) && find(q.right , q1.right);
 }
}
