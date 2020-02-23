package zohoInterviewQstns;

import java.util.Scanner;

public class MInimumJumps {
	
	public static void main(String[] arg) {

	     Scanner sc = new Scanner(System.in);
	     int test = Integer.parseInt(sc.nextLine());
	     
	     while (test > 0) {
	         
	        long len = Long.parselong(sc.nextLine());
	        String str = sc.nextLine();
	        String[] arr = str.split(" ");
	        long n1 = Long.parselong(arr[0]);
	        
	        if (len == 1) {
	            System.out.println("1");
	            continue;
	        }
	        int count = 0;
	        
	        for (long i = n1 ; i < len ;) {
	            
	            if (Long.parselong(arr[i]) > 0) {
	                i += Long.parselong(arr[i]);
	                count++;
	            } else {
	                count = -1;
	            }
	            
	        }
           System.out.println(count);         
	         
	         test--;
	     }
	 
	}

}
