package leetcode;

import java.util.HashMap;

public class CheckArrayFormation {
	
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        
        HashMap<Integer,int[]> map = new HashMap<>();
         int c = arr.length;
         for (int[] j : pieces) {
             map.put(j[0],j);
         }
         int i = 0;
         while (i < arr.length) {
             
             if (map.containsKey(arr[i])) {
                 int[] temp = map.get(arr[i]);
                 for (int j = 0 ; j < temp.length ; j++) {
                     if (temp[j] != arr[i]) {
                         return false;
                     } else {
                         i++;
                         continue;
                     }
                 }
             } else {
                 return false;
             }
//             i++;
         }
         
         return true;
         
     }

	public static void main(String[] args) {
		
		int[] arr = {91,4,64,78};
		int[][] temp = 
				{{78},{4,64},{91}};
		canFormArray(arr,temp);

	}

}
