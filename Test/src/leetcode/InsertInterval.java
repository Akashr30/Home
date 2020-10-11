package leetcode;

import java.util.Queue;
import java.util.List;

public class InsertInterval {
	
	public static int[][] insert(int[][] arr, int[] intr) {
        
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0 ; i < arr.length ; i++) {
            if (intr[0] > arr[i][0]) {
                if (intr[0] > arr[i][1])
                    q.add(new int[] {arr[i][0],arr[i][1]}); 
                else {
                    int st = arr[i][0];
                    int j = -1;
                    while (true) {
                        if (intr[1] <= arr[i][0]) {
                            j = i;
                            break;
                        }
                        if (intr[1] >= arr[i][1]) {
                            i++;
                            break;
                        }
                    }
                    if (j != -1) {
                        q.add(new int[]{st,intr[1]});
                        i--;
                    } else 
                        q.add(new int[]{st,arr[i][1]});
                } 
            } else {
                q.add(new int[]{arr[i][0],arr[i][1]});
            }
        }
        int[][] ans = new int[q.size()][2];
        int c =0;
        while (!q.isEmpty()) {
            int[] temp = q.poll(); 
            ans[c][0] = temp[0];
            ans[c++][1] = temp[1];
        }
        
        return ans;
    }

	public static void main(String[] args) {

	}

}
