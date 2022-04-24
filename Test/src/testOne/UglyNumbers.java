package testOne;

import java.util.ArrayList;
import java.util.Scanner;

public class UglyNumbers {
	

	public static void main (String[] args)
	 {
   	 Scanner sc = new Scanner(System.in);
   	 int test = Integer.parseInt(sc.nextLine());
   	 
   	 while (test-- > 0) {
   	     
          int len = sc.nextInt();
   	   if (len > 5) {  
       	   ArrayList<Long> al = new ArrayList<>();
       	   al.add((long)1);
       	   al.add((long)2);
       	   al.add((long)3);
       	   al.add((long)4);
       	   al.add((long)5);
       	   long val = 6;
       	   int count=5;
       	   while (al.size() <= len ) {
       	       long i = val;
       	       while (i > 0) {
       	           
       	           if (i%2 == 0) {
       	               i = i/2;
       	           } else if (i%3 == 0) {
       	               i = i/3;
       	           } else if (i % 5 == 0) {
       	               i = i/5;
       	           } else {
       	               break;
       	           }
       	           
       	           if (al.contains(i)) {
       	               al.add((long)val);
       	               break;
       	           }
       	       }
       	       
       	       val++;
       	       
       	       
       	   }
       	   System.out.println(al.get(al.size()-2));
   	   } else {
   	       System.out.println(len);
   	   }
   	 }
	 }
	
/*    int getNthUglyNo(int n) 
    { 
        int ugly[] = new int[n];  // To store ugly numbers 
        int i2 = 0, i3 = 0, i5 = 0; 
        int next_multiple_of_2 = 2; 
        int next_multiple_of_3 = 3; 
        int next_multiple_of_5 = 5; 
        int next_ugly_no = 1; 
          
        ugly[0] = 1; 
          
        for(int i = 1; i < n; i++) 
        { 
            next_ugly_no = Math.min(next_multiple_of_2, 
                                  Math.min(next_multiple_of_3, 
                                        next_multiple_of_5)); 
              
            ugly[i] = next_ugly_no; 
            if (next_ugly_no == next_multiple_of_2) 
            { 
               i2 = i2+1; 
               next_multiple_of_2 = ugly[i2]*2; 
            } 
            if (next_ugly_no == next_multiple_of_3) 
            { 
               i3 = i3+1; 
               next_multiple_of_3 = ugly[i3]*3; 
            } 
            if (next_ugly_no == next_multiple_of_5) 
            { 
               i5 = i5+1; 
               next_multiple_of_5 = ugly[i5]*5; 
            } 
        }
        return next_ugly_no; 
    } 
  
    public static void main(String args[]) 
    { 
        int n = 50; 
        UglyNumbers obj = new UglyNumbers(); 
        System.out.println(obj.getNthUglyNo(n)); 
    } 
*/
}
