package testOne;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
//		int[] arr = {0,5,2,3,4,5,1,1,1,1,1,1,1,1,1,1,12,3,6,9,7,8};
		int[] arr = {6,1,8,7,0,5,2,3,4,1,3,6};
		int temp = 0;
		for (int i = 0 ; i <arr.length-1;i++) {
			for (int j = 0;j<arr.length-i-1;j++) {
				if (arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
				}
			}
			
		}
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}

}



//Aliter method using recursion


/*
public class BubbleSort {
	
	
	
	static void recurBubble(int[] arr,int len) {
		int i = 0 ;
		if(len == 1)
		return;
//		int m=-1;
		for (i = 0 ; i < arr.length-1;i++) {
				if (arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
		}
//		m++;   can be done this way so that the iterations will be reduced gradually.
//		recurBubble( arr,len-1-m); 
		recurBubble( arr,len-1);
			
		
	}

	public static void main(String[] args) {
		
//		int[] arr = {0,5,2,3,4,1,3,6,9,7,8};
		int[] arr = {0,5,2,3,4,5,1,1,1,1,1,1,1,1,1,1,12,3,6,9,7,8,2,3,6,4,9,8,7,2};
		recurBubble(arr,arr.length);
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}
}

*/
/*
public class BubbleSort  
{ 
    // A function to implement bubble sort 
    static void bubbleSort(int arr[], int n) 
    { 
        // Base case 
        if (n == 1) 
            return; 
       
        // One pass of bubble sort. After 
        // this pass, the largest element 
        // is moved (or bubbled) to end. 
        for (int i=0; i<n-1; i++) 
            if (arr[i] > arr[i+1]) 
            { 
                // swap arr[i], arr[i+1] 
                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
            } 
       
        // Largest element is fixed, 
        // recur for remaining array 
        bubbleSort(arr, n-1); 
    } 
      
    // Driver Method 
    public static void main(String[] args) 
    { 
//        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
    	int[] arr = {0,5,2,3,4,1,3,6,9,7,8};
       
        bubbleSort(arr, arr.length); 
          
        System.out.println("Sorted array : "); 
        System.out.println(Arrays.toString(arr)); 
    } 
} 
*/