package zohoInterviewQstns;

public class pattern {

	/*private void remove(Node head) {

		HashSet<Integer> set = new HashSet<>();
		set.add(head.val);
		Node root = head;

		while (root != null) {
			if (set.contains(root.next.val)) {
				root.next = root.next.next;
			} else {
				set.add(root.next.val);
			}
			root = root.next;
		}

		return head;
	}*/

	private static void printPattern(int n) {

		if (n <= 1)
			return;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.setLength(0);
			for (int j = 0; j < n; j++) {
				if (j >= n - i - 1)
					sb.append("*");
				else
					sb.append(" ");
			}
			String temp = sb.toString();
			temp = temp.substring(0, temp.length() - 1);
			System.out.println(temp);
		}

		for (int i = 1; i < n; i++) {
			sb.setLength(0);
			for (int j = 0; j < n; j++) {
				if (j < i) {
					sb.append(" ");
				} else
					sb.append("*");
			}
			String temp = sb.toString();
			temp = temp.substring(0, temp.length() - 1);
			System.out.println(temp);
		}

	}

	public static void main(String[] args) {

		int n = 5;
		printPattern(n);

	}

}
