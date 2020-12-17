package backtracking;

import java.util.Arrays;
import java.util.TreeSet;

public class BreakString {
	
    public boolean checkIfCanBreak(String s1, String s2) {
    	char[] x = s1.toCharArray();
		char[] y = s2.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		boolean xx = true;
		boolean yy = true;
		for (int i = 0; i < x.length && (xx || yy); i++) {
			int val1 = x[i];
			int val2 = y[i];
			if (x[i] < y[i]) 
				xx = false;
			if (y[i] < x[i]) 
				yy = false;
		}
		return xx || yy;
	}
    

	public static void main(String[] args) {
		
		String s1 = "bxfowqvnrhuzwqohquamvszkvunb";
		String s2 = "xjegbjccjjxfnsiearbsgsofywtq";
		new BreakString().checkIfCanBreak(s1, s2);

	}

}
