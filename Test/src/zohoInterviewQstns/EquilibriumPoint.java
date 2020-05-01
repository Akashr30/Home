package zohoInterviewQstns;

import java.util.Arrays;

public class EquilibriumPoint {
	

    
    public static int checkEquil(int[] arr, int len) {
        
        int[] leftSum = new int[len];
        leftSum[0] = arr[0];
        
        for (int i = 1 ; i < arr.length ; i++) {
            leftSum[i] = leftSum[i-1]+arr[i];
        }
        
        int sum = 0;
        int temp = 0;
        int ans = -1;
        for (int i = 0 ; i < arr.length ; i++) {
            
            temp = i > 0 ? leftSum[i-1]:leftSum[i];
            
            for (int j = i+1 ; j < arr.length ; j++) {
                
                sum += arr[j];
                
                if (sum > temp) {
                    sum = 0;
                    break;
                }
                
            }
            
            if (temp == sum){
                ans = i+1;
                break;
            }
            sum = 0;
        }
        
        return ans;
    } 
     
     
     
	public static void main (String[] args)
	 {
//        Scanner sc = new Scanner(System.in);
//        int test = Integer.parseInt(sc.nextLine());
        
//        while (test > 0) {
            
//            int len = Integer.parseInt(sc.nextLine());
//            String str = sc.nextLine();
//			String str = "9 1 20 32 29 5 5";
//			String str = "1 3 5 2 2";
//		String str = "6 10 10 4 16 4 27 37 19 39 13 34";
		String str = "7 34 19 5 30 15 43 21 5 21 6 18 3 33";
            int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            int len = arr.length;
            System.out.println(checkEquil(arr,len));
//            test--;
//        }
	 }

	

}
