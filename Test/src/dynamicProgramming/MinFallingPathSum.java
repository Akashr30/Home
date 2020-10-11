package dynamicProgramming;

public class MinFallingPathSum {
	
    /*public static int minFallingPathSum(int[][] A) {
    	int ans = Integer.MAX_VALUE;
        for (int i = A[0].length-1 ; i >= 0  ; i--) {
           ans = Math.min(ans,find(A,A.length-1,i,0));
        }
        return ans;
    }
    
    
    public static int find(int[][] A,int m,int n,int sum) {
        
        if (m < 0 || n < 0 || n == A[0].length )
            return sum;
        int count = Integer.MAX_VALUE;
        
        count = Math.min(count,Math.min(find(A,m-1,n,sum+A[m][n]),Math.min(find(A,m-1,n-1,sum+A[m][n]),find(A,m,n+1,sum+A[m][n]))));
        
        return count;
        
    }*/
	
	 static int ans = Integer.MAX_VALUE;
	    public static int minFallingPathSum(int[][] A) {
	        for (int i = 0 ; i < A[0].length  ; i++) {
	           ans = Math.min(ans,find(A,0,i,0));
	        }
	        return ans;
	    }
	    
	    private static int find(int[][] A , int m , int n ,int sum) {
	        
	       if (m == A.length || n < 0 || n == A[0].length)
	           return 0;
	        
	        
	        int a1 = find(A,m+1,n,sum+A[m][n]);
	        int a2 = find(A,m+1,n+1,sum+A[m][n]);
	        int a3 = find(A,m+1,n-1,sum+A[m][n]);
	            
	        return A[m][n]+Math.min(a1,Math.min(a2,a3));
	        
	    }

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(minFallingPathSum(arr));

	}

}
