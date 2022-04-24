package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Online2 {
	
    public static String featuredProduct(List<String> products) {
        
        TreeMap<String,Integer> map = new TreeMap<>();
        List<String> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (String s : products) {
        	map.put(s,map.getOrDefault(s,0)+1);
            if (map.containsKey(s)) {
                max = Math.max(max, map.get(s));
            }
        }
        
        for (String s : map.keySet()) {
            if (map.get(s) == max) {
                res.add(s);
            }
        }
        
        Collections.sort(res);
        
        return res.get(res.size()-1);

    }
    /*public int hashCode() {
    	return 10;
    }*/
	
    public String toString() {
    	return getClass().getName()+"@"+Integer.toHexString(hashCode());
    }
    
	public static void main(String[] ar) {
		
		String[] s = {"yellowShirt",
				"redHat",
				"blackShirt",
				"bluePants",
				"redHat",
				"pinkHat",
				"blackShirt",
				"yellowShirt",
				"greenPants",
				"greenPants"};
		featuredProduct(Arrays.asList(s));
		
	}

}
//if (m == arr.length-1) {
//     return arr[m][n]+find(arr,m,n+1);
// }

// if (n == arr[0].length-1){
//     return arr[m][n]+find(arr,m+1,n);
// }

//
//1 2 2
//2 2 1
//2 1 2

/*
 public static int minCost(List<List<Integer>> cost) {
        int[][] arr = new int[100][3];
        int[][] dp = new int[100][3];
        for (int i = 0 ; i < cost.size() ; i++) {
            for (int j = 0 ; j < cost.get(0).size() ; j++) {
                arr[i][j] = cost.get(i).get(j);
                dp[i][j] = -1;
            }
        }
        int ans = find(arr,0,0,dp);
        return ans;
    }
    
    private static int find(int[][] arr , int m , int n,int[][] dp) {
        
        if (m >= arr.length || n >= arr[0].length)
            return 0;
        if (dp[m][n] != -1)
            return dp[m][n];
       
        return dp[m][n] = arr[m][n]+Math.min(find(arr,m+1,n,dp),find(arr,m,n+1,dp));
    }
 */
 