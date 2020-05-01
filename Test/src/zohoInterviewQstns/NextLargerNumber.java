package zohoInterviewQstns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Elements {
    
    int pos;
    long val;
    
    Elements(int x , long y) {
        pos = x;
        val = y;
    }
}

public class NextLargerNumber {
	public static void main (String[] args)
	 {
//	    Scanner sc = new Scanner(System.in);
//	    int test = Integer.parseInt(sc.nextLine());
	    
//	    while (test-- > 0) {
	        
	        int len = 4;
	        Elements[] ele = new Elements[len];
	        String str = "1 3 2 4";
//	        String str = "4 3 2 1";
	        long[] arr = Arrays.stream(str.split(" ")).mapToLong(Long::parseLong).toArray();
	        ArrayList<Elements> al = new ArrayList<>();
	        ArrayList<Elements> al1 = new ArrayList<>();
	        al.add(new Elements(0,arr[0]));
	        int count = 1;
	        for (int i = 1 ; i < arr.length ; i++) {
	            Elements e = new Elements(count,arr[i]);
	            if (e.val > al.get(al.size()-1).val) {
	            	while (al.size() > 0 && e.val > al.get(al.size()-1).val) {
		                al.get(al.size()-1).val = e.val;
		                al1.add(al.get(al.size()-1));
		                al.remove(al.size()-1);
	            	}
	            	al.add(e);
	            } else {
	                al.add(e);
	            }
	            
	            count++;
	        }
	        int x = al.size();
	        while (x > 0) {
	            Elements a = al.get(x-1);
	            a.val = -1;
	            al1.add(a);
	            x--;
	        }
	        StringBuffer sb = new StringBuffer();
	        long[] arr1 = new long[al1.size()];
	        for (int i = 0 ; i < al1.size() ; i++) {
//	        	sb.append(al1.get(i).val).append(" ");
	        	long z = al1.get(i).pos;
	        	arr1[(int) z] = al1.get(i).val;
	        }
	        for (long a : arr1)
	        	sb.append(a+" ");
	        
	        System.out.println(sb);
	        
//	    }
	 }
}
