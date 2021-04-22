package leetcode;

public class DiagonalTraverse {
	
    public int[] findDiagonalOrder(int[][] matrix) {
        
        int len = matrix.length;
        int[] arr = new int[len*matrix[0].length];
        int x = 0,c = 0;
        int horiz = 0;
        while (true) {
            int j = horiz;
            x = 0;
            int st = c;
            while (true) {
                arr[c++] = matrix[x][j];
                j--;
                x++;
                if (x == len || j < 0) {
                    break;
                }
            }
            if (horiz%2 == 0) {
                swap(arr,st,c-1);
            }
            horiz++;
            if (horiz == matrix[0].length)
                break;
        }
        
       
        int vertical = 1;
        if (len != matrix[0].length)
        	vertical = 2;
        
        while (true) {
           int  b = vertical;
           int a = len-1;
           int st = c; 
            while (true) {
                arr[c++] = matrix[a][b];
                a--;
                b++;
                if (b >= matrix[0].length || a < 0) 
                    break;
            }
            
            if (len == matrix[0].length && vertical%2 == 1) {
                swap(arr,st,c-1);
            }
            if (len != matrix[0].length && vertical%2 == 0) {
                swap(arr,st,c-1);
            }
            vertical++;
            if (vertical ==  matrix[0].length)
                break;
        }
        
        return arr;
    }
    
    public void swap(int[] arr , int i , int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

	public static void main(String[] args) {
		
//		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		DiagonalTraverse as = new DiagonalTraverse();
		as.findDiagonalOrder(arr);
	}

}
