package leetcode;

public class RotatedArrayBinarySearch {
	
	static int search(int[] arr) {
		int lo=0,hi=arr.length-1;
	 	while(lo<hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[hi]) 
            	lo=mid+1;
            else 
            	hi=mid;
        }
	 	return lo;
	}

	public static void main(String[] args) {
		
		int[] arr = {11,12,1,2,3,4,5,6,7,8,9,10};
		System.out.println(search(arr));

	}

}
