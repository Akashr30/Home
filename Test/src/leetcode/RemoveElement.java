package leetcode;

public class RemoveElement {
	
    public static int removeElement(int[] nums, int val) {
        
        int j = nums.length-1;
        int n = nums.length;
        int i = 0;
        while (i <= j) {
            
            if (nums[i] == val) {
                
                while (nums[j] == val) {
                    j--;
//                    n--;
                }
                if (i < j) {
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
//	                n--;
                }
            }
            i++;
        }
        
        return n;
    }

	public static void main(String[] args) {
		
		int[]  nums = {3,2,2,3};
		int val = 3;
		removeElement(nums,val);
	}

}
