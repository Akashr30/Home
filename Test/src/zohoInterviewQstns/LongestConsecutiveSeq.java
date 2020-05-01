package zohoInterviewQstns;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSeq {
	
// if there are duplicates use hashset
	public static void main (String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        
        while (test > 0) {
            
            int len = Integer.parseInt(sc.nextLine());
            int[] arr = new int[len];
            
           /* for (int i = 0 ; i < len ; i++) {
                arr[i] = sc.nextInt();
                sc.nextLine();
            } */
            
            String str = sc.nextLine();
            String[] strArr = str.split(" ");
            
            for (int i = 0 ; i < len ; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }
            
            Arrays.sort(arr);
            int max = 0;
            int count = 0;
          /*  int temp = arr[0]-1;
            if (temp+1 == arr[0])
                count++;*/
            
            for (int i = 1 ; i < len ; i++) {
                if ( arr[i]-1 == arr[i-1]) {
                    count++;
                } else {
                    if (count+1 >= max) {
                        max = count+1;
                    }
                    count = 0;
                }
            }
            
            System.out.println(max);
            
            test--;
        }
	 
	 }


}
