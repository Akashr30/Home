package com.mypractice;

import java.util.ArrayList;
import java.util.List;

public class printAlphabetsNTimes {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		String val = "a3b5";
		
//		Integer[] intgerList = new Integer[10];
//		String[] stringList = new String[10];
		
		List<Integer> intgerList = new ArrayList();
		List<String> stringList = new ArrayList();
		for(int i=0; i<val.length(); i++) {
			if(Character.isDigit(val.charAt(i))) {
				sb.append(val.charAt(i));
			} else {
				if(sb.length() != 0) {
					intgerList.add(Integer.parseInt(sb.toString()));
					sb.setLength(0);
				}
				stringList.add(val.charAt(i)+"");
			}
		}
		intgerList.add(Integer.parseInt(sb.toString()));
		
		for(int i=0; i< intgerList.size(); i++) {
			for(int j=0; j<intgerList.get(i); j++) {
				System.out.println(stringList.get(i));
			}
		}
		
		
	}

}
