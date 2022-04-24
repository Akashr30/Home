package leetcode;

import java.util.ArrayList;
import java.util.PriorityQueue;

interface I {
	void m1();
}

class A23 implements I {

	@Override
	public void m1() {
		
	}
	
}

public class TransposeMatrix extends A23{
	
	 public static int[][] transpose(int[][] A) {
	     boolean[][] flag = new boolean[A.length][A.length];   
	     
		 for (int i = 0 ; i < A.length ; i++) {
	            for (int j = 0 ; j < A[i].length ; j++) {
	            	if (i == j)
	            		continue;
	            	if (!flag[i][j]) {
	            		flag[i][j] = true;
	            		flag[j][i] = true;
	            		int temp = A[j][i];
		            	A[j][i] = A[i][j];
		            	A[i][j] = temp;
	            	}
	                
	            }            
	        }
	        
	        for (int i = 0 ; i < A.length ; i++) {
	            int x = 0 ;
	            int j = A[0].length-1;
	            
	            while (x<=j) {
	                int temp = A[i][x];
	                A[i][x] = A[i][j];
	                A[i][j] = temp;
	                x++;
	                j--;
	            }
	        }
	         
	        return A;
	    }

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		transpose(arr);
		ArrayList<int[]> ar = new ArrayList<>();
		ar.add(new int[] {1,1});
		
		if (ar.contains(new Integer(1))) {
			System.out.println(true);
		}
		
		I i = new TransposeMatrix();
		PriorityQueue<Integer> pq = new PriorityQueue<>(3);
		int[] arr1 = {3,2,1,5,6,4};
		
		for (int q : arr1) {
			pq.offer(q);
		}
	}

}
