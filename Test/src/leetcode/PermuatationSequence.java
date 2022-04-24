package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermuatationSequence {
	
	
/*public static String getPermutation(int n, int k) {
        
        int end = (int)Math.pow(10,n);
        int st =  (int)Math.pow(10,n-1);
        List<Integer> al = new ArrayList<>();
        
        for (int i = st ; i < end ; i++) {
            String str = i+"";
            boolean flag = false;
            for (int j = 1 ; j < n+1 ; j++) {
                
                if (!str.contains(j+"")) {
                    break;
                }
                
                if (j == n)
                    flag = true;
            }
            
            if (flag) {
                al.add(i);
            }
        }
        
        Collections.sort(al);
        
        return al.get(k-1)+"";
        
    }*/
	
	public static String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> num = new ArrayList<Integer>();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            num.add(i);
        }
        for (int i = 0, l = k - 1; i < n; i++) {
            fact /= (n - i);
            int index = (l / fact);
            sb.append(num.remove(index));
            l -= index * fact;
        }
        return sb.toString();
    }

	public static void main(String[] ar) {
		int n = 8;
		int k = 20000;
		System.out.println(getPermutation(n,k));
	}

}
