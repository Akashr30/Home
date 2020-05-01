package zohoInterviewQstns;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNUmberFromArray {

	public static void main (String[] args)
	 {
	    Scanner  sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    while (test > 0) {
	        
	        int len = Integer.parseInt(sc.nextLine());
	        String str = sc.nextLine();
	       // int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
	       String[] arr = str.split(" ");
	        
	        Arrays.sort(arr, new Comparator<String>(){
	            
	            public int compare(String a1 , String a2) {
	                String s1 = a1+a2;
	                String s2 = a2+a1;
	                
	                /*if (Integer.parseInt(s1) > Integer.parseInt(s2)) {
	                    return 1;
	                } else {
	                    return -1;
	                }*/
	                return s1.compareTo(s2) > 0 ? -1:1;
	               // return (Integer.parseInt(s1)).compareTo(Integer.parseInt(s2));
	            }
	        });
	        
	        for (String a : arr) {
	            System.out.print(a+"");
	        }
	         System.out.println();
	        test--;
	    }
	 }


}
