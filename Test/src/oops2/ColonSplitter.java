package oops2;

public class ColonSplitter {
	
	public static void main (String[] s) {
		
		String str = "12:";
		String[] arr = str.split(":");
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0 ; i < arr.length ; i++) {
			if (i!=0 && i%2 == 0)
				sb.append("\n");
			
			sb.append(arr[i]).append(":");
		}
		String st = sb.substring(0,sb.length()-1);
		System.out.println(st);
	}

}
