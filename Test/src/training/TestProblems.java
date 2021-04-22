package training;


class TestNode {
	
	int val;
	TestNode next;
	
	TestNode() {}
	
	public TestNode(int val, TestNode testNode) {
		this.val = val;
		this.next = testNode;
	}
	
}



public class TestProblems {
	
	static void delete (TestNode head) {
		
		System.out.println(head.val);
	}
	
	public static void main(String[] args) {
		
		TestNode obj = new TestNode(5,null);
		obj.next = new TestNode(6,null);
		obj.next.next =  new TestNode(7,null);
		obj.next.next.next =  new TestNode(8,null);
		obj.next.next.next.next =  new TestNode(9,null);
		
		delete(obj.next);
	}

}
