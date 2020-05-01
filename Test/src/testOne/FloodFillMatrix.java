package testOne;

import java.util.Arrays;
import java.util.Scanner;

public class FloodFillMatrix {

    
    public static void floodFill(int m , int n , int oldVal ,int newValue , int[][] arr) {
    	
    	int m1 = m;
    	int n1 = n;
        
        if (m >= arr.length || n >= arr[0].length || n < 0 || m < 0)
            return;
        
        if (arr[m][n] != oldVal) {
            return;
        }
        
        if (arr[m][n] == oldVal) {
            arr[m][n] = newValue;
        }
        
        floodFill(m,n+1,oldVal,newValue,arr);
        floodFill( m ,  n-1 ,  oldVal , newValue ,  arr);
        floodFill( m+1 ,  n ,  oldVal , newValue ,  arr);
        floodFill( m-1 ,  n ,  oldVal , newValue ,  arr);
        
    }
    
     
     
     
	public static void main (String[] args)
	 {
    	 Scanner sc = new Scanner(System.in);
    	 int test = Integer.parseInt(sc.nextLine());
    	 
    	 while (test-- > 0) {
    	     
    	     String s = sc.nextLine();
    	     int[] mn = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
    	     int m = mn[0];
    	     int n = mn[1];
    	     int[][] arr = new int[m][n];
    	     String mat = sc.nextLine();
    	     int[] matrix = Arrays.stream(mat.split(" ")).mapToInt(Integer::parseInt).toArray();
    	     int count = 0;
    	     for (int i = 0 ; i < m ; i++) {
    	         for (int j = 0 ; j < n ; j++) {
    	             arr[i][j] = matrix[count];
    	             count++;
//    	             sc.nextLine();
    	         }
    	     }
    	     
    	     String s1 = sc.nextLine();
    	     int[] values = Arrays.stream(s1.split(" ")).mapToInt(Integer::parseInt).toArray();
    	     int m1 = values[0];
    	     int n1 = values[1];
    	     int newVal = values[2];
    	     int oldVal = arr[m1][n1];
    	     
    	     floodFill(m1,n1,oldVal,newVal,arr);
    	     
    	     StringBuffer sb = new StringBuffer();
    	     for (int i = 0 ; i < m ; i++) {
    	         for (int j = 0 ; j < n ; j++) {
    	             sb.append(arr[i][j]+" ");
    	         }
    	     }
    	     
    	     System.out.println(sb);
    	     
    	 }
	 }

}
