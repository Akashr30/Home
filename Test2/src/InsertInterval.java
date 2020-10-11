import java.util.LinkedList;
import java.util.Queue;


public class InsertInterval {
	
	public static int[][] insert(int[][] arr, int[] intr) {
        
        if (arr.length == 0 )
            return new int[][]{{intr[0],intr[1]}};
        
        if (intr.length == 0)
            return arr;
        
        
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0 ; i < arr.length ; i++) {
            if (intr[0] > arr[i][0]) {
                if (intr[0] > arr[i][1])
                    q.add(new int[] {arr[i][0],arr[i][1]}); 
                else {
                    int st = arr[i][0];
                    while (intr[0] > arr[i][0] || intr[0] < arr[i][1]) {
                        if (intr[1] < arr[i][0]) {
                            q.add(new int[]{st,intr[1]});
                            i--;
                            break;
                        } else if (intr[1] < arr[i][1]) {
                            q.add(new int[]{st,arr[i][1]});
                            break;
                        }
                        i++;
                    }
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
		
//		int[][] arr = {{1,2},{3,5},{6,7},{8,10},{12,16}};
//		int[] arr1 = {4,8};
		int[][] arr = {{1,5}};
		int[] arr1 = {2,7};
		insert(arr,arr1);
	}

}
