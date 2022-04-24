package leetcode;

public class TeemoAttacking {
	
	public static int findPoisonedDuration(int[] arr, int duration) {
        
        int sum = 0;
        int prev = 0;
        
        for (int i = 0 ; i < arr.length ; i++) {
            int temp = arr[i]-1;
            if (i == 0) {
                sum += duration;
                prev = temp+duration;
                continue;
            }
            
            if (prev >= temp) {
                int add = temp+duration;
                int diff = add-prev;
                sum += diff;
                prev = add;
            } else {
                sum += duration;
                prev = temp+duration;
            }
        }
        
        return sum;
        
    }

	public static void main(String[] args) {
		
		int[] arr = {3,4,5};
		int n = 4;
		findPoisonedDuration(arr,n);

	}

}
