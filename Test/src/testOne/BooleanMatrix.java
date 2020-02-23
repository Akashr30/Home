package testOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BooleanMatrix {
	
	/*
	
	public static void main (String[] args) throws java.lang.Exception
	{
        int a[ ][ ] = { {1, 0, 0, 1}, 
                  {0, 0, 1, 0}, 
                  {0, 0, 0, 0},}; 	
                  
        int m = 3 ; 
        int n = 4;
        int[][] b = new int[m][n];
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++ ){
                boolean flag = false;
                if (a[i][j]==1) {
                    int v = 0 , h = 0;
                    while (v < m) {
                        b[v][j] = 1;
                        v++;
                        flag = true;
                    }
                    
                    while (h < n) {
                        b[i][h]=1;
                        h++;
                    }
                }
                
                if (flag){
                    break;
                }
            }
        }
        
        for (int x = 0 ; x < m ;x++) {
            for (int y = 0; y < n; y++ ) {
                System.out.print(b[x][y]+" ");
            }
            System.out.println();
        }

	}
*/

    public static void booleanArray (int m,int n,int[][] a) {
        
         int[][] b = new int[m][n];
         for (int i = 0 ; i < m ; i++) {
             boolean flag = true;
           for (int j = 0 ; j < n ; j++ ){
               
               if (a[i][j]==1) {
                   int v = 0 , h = 0;
                   while (v < m) {
                       b[v][j] = 1;
                       v++;
                       flag = false;
                   }
                   
                   while (h < n) {
                       b[i][h]=1;
                       h++;
                   }
               }
           }
       }
       StringBuilder sb = new StringBuilder();
       for (int x = 0 ; x < m ;x++) {
           for (int y = 0; y < n; y++ ) {
               System.out.print(b[x][y]+" ");
               // sb.append(b[x][y]+" ");
           }
           System.out.println();
       }
       // System.out.print(sb);
    }
    
	public static void main (String[] args) throws IOException 
	 {
       // Scanner input = new Scanner(System.in);
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int num = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < num ; i++ ){
            int m = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] a = new int[m][n];
            for (int j = 0 ; j < m;j++) {
                for (int k = 0; k < n ;k++){
                    a[j][k] = Integer.parseInt(br.readLine());
                }
            }
             booleanArray(m,n,a);
        }
	 }

}


/*
 * 
 * import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static void booleanArray (int m,int n,int[][] a) {
         
          int[][] b = new int[m][n];
          for (int i = 0 ; i < m ; i++) {
              boolean flag = true;
            for (int j = 0 ; j < n ; j++ ){
                
                if (a[i][j]==1 && flag) {
                    int v = 0 , h = 0;
                    while (v < m) {
                        b[v][j] = 1;
                        v++;
                        flag = false;
                    }
                    
                    while (h < n) {
                        b[i][h]=1;
                        h++;
                    }
                }
            }
        }
        
        for (int x = 0 ; x < m ;x++) {
            for (int y = 0; y < n; y++ ) {
                System.out.print(b[x][y]+" ");
            }
            System.out.println();
        }
     }
     
	public static void main (String[] args)
	 {
        Scanner input = new Scanner(System.in);
         int num = input.nextInt();
         for (int i = 0 ; i < num ; i++ ){
             int m = input.nextInt();
             int n = input.nextInt();
             int[][] a = new int[m][n];
             for (int j = 0 ; j < m;j++) {
                 for (int k = 0; k < n ;k++){
                     a[j][k] = input.nextInt();
                 }
             }
              booleanArray(m,n,a);
         }
	 }
}*/
