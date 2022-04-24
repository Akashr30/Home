package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestTime {
	
	public static String largestTimeFromDigits(int[] A) {
        
		List<Integer> ar = new ArrayList<>();
        
        for (int x : A)
            ar.add(x);
        
        String ans = "";
        
        for (int i = 2 ; i>=0 ; i--) {
            if (ar.contains(i)) {
                ans+= i;
                ar.remove(ar.indexOf(i));
                break;
            } 
        }
        
        if (ans == "")
            return ans;
        
        int i = 0;
        if (ans.equals("0")  || ans.equals("1"))
            i = 9;
        else 
            i = 3;
        for (  ; i >= 0 ;i--) {
            if (ar.contains(i)) {
                ans+= i;
                ar.remove(ar.indexOf(i));
                break;
            }
        }
        
        if (ans.length() == 1)
            return "";
        
        ans += ":";
        
        for (int j = 5 ; j >= 0 ; j--) {
            if (ar.contains(j)) {
                ans+= j;
                ar.remove(ar.indexOf(j));
                break;
            }
        }
        
        if (ans.length() == 3)
            return "";
        
        return ans+ar.get(0);
    }

	public static void main(String[] args) {
		
		int[] arr = {2,0,6,6};
		System.out.println(largestTimeFromDigits(arr));
	}

}
