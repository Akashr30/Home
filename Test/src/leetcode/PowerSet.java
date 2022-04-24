package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        res.add(new ArrayList<>());
        boolean[] arr = new boolean[nums.length];
        find(nums,0,arr,new ArrayList<>());
        return res;
    }
    
    public void find(int[] nums , int st , boolean[] arr , List<Integer> ar) {
        
        for (int i = st ; i < nums.length ; i++) {
            if (arr[i])
                continue;
            ar.add(nums[i]);
            res.add(new ArrayList<>(ar));
            arr[i] = true;
            find(nums,i+1,arr,ar);
            arr[i] = false;
            ar.remove(ar.size()-1);
        }
    }

	public static void main(String[] args) {
		
		PowerSet ps = new PowerSet();
		int[] nums = {1,2,3};
		ps.subsets(nums);
	}

}
