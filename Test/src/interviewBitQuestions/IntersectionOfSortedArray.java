package interviewBitQuestions;

import java.util.ArrayList;

public class IntersectionOfSortedArray {
	
	public static void main(String[] at) {
		
//		int[] A = {1, 3, 8, 10, 13, 13, 16, 16, 16, 18, 21, 23, 24, 31, 31, 31, 33, 35, 35, 37, 37, 38, 40, 41, 43, 47, 47, 48, 48, 52, 52, 53, 53, 55, 56, 60, 60, 61, 61, 63, 63, 64, 66, 67, 67, 68, 69, 71, 80, 80, 80, 80, 80, 80, 81, 85, 87, 87, 88, 89, 90, 94, 95, 97, 98, 98, 100, 101};
//		int[]   B = {5, 7, 14, 14, 25, 28, 28, 34, 35, 38, 38, 39, 46, 53, 65, 67, 69, 70, 78, 82, 94, 94, 98};
        int[] A = {10000000};
        int[] B = {10000000};
        ArrayList<Integer> c = new ArrayList<Integer>();
        
        int bCount = 0;
        for (int i = 0 ; i < A.length;) {
            
            if (bCount < B.length && B[bCount] == A[i]) {
                c.add(A[i]);
                bCount++;
            } else if (bCount < B.length && A[i] > B[bCount]){
                bCount++;
                continue;
            }
             i++;
        }
        System.out.println(c);
//        return c;
        
    
	}

}
