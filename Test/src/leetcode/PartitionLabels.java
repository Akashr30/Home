package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PartitionLabels {
	
	public static List<Integer> partitionLabels(String S) {
        
//		int[] lastIndex = new int[26];
//        for (int i = 0; i < S.length(); i++)
//            lastIndex[S.charAt(i) - 'a'] = i;
//
//        List<Integer> result = new ArrayList();
//        int j = 0, subStrStart = 0;
//        for (int i = 0; i < S.length(); i++) {
//            j = Math.max(j, lastIndex[S.charAt(i) - 'a']);
//            if (i == j) {
//                result.add(i - subStrStart + 1);
//                subStrStart = i + 1;
//            }
//        }
//		 return result;
		
		List<Integer> res = new ArrayList<>();
        
        int[] table = new int[26];
        char[] stc = S.toCharArray();
        for(char c:stc)//count the occurence of each char in string
            table[c-'a']++;
        
        int i = 0, j = 0, l = S.length(), counter = 0;
        HashSet<Character> hs = new HashSet<>();
        while(j < l){
            char c = stc[j];
            if(!hs.contains(c)){// found new char in current window, so increase counter
                hs.add(c);
                counter++;
            }
            table[c-'a']--;
            j++;
            if(table[c-'a'] == 0){ // decrease the counter as we have exhausted the c char and remove char c from set
                counter--;
                hs.remove(c);
            }
            if(counter == 0){//if counter becomes 0, means current window is a partition
                res.add(j - i);//add length of current window
                i = j;// reset i for next window
            }            
        } 
        return res;
    }

	public static void main(String[] args) {
		
		String s = "aacacabdefegdehijhklij";
		partitionLabels(s);
	}

}
