package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    static String findStockSpan(int[] nums) {
    	
        Stack<int[]> stack= new Stack<>();
        
        if (nums.length == 1)
            return "1";
        
        StringBuffer sb = new StringBuffer();
        stack.push(new int[]{nums[0],1});
        sb.append("1 ");
        
        for (int i = 1 ; i < nums.length ; i++) {
            int sum = 0;
            while (!stack.isEmpty() && stack.peek()[0] <= nums[i]) {
                
                int[] temp = stack.pop();
                sum += temp[1];
            }
            
            if (sum == 0) {
                sb.append("1 ");
                stack.push(new int[]{nums[i],1});
            } else {
                sb.append(sum+1).append(" ");
                stack.push(new int[]{nums[i],sum+1});
            }
            sum = 0;
            
        }
        
       return sb.toString();
        
    } 
     
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    while (test-- > 0) {
	        
	        int len = Integer.parseInt(sc.nextLine());
	        String str = sc.nextLine();
	        int[] nums = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
	        System.out.println(findStockSpan(nums));
	    }
	 }
}
