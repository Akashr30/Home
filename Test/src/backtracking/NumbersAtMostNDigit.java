package backtracking;

import java.util.HashSet;

public class NumbersAtMostNDigit {

    HashSet<String> res;
    public int atMostNGivenDigitSet(String[] digits, int n) {
        res = new HashSet<>();
        find(digits,n,new StringBuilder());
        return res.size();
    }
    
    
    private void find(String digits[],int n,StringBuilder sb) {
        
        if (sb.length() > 0 && Integer.parseInt(sb.toString()) > n)
            return;
        
        for (int i = 0 ; i < digits.length ; i++) {
            sb.append(digits[i]);
            if (sb.length() > 0 && Integer.parseInt(sb.toString()) <= n) {
                res.add(sb.toString());
            }
            find(digits,n,sb);
            sb.deleteCharAt(sb.toString().length()-1);
        }
    }

	public static void main(String[] args) {
		
		String[] digits = {"1","3","5","7"};
		int n = 1000;
		System.out.println(new NumbersAtMostNDigit().atMostNGivenDigitSet(digits,n));
	}

}
