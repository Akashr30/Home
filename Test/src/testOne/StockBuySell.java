package testOne;

import java.util.Scanner;

public class StockBuySell {

	public static void main (String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test > 0) {
            
                int len = sc.nextInt();
                int[] arr = new int[len];
                for (int i = 0 ; i < len ; i++) {
                    arr[i] = sc.nextInt();
                }
                int start = -1;
                int end = -1;
                // int x = 0;
                int y = 1;
                boolean isBuy = true;
                boolean isSale = false;
                
                while (y <= len-1) {
                    if (arr[y-1] < arr[y] && isBuy) {
                        start = y-1;
                        isBuy = false;
                    }
                    
                    if (!isBuy && y < len-1) {
                        if (arr[y+1] < arr[y]) {
                            end = y;
                            isBuy = true;
                            isSale = true;
                        }
                    }
                    
                    if(isSale) {
                        System.out.print("("+start+" "+end+")");
                        isSale = false;
                    }
                    y++;
                }
                
                if (y >= len-1 && arr[y-2] < arr[y-1]) {
                    System.out.print("("+start+" "+(y-1)+") ");
                }
                System.out.println();
            
            test--;
        }
	 }


}
