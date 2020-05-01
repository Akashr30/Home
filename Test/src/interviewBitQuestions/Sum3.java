package interviewBitQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class Sum3 {

	public static void main(String[] args) {
		
		int[] arr1 = {-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3 };
		int B = -1;
//		int[] arr1 = {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8 };
//		int B = -3;
		
		 ArrayList<Integer> A = new ArrayList<>();
		 for (int x : arr1)
			 A.add(x);
        int count = 0;
        int sum = 0;
        
        int i = 0;
        int j = A.size();
        ArrayList<Integer> ar = new ArrayList<>();
        
        while (i < j && i+2 < j) {
            
            sum += A.get(i);
            count++;
            
            if (count == 3) {
                ar.add(sum);
                sum = 0;
                count = 0;
                i = i-1;
                continue;
            }
            i++;
            
        }
        
        Collections.sort(ar);
        
        for (int f = 0 ; f < ar.size() ; f++) {
        	if (ar.get(f)>=B) {
        		System.out.println(ar.get(f));
        		break;
        	}
        }
        
        
//        System.out.println(ar.get(0));
//        return ar.get(0);
    

	}

}
