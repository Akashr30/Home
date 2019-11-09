package testOne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayLList {

	public static void main(String[] args) {
		
/*		List<Integer> l = new ArrayList();
		
		String s1 = "jhsiusdqqqrubd";
		String s2 = "kfseiywujhzhjrrdg";
		String s  = "";
//		char s[] = new char[s1.length()];
		
//		int m = 0;
		
		for (int i = 0 ; i < s1.length();i++) {
			if (s2.indexOf(s1.charAt(i)) <0) {
				if (!(s.indexOf(s1.charAt(i)) > -1))
				s += s1.charAt(i);
//				m++;
				System.out.print(s1.charAt(i));
				
			}
			
		}
		System.out.println();
		System.out.println("---------");
		System.out.println(s);*/
		Collection al12 = new ArrayList();
		ArrayList al1 = new ArrayList();
		al1.add(5);
		ArrayList al2 = new ArrayList();
		
		ArrayList al3 = new ArrayList();
		al2.add(al3);
		ArrayList al4 = new ArrayList();
		ArrayList al5 = new ArrayList();
		ArrayList al6 = new ArrayList();
		
		Collection c = new LinkedList();
		c.add(al1);
		c.add(al2);
		c.add(al3);
		c.add(al4);
		c.add(al5);
		c.add(al12);
		LinkedList ll = new LinkedList();
		ll.add(2);
		ll.add("abc");
		ll.addFirst(1);
		ll.addAll(c);
		for (int i = 0 ; i < c.size();i++) {
			System.out.println(c.iterator().next());
		}
		
//		System.out.println(ll.toArray().length);
		
		
	}

}
