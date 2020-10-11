package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class CarPooling {
	
    public static boolean carPooling(int[][] trips, int capacity) {
        
//        int num = 0;
//        Arrays.sort(trips, new Comparator<int[]>(){
//           
//            public int compare(int[] o1 ,int[] o2) {
//                return Integer.compare(o1[1],o2[1]);
//            }
//        });
//        
//        TreeMap<Integer,Integer> map = new TreeMap<>();
//        map.put(trips[0][2],trips[0][0]);
//        num += trips[0][0];
//        for (int i = 1 ; i < trips.length ; i++) {
//            Integer temp = map.floorKey(trips[i][1]);
//            if (!map.containsKey(trips[i][1])) {
//                if (temp != null) {
//                	num -= map.get(temp);
//                	map.remove(temp);
//                }
//                map.put(trips[i][2],trips[i][0]);
//                num += trips[i][0];
//                
//            } else {
//                num -= map.get(trips[i][1]);
//                if (temp != null) {
//                	num -= map.get(temp);
//                	map.remove(temp);
//                }
//                num += trips[i][0];
//                map.put(trips[i][2],trips[i][0]);
//            }
//            
//            if (num > capacity)
//                return false;
//            
//        }
//        
//        return true;
    	/* int[] timestamp = new int[1001];
         for(int[] t : trips) {
             timestamp[t[1]] += t[0];
             timestamp[t[2]] -= t[0];
         }
         
         for (int number : timestamp) {
             capacity -= number;
             if(capacity < 0)
                 return false;
         }
         
         return true;*/
    	int num = 0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Arrays.sort(trips, new Comparator<int[]>(){
            public int compare(int[] o1 ,int[] o2) {
                return Integer.compare(o1[1],o2[1]);
            }
        });
       
        for (int i = 0 ; i < trips.length ; i++) {
            
            if (!map.containsKey(trips[i][2])) {
                num += trips[i][0];
                map.put(trips[i][2],trips[i][0]);
            } else {
                map.put(trips[i][2],map.getOrDefault(trips[i][2],0)+trips[i][0]);
                num += trips[i][0];
            }
            
            while (map.floorKey(trips[i][1]) != null) {
                   num -= map.get(map.floorKey(trips[i][1]));
                    map.remove(map.floorKey(trips[i][1]));
                }
             if (num > capacity)
                return false;
        }
        
        return true;
    }

	public static void main(String[] args) {
		
//		int[][] arr = {{3,2,7},{3,7,9},{8,3,9}};
//		int[][] arr = {{2,1,5},{3,3,7}};
		int[][] arr = {{10,5,7},{10,3,4},{7,1,8},{6,3,4}};
		int n = 24;
		carPooling(arr,n);
	}

}
