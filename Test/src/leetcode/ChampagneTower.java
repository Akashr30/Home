package leetcode;

public class ChampagneTower {
	
	public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] g = new double[1 + query_row][1 + query_row];
        g[0][0] = poured;
        for (int i = 0; i < query_row; i++){
            for (int j = 0; j <= i; j++){
                if (g[i][j] > 1){
                    double p = (g[i][j] - 1.0) / 2;
                    g[i + 1][j] += p;
                    g[i + 1][j + 1] += p;
                }
            }
        }
        return Math.min(1.0, g[query_row][query_glass]);
    }

	public static void main(String[] args) {
		
		ChampagneTower c = new ChampagneTower();
		c.champagneTower(5, 3, 2);
	}

}
