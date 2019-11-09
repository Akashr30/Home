package testOne;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class ArraySubset {
	
	public static void main (String[] args) throws Exception
	 {
       Scanner in = new Scanner(System.in); 
   	int test = in.nextInt();
       
       for (int i = 0 ; i < test ; i++) {
           int sizeOfM1 = in.nextInt();
           int sizeOfM2 = in.nextInt();
           boolean isCheck =false;
           HashSet arr1 = new HashSet();
           HashSet arr2 = new HashSet();
           
           for (int k = 0 ; k < sizeOfM1 ; k++ ){
               int k1 = in.nextInt();
                   arr1.add(k1);
           }
           
           for (int j = 0 ; j < sizeOfM2 ; j++) {
               int j1 = in.nextInt();
               arr2.add(j1);
           }
           if (sizeOfM1 >= sizeOfM2) {
               Iterator<Integer> itr = arr2.iterator();
               while (itr.hasNext()){
                   int x = itr.next();
                   if (arr1.contains(x)){
                       isCheck = true;
                   } else {
                       isCheck = false;
                       System.out.println("No");
                       break;
                   }
               }
               
               if (isCheck){
                   System.out.println("Yes");
               } 
           } else 
               System.out.println("No");
       }
	 
	 }
}
