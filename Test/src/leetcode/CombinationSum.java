package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        find(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
    
    
    private static void find (int[] arr , int k , int st ,List<Integer> al,List<List<Integer>> res) {
        
        if (k < 0)
            return;
        
        if (0 == k)
            res.add(new ArrayList(al));
        
        
        for (int i = st ; i < arr.length ; i++) {
            al.add(arr[i]);
            find(arr,k-arr[i],i,al,res);
            al.remove(al.size()-1);
        }
    }

	public static void main(String[] args) {
		
		int[] arr = {2,3,6,7};
		int k = 7;
		combinationSum(arr,k);
		
	}

}
