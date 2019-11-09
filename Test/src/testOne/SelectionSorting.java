package testOne;
//selection sort
public class SelectionSorting {

	public static void main(String[] args) {
//		int[] arr = {5,2,3,4,5,1,1,1,1,1,1,1,1,1,1,12,3,6,9,7,8};
 		int[] arr = {0,5,2,3,4,5,1,1,1,1,1,1,1,1,1,1,12,3,6,9,7,8};
//		int[] arr = {1,2,3,4,5,6};
		int min=0;
//		int c = 0;
//		int idxOf = 0;
		int temp = 0;
		
		for (int i = 0; i < arr.length-1;i++) {
			min = i;
			for (int j = i+1;j<arr.length;j++) {
				if(arr[min] > arr[j]) {
//					min = arr[j];
//					idxOf = j;
					min = j;
				}
			}
//			if (idxOf > 0) {
			/*temp = arr[i];
			arr[min]= arr[i];
			arr[i] = temp;*/
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
//			idxOf = Integer.MIN_VALUE;
//			}
			
			
		}

		for(int a : arr) {
			System.out.print(a+" ");
		}
		
	}

	
	//aliter method
	

}
