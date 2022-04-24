package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class ArraySubSetOrNot {
	
	public static String find(int[] arr1 , int[] arr2) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr2){
            set.add(x);
        }
        
        for (int x : arr1) {
            
            if (set.contains(x)) {
                set.remove(x);
            }
        }
        System.out.println(set.size());
        System.out.println();
        for (int x : set) {
           System.out.print(x+" "); 
        }
        return set.size() > 0 ? "No" : "Yes";
    } 

	public static void main(String[] args) {
		
		String s = "8 4 5 3 1 7 9";
		String s1 = "5 1 3 7 9";
		int[] arr1 = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(s1.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println(find(arr1,arr2));
	}

}
