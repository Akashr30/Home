package testOne;

public class BinarySearch {
	
	/*	public int biSearch(int[] arr,int n,int len) {
		if (!(len > arr.length) && !(len<0)) {
		int mid = len/2;
		
		if (n == arr[mid] ) {
			return mid;
		}
		if (n > arr[mid]) {
			return biSearch(arr,n,len+1);
		}
		
		if (n < arr[mid]) {
			return biSearch(arr,n,len-1);
		}
		}
		return -1;
	}
	
	public static void main(String[] args) {
//		int arr[] = {0,1,2,3,4,6,1,0,3,7,9,6,1};
		int arr[] = {10,20,30,35,40,50,60,71,72,73,80,90};
		int n = 20;
		BinarySearch bs = new BinarySearch();
		int result = bs.biSearch(arr,n,arr.length-1);
		
		System.out.println(result);
		
	}
*/
	
		
	 
	   
	    int binarySearch(int arr[], int begin, int end, int x) 
	    { 
	        if (end >= begin) { 
//	        	int mid = (begin+end)/2;
	            int mid = begin + (end - begin) / 2; 
	  
	            // If the element is present at the 
	            // middle itself 
	            if (arr[mid] == x) 
	                return mid; 
	  
	            // If element is smaller than mid, then 
	            // it can only be present in left subarray 
	            if (arr[mid] > x) 
	                return binarySearch(arr, begin, mid - 1, x); 
	  
	            // Else the element can only be present 
	            // in right subarray 
	            return binarySearch(arr, mid + 1, end, x); 
	        } 
	  
	        // We reach here when element is not present 
	        // in array 
	        return -1; 
	    } 
	  
	    // Driver method to test above 
	    public static void main(String args[]) 
	    { 
	        BinarySearch ob = new BinarySearch(); 
//	        int arr[] = { 2, 3, 4, 10, 40 }; 
//	        int arr[] = {10,20,30,35,40,50,60};
	        int arr[] = {10,20,30,35,40,50,60,71,72,73,80,90};
	        int n = arr.length; 
	        int x = 100; 
	        int result = ob.binarySearch(arr, 0, n-1, x); 
	        if (result == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at index " + result); 
	    }
	    

}
