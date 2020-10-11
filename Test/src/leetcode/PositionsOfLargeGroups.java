package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PositionsOfLargeGroups {
	
	// does not work
	public static List<List<Integer>> largeGroupPositions(String S) {
        // char[] S = s.toCharArray();
        // Arrays.sort(S);
        boolean[] chIdx = new boolean[26];
        int[][] counts = new int[26][2];
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = null;
        
        int prev = 0;
        for (int i = 0 ; i < S.length() ; i++) {
            int val = S.charAt(i) -'a';
            
            if (!chIdx[val]) {
                // chIdx[val] = S.charAt(i);
                counts[val][0] = i;
                counts[val][1]++;
            }
            if (prev != val)
                chIdx[prev] = true;
            
            prev = val;
        }
        
        for (int i = 0 ; i < 26 ; i++) {
            list = new ArrayList<>();
            
            if (counts[i][1] >= 3) {
                list.add(counts[i][0]-counts[i][1]+1);
                list.add(counts[i][0]);
                res.add(list);
            }
            
        }
        
        Collections.sort(res , new Comparator<List<Integer>>() {
            
            public int compare(List<Integer> o1 , List<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
            
        });
        
        return res;
    }

	public static void main(String[] args) {
		String s = "abcdddeeeeaabbbcd";
		largeGroupPositions(s);
	}

}
