package interviewBitQuestions;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
	
	static ArrayList<Integer> a = new ArrayList<>();
	static ArrayList<Integer> B = new ArrayList<>();
	
	public static void main(String[] ar) {
		
//		int[] arr = {0, 1 ,2, 0 ,1,0,1,0,1,0,1 ,2};
		int[]arr = {5000,5000,5000,5,1};
		int[] arrB = {5000,5,2,1};
		for (int x : arr)
			a.add(x);
		for (int x : arrB)
			B.add(x); 
		
		 for (int x = 0 ; x < B.size() ; x++) {
	        	if(a.contains(B.get(x))) {
	        		System.out.println(B.get(x));
	        	}
	        }
		
        int i = 1;
        while ( i < a.size()) {
            if (a.get(i).equals(a.get(i-1))) {
                a.remove(i);
                continue;
            }
            
            i++;
        }
        
       
        
    
	}

}
