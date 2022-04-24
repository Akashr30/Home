package testOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Java program to find maximum amount of water that can 
//be trapped within given set of bars. 

class TrappingRainWater { 
//	static int arr[] = new int[] { 0, 0,1, 0, 3, 0, 5, 0, 2, 2, 2, 3, 4,2,1,0,0 }; 

	/*// Method for maximum amount of water 
	static int findWater(int n) 
	{ 
		// left[i] contains height of tallest bar to the 
		// left of i'th bar including itself 
		int left[] = new int[n]; 

		// Right [i] contains height of tallest bar to 
		// the right of ith bar including itself 
		int right[] = new int[n]; 

		// Initialize result 
		int water = 0; 

		// Fill left array 
		left[0] = arr[0]; 
		for (int i = 1; i < n; i++) 
			left[i] = Math.max(left[i - 1], arr[i]); 

		// Fill right array 
		right[n - 1] = arr[n - 1]; 
		for (int i = n - 2; i >= 0; i--) 
			right[i] = Math.max(right[i + 1], arr[i]); 

		// Calculate the accumulated water element by element 
		// consider the amount of water on i'th bar, the 
		// amount of water accumulated on this particular 
		// bar will be equal to min(left[i], right[i]) - arr[i] . 
		for (int i = 0; i < n; i++) 
			water += Math.min(left[i], right[i]) - arr[i]; 

		return water; 
	} 

	// Driver method to test the above function 
	public static void main(String[] args) 
	{ 

		System.out.println("Maximum water that can be accumulated is " + findWater(arr.length)); 
	} */
	
	public static void main(String[] args) 
	{ 
//		int height[] =  { 0, 0,1, 0, 3, 0, 5, 0, 2, 2, 2, 3, 4,2,1,0,0 }; 
		int height[] = {1,0,2,1,0,1,3,2,1,2,1};
	 if (height.length==0) 
//		 	return 0; 
		 return;
     int left = 0, right = height.length-1; 
     int leftMax=0, rightMax=0; 
     int ans = 0; 
     while (left < right) {
         if (height[left] > leftMax) 
        	 leftMax = height[left]; 
         if (height[right] > rightMax) 
        	 rightMax = height[right];
         if (leftMax < rightMax) {
             ans += Math.max(0, leftMax-height[left]); 
             left++; 
         } else {
             ans += Math.max(0, rightMax-height[right]); 
             right--; 
         }
     }
}
} 
