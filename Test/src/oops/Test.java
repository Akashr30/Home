package oops;

import java.util.ArrayList;
import oops.PrivateProperties;
import oops.ProtectedClass;

public class Test {
	
	public static void main(String[] args) {
		/*ArrayList al = new ArrayList();
		al.add(1);
		al.add("String is passed");*/
		
		
	/*	Try 1 : Casting has to be done explicitly if generics is not used in collections
	 * for (int i = 0 ; i < al.size() ; i++) {
//			if (al.get(i) instanceof Integer) {
				if (i == i) {
					String a = (String) al.get(i);
//				System.out.println("Inetger object :"+);
			} else if (al.get(i) instanceof String) {
				int a = (int)al.get(i);
				System.out.println("String object : "+al.get(i));
			}
		}*/
			ArrayList<Integer> al = new ArrayList<Integer>();
				/*al.add(new String("sdf"));
				al.add("cvcv");
				al.add(100);*/
				
				for (int i = 0 ; i < al.size() ; i++) {
//					int x = (int) al.get(i);
				}
			
				PrivateProperties pp = new PrivateProperties();
				ProtectedClass pc = new ProtectedClass();
				
				
		
	}

}
