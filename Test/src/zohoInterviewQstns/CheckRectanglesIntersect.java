package zohoInterviewQstns;

import java.util.ArrayList;

public class CheckRectanglesIntersect {
	
	public static boolean checkRectangles(int[][] recA , int[][] recB) {
		
		for (int[] i : recA) {
			int[] temp = i;
			for (int[] j : recB) {
				if (temp[0] <=  j[0] || temp[1] <= j[1]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void convert(int[][] rec , ArrayList<Integer> al) {
		for (int[] arr : rec) {
			String temp = String.valueOf(Math.abs(arr[0])+""+Math.abs(arr[1]));
			al.add(Integer.parseInt(temp));
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
