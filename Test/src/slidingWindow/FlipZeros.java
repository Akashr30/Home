package slidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class FlipZeros {
    
    static int flipZeroos(int[] arr,int len,int k) {
        
        int key = 0,zc = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        
        while (i < len) {
            
            sum += arr[i];
            
            if (arr[i] == 0 && zc <= k) {
                sum += 1;
                zc++;
            } 
            if (zc > k) {
                zc--;
                sum--;
                max = Math.max(sum,max);
                
                while (key < i && zc == k) {
                    key++;
                    
                    if (arr[key-1] == 0){
                        zc--;
                        sum -= 1;
                    } else {
                        sum -= 1;
                    }
                }
                i--;
            }
            i++;
        }
        
        return Math.max(sum,max);
    }
     
     
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int test = Integer.parseInt(sc.nextLine());
	    
	    while (test-- > 0) {
	        int len = Integer.parseInt(sc.nextLine());
	        String s = sc.nextLine();
	        int k = Integer.parseInt(sc.nextLine());
	        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
	        System.out.println(flipZeroos(arr,len,k));
	    }
	 }


}
