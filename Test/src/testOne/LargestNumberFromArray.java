package testOne;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFromArray {
	
	public static void sorting(String[] arr) {
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr.length-i-1 ; j++) {
				int temp1 = Integer.parseInt(arr[j]+arr[j+1]);
				int temp2 = Integer.parseInt(arr[j+1]+arr[j]);
				String temp = "";
				if(temp2 > temp1) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] ar) {
		
		int[] nums = {3, 30, 34, 5, 9};
		 String[] arr = new String[nums.length];
		    for(int i=0; i<nums.length; i++){
		        arr[i]=String.valueOf(nums[i]);
		    }
		 
		    /*Arrays.sort(arr, new Comparator<String>(){
		        public int compare(String a, String b){
		            return (b+a).compareTo(a+b);
		        }
		    });*/
		    sorting(arr);
		 
		    StringBuilder sb = new StringBuilder();
		    for(String s: arr){
		        sb.append(s);
		    }
		 
		    while(sb.charAt(0)=='0'&&sb.length()>1)
		        sb.deleteCharAt(0);
		    
		    System.out.println(sb.toString());
	}

}
