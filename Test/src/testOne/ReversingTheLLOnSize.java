package testOne;

/*public class ReversingTheLLOnSize {

}*/


import java.util.*;
import java.lang.*;
class Nodde2
{
    int data;
    Nodde2 next;
    Nodde2(int key)
    {
        data = key;
        next = null;
    }
}
class ReversingTheLLOnSize
{
    static Nodde2 head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Nodde2 head = new Nodde2(a1);
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Nodde2(a));
            }
            
            int k = sc.nextInt();
            GfGG3 gfg = new GfGG3();
            Nodde2 res = gfg.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void addToTheLast(Nodde2 node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Nodde2 temp = head;
            while(temp.next != null)
              temp = temp.next;
              temp.next = node;
        }
    }
    
    public static void printList(Nodde2 node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


/*This is a function problem.You only need to complete the function given below*/
/*node class of the linked list
class Nodde2
{
    int data;
    Nodde2 next;
    Nodde2(int key)
    {
        data = key;
        next = null;
    }
}
*/
class GfGG3
{
    static int count = 1;
    static Nodde2 temp;
    static Nodde2 prev;
    
     static Nodde2 n ;
     static Nodde2 n2;
     
    static  void reversingTheLL (Nodde2 node, int k) {
        n = node;
        while (count < k && n != null) {
          /*  if (prev == null) {
                prev = n;
                temp = prev;
            } 
            
            n = n.next;
            n1 = n;
            n1.next = prev;
            count++;*/
            
            prev = node;
            n2 = n.next;
            
            n.next = n2.next;
            n2.next = n;
            // n = n.next;
            count++;
        }
    }
    
    public static Nodde2 reverse(Nodde2 node, int k)
    {
        if (node==null)
            return null;
       
        reversingTheLL (node, k);
       
        if (n.next != null) {
            count = 1;
            reversingTheLL(n,k);
        }
        
        return n2;
    }
}