package leetcode;

import java.util.ArrayList;
import java.util.List;

public class WinnerofanArrayGame {
	
/*public static int getWinner(int[] arr, int k) {
        
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            list.add(x);
            max = Math.max(max, x);
        }
//		List<Integer> list = Arrays.a
        int num = 0;
        int c = 0;
        int prev = list.get(0);
        
        while (c < k) {
        	if (max == list.get(0))
        		break;
            if (list.get(0) > list.get(1) && prev > list.get(1)) {
                int val = list.get(1);
                list.remove(new Integer(val));
                list.add(val);
                c++;
            } else {
                int val = list.get(0);
                list.remove(new Integer(val));
                list.add(val);
                c = 1;
                prev = list.get(0);
            }
        }
        
        return list.get(0);
    }
*/
	public static int getWinner(int[] arr, int k) {
        int winner = arr[0];
        int wins = 0;
        for(int i = 1; i < arr.length; i++){
            if(winner > arr[i])
			    // increment wins count
                wins++;
            else{
                wins = 1;
				// new winner
                winner = arr[i];
            }
            if(wins == k)
			    // if wins count is k, then return winner 
                break;
        }
        return winner;
    }
	public static void main(String[] args) {
		int[] arr = {2,1,3, 4,6,7};
		int k = 2;
		getWinner(arr,k);
		
	}

}
