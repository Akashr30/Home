package leetcode;

public class ContainsDuplicate3 {
	
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        
        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = 0 ; j < nums.length ; j++) {
            	long l1 = nums[i];
            	long l2 = nums[j];
                if (i!=j && Math.abs(i-j) <= k && Math.abs(l1-l2) <= t) {
                    return true;
                }
            }
        }
        
        return false;
    }

	public static void main(String[] args) {
		
		int k = 1;
		int t = 2147483647;
		int[] arr = {-1,2147483647};
		System.out.println(containsNearbyAlmostDuplicate(arr,k,t));
		// -2147483648
	}

}
