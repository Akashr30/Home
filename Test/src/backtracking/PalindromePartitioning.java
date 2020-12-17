package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
	
	
    List<List<String>> res ;
    StringBuilder sb = new StringBuilder();
    public List<List<String>> partition(String s) {
        
        res = new ArrayList<>();
        boolean[] arr = new boolean[s.length()];
        find(0,s,arr,new ArrayList<>());
        return res;
    }
    
    public void find(int st ,String s,boolean[] arr,List<String> ar) {
        
        
        if (st >= s.length()) {
            res.add(new ArrayList<>(ar));
            return;
        }
        for (int i = st ; i < s.length() ; i++) {
        
            String temp = s.substring(st,i+1);
            String rev = sb.append(temp).reverse().toString();
            sb.setLength(0);
            if (temp.length() != 0 && temp.equals(rev)) {
                ar.add(temp);
                find(i+1,s,arr,ar);
                if (ar.size() > 0)
                    ar.remove(ar.size()-1);
            }
        }
        
    }

	public static void main(String[] args) {
		
		String s = "abbab";
		PalindromePartitioning pp = new PalindromePartitioning();
		long num = Integer.MAX_VALUE;
		long num1 = Long.MIN_VALUE;
		num = num+10000;
		int n = 5;
		System.out.println((long)n < num);	
		System.out.println(pp.partition(s));;
	}

}
