package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestDivisor {
	
    /*public static int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int i = 1;
        List<Integer> set = new ArrayList<>();
        while (i <= nums[nums.length-1]) {
            
            int sum = 0;
            
            for (int j = 0 ; j < nums.length ; j++) {
                int q = nums[j]/i;
                int rem = nums[j] % i;
                if (rem != 0) 
                    q += 1;
                sum += q;
                if (sum > threshold)
                    break;
            }
            if (sum <= threshold)
                set.add(i);
            i++;
        }
        Collections.sort(set);
        return set.size() == 0 ? 0 : set.get(0);
        }*/
	
	public static int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int i = 1;
        int j = nums[nums.length-1];
        List<Integer> set = new ArrayList<>();
        while (i < j) {
            
            int mid = (i+j)/2;
            int sum = getSum(nums,mid);
            
            if (sum > threshold){
                j = mid-1;
            } else {
                i = mid+1;
            }
            
        }
        return i;
    }
    
    
    
    private static int getSum(int[] nums , int i) {  
        int sum = 0;
        for (int j = 0 ; j < nums.length ; j++) {
            int q = nums[j]/i;
            int rem = nums[j] % i;
            if (rem != 0) 
                q += 1;
            sum += q;
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,5,9};
		int n = 6;
		smallestDivisor(arr,n);
	}

}
