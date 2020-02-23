package treesAndGraphs;

/*public class LeavesToDLL {

}*/


import java.util.Scanner;
class Noddee3
{
    int data;
    Noddee3 left,right;
    Noddee3(int d){
        data=d;
        left=right=null;
    }
}
class TreeNode
{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==0){
                System.out.println(0);
                continue;
            }
            Noddee3 root = null;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int a1=sc.nextInt();
                char lr=sc.next().charAt(0);
                if(i==0){
                    root=new Noddee3(a);
                    switch(lr){
                        case 'L':root.left=new Noddee3(a1);
                        break;
                        case 'R':root.right=new Noddee3(a1);
                        break;
                    }
                }
                else{
                    insert(root,a,a1,lr);
                }
            }
            Noddee3 head = null;
            //inorder(root);
            GfGG1 g=new GfGG1();
           root = g.convertToDLL(root);
            g.pritntDLL();
            System.out.println();
           
           // System.out.println(g.tilt(root));
        }
    }
    public static void insert(Noddee3 root,int a,int a1,char lr){
        if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Noddee3(a1);
                break;
                case 'R':root.right=new Noddee3(a1);
                break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
    public static void inorder(Noddee3 root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}

/*This is a function problem.You only need to complete the function given below*/
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/
//User function Template for Java
/*
Noddee3 defined as
class Noddee3{
    int data;
    Noddee3 left,right;
    Noddee3(int d){
        data=d;
        left=right=null;
    }
}
*/
class GfGG1
{
    static Noddee3 leaves;
    Noddee3 nodes;
    Noddee3 temp;
    Noddee3 convertToDLL(Noddee3 root)
    {
        if (root == null) {
            return null;
        }
                
        if (root.left == null && root.right == null) {
           /* if (leaves == null) {
            	Noddee3 n3 = new Noddee3(root.data);
                leaves = n3;
                nodes = leaves;
            } else {
                leaves.right = root;
                 leaves.right.left = leaves;
                leaves = leaves.right;
            	Noddee3 n3 = new Noddee3(root.data);
            	nodes.right = n3;
            	n3.left = nodes;
            	
            	nodes = nodes.right;*/
        		if (nodes == null) {
        			nodes = root;
        			temp = nodes;
        		} else {
        			temp.right = root;
        			temp.right.left = temp;
        			temp = temp.right;
        		}
            
           
        } 
            convertToDLL(root.left);
            convertToDLL(root.right);
            // return root;
        
        return nodes;
    }
    
    void pritntDLL() {
        
        if (leaves == null) {
            return ;
        }
        
        System.out.print(leaves.data);
        
        while (leaves.right != null) {
            leaves = leaves.right;
            System.out.print(leaves.data+" ");
        }
    }
}
