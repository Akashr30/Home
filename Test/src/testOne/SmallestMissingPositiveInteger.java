package testOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

/*
//Java program to find the smallest 
//positive missing number 
import java.util.*; 

class SmallestMissingPositiveInteger { 

	 Utility function that puts all non-positive 
	(0 and negative) numbers on left side of 
	arr[] and return count of such numbers 
	static int segregate(int arr[], int size) 
	{ 
		int j = 0, i; 
		for (i = 0; i < size; i++) { 
			if (arr[i] <= 0) { 
				int temp; 
				temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
				// increment count of non-positive 
				// integers 
				j++; 
			} 
		} 

		return j; 
	} 

	 Find the smallest positive missing 
	number in an array that contains 
	all positive integers 
	static int findMissingPositive(int arr[], int size) 
	{ 
		int i; 

		// Mark arr[i] as visited by making 
		// arr[arr[i] - 1] negative. Note that 
		// 1 is subtracted because index start 
		// from 0 and positive numbers start from 1 
		for (i = 0; i < size; i++) { 
			int x = Math.abs(arr[i]); 
			if (x - 1 < size && arr[x - 1] > 0) 
				arr[x - 1] = -arr[x - 1]; 
		} 

		// Return the first index value at which 
		// is positive 
		for (i = 0; i < size; i++) 
			if (arr[i] > 0) 
				return i + 1; // 1 is added becuase indexes 
		// start from 0 

		return size + 1; 
	} 

	 Find the smallest positive missing 
	number in an array that contains 
	both positive and negative integers 
	static int findMissing(int arr[], int size) 
	{ 
		// First separate positive and 
		// negative numbers 
		int shift = segregate(arr, size); 
		int arr2[] = new int[size - shift]; 
		int j = 0; 
		for (int i = shift; i < size; i++) { 
			arr2[j] = arr[i]; 
			j++; 
		} 
		// Shift the array and call 
		// findMissingPositive for 
		// positive part 
		return findMissingPositive(arr2, j); 
	} 
	// main function 
	public static void main(String[] args) 
	{ 
		int arr[] = { 2, 3, -7, 6, 8, 1, -10, 15,-16,25,-24,-30,55,-61};
		int arr_size = arr.length; 
		int missing = findMissing(arr, arr_size); 
		System.out.println("The smallest positive missing number is " + missing); 
	} 
} */

class SmallestMissingPositiveInteger { 
	
	public static void main(String[] a) {
        ArrayList<Integer> A  = new ArrayList<Integer>();
        A.add(2);
        int min = -1;
        boolean flag = false;
       Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
       for (int i = 0 ; i < A.size(); i++) {
           if(A.get(i) >= 0) {
               flag = true;
               ht.put(A.get(i),A.get(i));
           }
       }
       
       boolean check = false;
        if (!flag) {
            min = 1;
        } else { 
        int i = 0;
        for ( i = 0 ; i < ht.size(); i++) {
            if (ht.get(i+1) == null) {
                check = true;
                min = i+1;
                break;
            }
        }
        }
        if (min == -1)
            min = ht.get(ht.size())+1;
            
        System.out.println(min); 
    }
	
}
