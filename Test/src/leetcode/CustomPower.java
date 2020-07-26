package leetcode;

public class CustomPower {
	
	public static double myPow(double x, int n) {
        
        if (n < 0) {
        	n = n*-1;
            double prod = multiply (x,n-1);
            double div = divide(1,prod);
            return div;
        } else {
            return multiply (x,n-1);
        }
        
        // return 0;
    }
    
    static double multiply (double x , int n) {
        double temp = x;
        while (n-- > 0) {
            x *= temp;
        }
        return x;
    }
    
    
    static double divide (double a , double prod) {
        
//        int n = 6;
//    	double prev = 0;
//        double deci = 1;
        double ans = 0;
        /*while (n > 0) {
            while (a < prod && n-- > 0) {
                deci *= 0.1; 
                a = a*10;
            }
            ans = a/prod;
            ans = ans * deci;
            prev += ans;
            a = a%prod;
            }*/
        double tens = a*100000;
        ans = tens/prod;
        return ans*0.00001;
    }
    
    public static void main(String[] ar) {
    	
    	double x = 2;
    	int y = -4;
    	System.out.print(myPow(x,y));
    }

}
