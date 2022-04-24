package leetcodeWeeklyContestDiscussion;

public class CheckIfArrayPairsDivisiblebyK {
	
	 public static boolean canArrange(int[] arr, int k) {
	    /*    int[] frequency = new int[k];
	        for(int num : arr){
	            num %= k;
	            if(num < 0) num += k;
	            frequency[num]++;
	        }
	        if(frequency[0]%2 != 0) return false;
	        
	        for(int i = 1; i <= k/2; i++)
	            if(frequency[i] != frequency[k-i]) return false;
				
        return true;*/
		 
		 if(arr.length%2 == 1) return false;
	        
			// compute remainder frequency in an array 1--k
	        int[] freq = new int[k];
	        
	        for(int n : arr) {
	            int rem = n%k;
	            
				// if remainder is -ve add by k to make sure remainder falls between 1--k
	            if(rem < 0) rem += k;
	            
	            freq[rem]++;
	        }
	        
	        for(int i = 1; i < k; i++) {
			   // if count of remainder i and k-i not equal then return false
	            if(freq[i] != freq[k-i]) return false;
	        }
	        // if count of remainder of  0 value is odd than not possible
	        return freq[0]%2 == 0;
	 }        
       
       public static void main(String[] ar) {
    	   
//    	   int[] a = {1,2,3,4,5,6};
//    	   int[] a = {1,2,3,4,5,10,6,7,8,9};
    	   int[] a = {-1,1,-2,2,-3,3,-4,4};
    	   int k = 3;
    	   System.out.println(canArrange(a,k));
       }

}
