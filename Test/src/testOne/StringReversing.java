package testOne;

public class StringReversing {

	public static void main(String[] args) {
		
		String str = "A man, in the boat says : I see 1-2-3 in the sky";	//input
		
		
		/*str = str.replaceAll("\\s", "");
		System.out.println(str);*/
//		String Symbol = "abcdefghijklmnopqrstuvwxyzABCDEFGHJIKLMNOPQRSTUVWXYZ";
//		int j = str.length()-1;
		/*int C = 0;
		for (int i=0; i< str.length()-1;i++) {
			for (int j = (str.length()-1)-C;j>0;j--) {
//			while ( j>0 ) {
				if (Symbol.indexOf(str.charAt(i)) >=0 && Symbol.indexOf(str.charAt(j)) >=0 ) {
					System.out.print(str.charAt(j));
					C++;
					break;
				} else {
					System.out.print(str.charAt(i));
					C++;
					break;
				}
				
			}
			String str = "A man, in the boat says : I see 1-2-3 in the sky";	//input
			// expected result : y kse, ht ni3 21ee slsy : a sta o-b-e ht nin amA
		}*/
		String Symbol = "abcdefghijklmnopqrstuvwxyzABCDEFGHJIKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		char[] givenStr = new char[str.length()];
		char[] revStr = new char[str.length()];
		String rev= "";
		int c =0;
		
		for (int i =0; i<str.length();i++) {
			givenStr[i] = str.charAt(i);
		}
		for (int j = str.length()-1; j>=0;j-- ) {
			rev += str.charAt(j); 
		}
		rev = rev.replaceAll("\\p{P}", "");
		rev = rev.replaceAll("\\s+", "");
		System.out.println(givenStr);
		System.out.println(rev);
		
		for (int x = 0 ; x < givenStr.length;x++) {
			if (!((Symbol.indexOf(givenStr[x]) > -1) || numbers.indexOf(givenStr[x]) > -1)) {
				revStr[x] = givenStr[x];
				continue;
			}
			for (int y = 0+c ; y<rev.length();) {
				revStr[x] = rev.charAt(y);
				c++;
				break;
			}
		}
		System.out.print(revStr);
//		System.out.print(revStr.length);
	}
	
	
}
