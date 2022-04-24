package leetcode;

public class CheckIfPairsAreDivisibleByK {
	
	public boolean canArrange(int[] arr, int k) {
	       // If length of an array is odd return false
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

}
