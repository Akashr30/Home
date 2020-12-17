package com.online;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Athena_Qstn1_17112020 {
	
	public static int find(int x,int[][] arr) {
        int min1 = Integer.MAX_VALUE;
        int prev = x;
        int sum = arr[0][prev];
        for (int i = 1 ; i < arr.length ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                if (min1 >= arr[i][j] && j != prev) {
                    min1 = arr[i][j];
                    prev = j;
                }
            }
        	sum += min1;
            min1 = Integer.MAX_VALUE;
        }
        return sum;
    }

    public static int minCost(List<List<Integer>> cost) {
        int[][] arr = new int[cost.size()][3];
        
        for (int i = 0 ; i < cost.size() ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                arr[i][j] = cost.get(i).get(j);
                // System.out.print(arr[i][j]+" ");
            }
            // System.out.println();
        }  
       
       int val1 = find(0,arr);
       int val2 = find(1,arr);
       int val3 = find(2,arr);
       
       return Math.min(val1,Math.min(val2,val3));
    }

	public static void main(String[] args) {
		
		Athena_Qstn1_17112020 obj = new Athena_Qstn1_17112020();
		List<List<Integer>> al = new ArrayList<>();
		List<Integer> l1  = Arrays.asList(new Integer[]{1,2,3});
		List<Integer> l2  = Arrays.asList(new Integer[]{1,2,3});
		List<Integer> l3  = Arrays.asList(new Integer[]{3,3,1});
		al.add(new ArrayList<>(l1));
		al.add(new ArrayList<>(l2));
		al.add(new ArrayList<>(l3));
		System.out.println(minCost(al));
	}

}
