package slidingWindow;

//Java implementation to find the length 
//of longest subarray having sum k 
import java.io.*; 
import java.util.*; 

class LargestSubArrayWithSumK {
    
    static int maxSumSubArray(int[] nums,int len , int total)  {
        
       /* int max = 0;
        int i= 0;
        int start = i;
        int sum = 0;
//         6 -5
// 10 5 2 7 1 9
        
        for (i = 0 ; i < len ; i++) {
            
            
            
            while (nums[i]+sum > total && start < i) {
                
                sum -= nums[start];
                start++;
            }
            
            if (nums[i]+sum < total && !(nums[i]+sum == total )) {
                sum = nums[i]+sum;
            }
            
            if (nums[i]+sum == total) {
                sum += nums[i];
                max = Math.max((i-start)+1,max);
            }    
        }
        return max;*/
    	
    	  

        
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int  max = 0;
        for (int i = 0 ; i < len ; i++) {
            sum += nums[i];
           
            if (sum == total)
            	max = i+1;
            
            if (!map.containsKey(sum))
            	map.put(sum, i);
            
            if (map.containsKey(sum-total)) {
            	
            	if (max < i-map.get(sum-total)) {
            		max = i - map.get(sum - total);
            	}
            }
        }
        
        return max;
        
    
    }
     
	public static void main (String[] args)
	 {
	    
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    while (test-- > 0) {
	        
	        String lenAndSum = sc.nextLine();
	        int [] arr = Arrays.stream(lenAndSum.split(" ")).mapToInt(Integer::parseInt).toArray();
	        String num = sc.nextLine();
	        int[] nums = Arrays.stream(num.split(" ")).mapToInt(Integer::parseInt).toArray();
	        int len = arr[0];
	        int total = arr[1];
	        System.out.println(maxSumSubArray(nums,len,total));
	    }
	    
	    
	 }
} 

//This code is contibuted by rachana soma 
