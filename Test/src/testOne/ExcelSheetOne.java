package testOne;

import java.util.Scanner;

public class ExcelSheetOne {

	public static void main (String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test > 0) {
            int num = sc.nextInt();
            String temp = "";
            String val = "";
            char[] arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
            String str = "";
            if (num < 27) {
                str = arr[num-1]+"";
            } else {
                String rem = "";
                String tempRem = "";
                
                
                while (num >= 26) {
                    
                    int r = num % 26;
                    num = num/26;
                    if (r == 0 && num > 1 && num <= 27) {
                        str = arr[num-2]+"";
                        String Rem3 = "Z";
                        str = str+Rem3+tempRem;
                    } else {
                        if (num <= 26 ) {
                            str = arr[num-1]+"";
                            String rem2 = arr[r-1]+"";
                            str = str+rem2+tempRem;
                        } else {
                            String rem1 = arr[r-1]+"";
                            tempRem = rem1+tempRem;
                        }
                    }
                  
                }
            }
            
            System.out.println(str);
            
            test--;
        }
	 }


}
