package testOne;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfSubMatrix {
	

    
    public static int subMatrixSum(int n,int m , int[][] arr , int a ,int b,int c,int d) {
        
        int sum = 0;
        
        for (int i = 0 ; i < arr[0].length ; i++) {
            
            for (int j = 0 ; j < arr[1].length ; j++) {
                
                if ((i <= c && i >= a) && (j >=b && j <= d)){
                    sum += arr[i][j];
                }
                
            }
        }
        
        return sum;
        
    } 
     
     
	public static void main (String[] args)
	 {
    	 Scanner sc = new Scanner(System.in);
    	 int test = Integer.parseInt(sc.nextLine());
    	 
    	 while (test > 0) {
    	     
    	     String str = sc.nextLine();
    	     int[] mat = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
    	     int n = mat[0];
    	     int m = mat[1];
    	     int[][] matrix = new int[n][m];
    	     
    	     for (int i = 0 ; i < n ; i ++) {
    	         for (int j = 0 ; j < m ; j++) {
    	             matrix[i][j] = sc.nextInt();
//    	             sc.nextLine();
    	         }
    	     }
    	     sc.nextLine();
    	     String str1 = sc.nextLine();
    	     int[] subMat = Arrays.stream(str1.split(" ")).mapToInt(Integer::parseInt).toArray();
    	     int a = subMat[0];
    	     int b = subMat[1];
    	     int c = subMat[2];
    	     int d = subMat[3];
    	     System.out.println(subMatrixSum(n,m,matrix,a,b,c,d));
    	     
    	     test--;
    	 }
	 }


}
