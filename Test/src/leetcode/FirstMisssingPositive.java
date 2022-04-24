package leetcode;

import java.util.Arrays;

public class FirstMisssingPositive {
	
	public static int firstMissingPositive(int[] nums) {
        
        if (nums.length == 0)
            return 1;
        
//         TreeMap<Integer,Integer> res = new TreeMap<>();
//         int c = 1;
//         for (int x : nums)
//             res.put(x,x);
        
//         for (int i = 0 ; i < res.size();i++) {
//             if (res.get(c++) == null)
//                 return c-1;
//         }
//         return c;
        
        int max = Arrays.stream(nums).max().getAsInt();
//        if (max == Integer.MAX_VALUE)
//            return 1;
        if (max < 0)
            return 1;
        int[] arr = new int[max];
        
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] > 0) {
                arr[nums[i]-1]++;
            }
        }
        
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == 0)
                return i+1;
        }
        
        return arr.length;
    }

	public static void main(String[] args) {

		
		int[] arr = {1,2,3,10,2147483647,9};
		firstMissingPositive(arr);
	}

}
