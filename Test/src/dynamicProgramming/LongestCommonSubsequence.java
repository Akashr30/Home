package dynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence {
	
	public static int commonSubsequence(String s1 , String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int[][] dp = new int[ch1.length][ch2.length];
		for (int i = 0 ; i < ch1.length ; i++) {
			Arrays.fill(dp[i],-1);
		}
		return find(ch1,ch2,ch1.length,ch2.length,dp);
	}
	
	static int find(char[] ch1 , char[] ch2 , int m , int n , int[][] dp) {
		
		if (m == 0 || n == 0)
			return 0;
		
		if (dp[m-1][n-1] != -1)
			return dp[m-1][n-1];
		
		if (ch1[m-1] == ch2[n-1]) {
			return dp[m-1][n-1] = find(ch1,ch2,m-1,n-1,dp)+1;
		} else {
			return dp[m-1][n-1] = Math.max(find(ch1,ch2,m-1,n,dp), find(ch1,ch2,m,n-1,dp));
		}
		
	}
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "aed";
		int num = commonSubsequence(s1,s2);
		System.out.print(num);
	}
}
