package leetcode;

public class WordSearch {

    static String val;
    public static boolean exist(char[][] board, String word) {
        
        char[] arr = word.toCharArray();
        val = word;
        for (int i = 0 ; i < board.length ; i++) {
            for (int j = 0 ; j < board[0].length ; j++) {
                if (board[i][j] == arr[0]) {
                    
                  boolean flag = find(board,i,j,arr,"",0);
                    if (flag)
                        return true;
                }
            }
        }
        return false;
    }
    
    static boolean find(char[][] board,int i , int j ,char[] arr , String str,int k) {
        
        if (i >= board.length || j >= board[0].length || j < 0 || k >=arr.length)
            return false;
        
        if (board[i][j] != arr[k])
            return false;
        
        if (str.equals(val))
            return true;
        
         return find(board,i+1,j,arr,""+arr[k],++k) || find (board,i,j+1,arr,""+arr[k],++k) 
                || find (board,i,j-1,arr,""+arr[k],++k);
    }
    
    public static void main(String[] ar) {
    	
    	char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
    	String str = "SEE";
    	System.out.print(exist(board,str));
    }

}
