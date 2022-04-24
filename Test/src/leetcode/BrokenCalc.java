package leetcode;

public class BrokenCalc {
	
	    public static int brokenCalc(int x, int y) {
	        
	    	int ans = 0;
	        if (y <= x) {
	            return x-y;
	        }
	        int sum = x;
	        while (true) {
	           System.out.println(sum);
	            if (sum*2 <= y) {
	                ans++;
	                sum *= 2;
	                System.out.println("sum*2 : "+sum);
	            }
	            
	            if (sum*2 > y) {
	                ans++;
	                sum -= 1;
	                System.out.println("sum-1 : "+sum);
	            }
	            
	            if (sum == y) {
	                break;
	            }
	        }
	        
	        return ans;
	    }

	public static void main(String[] args) {
		int x = 3;
		int y = 10;
		brokenCalc(x,y);
	}

}
