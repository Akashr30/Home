package com.java8;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CollectionsJav8 {
	
	CollectionsJav8(){
		System.out.println("Hello");
	}
	
	public boolean checkMatch(String input) {
        String str = "(){}[]";
        String nums = "-+/*%0123456789";
        Stack<Character> stack = new Stack<>();
        int n = input.length();
        
        for (int i = 0 ; i < n ; i++) {
            char temp = input.charAt(i);
            if (str.indexOf(temp) == -1 
                && nums.indexOf(temp) == -1)
                return false;
            
            if (str.indexOf(temp) > -1) {
                if (stack.isEmpty()) {
                    stack.push(temp);
                }  else if ((stack.peek() == '(' && temp == ')' ) 
                			|| (stack.peek() == '[' && temp == ']') 
                			|| (stack.peek() == '{' && temp == '}')) {
                    stack.pop();
                } else  {
                    stack.push(temp);
                }
                
            }
            
        }
        
        return stack.size() == 0;
    }
//	CollectionsJav8 x = new CollectionsJav8();
	public static void main(String[] ar) {
		
		
		CollectionsJav8 x = new CollectionsJav8();
		String str = "(9*8)+(1-2)-[7/2]";
		System.out.println(x.checkMatch(str));
		int[][] a = new int[3][];
		System.out.println(Pattern.matches("^[^\\d].*", "123abc"));
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(4);
		al.add(6);
		Stream s ;
		al.stream();
	}
}
