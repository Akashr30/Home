package patterns;

public class HollowTriangle {
	
	public static void main(String[] arg) {
		
		int n = 5;
		int space = 5;
		
		for(int i = 0 ; i < n ; i++) {
			for (int s = 0 ; s < space-1 ;s++) {
				System.out.print(" ");
			}
			for (int j = 1 ; j < 2*(i+1) ; j++) {
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
