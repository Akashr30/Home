package testOne;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		
		String str1 = "ABCDGH";
		String str2 = "ACDGHR";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int max = 0;
		int count = 0;
		
		int[] a = new int[125];
		int[] b = new int[125];
		
		for (int x = 0; x < ch1.length;x++) {
			a[ch1[x]]++;
		}
		
		for (int y = 0 ; y < ch2.length ; y++) {
			b[ch2[y]]++;
		}
		
		for (int i = 'A' ; i < 'z' ; i++) {
			if (a[i] != 0 && b[i] != 0) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 0;
			}
		}
		
		System.out.println(max);
	}

}
