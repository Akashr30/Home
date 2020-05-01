package dynamicProgramming;

public class MinimumJumps {
	
	static int minVal = Integer.MAX_VALUE;
	public static int minJumps (int start , int count , int n , int[] arr) {
		
		
		for (int i = start ; i < start+arr[start] && start+arr[start] <= n-1 ; i++) {
			 int jump = minJumps(i1,++count,n,arr);
			 
			 if (minVal > jump) {
				 minVal = jump;
			 }
		}
		
		return minVal;
	}
	
	
	
	public static void main(String[] ar) {
		
		int n = 8;
		int[] arr = {1,4,3,2,6,7,8,9};
//		System.out.println(minJumps(0,0,n,arr));
		minJumps(0,0,n,arr);
		System.out.println(minVal);
		
	}
}
