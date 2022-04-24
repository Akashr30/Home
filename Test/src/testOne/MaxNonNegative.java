package testOne;

import java.util.ArrayList;

public class MaxNonNegative {
	
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();  
//			int [] a = { 756898537, -1973594324, -2038664370, -184803526, 1424268980 };
		int[] a = {0, 0, -1, 0};
			for (int y : a) 
				A.add(y);
			long sum = 0;
	        long max = 0;
	        long tempMax = 0;
	        long tempEquals = 0;
	        String tempIdx = "";
	        String tempX = "";
	        ArrayList<Integer> maxArr = new ArrayList<Integer>();
	        ArrayList<Integer> tempArr = new ArrayList<Integer>();
	        ArrayList<Integer> x = new ArrayList<Integer>();
	        StringBuilder sb = new StringBuilder();
	        boolean flag = true;
	        for (int i = 0 ; i < A.size() ; i++) {
                if (A.get(i) >= 0) {
                    sum += A.get(i);
                    maxArr.add(A.get(i));
                    sb.append(i);
                } 
                
                if (sum >= max &&(maxArr.size() > tempArr.size())) {
                    max = sum;
                    tempArr = maxArr;
                }
                
                if (A.get(i) < 0) {
                    sum = 0;
                    maxArr = new ArrayList<Integer>(); 
                }
                
                
            }
	        
	     /*   if (tempEquals == max && maxArr.size() > 0 && tempEquals != 0) {
	            if (x.size() > tempArr.size()) {
	                maxArr = x;
	            } else if (x.size() < tempArr.size()) {
	                maxArr = tempArr;
	            } else if (x.size() == tempArr.size()) {
	                if (tempX.charAt(0) > tempIdx.charAt(0)) {
	                    maxArr = tempArr;
	                } else {
	                    maxArr = x;
	                }
	            }
	        } else {
	            maxArr = tempArr;
	        }*/
	}

}
