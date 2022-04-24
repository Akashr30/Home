 package dynamicProgramming;

import java.util.Arrays;

public class CoinChange {
	static int[][] dp;
    public static int change(int amount, int[] coins) {
//        int[][] dp = new int[coins.length][amount + 1];
        for(int i = 0; i < coins.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return cc(coins, 0, amount, dp);
    }
    
    static int cc(int[] coins, int i, int amount, int[][] dp){
        if(amount == 0) 
        	return 1;
        if(amount < 0 || i == coins.length)
        	return 0;
        if(dp[i][amount-1] != -1) 
        	return dp[i][amount-1];
        
        dp[i][amount-1] = cc(coins, i, amount - coins[i], dp) + cc(coins, i + 1, amount, dp);
        return dp[i][amount-1];
    }
    
    public static void main(String[] args) {
    	
    	int amount = 4;
    	int[] arr = {1,2,3};
    	dp = new int[arr.length][amount ];
    	int counts  = change(amount, arr);
    	System.out.println(counts);
    	
    }
}
