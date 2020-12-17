package stack;

import java.util.Stack;

public class SimpleCalcII {
	
	 static int i;
	    public int calculate(String s) {
	        i = 0;
	        Stack<String> stack = new Stack<>();
	        Stack<String> temp = new Stack<>();
	        int len = s.length();
	        int sum = 0;
	        StringBuilder sb = new StringBuilder();
	        
	        for ( ; i < len ;) {
	            
	            if (s.charAt(i) == ' ') {
	              i++;
	            	continue;
	            } else if (s.charAt(i) == '*') {
	                String num = getNextNum(s);
	                if (sb.toString().length() == 0)
	                	sb.append(stack.pop());
	                stack.push(multiply(num,sb.toString()));
	                sb.setLength(0);
	            } else if (s.charAt(i) == '/') {
	                String num = getNextNum(s);
	                if (sb.toString().length() == 0)
	                	sb.append(stack.pop());
	                stack.push(divide(sb.toString(),num));
	                sb.setLength(0);
	            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
	                stack.push(sb.toString());
	                stack.push(String.valueOf(s.charAt(i)));
	                sb.setLength(0);
	            } else 
	                sb.append(s.charAt(i)); 
	            
	            i++;
	       }
	        if (sb.toString().length() > 0)
	        	stack.push(sb.toString());
	        
	        while (!stack.isEmpty()) {
	            temp.push(stack.pop());
	        }
	        
	        while (!temp.isEmpty()) {
	            
	            if (temp.peek().equals("-")) {
	                temp.pop();
	                sum -= Integer.parseInt(temp.pop());
	            } else  if (temp.peek().equals("+")) {
	                 temp.pop();
	                sum += Integer.parseInt(temp.pop());
	            } else {
	                sum += Integer.parseInt(temp.pop());
	            }
	        }
	        
	        return  sum ;
	        
	    }
	    
	    
	    private String getNextNum(String s) {
	    	i++;
	        int n = s.length();    
	        StringBuilder sb1 = new StringBuilder();
	        for (; i < n  ; i++) {
	           if ((i < n-1) && ( s.charAt(i+1) == '*' || s.charAt(i+1) == '/' || s.charAt(i+1) == '+' || s.charAt(i+1) == '-')) {
	               return sb1.append(s.charAt(i)).toString();
	            } else if (s.charAt(i) == ' ') {
	                continue;
	            }
	            sb1.append(s.charAt(i));
	        }
	        return sb1.toString();
	    }
	    
	     private String multiply(String n1 , String n2) {
	        return String.valueOf(Integer.parseInt(n1)*Integer.parseInt(n2));
	    }
	    
	    private String divide(String n1 , String n2){
	        return String.valueOf(Integer.parseInt(n1)/Integer.parseInt(n2));
	    }

	public static void main(String[] args) {
		
//		String s = " 3-5 / 2 ";
//		String s = "5*6/4";
		String s = "2*3+4";
		new SimpleCalcII().calculate(s);

	}

}
