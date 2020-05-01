package interviewBitQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReArrangeArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList( 4, 0, 2, 1, 3));
		
	   /*for (int i = 0 ; i < a.size(); i++) {
            
            for (int j = i ; j < a.size();j++) {
                
                if (i == a.get(j))
                    break;
                    
                 Collections.swap(a, a.get(i), a.get(j));
//                 Collections.swap(a, i, j);
                
                
            }
            
        }
	   for (int a1 : a)
	   System.out.println(a1);*/
		
		Collections.sort(a, new Comparator<Integer>(){
	           @Override
	           public int compare(Integer a  , Integer b){
	               return -a.compareTo(b);
	           }

	        });
		
		System.out.println(Integer.MIN_VALUE);
		
	}

}
