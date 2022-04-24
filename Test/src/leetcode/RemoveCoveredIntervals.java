package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveCoveredIntervals {
	
	public static int removeCoveredIntervals(int[][] intervals) {
		
		Arrays.sort(intervals, (o1,o2) -> Integer.compare(o2[1], o1[1]));
        
        List<int[]> ls = new ArrayList<>();
        ls.add(new int[]{intervals[0][0],intervals[0][1]});
        for (int i = 1 ; i < intervals.length ; i++) {
            
            if (intervals[i-1][0] >= intervals[i][0] && intervals[i][1] >= intervals[i-1][1]) {
                continue;
            } else {
                ls.add(new int[]{intervals[i][0],intervals[i][1]});
            }
        }
        
//        if (intervals[intervals.length-2][0] <= intervals[intervals.length-1][0] &&
//            intervals[intervals.length-2][0] >= intervals[intervals.length-1][0])
//            ls.add(new int[]{intervals[intervals.length-1][0],intervals[intervals.length-1][1]});
        
        return ls.size();
    }

	public static void main(String[] args) {

		int[][] arr = {{1,4},{3,6},{2,8}};
		removeCoveredIntervals(arr);
	}

}
