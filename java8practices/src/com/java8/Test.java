package com.java8;


public class Test {
	
	/*double attribute = 8;
	final int finalAttri = 9;*/
	
	/*public void foo (final int num) {
		this.finalAttri = num;
	}

	public void foo (final Test t) {
		t.attribute = 10;
		t.finalAttri = 11;
	}*/
	int q = 4;
	static {
		int y = 7;
	}
	public static int temp1 = 1;
	private static int temp2 = 2;
	private static int temp4 = 4;
	
	public static class inner {
		
		private static int temp5 = 5;
		
		private int get2() {
			return temp1+temp2;
		}
		
		int getSum4() {
			return temp1+temp2+temp4;
		}
		
		int getSum5() {
			return temp1+temp2+temp5;
		}
	}
	
	public static void foo(String s1 , String s2) {
		System.out.println("dgdf");
	}
	public static void foo(Object d , Object d2) {
		System.out.println("qwee");
	}
	public static void main(String[] args) {
		
		Test.inner t = new Test.inner();
//		Test.inner t = t1.new inner();
		int temp = Test.inner.temp5;
		if (temp == 30 && temp/0 == 4) {
			System.out.println("sd");
		}
		
		int y = 6;
		int q = 4;
		System.out.println(y+""+q);
		foo(null,null);
		char[] c = {'a','b'};
		String s = new String(c);
		System.out.println(s);
	}

}
