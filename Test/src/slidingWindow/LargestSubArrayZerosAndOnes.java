package slidingWindow;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class LargestSubArrayZerosAndOnes {
 public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while (T > 0) {
         int N = sc.nextInt();
         int a[] = new int[N];
         for (int i = 0; i < N; i++) {
             a[i] = sc.nextInt();
         }

         LargestGFGSubArrayZerosAndOnes g = new LargestGFGSubArrayZerosAndOnes();
         int n = g.maxLen(a, a.length);

         System.out.println(n);

         T--;
     }
 }
}
//} Driver Code Ends


class LargestGFGSubArrayZerosAndOnes {

 int maxLen(int[] nums, int N) {
	 
/* int[] arr = new int[2 * nums.length + 1];
 Arrays.fill(arr, -2);
 arr[nums.length] = -1;
 int maxlen = 0, count = 0;
 for (int i = 0; i < nums.length; i++) {
     count = count + (nums[i] == 0 ? -1 : 1);
     if (arr[count + nums.length] >= -1) {
         maxlen = Math.max(maxlen, i - arr[count + nums.length]);
     } else {
         arr[count + nums.length] = i;
     }

 }
 return maxlen;*/
	 
	    Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
 
 }
}
//1 0 0 1 0 1 1