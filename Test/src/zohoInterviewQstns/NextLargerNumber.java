package zohoInterviewQstns;

import java.util.Scanner;

public class NextLargerNumber {
	// Incomplete

    public static String[] nextLargerElement(String[] arr , int len) {
        
        StringBuffer sb = new StringBuffer();
        int temp = -1;
        for (int i = len-1 ; i >= 0 ; i--) {
           if (temp == -1) {
               int num1 = Integer.parseInt(arr[i]);
               arr[i] = temp+"";
               temp = num1;
               sb.append(arr[i]+" ");
           } else if (temp >= Integer.parseInt(arr[i]) ) {
                int num1 = Integer.parseInt(arr[i]);
                arr[i] = temp+"";
                if (num1 > temp)
                	temp = num1;
                sb.append(arr[i]+" ");
           } else if (temp < Integer.parseInt(arr[i]) 
                        && Integer.parseInt(arr[i+1]) > Integer.parseInt(arr[i])) {
        	   temp = Integer.parseInt(arr[i]);
        	   arr[i] = arr[i+1]+"";
        	   sb.append(arr[i]+" ");
           }  else if (temp < Integer.parseInt(arr[i]) 
                   && !(Integer.parseInt(arr[i+1]) > Integer.parseInt(arr[i]))) {
        	   for (int j = i+1 ; j < arr.length ;j++) {
        		   if (Integer.parseInt(arr[j]) > Integer.parseInt(arr[i])){
        			   temp = Integer.parseInt(arr[i]);
        		   	   arr[i] = arr[j]+"";
        		   	   sb.append(arr[i]+" ");
        		   	   break;
        		   }
        	   }
		      } else {
               temp = Integer.parseInt(arr[i]);
               arr[i] = -1+"";
           }
           
        }
        
        return arr;
    }
     
     
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    while (test > 0) {
	        
	        int len = Integer.parseInt(sc.nextLine());
	        String str = sc.nextLine();
	        String[] arr = str.split(" ");
	        if (arr.length == 0) {
	        	System.out.println("-1");
	        } else {
	        	nextLargerElement(arr,len);
	        	for (int i = 0 ; i < arr.length ; i++) {
	        		System.out.print(arr[i]+" ");
	        	}
	        	System.out.println();
	        }
	        test--;
	    }
	    
	 }


}
