package leetcode;

public class MinimumDaysToMakeBouquets {
	
	 public static int minDays(int[] A, int m, int k) {
	        int n = A.length, left = 1, right = (int)1e9;
	        if (m * k > n) return -1;
	        while (left < right) {
	            int mid = (left + right) / 2, flow = 0, bouq = 0;
	            for (int j = 0; j < n; ++j) {
	                if (A[j] > mid) {
	                    flow = 0;
	                } else if (++flow >= k) {
	                    bouq++;
	                    flow = 0;
	                }
	            }
	            if (bouq < m) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }
	 
	 public static void main(String[] ar) {
		 
		 int[] arr = {1,10,3,10,2};
		 int m = 3;
		 int k = 1;
		 System.out.println(minDays(arr,m,k));
	 }
}
