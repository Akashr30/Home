package zohoInterviewQstns;

import java.util.Arrays;

public class Sum2Arrays {
	
	public static void main(String[] ar) {
        
        String len = "42 30";
        int[] lengths = Arrays.stream(len.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        String n1 = "4 0 9 4 8 8 2 4 5 5 1 7 1 1 5 2 7 6 1 4 2 3 2 2 1 6 8 5 7 6 1 8 9 2 7 9 5 4 3 1 2 3";
        String n2 = "3 4 1 1 3 8 7 4 2 7 7 9 3 1 9 8 6 5 0 2 8 6 0 2 4 8 6 5 0 9";
        
        int[] num1 = Arrays.stream(n1.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] num2 = Arrays.stream(n2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = 0;
        
        if (lengths[0] > lengths[1]) {
            max = lengths[0];
        } else {
            max = lengths[1];
        }
        StringBuffer sb = new StringBuffer();
        int n1Counts = num1.length-1;
        int n2Counts = num2.length-1;
        int temp = 0;
        while (max >= 0) {
            
            int val1 = n1Counts >= 0 ? num1[n1Counts] : 0;
            int val2 = n2Counts >= 0 ? num2[n2Counts] : 0;
            
            if (n1Counts >= 0 || n2Counts >= 0) {
	            int sum = val1+val2+temp;
	            
	            if (sum < 10) {
	                sb.append(sum+" ");
	                temp = 0;
	            } else {
	                temp = sum/10;
	                int rem = sum % 10;
	                sb.append(rem+" ");
	            }
            }
            n1Counts--;
            n2Counts--;
            max--;
        }
        System.out.println(sb.reverse().toString());
        
	}

}
