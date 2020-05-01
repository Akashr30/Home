package patterns;

public class InvertedHollowTriangle {
	

	
	public static void main(String[] arg) {
		
		int n = 5;
		int space = 5;
		int spCount = 0;
		for(int i = n-1 ; i>=0 ; i--) {
			for (int s = 0 ; s < spCount  ;s++) {
				System.out.print(" ");
			}
			spCount++;
			for (int j = 2*(i+1)-1 ; j >0  ; j--) {
				if (j == 1 || j == 2*(i+1)-1 || i == n-1)
				System.out.print("#");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			space--;
		}
		
	}



}
