package leetcode;

import java.util.HashSet;

public class DivisibleString {
	
	HashSet<String> set ;
	StringBuilder sb = new StringBuilder();
    public int solution(String S) {
        
        set = new HashSet<>();
        String[] arr =  S.split("");
         find(arr);
         return set.size();
        
    }
	    
	    private void find(String[] arr) {
	        
	        int count = 0;
	        for (int i = 0 ; i < arr.length ; i++) {
	        	String temp = arr[i];
	            for (int j = 0 ; j < 10 ; j++) {
	                arr[i] = String.valueOf(j);
	                isDivide(arr);
	                sb.setLength(0);
	            }
	            arr[i]= temp;
	        }
	        return ;
	        
	    }
	    
	    private boolean isDivide(String[] s) {
	        
	        for (String str : s)
	        	sb.append(str);
	        	
	        String num = sb.toString();
	        
	        if (!set.contains(num) && Integer.parseInt(num)%3 == 0) {
	        	System.out.println(num);
	            set.add(num);
	            return true;
	        } else {
	            return false;
		    }
	    }

	public static void main(String[] args) {
		
		DivisibleString a = new DivisibleString();
		String x = "689";
		System.out.println(a.solution(x));
//		String[] arr = x.split("");
		
		

	}

}
