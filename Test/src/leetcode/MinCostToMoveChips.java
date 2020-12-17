package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MinCostToMoveChips {
	
    public static int minCostToMoveChips(int[] position) {
        
        // int size = IntStream.of(position).max().getAsInt();
    	Arrays.sort(position);
       int[] arr = new int[100+1];
       int max = 0;
       int idx = -1;
       for (int x : position) {
           if (x > 100) {
               if (x%2 == 1) {
            	   x = 99;
                   arr[99]++;
               }
               x = 100;
               arr[100]++;
           } else 
               arr[x]++;
               
           if (arr[x] > max) {
               idx = x;
               max = arr[x];
           }
       }
       boolean flag = true;
       if (idx%2 == 1)
           flag = false;
       int sum = 0;
       for (int i = 1 ; i < arr.length ; i++) {
           
           if (flag && i%2 == 1 && arr[i] > 0) {
               sum += arr[i];
           } else if (!flag && i%2 == 0 && arr[i] > 0) {
               sum += arr[i];
           }
           
       }
       return sum;
   }
	

	public static void main(String[] args) {
		
//		int[] arr = {2,2,2,4,4,4,5,5,6,6,6,6,6};
//		int[] arr = {1,2,3,4};
//		int[] arr = {1,1000000000};
//		int[] arr = {3,3,1,2,2};
		int[] arr = {6,4,7,8,2,10,2,7,9,7};
		minCostToMoveChips(arr);

	}

}
