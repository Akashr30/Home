package testOne;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {9,8,5,7,3,2,5,3,2,3,4,1,3,6,9,7,8,1,11,6,0};
		int min = 0;
		int idx  = 0;
		int j =0;
		System.out.println(arr.length);
		/*for(int i = 0 ; i < arr.length-1;i++) {
			if (arr[i] > arr[i+1]) {
				min = arr[i+1];
				arr[i+1] = arr[i];
				j = i ;
				
				while (j>=0) {
					if (j==0) {
						arr[j]= min;
						break;
					}
					if (arr[j-1] > min) {
						arr[j]= arr[j-1];
						j = j-1;
					} else {
						arr[j]= min;
						break;
					}
				}
			}
		}*/
		// alter method  optimized soln
		int i=0;
		int key = i-1;
	      int temp = 0;
	      int x = 0 ;
	      
	      if (arr[key] > arr[i]) {
	          temp = arr[i];
	          arr[i]= arr[key];
	          
	          x = key;
	          
	          while ( x > 0 && arr[x-1] > temp ) {
	              arr[x] = arr[x-1];
	              x--;
	          }
	          
	          arr[x] = temp;
	      }
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
	}

}
