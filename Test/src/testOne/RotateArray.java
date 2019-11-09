package testOne;

public class RotateArray {

	public static void main (String[] abc) {
		
		int[] arr = {1,2,3,4,5};
		int[] revArr = new int[arr.length];
//		int c = 1;
		int no = 2;
		int temp = 0;
		
		for (int i = 0 ; i < no ; i++ ) {
			temp = arr[0];
			for(int j = 0 ; j < arr.length-1;j++ ) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
//		System.out.println((3+5-4)%5);	
	}
	
	
}
