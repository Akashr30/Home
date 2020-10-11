package leetcode;

public class MinimumJumps {
	
	static int findJumps(int st , int[] arr) {
        
        if (st >= arr.length-1)
            return 0;
            
        if (arr[st] == 0)
            return Integer.MAX_VALUE;
            
        int min = Integer.MAX_VALUE;
        
        for (int i = st ; i < arr.length && i < st+arr[st] ; i++) {
            
            int jump = findJumps(i+1,arr);
            
            if (jump != Integer.MAX_VALUE && jump+1 < min)
                min = jump+1;
                
        }
        return min;
    } 
	
	public static void main(String[] at) {
		
		int n = 6;
        int[] arr = {1,4,3,2,6,7};
        System.out.println(findJumps(0,arr));
	}

}
