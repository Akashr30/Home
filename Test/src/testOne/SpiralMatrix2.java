package testOne;

import java.util.ArrayList;

public class SpiralMatrix2 {
	
	public static void main(String[] a) {
		int A = 1;
		int numbers = 1;
        int total = A*A;
        int[][] arr = new int[A][A];
        int m = A , n = A;
        int start = 0;
        int down = m;
        int right = n-1;
        int end = m;
        while (numbers <= total) {
            
            for (int i = start ; i < end ; i++) {
                arr[start][i] = numbers;
                numbers++;
            }
            // start++;
            for (int j = start+1 ; j < down-1 ; j++) {
                arr[j][right] = numbers;
                numbers++;
            }
            // right--;
            int bottom = down-1;
            for (int x = bottom ; x > start ; x--) {
                arr[bottom][x] = numbers;
                numbers++;
            }
            
            int up = bottom;
            for (int z = up ; z > start ; z--) {
                arr[z][start] = numbers;
                numbers++;
            }
            
            start++;
            right--;
            end--;
            down--;
            
        }
        
        ArrayList<ArrayList<Integer>> finl = new ArrayList<ArrayList<Integer>>();
        
        for (int a1 = 0 ; a1 < m ; a1++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int b = 0 ; b < n ; b++) {
                temp.add(arr[a1][b]);
            }
            finl.add(temp);
        }
	}

}
