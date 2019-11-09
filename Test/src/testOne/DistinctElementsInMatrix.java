package testOne;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctElementsInMatrix {

	/*public static void main(String[] args) {
		
		int[][] mat = {  {2, 31, 4, 31},
                {31, 2, 31, 2},  
                {31, 6, 2, 31},  
                {31, 2, 5, 31}  };*/
		
/*		String currentString = "";
//		String nextEle = "";
		String commonElem = "";
//		int incre = 0;
		HashSet currentString = new HashSet();
		HashSet commonElem = new HashSet();
		
		for (int i = 0 ; i < 4 ; i++) {
			currentString.add(mat[0][i]);
		}
		
		for (int j = 1 ; j < 4; j++) {
			for (int k = 0 ;  k < 4 ; k++) {
				if (currentString.contains(mat[j][k]) ) {
					commonElem.add(mat[j][k]);
				}
			}
			currentString = commonElem;
//			commonElem = "";
		}
		
		System.out.println(currentString);
		}
	

}*/
		
	private static Integer[][] mat;

	public static void main (String[] args)
	 {
	 
       Scanner in = new Scanner(System.in); 
   	int testCase = in.nextInt();
   	
   	for (int i = 0 ; i < testCase ; i++){
   	    int mtxSize = in.nextInt();
   	    int[][] mtx = new int [mtxSize][mtxSize];
   	    
   	    HashSet<Integer> currentString = new HashSet<Integer>();
   		HashSet<Integer> commonElem = new HashSet<Integer>();
   		
   		for (int a = 0 ; a < 4 ; a++) {
   			currentString.add(mat[0][a]);
   		}
   		
   		for (int j = 1 ; j < 4; j++) {
   			for (int k = 0 ;  k < 4 ; k++) {
   				if (currentString.contains(mat[j][k]) ) {
   					commonElem.add(mat[j][k]);
   				}
   			}
   			currentString = commonElem;
   		}
   		
   		System.out.println(currentString);
		}
	

	 
	 }
}