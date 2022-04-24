package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SkylineProblem {
	
    public List<List<Integer>> getSkyline(int[][] arr) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Stack<int[]> stack = new Stack<>();
        for (int i = 0 ; i < arr.length ; i++) {
            
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                
                int[] temp = stack.pop();
                
                if (temp[1] < arr[i][0]) {
                    res.add(new ArrayList<>(Arrays.asList(new Integer[] {temp[0],temp[2]})));
                    res.add(new ArrayList<>(Arrays.asList(new Integer[] {temp[1],0})));
                    stack.push(temp);
                    stack.push(arr[i]);
                } else if (temp[1] >= arr[i][0]) {
                    
                    if (temp[0] == arr[i][0] && temp[1] <= arr[i][1]) {
                        res.add(new ArrayList<>(Arrays.asList(new Integer[] {arr[i][0],arr[i][2]})));
                        temp[1] = Math.max(temp[1],arr[i][1]);
                        temp[2] = Math.max(temp[2],arr[i][2]);
                        stack.push(temp);
                    } else if (temp[1] > arr[i][0] && temp[1] >= arr[i][1]) {
                    	res.add(new ArrayList<>(Arrays.asList(new Integer[] {temp[0],temp[2]})));
                    	res.add(new ArrayList<>(Arrays.asList(new Integer[] {arr[i][0],arr[i][2]})));
                        temp[2] = Math.max(temp[2],arr[i][2]);
                        stack.push(temp);
                    } else if (temp[1] > arr[i][0] && temp[1] < arr[i][1]) {
                    	res.add(new ArrayList<>(Arrays.asList(new Integer[] {temp[0],temp[2]})));
                    	res.add(new ArrayList<>(Arrays.asList(new Integer[] {arr[i][0],arr[i][2]})));
                        temp[1] = arr[i][1];
                        temp[2] = Math.max(temp[2],arr[i][2]);
                        stack.push(temp);
                    }
                } 
            }
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
