package testOne;

import java.util.*;


//Java program for implementation of QuickSort 
class QuickSort 
{ 
	/* This function takes last element as pivot, 
	places the pivot element at its correct 
	position in sorted array, and places all 
	smaller (smaller than pivot) to left of 
	pivot and all greater elements to right 
	of pivot */
	int partition(int arr[], int low, int high) 
	{ 
		/*int pivot = arr[high]; 
		int i = (low-1); // index of smaller element 
		for (int j=low; j<high; j++) 
		{ 
			
			if (arr[j] <= pivot) 
			{ 
				i++; 

				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; */
		

	     /*  int pivot = high;
	       int i = low,j=high-1;
	       
	       
	       while (i < j) {
	         
	         if (arr[i] >= arr[pivot]) {
	             if (arr[j] < arr[pivot]) {
	                 int tempLeft = arr[i];
	                 arr[i] = arr[j];
	                 arr[j] = tempLeft; 
	                 i++;
	                 j--;
	             } else {
	                 j--;
	             }
	         } else {
//	             i++;
	             j--;
	         } 
	         
	       }
	           int temp = arr[i];
	           arr[i] = arr[pivot];
	           arr[pivot] = temp;
	       return i;*/
		

	       int pivot = high;
	       int i = low,j=high-1;
	       int count = 0;
	       
	       while (i < j) {
	         
	         if (arr[i] >= arr[pivot]) {
	             if (arr[j] < arr[pivot]) {
	                 int tempLeft = arr[i];
	                 arr[i] = arr[j];
	                 arr[j] = tempLeft; 
//	                 i++;
//	                 j--;
	             } else {
	                 j--;
	             }
	         } else {
	           j--;
	        	
	         } 
	         Set<Integer> set = new LinkedHashSet<Integer> ();
	         set.add(1);
	         Iterator iterator = set.iterator();
	       }
//	       if (arr[j] > arr[pivot]) {
	           int temp = arr[j];
	           arr[j] = arr[pivot];
	           arr[pivot] = temp;
//	       }
	       return j;
	    
	    
	} 


	/* The main function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	low --> Starting index, 
	high --> Ending index */
	void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			/* pi is partitioning index, arr[pi] is 
			now at right place */
			int pi = partition(arr, low, high); 

			// Recursively sort elements before 
			// partition and after partition 
			sort(arr, low, pi-1); 
			sort(arr, pi+1, high); 
		} 
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
//		int arr[] = {119, 160, 380, 947, 604, 111,251}; 
		int arr[] ={411, 575, 686, 364 ,887, 183};
//		int arr[] ={10,5,8,7,2,1,3,4,6,9};
//		int arr[] ={4, 1, 3, 9, 7};
//		int arr[] ={10, 9 ,8 ,7, 6 ,5, 4, 3 ,2 ,1};
		int n = arr.length; 
		

		QuickSort ob = new QuickSort(); 
		ob.sort(arr, 0, n-1); 

		System.out.println("sorted array"); 
		printArray(arr); 
	} 
} 
/*This code is contributed by Rajat Mishra */

