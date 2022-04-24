package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
class ABCD {
	
	int x ;
	String str = "";
	ABCD(){}
	public ABCD(int x, String str) {
		this.x = x;
		this.str = str;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		ABCD ab = (ABCD)obj;
		return ab.x == this.x;
	}
	
	@Override
	public int hashCode() {
		return this.x;
	}
}
public class MaxNumberofKSumPairs {
	
	MaxNumberofKSumPairs df = new MaxNumberofKSumPairs();
	public static int maxOperations(int[] nums, int k) {
        
        int count = 0;
         HashMap<Integer,Integer> map = new HashMap<>();
         for (int x : nums) {
            int val = k-x;
        	 if (map.containsKey(val) && map.get(val) > 0) {
        		 map.put(val, map.get(val)-1);
        		 count++;
        	 } else {
        		 map.put(x, 1);
        	 }
            
         }
        return count;
    }
	static HashMap<Integer,Integer> m1() {
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(1, 3);
		return (HashMap<Integer, Integer>) Collections.unmodifiableMap(map);
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int num = 5;
		maxOperations(arr,num);
		int[] arrr = new int[100000000];
		double mb = 1024*1024;
		Runtime r = Runtime.getRuntime();
		System.out.println(r.maxMemory()/mb);
		System.out.println(r.totalMemory()/mb);
		System.out.println(r.freeMemory()/mb);
//		HashMap<Integer,Integer> map = m1();
//		map.put(1, 5);
//		map.put(4, 5);
		/*HashMap<Integer,Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(1, 3);
		map = (HashMap<Integer, Integer>) Collections.unmodifiableMap(map);
		map.put(1, 5);
		map.put(4, 5);*/
		Integer a = 34;
		Integer b = 34;
		System.out.println(a==b);
		
		char i = 'z';
		while (i>>>1>1) {
			System.out.println(i--);
		}
		MaxNumberofKSumPairs sd = null;
		sd.maxOperations(arr, num);
		
		TreeMap<ABCD,Integer> map = new TreeMap<>();
		TreeMap<List<Integer>,Integer> map1 = new TreeMap<>();
		
		for (int z = 0 ; z < 100 ; z++) {
			map.put(new ABCD() ,5);
		}
		
		
		
	}

}
