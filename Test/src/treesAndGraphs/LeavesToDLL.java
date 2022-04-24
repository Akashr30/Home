package treesAndGraphs;
 
//package treesAndGraphs;{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class NodeLeavesToDLL{
    int data;
    NodeLeavesToDLL left;
    NodeLeavesToDLL right;
    NodeLeavesToDLL(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfGNodeLeavesToDLL {
    
    static NodeLeavesToDLL buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        NodeLeavesToDLL root = new NodeLeavesToDLL(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<NodeLeavesToDLL> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            NodeLeavesToDLL currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new NodeLeavesToDLL(Integer.parseInt(currVal));
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
                currNode.right = new NodeLeavesToDLL(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(NodeLeavesToDLL root)
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
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	NodeLeavesToDLL root = buildTree(s);
    	        TreenodeLeavestoDLL g = new TreenodeLeavestoDLL();
    	        NodeLeavesToDLL head_ref = null;
    	        NodeLeavesToDLL head = g.convertToDLL(root);
    	        printInorder(root);
    	        System.out.println();
    	        NodeLeavesToDLL temp = head;
    	        NodeLeavesToDLL last = null;
    	        while(temp!=null){
    	            last = temp;
    	            System.out.print(temp.data+" ");
    	            temp = temp.right;
    	        }
    	        System.out.println();
	            temp = last;
	            
	            while(temp!=null){
	                System.out.print(temp.data+" ");
	                temp = temp.left;
	            }
	            System.out.println();
	        
	            
	        }
	}
}


// } Driver Code Ends


//User function Template for Java

class TreenodeLeavestoDLL{
    // return the head of the DLL and remove those node from the tree as well.
    static Stack<NodeLeavesToDLL> al ;
    public NodeLeavesToDLL convertToDLL(NodeLeavesToDLL root)
    {
        
        if (root == null)
            return null;
        
       convertToDLLAlter( root);
       
       al = new Stack<>();
       NodeLeavesToDLL  head = null;
       if (!al.isEmpty())
            head = al.pop(); 
        NodeLeavesToDLL n = head;
       while (!al.isEmpty()) {
           
           NodeLeavesToDLL temp = al.pop();
           
           n.right = temp;
           temp.left = n;
           
           n = n.right;
           
           
       }
       return head;
    }
    
     
    static void convertToDLLAlter(NodeLeavesToDLL root) {
        
        if (root == null)
            return ;
        
        if (root.left!=null ) {
            
            if (root.left.left == null && root.left.right == null) {
                al.add(root.left);
                root.left = null;
            } 
        }  
        
        if (root.right!=null ) {
            
            if (root.right.left == null && root.right.right == null) {
                al.add(root);
                root.right = null;
            } 
        }
            
            convertToDLLAlter(root.left);
            convertToDLLAlter(root.right);
            
            return;
            
        }
        
        
    
}

