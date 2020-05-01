package stack;

import java.util.ArrayList;

public class LongestvalidParanthesis {

	public static int validParan(String str) {
		
		String[] arr = str.split("");
		int[] num = new int[arr.length];
		int max = 0;
		int count = 0;
		for (int i = 1 ; i < arr.length ; i++) {
			if (arr[i].equals(")")) {
				for (int j = i-1 ; j >=0 ; j--) {
					if (num[j]==0 && arr[j].equals("(")) {
						num[j] = 1;
;						num[i] = 1;
						break;
					} else if (num[j] == 1) {
						continue;
					}
				}
			} 
			
		}
		
		for (int i = 0 ; i < num.length ; i++) {
			if (num[i] == 1) {
				count++;
			} else {
				if (count >= max) {
					max = count;
				}
				count = 0;
			}
		}
		
		if (count >= max)
			max = count;
		
		return max;
	}
     
     
	public static void main (String[] args)
	 {
//        Scanner sc = new Scanner(System.in);
//        int test = Integer.parseInt(sc.nextLine());
        
//        while (test-- > 0) {
        String str = "()";
//      String str = "((()";
//		String str = ")()())";	?
//		String str = "()(()))))";
//		String str = "((()(())))))()()()";
		System.out.println(validParan(str));
//        }
	 }


}
