package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Intervals {
    
    int x;
    int y;
    
    Intervals(int x , int y) {
        this.x = x;
        this.y = y;
    }
}
// test cases with -ve values fails 16/18
public class NonOverLappingIntervals {
	
	public static int eraseOverlapIntervals(int[][] arr) {
        
        List<Intervals> res = new ArrayList<>();
        
        for (int i = 0 ; i < arr.length ; i++) {
            res.add(new Intervals(arr[i][0],arr[i][1]));
        }
        
//        Collections.sort(res , (o1,o2) -> Integer.compare(o1.x, o2.x));
        Collections.sort(res , new Comparator<Intervals>() {

			@Override
			public int compare(Intervals o1, Intervals o2) {
				if ((o1.x == o2.x))
					return Integer.compare(o1.y, o2.y);
				else 
					return Integer.compare(o1.x, o2.x);
			}
        	
        });
        int count = 0;
        
        for (int i = 1 ; i < res.size();) {
            if (res.get(i).x != res.get(i-1).y) {
                count++;
                res.remove(i);
                continue;
            }
                i++;
        }
        return count;
    }

	public static void main(String[] args) {
//		int[][] arr = {{1,2},{2,3},{3,4},{1,3}};
//		int[][] arr = {{1,100},{11,22},{1,11},{2,12}};
		int[][] arr = {{1,2},{2,3},{3,4},{-100,3},{5,7}};
		eraseOverlapIntervals(arr);
	}

}
