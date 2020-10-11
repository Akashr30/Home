package leetcode;

import java.util.ArrayList;
import java.util.List;

public class NumbesWithConsecDiff {
	
	 List<Integer> res ;
	    int nlen;
	    public int[] numsSameConsecDiff(int N, int K) {
	        
	        res = new ArrayList<>();
	        nlen = N;
	        find(0,N,K,0,0);
	        int[] arr = new int[res.size()];
	        int c = 0;
	        for (int x : res)
	            arr[c++] = x;
	        return arr;
	    }
	    
	    private void find(int ist , int n , int k , int sum,int pow) {
	        
	        if (n <= 0) {
	            if (String.valueOf(sum).length() == nlen)
	            res.add(sum);
	            return;
	        }
	        if (n == 1) {
	            
	            for (int m = 0 ; m <= 9 ;m++) {
	                if (Math.abs(m-ist) == k) {
	                    sum += ((int)m*Math.pow(10,pow));
	                    if (String.valueOf(sum).length() == nlen)
	                        res.add(sum);
	                }
	            }
	            return;
	        }
	        
	        for (int i = ist ; i <= 9 ; i++) {
	            for (int j = 0 ; j <= 9 ; j++) {
	                if (Math.abs(i-j) == k ) {
//	                    sum += ((int)i*Math.pow(10,pow)) + ((int)j*Math.pow(10,pow+1));
	                    find(0,n-2,k,sum+(int)((i*Math.pow(10,pow)) + (j*Math.pow(10,pow+1))),pow+2);
//	                    sum = 0;
	                }                
	            }
	        }
	        return;
    }

	public static void main(String[] args) {
		
		NumbesWithConsecDiff obj = new NumbesWithConsecDiff();
		int n = 4;
		int k = 4;
		obj.numsSameConsecDiff(n,k);
		System.out.println(obj.res);
	}

}
