package leetcode;

public class NortonCompany {
	
	public int solution(int[] A) {
	        
	        int sum = 0;
	        int i = 0 ,j = A.length-1;
	        int count = 0;
	        while (i <= j) {
	            
	            if (sum + A[i] < 0) {
	                
	                while (A[j] < 0)
	                    j--;
	                    
	                int temp = A[i];
	                A[i] = A[j];
	                A[j] = temp ;
	                
	                count++;
	            }
	            sum += A[i];
	            i++;
	        }
	        return count;
	    }
	

	public static void main(String[] args) {
		
		NortonCompany a = new NortonCompany();
//		int arr[] = {-1,-1,-1,1,1,1,1,1};
		int arr[] = {5,-2,-3,1};
		a.solution(arr);
	}

}
