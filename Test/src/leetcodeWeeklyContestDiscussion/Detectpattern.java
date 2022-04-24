package leetcodeWeeklyContestDiscussion;

public class Detectpattern {
	
	public static boolean containsPattern(int[] arr, int m, int k) {
        
		int f = 0;
		int c = 1;
		boolean flag = true;
		int x = 0;
		for ( x = 0 ; x < arr.length && x+m < arr.length;x++) {
			if (arr[x] == arr[x+m])
				break;
		}
		int i = x;
		int end = x+m;
		
		while (true) {
			
			for (;i < end ; i++) {
				if (arr[i] == arr[f]) {
					f++;
				} else {
					flag = false;
					f++;
					i++;
					c = 0;
					break;
				}
				
			}
			
			if (flag)
				c++;
			flag = true;
			end = i+m;
			
			if (c == k)
				return true;
			
			if ( i >= arr.length)
				break;   
		}
       
        return false;
    }
        

	public static void main(String[] args) {
//		int[] arr = {1,2,1,2,1,1,1,3};
		int arr[] = {1,2,2,2,1,1,2,2,2};
		int m =1;
		int k = 3;
//		int m = 2,k=2;
		containsPattern(arr,m,k);
	}

}
