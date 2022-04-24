package testOne;

import java.util.*;
import java.lang.*;

class NodeSwap {
    int data;
    NodeSwap next;
    NodeSwap(int key) {
        data = key;
        next = null;
    }
}

class PairWiseSwapLinkedList {
    static NodeSwap head;
    static NodeSwap last;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            NodeSwap head = new NodeSwap(a1);

            addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                addToTheLast(new NodeSwap(a));
            }

            GFGSwap gfg = new GFGSwap();
            head = gfg.pairwiseSwap(head);
            printList(head);
            System.out.println();
        }
    }

    public static void addToTheLast(NodeSwap node) {
        if (head == null) {
            head = node;
            last=head;
        } else {
            // NodeSwap temp = head;
            // while (temp.next != null) temp = temp.next;
            last.next = node;
            last=last.next;
        }
    }

    public static void printList(NodeSwap node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}// } Driver Code Ends
/*node class of the linked list
class NodeSwap
{
    int data;
    NodeSwap next;
    NodeSwap(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class GFGSwap {
    public static NodeSwap pairwiseSwap(NodeSwap head) {
         if(head == null || head.next == null)
            return head;
        
         NodeSwap b = head.next, a = head, prev = null;
         NodeSwap ans = b;
        while(b != null) {
        	NodeSwap next_b = b.next;
            a.next = next_b;
            b.next = a;
            if(prev != null)
                prev.next = b;
            prev = a;
            a = a.next;
            b = a != null ? a.next : null;
        }
        return ans;}
}