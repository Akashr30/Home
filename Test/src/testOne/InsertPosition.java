package testOne;

public class InsertPosition {
	
	public static void main(String[] ar) {
		
		int[] nums = {1,3,5,6};
		int target = 2;
		
		 if (target > nums[nums.length-1])
	            System.out.println( nums.length+1);
	        
	        int left = 0;
	        int right = nums.length;
	        while (left <= right) {
	            
	            int mid = (left+right)/2;
	            
	            if (target > nums[mid]) {
	                left = mid+1;
	            } else {
	            	right = mid-1;
	            }
	            
	            if (target == nums[mid])
	            	System.out.println(mid); 
	        }
	        
	        System.out.println(left);
	        
	}

}
