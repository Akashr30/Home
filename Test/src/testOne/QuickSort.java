package testOne;

public class QuickSort {
	
	static int pivott = 0;
	static int loww = 0;
//	static int highh = 0;
	
	static void sort (int[] arr,int low,int high) {
		if (low < high) {
		partitionArray(arr,low,high);
		sort(arr,pivott,loww);
		sort(arr,loww+1,high);
		}
	}
	
	static void partitionArray(int[] arr,int lw,int h){
		 pivott = lw;
		while (lw < h) {
			if (arr[lw] > arr[pivott]) {
				if (arr[h] < arr[pivott]) {
					int temp = arr[lw];
					arr[lw] = arr[h];
					arr[h] = temp;
					lw++;
					h--;
				}else h--;
			} else {
				lw++;
			}
		}
//		if (lw == h) {
			int temp = arr[pivott];
			arr[pivott] = arr[lw];
			arr[lw] = temp;
			loww = lw-1;
//		}
		
	}
	
	
	/*static void partitionArray(int[] arr,int lw,int h){
		int low = lw;
		int high = h;
		int pivot = arr[low];
		boolean isHigh , isLow;
		
		for (;low < high;low++) {
			if (arr[low] > pivot) {
				isHigh = true;
			} else {
				continue;
			}
			
			for (;high>=low;high--) {
				if (arr[high] < pivot) {
					isLow = true;
				} else {
					continue;
				}
				
				if (isHigh && isLow) {
					int temp = arr[low];
					arr[low] = arr[high];
					arr[high] = temp;
					high--;
					break;
				}
			}
		}
		int pivotTemp = arr[lw];
		arr[lw] = arr[high];
		arr[high] = pivotTemp;
		pivott = high;
	}*/
	
	

	public static void main(String[] args) {
		
		int[] arr = {10,16,8,12,15,6,3,9,5};
		int low = 0;
		int high = arr.length-1;
//		int[] arr = {10,20,30,40,50,60,70,80,2};
		sort(arr,low,high);
		for (int a : arr) {
			System.out.print(a+" ");
		}
	}

}
