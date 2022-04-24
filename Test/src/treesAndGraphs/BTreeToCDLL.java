package treesAndGraphs;


import java.util.Scanner;
import java.util.*;
import java.io.*;
class Nodee6{
    int data;
    Nodee6 left,right;
    Nodee6(int d){
        data=d;
        left=right=null;
    }
}
class TreeNodee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==0){
                System.out.println(0);
                continue;
            }
            Nodee6 root = null;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int a1=sc.nextInt();
                char lr=sc.next().charAt(0);
                if(i==0){
                    root=new Nodee6(a);
                    switch(lr){
                        case 'L':root.left=new Nodee6(a1);
                        break;
                        case 'R':root.right=new Nodee6(a1);
                        break;
                    }
                }
                else{
                    insert(root,a,a1,lr);
                }
            }
            //inorder(root);
            GfGG2 g=new GfGG2();
                 root =  g.bTreeToClist(root);
                
                TreeNodee tn = new TreeNodee();
                tn.displayCList(root);
                
                
                /* inorder(root);
                 System.out.println();*/
            
        }
    }
    public static void insert(Nodee6 root,int a,int a1,char lr){
        if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Nodee6(a1);
                break;
                case 'R':root.right=new Nodee6(a1);
                break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
    public static void inorder(Nodee6 root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    void displayCList(Nodee6 head)
{
    Nodee6 itr = head;
    do
    {
       System.out.print(itr.data + " ");
        itr = itr.right;
    } while (head!=itr);
   System.out.println();
	itr=itr.left;
	do{
		System.out.print(itr.data + " ");
		itr=itr.left;
	}while(head!=itr);
	System.out.println(itr.data + " ");
}
}

/*This is a function problem.You only need to complete the function given below*/
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/
//User function Template for Java
/*
Nodee6 defined as
class Nodee6{
    int data;
    Nodee6 left,right;
    Nodee6(int d){
        data=d;
        left=right=null;
    }
}
*/
class GfGG2
{ 
    Nodee6 head;
    Nodee6 bTreeToClist(Nodee6 root)
    {
        if (root == null) {
            return null;
        }
        
         bTreeToClist(root.left);
         
        if (head == null) {
            head = root;
        } else  {
            
            Nodee6 node = head;
            Nodee6 n2 = head;
            
            while (node.right != null) {
                node = node.right;
            }
            Nodee6 n1 = new Nodee6(root.data);
            node.right = n1;
            n1.left = node;
            
            n2.left = n1;
            n1.right = n2;
        }
        
         bTreeToClist(root.right);
        
        return head;
    }
    
}
    