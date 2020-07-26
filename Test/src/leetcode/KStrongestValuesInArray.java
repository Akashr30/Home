package leetcode;

import java.util.Arrays;

public class KStrongestValuesInArray {

    public static int[] getStrongest(int[] a, int K) {
        Arrays.sort(a);
        int m = a[(a.length-1)/2];
        long[] ai = new long[a.length];
        for(int i = 0;i < a.length;i++){
        	ai[i] = (long)Math.abs(a[i]-m)<<32|a[i]+100000;
        }
        Arrays.sort(ai);
        for(int i = 0;i < a.length;i++){
        	a[i] = ((int)ai[a.length-1-i]) - 100000;
        }
        return Arrays.copyOf(a, K);
    }
    
    public static void main(String[] ar) {
    	int[] a = {6, -3, 7, 2, 11};
    	int k = 2;
    	getStrongest(a,k);
    }
}	