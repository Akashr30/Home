package leetcode;

public class NonDecreasingArray {
	
public static boolean checkPossibility(int[] arr) {
        
        boolean flag = true;
        int c = 1;
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < arr.length -1 ; i++) {
            
            if (arr[i] > arr[i+1] && c == 0) {
                return false;
            } else if (arr[i] > arr[i+1] && c != 0) {
                arr[i] = arr[i+1]-1;
//                min = Math.min(min,arr[i]);
                c--;
                if (arr[i] < min && i !=0)
                    return false;
                
            }
            min = Math.min(min,arr[i]);
        }
        
        return true;
    }

	public static void main(String[] ar) {
		
//		int[] arr = {4,2,3};
//		int[] arr = {3,4,2,3};
		int[] arr = {2,3,3,2,4};
		System.out.print(checkPossibility(arr));
	}
}
