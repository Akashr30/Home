package testOne;

public class MatrixTransapose {
	
	 static void TransposedMatrix(int[][] mat,int m,int n) {
		 int [][] Tmat = new int[n][m];
		for ( int k = 0 ; k < m;k++ ) {
			for (int j = 0 ; j < n;j++) {
				Tmat[j][k] = mat[k][j];
				System.out.print(Tmat[j][k]);
			}
		}
//		System.out.println(Tmat.toString());
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,1,1,1},{2,2,2,2},{3,3,3,3}};
		int m = 3;
		int n = 4;
//		System.out.println(matrix[1].length);
		TransposedMatrix(matrix,m,n);
//		System.out.println(1%2);
	}

}
