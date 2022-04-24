package leetcode;

import java.util.Arrays;

public class DistanceBetweenBusStops {
	
	public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        
        int total = Arrays.stream(distance).sum();
        int sum = 0;
        int diff = Math.abs(destination-start);
        int n = distance.length;
        if (start > destination) {
        	int temp = start;
        	start = destination;
        	destination = temp;
        }
        for (int i = start ; i < destination ; i++) {
        	sum += distance[i];
        }
        
        return total-sum > sum ? sum : total-sum;
    }
	
	public static void main(String[] ar) {
		
		int[] arr = {7,10,1,12,11,14,5,0};
		int s = 7;
		int des = 2;
		distanceBetweenBusStops(arr,s,des);
	}

}
