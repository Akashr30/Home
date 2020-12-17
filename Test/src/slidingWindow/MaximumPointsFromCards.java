package slidingWindow;

public class MaximumPointsFromCards {
	
	public int maxScore(int[] arr, int k) {
        
	       return find(arr,k,0,arr.length-1,0);
	        
	    }
	    
	    private int find (int [] arr , int k , int st, int end , int sum) {
	        
	        if (k == 0)
	            return sum;
	        
	        if (st >= arr.length || end < 0)
	            return sum;
	        
	        int max = Integer.MIN_VALUE;
	        
	        int lhs = find(arr,k-1,st+1,end,sum+arr[st]);
	        int rhs = find(arr,k-1,st,end-1,sum+arr[end]);
	        
	        return Math.max(max, Math.max(lhs,rhs));
	    }

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,1};
		int k = 3;
		new MaximumPointsFromCards().maxScore(arr, k);

	}

}
