package leetcode;

public class KthBinaryStirng {

	   public static char findKthBit(int n, int k) {
	        
	        if (k == 1)
	            return '0';

	        String s = "0";
	        StringBuffer sb = new StringBuffer();
	        while (n-- > 1) {
	            String prev = s;
	             s += '1';
	            String next = prev.replace('0', '2').replace('1', '0').replace('2', '1');
	            String temp = sb.append(s).toString();
	            sb.setLength(0);
	            String temp1 = sb.append(next).reverse().toString();
	            sb.setLength(0);
	            s = sb.append(temp).append(temp1).toString();
	            sb.setLength(0);
	        }
	        
	        return s.charAt(k-1);
	    }
	   
	   public static void main(String[] ar) {
		   
		   findKthBit(4,11);
	   }
}
