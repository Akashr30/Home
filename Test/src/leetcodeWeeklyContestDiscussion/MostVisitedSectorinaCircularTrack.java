package leetcodeWeeklyContestDiscussion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MostVisitedSectorinaCircularTrack {
	
	public static List<Integer> mostVisited(int n, int[] rounds) {
	
		/*int f = rounds[0], t = rounds[rounds.length-1];
	    List<Integer> ret = new ArrayList<>();
	    for(int i = f;;){
	    	ret.add(i);
	    	if(i == t)break;
	    	i++;
	    	if(i == n+1)i = 1;
	    }
	    Collections.sort(ret);
	    return ret;*/
		HashMap<Integer,Integer> res = new HashMap<>();
		int j = rounds[0];
//        res.put(j,res.getOrDefault(j,0)+1);
//        j++;
        int c = 1;
        while (c != rounds.length){
            while (j != rounds[c]) {
            res.put(j,res.getOrDefault(j,0)+1);
                if (j == n) {
                	j = 1;
                	break;
                }
                j++;
            }
            if (j == n)
            	j = 1;
            if (j == rounds[c])
            	res.put(j,res.getOrDefault(j,0)+1);
            j++;
            c++;
        }
        List<Map.Entry<Integer, Integer>> tempMap = new LinkedList<>(res.entrySet());
        Collections.sort(tempMap,(o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        List<Integer> al = new ArrayList<>(); 
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> x :res.entrySet()) {
            if (x.getValue()>=max) {
                al.add(x.getKey());
                max = x.getValue();
            }
            else 
                break;
        }
        
        return al;
	}

	public static void main(String[] args) {
		
//		int n = 4;
//		int[] arr = {1,3,1,2};
		/*int n = 7;
		int[] arr = {1,3,5,7};*/
		int n = 2;
		int[] arr = {2,1,2,1,2,1,2,1,2};
		System.out.println(mostVisited(n,arr));

	}

}
