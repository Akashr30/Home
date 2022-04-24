package com.mypractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import org.apache.catalina.tribes.group.AbsoluteOrder;
import org.apache.catalina.tribes.group.AbsoluteOrder.AbsoluteComparator;

public class StringPrograms {
	static int n1=0, n2=1, n3=0;
	public static void main(String[] args) {
		
		//String Reverse
//		String str = "Deva";
//		for(int i = str.length(); i > 0; i--) {
//			System.out.println(str.charAt(i-1));
//		}
//		
		//Roman Number to Integer
		
//		Map<String, Integer> roman = new HashMap<>();
//		roman.put("I", 1);
//		roman.put("V", 5);
//		roman.put("X", 10);
//		roman.put("L", 50);
//		roman.put("C", 100);
//		roman.put("D", 500);
//		roman.put("M", 1000);
//		
//		Scanner input = new Scanner(System.in);
//		String inputElement = input.nextLine();
//		
//		if(roman.containsKey(inputElement)) {
//			System.out.println(roman.get(inputElement));
//		}else if(roman.containsValue(Integer.parseInt(inputElement))) {
//				for(Entry<String, Integer> entry : roman.entrySet()) {
//					if(entry.getValue().equals(Integer.parseInt(inputElement))) {
//						System.out.println(entry.getKey());
//					}
//				}
//		}else {
//			System.out.println("Input Element not Found");
//		}
		
		//Closest String
		
//		List<String> str2 = Arrays.asList("the", "quick", "brown", "fox", "quick");
////		Scanner firstLine = new Scanner(System.in);
////		Scanner scndLine = new Scanner(System.in);
//		String input1 = "the";
//		String input2 =  "brown";
//		int firstInputindex = -1;
//		int scndInputIndex = -1;
//		
//		for(int i=0; i<=str2.size(); i++) {
//			if(input1.equals(str2.get(i))) {
//				firstInputindex = i;
//			}
//			if(input2.equals(str2.get(i))) {
//				scndInputIndex = i;
//			} 
//			
//			if(firstInputindex >=0 && scndInputIndex >=0) {
//				 System.out.println(Math.abs(firstInputindex - scndInputIndex));
//				break;
//			}
//		}
		
		//Divisible by 7
		
		String input = "1000";
		
		Long inputVal =Long.parseLong(input);
		if(inputVal % 7 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		
		//Swap number without 3rd number
		
		int a =10;
		int b = 20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A value" + a);
		System.out.println("B value" + b);
		
		// String contains vowels
		
		String val = "hello";
		
		System.out.println(val.toLowerCase().matches(".*[aeiou].*"));
		
		
		//prime number
		
		int isprime = 19;
		
		for(int i=2; i <= isprime/2; i++) {
			if(isprime % i == 0 ) {
				System.out.println("Not a prime");
			}
		}
		
		//fibonacci series with recurssion
//		System.out.print(n1+ " "+ n2 + " ");
//		fibo(10-2);
		
		// fibo without recurrsion
		System.out.print("without Recurrsion" + n1+ " "+ n2 + " ");
		for(int i=0; i< 10; i++ ) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print( n3 + " ");
		}
		
	}
	static void fibo(int count) {
		if(count > 0) {
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		System.out.print(n3+ " ");
		fibo(count - 1);
		}
	}
	
	

}
