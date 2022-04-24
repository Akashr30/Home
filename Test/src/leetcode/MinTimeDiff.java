package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinTimeDiff {
	
	 public static int findMinDifference(List<String> timePoints) {
	        
	        String str1 = timePoints.get(0);
	        String str2 = timePoints.get(1);
	        
	        int[] arr1 = Arrays.stream(str1.split(":")).mapToInt(Integer::parseInt).toArray();
	        int[] arr2 = Arrays.stream(str2.split(":")).mapToInt(Integer::parseInt).toArray();
	        
	        int zero = 1440;
	        int min = Integer.MAX_VALUE;
	        if (arr1[0] < 12 && arr2[0] > 12) {
	            int val1 = zero+arr1[0]*60+arr1[1];
	            int val2 = arr1[0]*60+arr1[1];
	            int time2 = arr2[0]*60+arr2[1];
	            min = Math.min(Math.abs(time2-val1),Math.abs(time2-val2));
	        } else if (arr2[0] < 12 && arr1[0] > 12) {
	            int val1 = zero+arr2[0]*60+arr2[1];
	            int val2 = arr2[0]*60+arr2[1];
	            int time2 = arr1[0]*60+arr1[1];
	            min = Math.min(Math.abs(time2-val1),Math.abs(time2-val2));
	        } else {
	            min = Math.abs((arr1[0]*60+arr1[1])-(arr2[0]*60+arr2[1]));
	        }
	        return min;
	    }
	 public static void main(String[] ar) {
		 
		 List<String> list = new ArrayList<>();
		 list.add("10:00");
		 list.add("13:00");
		 findMinDifference(list);
	 }
}
