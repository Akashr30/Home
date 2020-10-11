package leetcodeWeeklyContestDiscussion;

import java.util.Arrays;

public class MinimumNumberOfDaysToEatOranges {
    public static int minDays(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = find(n , dp);
        return ans;
        
    }
    
    static int find (int n , int[]dp) {
        if (n <= 0)
            return 0;
        
        if (dp[n] != -1)
            return dp[n];
        
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        if (n%2 == 0)
            b = 1+find(n-(n/2),dp);

        if (n%3 == 0)
            c = 1+find(n - (2*(n/3)),dp);
        
        a = 1+find(n-1,dp);
        
        
        return dp[n] = Math.min( a ,Math.min (b,c));
    }
    
    public static void main(String[] at) {
    	
    	int n = 50;
    	System.out.println(minDays(n));
    }
}
