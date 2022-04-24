package leetcode;

public class HummingDistance {

	 public static int hammingDistance(int x, int y) {
	        
		 int xor = x^y;
	        int res = 0;
	        while(xor!=0) {
	            res+= xor & 1;
	            xor >>= 1;
	        }
	        return res;
	    }
	 public static void main(String[] ar) {
		 int a = 1;
		 int k = 4;
		 hammingDistance(a,k);
	 }
}
