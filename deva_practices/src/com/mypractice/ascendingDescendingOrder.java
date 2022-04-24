package com.mypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ascendingDescendingOrder {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		List<Integer> input = new ArrayList<>();
		String lenAndSum = myObj.nextLine();
//		Integer[] in = {13,2,4,15,12,10,5};
		Integer [] in = Arrays.stream(lenAndSum.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
//		Integer[] result = Stream.of(lenAndSum.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

		
		List<Integer> evenIndex = new ArrayList<>();
		List<Integer> oddIndex = new ArrayList<>();
		for(int i = 0; i< in.length; i++) {
			if(i % 2 == 0) {
				oddIndex.add(in[i]);
			} else {
				evenIndex.add(in[i]);
			}
		}
		
		Collections.sort(oddIndex);
		Collections.sort(evenIndex);
		int x = oddIndex.size()-1;
		int y = 0;
		for(int i=0; i< in.length; i++){
			if (i%2==0) {
				in[i]= oddIndex.get(x);
				x--;
			} else {
				in[i] = evenIndex.get(y++);
			} 
		}
		
		System.out.println(Arrays.deepToString(in));
		
//		String str1 = "test123string";
//		String str2 = "123";
//		
//		System.out.println(str1.indexOf(str2));
	}
	
	
		
		
		
		
//		System.out.println(input[0]);
//		
//		for(int i = 0; i< input.length;) {
//			
////			if(input[i+2]>input.length) {
////				for(int j=1; j<input.length;) {
////					if(input[j+1]> input.length) {
////						break;
////					}
////					if(input[j] > input[j+1]) {
////						int temp = input[j];
////						input[j] = input[j+1];
////						input[j+1] = temp;
////						j = j+1;
////					}else {
////							input[j] = input[j];
////							j = j+1;
////						}
////				}
////			}
//			
//			if(input[i] < input[i+2]) {
//				int temp = input[i];
//				input[i] = input[i+2];
//				input[i+2] = temp;
//				i = i+2;
//			} else {
//				input[i] = input[i];
//				i = i+2;
//			}
//		}
//	}

}
