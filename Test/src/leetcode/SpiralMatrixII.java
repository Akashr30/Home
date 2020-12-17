package leetcode;

public class SpiralMatrixII {
	
    public static int[][] generateMatrix(int n) {
        
        int[][] arr = new int[n][n];
        int c = 1;
        
        int right = 0;
        int sideRun = n;
        int downRun = n;
        int leftBorder = 0;
        int bottomTopIdx = 0;
        while (true) {
            
        	int rightJ = right;
            for (;rightJ <= sideRun-1 ; rightJ++) {
                arr[right][rightJ] = c++;
            }
            
            right++;
            int down = right;
            int downJ = rightJ-1;
            for (;down <= downRun-1 ; down++) {
                arr[down][downJ] = c++;
            }
            downRun--;
            
            int bottomLeft = downJ;
            int bottomIdx = bottomLeft-1;
            for (;bottomIdx >= leftBorder ; bottomIdx--) {
                arr[bottomLeft][bottomIdx] = c++;
            }
            
            int bottomTop = bottomLeft-1;
            
            for (;bottomTop >= right ; bottomTop--) {
                arr[bottomTop][bottomTopIdx] = c++;
            }
            if (c > n*n)
                break;
            bottomTopIdx++;
            leftBorder++;
            sideRun--;
        }
        return arr;
    }

	public static void main(String[] args) {
		
		int n = 6;
		generateMatrix(n);

	}

}
