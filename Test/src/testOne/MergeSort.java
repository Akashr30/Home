package testOne;

/* Java program for Merge Sort */
class MergeSort 
{ 
	void mergeArr(int arr[], int l, int m, int r) 
	{ 
		int n1 = m - l + 1; 
		int n2 = r - m; 

		int L[] = new int [n1]; 
		int R[] = new int [n2]; 

		for (int i=0; i<n1; ++i) 
			L[i] = arr[l + i]; 
		for (int j=0; j<n2; ++j) 
			R[j] = arr[m + 1+ j]; 

		int i = 0, j = 0; 

		int k = l; 
		while (i < n1 && j < n2) 
		{ 
			if (L[i] <= R[j]) 
			{ 
				arr[k] = L[i]; 
				i++; 
			} 
			else
			{ 
				arr[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 

		while (i < n1) 
		{ 
			arr[k] = L[i]; 
			i++; 
			k++; 
		} 

		while (j < n2) 
		{ 
			arr[k] = R[j]; 
			j++; 
			k++; 
		} 
	} 
	void sort(int arr[], int l, int r) 
	{ 
		if (l < r) 
		{ 
			int mid = (l+r)/2; 

			sort(arr, l, mid); 
			sort(arr , mid+1, r); 

			mergeArr(arr, l, mid, r); 
		} 
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
//		int arr[] = {12, 11, 13, 5, 6, 7}; 
//		int arr[] = {8,7,6,5,4,3,2,1,0};
		int arr[] = {9,3,7,5,6,4,8,2};

		System.out.println("Given Array"); 
		printArray(arr); 
		String s = "leetcode";
		System.out.println(s.substring(1)); 

		MergeSort ob = new MergeSort(); 
		ob.sort(arr, 0, arr.length-1); 

		System.out.println("\nSorted array"); 
		printArray(arr); 
	} 
} 
/* This code is contributed by Rajat Mishra */
