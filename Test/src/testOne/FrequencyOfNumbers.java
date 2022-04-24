package testOne;
import java.util.*;
import java.lang.*;
import java.io.*;

public class FrequencyOfNumbers {
	
	/*public static void main (String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0 ; i < test ; i++) {
            
            int arrSize = sc.nextInt();
            int[] tempArr = {30,35,41,18,17,13,1,41,21,36,6,14,28,8,30,14,15,40,19,10,31,39,28,41,35,34,27,21,30,30,13,30,31,22,5,6,8,26,25,18,40,33};
            for (int j = 0 ; j < arrSize; j++) {
                tempArr[j] = sc.nextInt();
//                sc.nextLine();
            }
            Arrays.sort(tempArr);
            int[] newArrSize = new int[tempArr.length+1];
            
            for (int k = 0 ; k < tempArr.length ; k++) {
                ++newArrSize[tempArr[k]];  
//                System.out.print(newArrSize[k]+" ");
            }
            
            // System.out.println(Arrays.deepToString(newArrSize));
            for (int x = 1 ; x < newArrSize.length;x++) {
                System.out.print(newArrSize[x]+" ");
            }
            System.out.println();
        }
	 }*/
	
	 void printfrequency(int arr[], int n)  
	    { 
	        // Subtract 1 from every element so that the elements 
	        // become in range from 0 to n-1 
	        for (int j = 0; j < n; j++) 
	            arr[j] = arr[j] - 1; 
	  
	        // Use every element arr[i] as index and add 'n' to 
	        // element present at arr[i]%n to keep track of count of 
	        // occurrences of arr[i] 
	        for (int i = 0; i < n; i++) 
	            arr[arr[i] % n] = arr[arr[i] % n] + n; 
	  
	        // To print counts, simply print the number of times n 
	        // was added at index corresponding to every element 
	        for (int i = 0; i < n; i++) 
	            System.out.println(i + 1 + "->" + arr[i] / n); 
	    } 
	  
	    // Driver program to test above functions 
	    public static void main(String[] args)  
	    { 
	    	FrequencyOfNumbers count = new FrequencyOfNumbers(); 
//	        int arr[] = {2, 3, 3, 2, 5};
	        int arr[] = {1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1}; 		
	        int n = arr.length; 
	        count.printfrequency(arr, n); 
	    } 
}