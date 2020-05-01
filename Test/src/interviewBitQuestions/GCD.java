package interviewBitQuestions;

import java.util.ArrayList;

public class GCD {

	public static void main(String[] args) {

        int ans = 0;
        int A = 6;
        int B = 4;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        for (int i = 1 ; i <= A ; i++ ) {
            if (A%i == 0)
                a.add(i);
        }
        
        for (int i = 1 ; i <= B ; i++ ) {
            if (B%i == 0)
                b.add(i);
        }
        
        for (int i = a.size()-1 ; i >= 0 ; i-- ) {
            if (b.contains(a.get(i))) {
                ans = a.get(i);
                break;
            }
        }
        
        System.out.println(ans); 
    

	}

}
