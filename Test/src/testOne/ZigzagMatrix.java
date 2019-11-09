package testOne;

import java.util.Scanner;

public class ZigzagMatrix {

	/*public static void main(String[] args) {
	
		int[][] arr = { {1,2,3,1},
				{4,5,6,2},
				{7,8,9,3},
				{99,98,97,96}
				};
		int n = 4 ;
		int N = (2*n)-1 ;
//		int[] check = new int[1];
		int c = 0;
		int i = 0;
		int z = 1;
		boolean isCheck = true;
		while(N > 0) {
			int j = c;
			while (i<= c && j>=0) {
				System.out.print(arr[i][j]);
				i++;
				j--;
			}
			N--;
			if (c == n-1 && isCheck) {
//				check[0]++;
				i=1;
				isCheck = false;
				continue;
			}
//			if (check[0] != 0) {
			if (!isCheck) {
				z = z+1;
				c = n-1;
				i = z;
			} else {
				c++;
				i=0;
			}
		}
		
	}*/
	int fg = 0;
	
	public static void main (String[] args)
	 {
        Scanner in = new Scanner(System.in); 
        int num = in.nextInt();
        
        for (int a = 0 ; a < num ; a++) {
            int mtx = in.nextInt();
            int[][] arr = new int[mtx][mtx];
            for (int b = 0 ; b < mtx ; b++) {
                for (int d = 0 ; d < mtx ; d++) {
                    arr[b][d] = in.nextInt();
                }
            }
            int c = 0;
	         int i = 0;
		     int z = 1;
		     int N = (mtx*2)-1;
		     boolean isCheck = true;
            while (N > 0) {
                
			    int j = c;
   			while (i<= c && j>=0) {
   				System.out.print(arr[i][j]+" ");
   				i++;
   				j--;
   			}
           N--;
   			if (c == mtx-1 && isCheck) {
   				i=1;
   				isCheck = false;
   				continue;
   			}
   			if (!isCheck) {
   				z = z+1;
   				c = mtx-1;
   				i = z;
   			} else {
   				c++;
   				i=0;
   			}
           }
           System.out.println();
        } 
 
	 }

}
