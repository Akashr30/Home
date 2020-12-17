package leetcode;

import java.util.HashMap;

public class Sum4 {
	
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < A.length ; i++) {
            for (int j = 0 ; j < B.length ; j++) {
                int temp = A[i]+B[j];
                map.put(temp,map.getOrDefault(temp,0)+1);
            }
        }
        
        for (int i = 0 ; i < C.length ; i++) {
            for (int j = 0 ; j < D.length ; j++) {
                int temp = C[i]+D[j];
                
               /* if (map.containsKey(temp) && map.get(temp) > 0) {
                    ans++;
                    map.put(temp,map.getOrDefault(temp,0)-1);
                }*/
                ans += map.getOrDefault(-1*temp,0);
            }
        }
        
        return ans;
    }

	public static void main(String[] args) {

		int[] A = { -1, -1 };
		int[] B = { -1, 1 };
		int[] c = { -1, 1 };
		int[] d = { 1, -1 };
		System.out.println(fourSumCount(A,B,c,d));
	}

}
