package dynamicProgramming;

public class KadaneAlgorithm {
	
	public static void main(String[] args) {
		int curr_max = 0;
		int max = Integer.MIN_VALUE;	
		int old_max = 0;
		int sum = 0;
		int[] arr =  {-2, -3, -4, -1, -2, -1, -5, -3}; 
		
		for (int i = 0 ; i < arr.length;i++) {
            
            curr_max = curr_max + arr[i];
            // if (curr_max > max) {
                max = Math.max(max,curr_max) ;
            // }
            if (curr_max < 0) {
                curr_max = 0;
            }
        }
		System.out.println(max);
		
	}

}
