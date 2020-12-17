package com.java8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapTest {
	int x = 5;
	public static void main(String[] args) throws Exception {
		
		
		List<String> al = Arrays.asList("abdsf","3we3we");
		List<Integer> ans = al.stream().map(x->x.length()).collect(Collectors.toList());
		System.out.println(ans);
		Map<String,Integer> map = new HashMap<>();
		
		Map<String,Integer> res = map.entrySet().stream()
								.sorted(Map.Entry.comparingByValue())
								.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(old,val)->val,HashMap::new));
		/*try {
			Class cs = Class.forName("FlatMapTest");
			Method[] s  = cs.getMethods();
			s[0].getName();
			Field[] f = cs.getFields();
			Arrays.stream(f).forEach(System.out::println);
			} catch(Exception e) {
				throw e;
			}*/
		
		try {
	         Class cls = Class.forName("FlatMapTest");

	         // returns the ClassLoader object
	         ClassLoader cLoader = cls.getClassLoader();
	       
	         /* returns the Class object associated with the class or interface 
	            with the given string name, using the given classloader. */
	         Class cls2 = Class.forName("java.lang.Thread", true, cLoader);       
	          
	         // returns the name of the class
	         System.out.println("Class = " + cls.getName());
	         System.out.println("Class = " + cls2.getName()); 
	      } catch(ClassNotFoundException ex) {
	         System.out.println(ex.toString());
	      }
	}

}
