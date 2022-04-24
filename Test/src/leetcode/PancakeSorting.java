package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {
	
public static List<Integer> pancakeSort(int[] A) {
        
        int num = A.length;
        List<Integer> al = new ArrayList<>();
        while (num > 0) {
            int c = 0;
            int i = 0;
            for (i = 0 ; i < num ; i++) {
                if (A[i] == num)
                    break;
            }
            al.add(i+1);
            swap(0,i+1,A);
            al.add(num);
            swap(0,num,A);
            num--;
            
        }
        return al;
    }
    
    public static void swap(int st , int end, int[] A) {
        int[] temp = new int [end];
        
        for (int i = 0 ; i < end ; i++) {
            temp[i] = A[i];
        }
        
        int c = 0;
        for (int j = temp.length -1 ; j >= 0 ; j--) {
            A[c++] = temp[j];
        }
    }

	public static void main(String[] args) {
		
		int[] A = {3,2,4,1,6,5};
		pancakeSort(A);

	}

}
