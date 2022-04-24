package testOne;

public class CallingMainMethod {
	
	/*static {
		String[] str = new String[] {"asfa","gvrg"};
		CallingMainMethod.main(str);
	}*/

	public static void main(String[] args) {
		String str ="";
		String[] str1 = new String[] {"asfa","gvrg"};
		for (int i = 0 ; i < args.length;i++) {
			str += args[i]+",";
		}
		if (args.length == 0) {
			System.out.println("empty");	
		}
		System.out.println(str);
		main(str1);
	}

}


