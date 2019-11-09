package testOne;

import java.util.ArrayList;
import java.util.Collection;

public class StringMatrix {

	public static void main(String[] args) {
		
//		ArrayList cc = new ArrayList();
		
		String s = "abcdefgh";
		int r = 3;
		int c = 0;
		
		for (int i = 0; i < r ; i++) {
			for (int j = 0 ; j<r;j++) {
				if (!(i == r-1 && c==6)) {
				System.out.print(s.charAt(i+c));
				}
				c=c+3;
			}
			c=0;
			System.out.println();
		}
		
	}

}
