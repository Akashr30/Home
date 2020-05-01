package interviewBitQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortByColor {
	
	
	public static void main(String[] ar) {
		
		ArrayList<Integer> a = new ArrayList<>();
		int[] arr1 = {0, 1 ,2, 0 ,1,0,1,0,1,0,1 ,2};
		
		for (int x : arr1)
			a.add(x);
        /*int red = 0;
        int white = 0 ; 
        int blue = 0;
        
       for (int j = 0 ; j < a.size() ; j++) {
           
           if (a.get(j) == 0){
               red++;
           } else if (a.get(j) == 1) {
               white++;
           } else {
               blue++;
           }
       }*/
       /* int count = 0;
        for ( int i = 0; i < red ;i++){
        	a.remove(i);
           a.add(i,0);
           count++;
       }
//       i--;
        for ( int i = 0;  i < white ;i++){
        	a.remove(count);
           a.add(count,1);
       }
//       i--;
        for (int i = 0;  i < blue ;i++){
        	a.remove(count);
           a.add(count,2);
       }*/
        
		
       	//-------
       /* boolean redFlag = true;
        boolean wFlag = false;
        boolean bFlag = false;
        int count = 0;
		for (int i = 0 ; i < a.size(); i++) {
			
           if(redFlag) {
               a.remove(i);
               a.add(i,0);
               count++;
               if (count == red) {
            	   redFlag = false;
            	   bFlag = false;
            	   wFlag = true;
            	   count = 0;
               }
            	   
           } else if (wFlag) {
               a.remove(i);
               a.add(i,1);
               count++;
               if (count == white) {
            	   redFlag = false;
            	   wFlag = false;
            	   count = 0;
               }
           } else {
               a.remove(i);
               a.add(i,2);
               count++;
               if (count == blue) {
            	   redFlag = false;
            	   wFlag = false;
            	   bFlag = false;
            	   count = 0;
               }
           }
       }*/

		if (a.size() <= 1) 
	        return;
	      
	      int[] arr = new int[a.size()];
	      int r = 0;
	      int b = a.size()-1;
	      int i = 0; 
	      int j = a.size()-1;
	    //   for (int i = 0 ; i < a.size(); i++) {
	        while (i <= j) {
	            
	            if (a.get(i).equals(1)) {
	              i++;
	              continue;
	          } else if (a.get(j).equals(1)) {
	              j--;
	              continue;
	          }
	          
	          if (a.get(i).equals(0)) {
	              arr[r] = 0;
	              r++;
	              i++;
	          } else if (a.get(i).equals(2)) {
	              arr[b] = 2;
	              b--;
	              i++;
	          }
	          
	          if (a.get(j).equals(0)) {
	              arr[r] = 0;
	              r++;
	              j--;
	          } else if (a.get(j).equals(2)) {
	              arr[b] = 2;
	              b--;
	              j--;
	          }
	          
	          
	          
	      }
	        r--;
	        b++;
	        a.clear();
	      for (int x = 0 ; x < arr.length ; x++) {
	          if (x >= r && x <= b) {
	            a.add(1);
	            continue;
	          }
	            a.add(arr[x]);
	      }
	      
    
	}

}
