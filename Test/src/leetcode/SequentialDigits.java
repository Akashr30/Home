package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {
	
    public static List<Integer> sequentialDigits(int low, int high) {List<Integer> res = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    List<Integer> ans2 = new ArrayList<>();
    res.add(12);
    ans.add(12);
     int num = 12;
    if (high < 100) {
        while (num < high) {
            num += 11;
            res.add(num);
        }
    } else {
        while (num < 89) {
            num += 11;
            res.add(num);
            ans.add(num);
        }
    }
    int tenP = 10;
    int product = 3;
    int x = 7;
    for (int i = 0 ; i < res.size();i++) {
         int ten = tenP;
         int prod = product;
        int val = res.get(i);
        int p = x;
        // ans.add(val);
        while (val < high && p > 0) {
           
            val = val*ten+prod;
            prod++;
//            ten *= 10;
            if (val > high) {
                break;
            } else {
                ans.add(val);
            }
             p--;
        }
        product++;
        x--;
    }
    Collections.sort(ans);
    
    for (int i : ans) {
    	if ( i >= low && i < high) {
    		ans2.add(i);
    	}
    }
    return ans2;
    }

	public static void main(String[] args) {
		int st = 234;
		int end = 20000;
		sequentialDigits(st,end);

	}

}
