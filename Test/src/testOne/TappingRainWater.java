package testOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TappingRainWater {

/*	 static int arr[] = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; 
     
	    // Method for maximum amount of water 
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
	           left[i] = Math.max(left[i-1], arr[i]); 
	       
	        // Fill right array 
	        right[n-1] = arr[n-1]; 
	        for (int i = n-2; i >= 0; i--) 
	           right[i] = Math.max(right[i+1], arr[i]); 
	       
	        // Calculate the accumulated water element by element 
	        // consider the amount of water on i'th bar, the 
	        // amount of water accumulated on this particular 
	        // bar will be equal to min(left[i], right[i]) - arr[i] . 
	        for (int i = 0; i < n; i++) 
	           water += Math.min(left[i],right[i]) - arr[i]; 
	       
	        return water; 
	    } 
	      
	    // Driver method to test the above function 
	    public static void main(String[] args)  
	    { 
	          
	        System.out.println("Maximum water that can be accumulated is " +  
	                                        findWater(arr.length)); 
	    } */
 /*   static int findWater(int arr[], int n) 
    { 
        // initialize output 
        int result = 0; 
           
        // maximum element on left and right 
        int left_max = 0, right_max = 0; 
           
        // indices to traverse the array 
        int lo = 0, hi = n-1; 
           
        while(lo <= hi)  
        { 
            if(arr[lo] < arr[hi]) 
            { 
                if(arr[lo] > left_max) 
      
                // update max in left 
                left_max = arr[lo]; 
                else
      
                // water on curr element =  
                // max - curr 
                result += left_max - arr[lo]; 
                lo++; 
            } 
            else
            { 
                if(arr[hi] > right_max) 
                  
                // update right maximum 
                right_max = arr[hi]; 
                  
                else
                result += right_max - arr[hi]; 
                hi--; 
            } 
        } 
           
        return result; 
    } 
      
     Driver program to test above function 
    public static void main(String[] args)  
    { 
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 
                     3, 2, 1, 2, 1}; 
        int n = arr.length; 
          
        System.out.println("Maximum water that "
                       + "can be accumulated is " 
                       + findWater(arr, n)); 
          
    }*/
	
	public static void main (String[] args) throws IOException
	 {
	    
	   // Scanner input = new Scanner(System.in);
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int num = Integer.parseInt(br.readLine());
	    String str = "";
	    for (int i = 0 ; i < num ; i++) {
	        int size = Integer.parseInt(br.readLine());
	        int[] arr = new int[size-1];
	        String[] in  = new String[size-1];
	        for (int j = 0 ; j < size-1; j++){
	             in = br.readLine().split(" ");
	            
	            /*int temp = Integer.parseInt(br.readLine());
	            System.out.print(" ");
	            arr[j] = temp;*/
	            /*String str = str+arr[j]+" ";
	            String[] in = br.readLine().split(" ");
               int[] arr = new int[ecount];
               for(int i = 0; i < ecount; i++) {
               arr[i] = Integer.parseInt(in[i]);
               }*/
	        }
	        for(int y = 0; y < size-1; y++) {
               arr[y] = Integer.parseInt(in[y]);
               }
	        int givenValue = Integer.parseInt(br.readLine());
	        int st = 0;
	        int end = size-1;
	        boolean isFounded = true;
	        while (st < end) {
	        	int temp = arr[st]+arr[end];
	            if (arr[st]+arr[end] == givenValue){
	                System.out.println(arr[st]+" "+arr[end]+" "+givenValue);
	                st++;
	                end--;
	                isFounded = false;
	            } else if (temp > givenValue) {
	                end--;
	            } else if (temp < givenValue) {
	            	st++;
	            }
	        }  
	            if (isFounded){
	                System.out.println("-1");
	            }
	        }
	    }
	}
