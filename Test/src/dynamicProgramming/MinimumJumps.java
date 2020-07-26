package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumJumps {
	
	static int[] dp;
	static int minJumps(int[] arr, int st , int len , int[] dp) {
        
        
        
        int min = Integer.MAX_VALUE;
        int jumps = 0;
        
        if (st <= len && dp[st] != -1)
    		return dp[st];
        
        if (st >= len) {
            return 0;
        }
         
        if (arr[st] == 0) 
            return Integer.MAX_VALUE; 
        
        for (int i = st+1 ; i <= len && i <= st+arr[st] ; i++ ) {
        	
            jumps = minJumps(arr,i,len,dp);
            
            if (jumps != Integer.MAX_VALUE && 1+jumps < min) {
                min = 1+jumps; 
                
             if (dp[st] != -1)
            	dp[st] = Math.min(dp[i], 1+jumps);
            else 
            	dp[st] =1+ jumps;
            }
        }
        
        return min;
    } 
	
	
	
	public static void main(String[] ar) {
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    
	    while (test-- > 0) {
	        
	        int len = Integer.parseInt(sc.nextLine());
	        String str = sc.nextLine();
	        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
	        dp = new int[len+1];
	        Arrays.fill(dp, -1);
            System.out.println(minJumps(arr,0,len-1,dp));
            System.out.println("done");
	    }
	 }
}

//1 3 6 3 2 3 6 8 9 5
//3 1 9 0 4 4 8 4 7 0 8 4 3 1 2
/*
1
15
3 1 9 0 4 4 8 4 7 0 8 4 3 1 2*/


/*
class MinimumJumps {

	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[n];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Test obj=new Test(n);
		    int res = obj.minJumps(arr,n,0);
		    if(res>n){
		        res = -1;
		    }
		    System.out.println(res);
		}
	}
}

class Test{
    
    int[] memo;
    
    public Test(int n){
        memo = new int[n];
        Arrays.fill(memo,-1);
    }
    
    public int minJumps(int[] arr, int n,int start){
        
        if(memo[start]>=0){
            return memo[start];
        }
        
        if(start==n-1){
            memo[start] = 0;
            return 0;
        }
        if(arr[start]==0){
            memo[start] = n*2;
            return n*2;
        }
        
        int min = Integer.MAX_VALUE;
        for(int i=start+1;i<=start+arr[start] && i<n;i++){
            min = Math.min(min,minJumps(arr,n,i));
            
        }
        memo[start] = min+1;
        return memo[start];
    }
}*/