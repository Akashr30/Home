package zohoInterviewQstns;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class CheckParanthesis {
	
	public static boolean checkBrackets(String str) {
		
		Stack<Character> stack = new Stack<>();
		int len = str.length();
		for (int i = 0  ; i < len ; i++) {
			char temp = str.charAt(i);
			if (stack.isEmpty()) {
				stack.add(temp);
			} else if (stack.peek()=='{' && temp == '}') {
				stack.pop();
			} else if (stack.peek() == '(' && temp == ')') {
				stack.pop();
			} else if (stack.peek() == '[' && temp == ']') {
				stack.pop();
			} else {
				stack.add(temp);
			}
		}
		
		return stack.isEmpty();
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.next());
		
		while (test-- > 0) {
//			String str = "[{{}}]";
//			String str = "[(}}]";
//			String str = "[{]";
//			String str = "";
			String str = sc.next();
			System.out.println(checkBrackets(str));
		}
		
	}

}
