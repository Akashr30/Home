package leetcode;

import java.util.TreeMap;

// did not work..need to generate combinations
class Combination {
    
    TreeMap<String,Integer> res ;
    int count ;
    public Combination(String str, int combinationLength) {
        res = new TreeMap<>();
        count = 0;
        String s = "";
        int n = str.length();
        for (int i = 0 ; i < n ; i++) {
            s = str.charAt(i)+"";
            for (int j = i+1 ; j < n;j++) {
            	if (j+combinationLength-1 > n)
            		break;
                String temp = str.substring(j,j+combinationLength-1);
                res.put(s+temp,combinationLength);
                temp= "";
            }
        }
        
    }
    
    public String next() {
        java.util.Map.Entry<String,Integer> ent = res.firstEntry();
        count++;
        return ent.getKey();
    }
    
    public boolean hasNext() {
        return count < res.size();
    }
}

public class CombinationIterator {

	public static void main(String[] args) {
		
		String s = "chp";
		int n = 1;
		Combination c = new Combination(s,n);

	}

}
