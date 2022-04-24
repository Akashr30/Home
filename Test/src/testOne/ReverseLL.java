package testOne;

class LinkedList { 

	static Node head; 

	static class Node { 

		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	/* Function to reverse the linked list */

    private boolean isPal = true;
	Node reverse(Node root) 
	{ 
		/*Node n = head;
		Node temp = revert(n,n);
		
		return head;*/
		int k = 3;
		Node[] res = new Node[k];
		
		Node n = root;
        int c = 0;
        while (n != null) {
            c++;
            n = n.next;
        }
        
        int div = c/k;
        int rem = c%k;
        int num = k;
        Node head = root;
        Node prev = null;
        for (int i = 0 ; i < k ; rem--,i++) {
            
            res[i] = head;
            if (head != null) {
                for (int j = 0 ; j < div + (rem > 0 ? 1 : 0) ; j++) {
                    prev = head;//1,2,3,4
                    head = head.next;
                }
                prev.next = null;
            }
        }
        return null;
	} 
	
	private Node revert(Node head, Node curr) {
		
		if(curr == null || !isPal) {
            return head;
        }
        head = revert(head, curr.next);
        if(head.data != curr.data) {
            isPal = false;
        } 
        return head.next;    
	}

	// prints content of double linked list 
	void printList(Node node) 
	{ 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) 
	{ 
		LinkedList list = new LinkedList(); 
		list.head = new Node(1); 
		list.head.next = new Node(2); 
		list.head.next.next = new Node(3); 
		list.head.next.next.next = new Node(4); 
		list.head.next.next.next.next = new Node(5); 
		list.head.next.next.next.next.next = new Node(6); 
		list.head.next.next.next.next.next.next = new Node(7);
		list.head.next.next.next.next.next.next.next = new Node(8);
		list.head.next.next.next.next.next.next.next.next = new Node(9);
		list.head.next.next.next.next.next.next.next.next.next = new Node(10);

		System.out.println("Given Linked list"); 
		list.printList(head); 
		head = list.reverse(head); 
		System.out.println(""); 
		System.out.println("Reversed linked list "); 
		list.printList(head); 
	} 
} 

//This code has been contributed by Mayank Jaiswal 
