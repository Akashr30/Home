package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstruction {
	
	public static void main(String[] arsd) {
		
		int[][] people =  {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}} ;
		
		/*Arrays.sort(people,new Comparator<int[]>(){
	           @Override
	           public int compare(int[] o1, int[] o2){
	               return o1[0]!=o2[0]?o1[0]-o2[0]:o1[1]-o2[1];
	           }
	        });*/
		
		Arrays.sort(people, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] != o2[0] ? -(o1[0]-o2[0]) : o1[1]-o2[1];
			}
		});
	        List<int[]> res = new ArrayList<>();
	        for(int[] cur : people){
	            res.add(cur[1],cur);       
	        }
	        System.out.println ( res.toArray(new int[people.length][]));
	}

}
