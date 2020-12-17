package stack;

import java.util.HashSet;
import java.util.Stack;

public class RemoveToMakeValidParanthesis {
	
    /*public String minRemoveToMakeValid(String s) {
        
        String[] arr = s.split("");
        Stack<String[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < arr.length ; i++) {
            
            if (stack.isEmpty() && (arr[i].equals("(") || arr[i].equals(")"))) {
                stack.push(new String[]{arr[i], i+""});
            } else {
                if (arr[i].equals("(")) {
                    stack.push(new String[]{arr[i], i+""});
                }

                if (arr[i].equals(")") && stack.peek()[0].equals("(")) {
                    stack.pop();
                } else if (arr[i].equals(")"))
                    stack.push(new String[]{arr[i],i+""});
            }
        }
        HashSet<Integer> set = new HashSet<>();
        while (!stack.isEmpty()) {
            int val = Integer.parseInt(stack.pop()[1]);
            set.add(val);
        }
        
        for (int i = 0 ; i < s.length() ; i++) {
            if(!set.contains(i))
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }*/
	
    public String minRemoveToMakeValid(String s) {
        
        String[] arr = s.split("");
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0 ; i < arr.length ; i++) {
            
            if (stack.isEmpty() && (arr[i].equals("(") || arr[i].equals(")"))) {
                stack.push(i);
            } else {
                if (arr[i].equals("(")) {
                    stack.push(i);
                }

                if (arr[i].equals(")") && arr[stack.peek()].equals("(")) {
                    stack.pop();
                } else if (arr[i].equals(")"))
                    stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            int num = stack.pop();
            s = s.substring(0,num)+s.substring(num+1,s.length());
        }
        
        return s;
    }

	public static void main(String[] args) {
		
		String s = "lee(t(c)o)de)";
		new RemoveToMakeValidParanthesis().minRemoveToMakeValid(s);

	}

}
