package leetcode;

public class Clock {
	
	 public static double angleClock(int hour, int minutes) {
	        
	        hour = hour%12;
	        int hr = hour * 30;
	        double q = minutes/5;
	        if (minutes%5 > 0) {
	        	double rem = (((minutes%5)*10))/5;
	        	rem *= 0.1;
	        	q += rem;
	        }
	        double add = 0;
	        double min = 0;
	        if (q > 0) {
	            min = q * 30;
	            add = (q * 0.5*5)+hr;
	        } else {
	            min = minutes * 6;
	            add = minutes * 0.5;
	            add += hr;
	        }
	        double diff = Math.abs(add - min);
	        return Math.min(diff , 360-diff);
	        
	    }
	 
	 public static void main(String[] ar) {
		 
		 int hr = 1;
		 int min = 57;
		 System.out.print(angleClock(hr,min));
	 }
}
