package com.mypractice;

import java.util.ArrayList;
import java.util.List;

public class findSubstring {

	public static void main(String[] args) {
		String str1 = "1234567str";
		String str2 = "stra";
		boolean flag = true;
		int i = 0;
		int j = 0;
		List<Integer> stringList = new ArrayList();
		
		while(i < str1.length()) {
			while (j < str2.length()) {
				if(str1.charAt(i) == str2.charAt(j)) {
					j++;
					i++;
					flag = true;
				}else {
					flag = false;
					i++;
				}
			}
		}
		
		if(flag) {
			System.out.println("1");
		}else {
			System.out.println("-1");
		}
//		for(int i=0; i<str1.length(); i++) {
//			if(str1.charAt(i) == str2.charAt(i)) {
//				continue;
//			}else {
//				flag=false;
//				break;
//			}
//		}
//		for(int i = 0; i< str1.length(); i++) {
//			for(int j = 0; j<str2.length(); j++) {
//				if(i > str1.length()-1) {
//					flag = false;
//					break;
//				}
//				if(str1.charAt(i) == str2.charAt(j)) {
//					stringList.add(i);
//					i++;
//					flag = true;
//					continue;
//				}else {
//					flag = false;
//					break;
//				}
//			}
//		}
//		if(flag) {
//			System.out.println(stringList.get(0));
//		}else {
//			System.out.println("-1");
//		}
//		if(flag) {
//			System.out.println("String is Equal");
//		}else {
//			System.out.println("String Not Equal");
//		}
	}

}
