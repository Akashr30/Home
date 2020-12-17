package dynamicProgramming;

import java.util.Arrays;

public class PartitionEqualsSubsetSum {
	
    public boolean canPartition(int[] nums) {
        
        Arrays.sort(nums);
        
        int i = 0 , j = nums.length-1;
        int lhs = 0 , rhs = 0;
        while (i <= j) {
            
            if (lhs == 0 ) {
                lhs += nums[i];
                i++;
                continue;
            }
            
            if (lhs <= rhs ) {
                
                lhs += nums[i];
                i++;
            } else if (lhs > rhs ) {
                rhs += nums[j];
                j--;
            }
        }
        
        return lhs == rhs;
    }

	public static void main(String[] args) {
		
		int[] nums = {1,5,11,5};
		new PartitionEqualsSubsetSum().canPartition(nums);
	}

}
