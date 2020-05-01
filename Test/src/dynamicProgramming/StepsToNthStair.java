package dynamicProgramming;

import java.util.Scanner;

public class StepsToNthStair {

    
    static int count = 0;
    static long[] arr;
    public static long countWays(int start , int steps , long[] arr , int len) {
        
        /*if (start > steps) {
            return 0;
        }
        
        if (start == steps){
            // count++;
            return 1;
        }
//        len--;
        if (arr[start] != 0) {
            return arr[start]% 1000000007;
        } 
        
        arr[start] =  countWays(start+1 , steps,arr,len) + countWays(start+2 , steps,arr,len);
        arr[start] %=  1000000007 ; 
        
        return arr[start];*/
    	
    	arr[0] = 0;
        arr[1] = 1;
        
        for (int i = 2 ; i < arr.length ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
            arr[i] %= 1000000007;
        }
        
        return arr[len-1];
    }
     
     
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    while (test-- > 0) {
	        
	        int steps = Integer.parseInt(sc.nextLine());
	        int start = 0;
	       // countWays(start,steps);
	       // System.out.println(count);
	        arr = new long[steps+2];
	       //for (int i = 0 ; i < steps ; i++) {
	           // arr[i] = countWays(start,steps,arr)
	       //}1000000007
	        System.out.println(countWays(start,steps,arr,arr.length));
	    }
	 }

}
