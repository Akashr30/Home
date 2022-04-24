package leetcode;

import java.util.HashMap;

public class FirstRepeatingElement {
	
	public static int find(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int pos = Integer.MAX_VALUE;
        for (int i= 0 ; i < arr.length ; i++) {
            
            if (map.containsKey(arr[i])) {
                pos = Math.min(pos,map.get(arr[i]));
            } else {
                map.put(arr[i],i+1);
            }
        }
        return pos;
    }
	

	public static void main(String[] args) {
		
//		int[] arr = {1,5,3,4, 3, 5, 6};
		int[] arr = {1,1,2,2,3,3};
		System.out.println(find(arr));
	}

}
