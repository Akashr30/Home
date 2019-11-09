package testOne;

public class ArrayTraingles {

	public static void main (String[] ards) {
		int[] arr = {10,21,22,100,101,200,300,800,801};
		int temp = 0;
		int[] tleArr = new int[100];
		int cons = 0;
		String totalTraingles = "";
		int count = 0;
		for (int i = 0 ; i < arr.length-1;i++) {
			temp = arr[i];
			for (int j = 0 ; j < arr.length-1;j++) {
				if (temp == arr[j]|| temp > arr[j]) {
					continue;
				}
				if ((temp+arr[j]) > arr[j+1] ) {
					/*
					tleArr[cons] = temp;
					tleArr[++cons] = arr[j];
					tleArr[++cons] = arr[j+1];
					cons++;*/
					totalTraingles +="{"+ temp+","+arr[j]+","+arr[j+1]+"},";
					count++;
				}
			}
		}
		System.out.println(totalTraingles);
		System.out.println(count);
		
	}

}
