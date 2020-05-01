package testOne;

//{ Driver Code Starts
import java.util.*;

class LargestSubArrayWithSumZero {

 // Returns length of the maximum length subarray with 0 sum

 // Drive method
 public static void main(String arg[]) {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while (T > 0) {
         int n = sc.nextInt();
         int arr[] = new int[n];
         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

         GfGLSAWS g = new GfGLSAWS();
         System.out.println(g.maxLen(arr, n));
         T--;
     }
 }
}// } Driver Code Ends
class GfGLSAWS {
 int maxLen(int arr[], int n) {
     
     int[] arr1 = new int[n];
     int max = 0;
     
     arr1[0] = arr[0];
     for (int i = 1 ; i <  n ; i++) {
         arr1[i] = arr1[i-1]+arr[i];
         if (arr1[i] == 0) {
             if (i > max) {
                 max = i+1;
             }
         }
     }
      
     for (int i = 0 ; i < arr1.length ; i++) {
         int temp = arr1[i];
         for (int j = i+1 ; j < arr1.length ; j++) {
             if (arr1[j] - temp == 0) {
                 if (j-i > max) {
                     max = j-i;
                 }
             }
         }
     }
     
     return max;
             
 }
}