package testOne;



import java.util.*;
import java.lang.*;
import java.io.*;
class Wave_Array
 {
    public static String makeWave(String[] arr, int len) {
        int max = 0;
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        if (len%2 != 0) {
            max = len-1;
            flag = true;
        } else {
            max = len;
        }
        for (int i = 1 ; i < max ; i=i+2) {
            String temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            sb.append(arr[i-1]+" ").append(arr[i]+" ");
        }
        
        if (flag)
            sb.append(arr[len-1]);
            
        return sb.toString();
    }
     
     
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int test = 1;
	    
	    while (test > 0) {
	        
	        int len = 5;
	        sc.nextLine();
	        String str = "10,5,6,2,20,3,100,80";
	        String[] arr = str.split(",");
	        
	        String waveString = makeWave(arr,len);
	        System.out.println(waveString);
	        
	        test--;
	    }
	 }
}