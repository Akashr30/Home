package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
	
public static int orangesRotting(int[][] grid) {
        
        Queue<int[]> q = new LinkedList<>();
        int fruits = 0;
        int rots = 0;
        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0; j < grid[0].length ; j++) {
                if (grid[i][j] == 2) {
                    int[] arr = new int[2];
                    arr[0] = i;
                    arr[1] = j;
                    q.add(arr);
                    rots++;
                } else if (grid[i][j] == 1) {
                    fruits++;
                }
            }
        }
        int total = rots+fruits;
        if ( total== 0)
            return 0;
        
        int time = 0;
        while (!q.isEmpty()) {
            
            int n = q.size();
            
            if (rots == total)
                return time;
            
            for (int j = 0 ; j < n ; j++) {
                
                int[] temp = q.poll();
                int i = temp[0];
                int k = temp[1];
                if ( k+1 < grid[0].length  && grid[i][k+1] == 1) {
                    int[] arr = new int[2];
                    arr[0] = i;
                    arr[1] = k+1;
                    q.offer(arr);
                    grid[i][k+1] = 2;
                    rots++;
                }
                
                 if (k-1 >= 0 && k-1 < grid[0].length  && grid[i][k-1] == 1) {
                    int[] arr = new int[2];
                    arr[0] = i;
                    arr[1] = k-1;
                    q.offer(arr);
                     grid[i][k-1] = 2;
                     rots++;
                }
                
                if (i+1 < grid.length &&  grid[i+1][k] == 1) {
                    int[] arr = new int[2];
                    arr[0] = i+1;
                    arr[1] = k;
                    q.offer(arr);
                     grid[i+1][k] = 2;
                    rots++;
                }
                
                if (i-1 >=0 && grid[i-1][k] == 1) {
                    int[] arr = new int[2];
                    arr[0] = i-1;
                    arr[1] = k;
                    q.offer(arr);
                    grid[i-1][k] = 2;
                    rots++;
                }
            }
            
            time++;
        }
        
       return -1; 
    }

	public static void main(String[] ar) {
		
		int[][] arr = {{2,1,1},{1,1,0},{0,1,1}};
		orangesRotting(arr);
	}

}
