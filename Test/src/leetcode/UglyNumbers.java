package leetcode;

import java.util.ArrayList;
import java.util.List;

public class UglyNumbers {
	
	public static int nthUglyNumber(int n) {
	
		List<Integer> list = new ArrayList<>();
        list.add(1);
        int two = 2,three = 3,five = 5;
        int c2 = 0 , c3 = 0, c5 = 0;
        
        for (int i = 0 ; i < n ; i++) {
            
            int min = Math.min(2*list.get(c2),Math.min(3*list.get(c3),5*list.get(c5)));
            list.add(min);
            
            if (2*list.get(c2) == min) {
                c2++;
            }
            
            if (3*list.get(c3) == min) {
                c3++;
            }
            
            if (5*list.get(c5) == min) {
                c5++;
            }
            
        }
        
        return list.get(list.size()-2);
		
		
	}
        
 /*       int[] arr = new int[n];
        arr[0] = 1;
        int two = 2,three = 3,five = 5;
        int c2 = 1 , c3 = 1, c5 = 1;
        int ans = 0;
        for (int i = 1 ; i <= n ; i++) {
            int min = Math.min(Math.min(two,three) , five);
            
//            arr[i] = min;
            if (min == two) {
                two = 2 * ++c2;
                ans = two;
            }
            
            if (min == three) {
                three = 3 * ++c3;
                ans = three;
            }
            
            if (min == five) {
                five = 5 * ++c5;
                ans = five;
            }
        }
//        return arr[arr.length-1];
        return ans;
    }*/
	/*public static int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        for(int i=1;i<n;i++){
            int min = Math.min(Math.min(factor2,factor3),factor5);
            ugly[i] = min;
            if(factor2 == min)
                factor2 = 2*ugly[++index2];
            if(factor3 == min)
                factor3 = 3*ugly[++index3];
            if(factor5 == min)
                factor5 = 5*ugly[++index5];
        }
        return ugly[n-1];
    }*/
	public static void main(String[] ar) {
		
		int n = 20;
		System.out.print(nthUglyNumber(n));
	}

}
