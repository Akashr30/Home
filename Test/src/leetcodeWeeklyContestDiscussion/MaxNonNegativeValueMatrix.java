package leetcodeWeeklyContestDiscussion;

	public class MaxNonNegativeValueMatrix {
	
	long max = Integer.MIN_VALUE;
    public int maxProductPath(int[][] grid) {
        
        dfs (grid,0,0,1);
        return max < 0 ? -1 : (int)(max%1000000007);
    }
    
    public void dfs (int[][] grid , int i , int j,long prod) {
        
        if (i == grid.length || j == grid[0].length)
            return;
        
        if (i == grid.length-1 && j == grid[0].length-1){
            max = Math.max(max,prod*grid[i][j]);
        }
        
        if (i==grid.length-1) {
            dfs(grid,i,j+1,prod*grid[i][j]);
        } else if (j==grid[0].length-1) {
            dfs(grid,i+1,j,prod*grid[i][j]);
        }
        
        dfs(grid,i,j+1,prod*grid[i][j]);
        dfs(grid,i+1,j,prod*grid[i][j]);
        
        
    }

	public static void main(String[] args) {

		MaxNonNegativeValueMatrix sd = new MaxNonNegativeValueMatrix();
//		int[][] arr = {{1,-2,1},{1,-2,1},{3,-4,1}};
//		int[][] arr = {{1,3},{0,-4}};
		int[][] arr = {{4,3}};
		sd.maxProductPath(arr);
	}

}
