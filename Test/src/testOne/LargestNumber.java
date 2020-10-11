package testOne;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	
public static String largestNumber(int[] nums) {
	String[] arr =new String[nums.length];
	int c = 0;
	for (int a : nums)
		arr[c++]=String.valueOf(a);
	Arrays.sort(arr,new Comparator<String>(){
           
            public int compare(String o1 , String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        
        for (String x : arr)
            sb.append(x);
        
        return sb.toString();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largestNumber(new int[] {3,30,34,5,9});
	}

}
