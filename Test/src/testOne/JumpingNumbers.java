package testOne;

import java.util.*;
import java.lang.*;
import java.io.*;
class JumpingNumbers
 {
	public static void main (String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test > 0) {
            int len = sc.nextInt();
            StringBuffer sb = new StringBuffer();
            for (int i = 0 ; i <= len ; i++) {
                if (i < 11) {
                    sb.append(i+" ");
                    continue;
                } else {
                    int num = i;
                    boolean flag = true;
                    int temp = 0;
                    int diff = 0;
                    int rem = 0;
//                    int num = 0;
                    boolean isJump = true;
                    while (num > 0) {
                    	
                    	rem = num%10;
                    	num = num/10;
                        
                        if (flag) {
                            temp = rem;
                            flag = false;
                            continue;
                        } else {
                            diff = temp - rem;
                            temp = rem;
                            if (Math.abs(diff) != 1) {
                                isJump = false;
                                break;
                            }
                        }
                    }
                    
                    if (isJump) {
                        sb.append(i+" ");
                    }
                }
            }
            System.out.println(sb.toString());
            test--;
        }
        	 
	 }
}