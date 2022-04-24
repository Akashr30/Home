package backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class PermutationsII {
	List<List<Integer>> res;
	HashSet<List<Integer>> set;
	public List<List<Integer>> permuteUnique(int[] nums) {
	    
	    res = new ArrayList<>();
	    set = new HashSet<>();
	    boolean[] arr = new boolean[nums.length];
	    find(nums,arr,new ArrayList<>());
	    return new ArrayList(set);
	}
	
	private void find(int[] nums ,boolean[] arr, ArrayList<Integer> list) {
	    
	    if (list.size() == nums.length) {
	    	set.add(new ArrayList<Integer>(list));
	    }
	    Stack<String[]> stack = new Stack<>();
	    for (int i = 0 ; i < nums.length ; i++) {
	        
	        if (arr[i])
	            continue;
	        arr[i] = true;
	        list.add(nums[i]);
	        find(nums,arr,list);
	        arr[i] = false;     
	        if (list.size() > 0)
	            list.remove(list.size()-1);
	    }
	}
	
	public static void main(String[] ar) {
		int[] nums = {1,2,3,4};
		new PermutationsII().permuteUnique(nums);
	}
}
