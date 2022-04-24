package testOne;

import java.util.Scanner;

public class MaximumSubArray {
	
	public static void main (String[] args)
	 {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    sc.nextLine();
    
    while (test > 0) {
        
        int len = sc.nextInt();
        int[] a = new int[len];
        // int max = 
        for (int i = 0 ; i < len ; i++) {
            a[i] = sc.nextInt();
            
        }
        int max = 0;
        String str = "";
        int tempMax = 0;
        String tempStr = "";
        int idx = 0;
        int minIdx = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int j = 0 ; j < len ; j++) {
            if (a[j] > -1) {
                tempMax = tempMax+a[j];
                sb.append(a[j]+" ");
                idx++;
            } else {
                if (tempMax > max) {
                    max = tempMax;
                    str = sb.toString();
                    sb.setLength(0);
                    minIdx = j - idx;
                    tempMax = 0;
                    idx = 0;
                } else if(max > tempMax) {
                	sb.setLength(0);
                    tempMax = 0;
                    idx = 0;
                } 
                else if (tempMax == max) {
                    if (str.length() < sb.toString().length()) {
                        str = sb.toString();
                        sb.setLength(0);
                        tempMax = 0;
                        idx = 0;
                    } else if (str.length() == sb.toString().length()) {
                        int curr = j - idx;
                        if (curr < minIdx) {
                            str = sb.toString();
                            sb.setLength(0);
                            tempMax = 0;
                            idx = 0;
                        } else {
                            sb.setLength(0);
                            tempMax = 0;
                            idx = 0;
                        }
                        
                    }
                }
                
            } 
            
        }
        if (str == "" || str.length() < 0){
            str = sb.toString();
        } else if (tempMax > max) {
        	str = sb.toString();
        }
        
        System.out.println(str);
        
        test--;
    }
    
	 }
 

}
