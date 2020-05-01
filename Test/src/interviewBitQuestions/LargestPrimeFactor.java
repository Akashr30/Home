package interviewBitQuestions;

import java.util.Scanner;

public class LargestPrimeFactor {
	
    public static int  largestPrimeFactor(int num) {
        
        int ans = 0;
        boolean[] arr = new boolean[num+1];
        
        for (int i = 2 ; i*i <= num ; i++) {
            
            if (arr[ i] == false) {
            
                for (int x = i*i ; x <= num; x=x+i) {
                    arr[x] = true;
                }
            
            }
        }
        
        /*for (int j = arr.length-1 ; j >=2 ; j--) {
            if (arr[j] == false) {
            	ans = j;
            	break;
            }
        }*/
        
        for (int i = 2 ; i < arr.length-1 ; i++) {
            if (arr[i] == false && (num%i == 0) )
                ans = i; 
        }
        
        return ans;
    }
     
     
	public static void main (String[] args)
	 {
       /* Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        
        while (test > 0) {*/
            
            int num = 15;
            System.out.println(largestPrimeFactor(num));
//            test--;
//        }
	 
	 }


}


