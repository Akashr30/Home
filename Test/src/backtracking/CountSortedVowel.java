package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CountSortedVowel {
	
	int count ;
	List<List<Character>> res;
    public int countVowelStrings(int n) {
    	res = new ArrayList<>();
        char arr[] = {'a','e','i','o','u'};
        count = 0;
        find(n,arr,0,new ArrayList<>());
        return count;        
    }
    
    private void find(int n , char[] arr , int idx ,List<Character> list) {
        
        if (list.size() == n) {
        	res.add(new ArrayList<>(list));
            count++;
//            return;
        }
        
        for (int i = idx ; i < 5 ; i++) {
            list.add(arr[i]);
            find(n,arr,i,list);
            
            if (list.size() > 0)
                list.remove(list.size()-1);
        }
    }

	public static void main(String[] args) {
		
		int n = 2;
		System.out.println(new CountSortedVowel().countVowelStrings(n));
		int c = 0;
	}

}
