package testOne;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArray {
    
    public static int[] maxSubArray(int[] arr , int len) {
        /*int i = 0;
        int j = len-1;*/
        
        int start = 0;
        int end = 0;
        boolean isStart = true;
        int sum = 0;
        int max = 0;
        int prevStart = 0;
        int prevEnd = 0;

        for (int i = 0 ; i < len ; i++) {
            
            if (isStart){
                start = i;
                isStart = false;
            }
            
            if (arr[i] > 0) {
                
                sum += arr[i];
                
            } else {
                isStart = true;
                if (sum > max) {
                    max = sum;
                    sum = 0;
                    prevStart = start;
                    prevEnd = i;
                }
                
                if (sum == max) {
                    int l1 = Math.abs(prevStart - prevEnd);
                    int l2 = Math.abs(start - i);
                    sum = 0;
                    if (l2 > l1) {
                        prevStart = start;
                        prevEnd = i;
                    } else if (l2 == l1) {
                        
                        if (l1 > l2) {
                            prevStart = start;
                            prevEnd = i;
                        }
                        
                    }
                }
            }
        }
        
        int[] arr1 = new int[Math.abs(prevStart - prevEnd)];
        
       /* for (int x = prevStart ; x < prevEnd ; x++) {
            arr1[x] = arr[x];
        }*/
        
        int ab = 0;
        for (int x : arr){
            arr1[ab] = x;
            ab++;
        }
        
        return arr1;
                    
    } 
     
     
	public static void main (String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
//        sc.nextLine();
        
        while (test > 0) {
            
            int len = Integer.parseInt(sc.nextLine());
            String str = sc.nextLine();
            int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
//    		int arr[] = {1, 2, 5, -7, 2, 3};
//    		int len = arr.length;
            int[] temp = maxSubArray(arr,len);
            for (int z = 0 ; z < temp.length ; z++) {
                System.out.print(temp[z]+" ");
            }
             System.out.println();
             test--;
        }
        
	 }
}
