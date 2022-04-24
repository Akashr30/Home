package leetcode;

public class KadaneAlgo {
	
	 public static  int maxSubArray(int[] nums) {
	        int maxsum=nums[0];
	        int len=nums.length;
	        int index=1;
	        return recursion(nums,index,len,maxsum);
	    }
	    
	    public static int recursion(int[] nums,int index,int len,int maxsum){
	        if(index==len){
	             return maxsum;
	        }else{
	            int sum=0;
	            
	            for(int i=index;i>=0;i--){
	                sum+=nums[i];
	                maxsum=Math.max(maxsum,sum);
	            }
	            index++;
	            return recursion(nums,index,len,maxsum);
	        }
	    }
	    
	    public static void main(String[] ar) {
	    	
	    	int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
	    	maxSubArray(arr);
	    }
}
