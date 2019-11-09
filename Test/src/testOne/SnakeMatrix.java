package testOne;

public class SnakeMatrix {
	
	static void snakeMatrix(int[][]mat ,int m ,int n){
		for (int i = 0; i < m ; i++) {
			if (i%2==0) {
				for (int j = 0;j<n;j++) {
					System.out.print(mat[i][j]);
				}
			} else {
				for (int k =n-1;k >=0;k--) {
					System.out.print(mat[i][k]);	
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{10,11,12,13},{20,21,22,23},{30,31,32,33}};
		int m = 3;
		int n = 4;
		snakeMatrix(matrix,m,n);
		System.out.println();
		int i = 'a';
		System.out.println(i);
	}

}
