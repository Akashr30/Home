package leetcode;

import java.util.Stack;

public class AsteroidCollision {
	
	public static int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i : asteroids) {
            
            if (stack.isEmpty()) {
                stack.push(i);
            } else if ((i > 0 && stack.peek() > 0) || (i < 0 && stack.peek() < 0) )  {
            	 stack.push(i);
            } else if (stack.peek() < 0 && i > 0 ) {
                stack.push(i);
            } else if (stack.peek() > 0 && i < 0 ) {
                
                if (Math.abs(i) == stack.peek()) {
                    stack.pop();
                }  else {
                    int temp = Math.abs(i);
                    
                    while (!stack.isEmpty() 
                           && stack.peek() > 0 
                           && stack.peek() < temp) {
                        stack.pop();
                    }
                    
                    if (stack.peek() > temp) {
                        continue;
                    } else {        
                        stack.push(i);
                    }
                }
                
            }
        }
        int[] res = new int[stack.size()];
        int n = res.length-1;
        while (!stack.isEmpty()) {
            res[n--] = stack.pop();
        }
        
        
        return res;
    }

	public static void main(String[] args) {

		int[] arr = {-2,-1,1,2};
		asteroidCollision(arr);

	}

}
