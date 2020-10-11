package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PartitionLabels {
	
	public static List<Integer> partitionLabels(String S) {
        
		int[] lastIndex = new int[26];
        for (int i = 0; i < S.length(); i++)
            lastIndex[S.charAt(i) - 'a'] = i;

        List<Integer> result = new ArrayList();
        int j = 0, subStrStart = 0;
        for (int i = 0; i < S.length(); i++) {
            j = Math.max(j, lastIndex[S.charAt(i) - 'a']);
            if (i == j) {
                result.add(i - subStrStart + 1);
                subStrStart = i + 1;
            }
        }

        return result;
    }

	public static void main(String[] args) {
		
		String s = "ababcbacadefegdehijhklij";
		partitionLabels(s);
	}

}
