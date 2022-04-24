package com.java8;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
 class ConstructorAndMethodReference {
	
	public  void run() {
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		ConstructorAndMethodReference r1 = new ConstructorAndMethodReference();
		Runnable r = r1::run;
		Thread t = new Thread(r);
		t.start();
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(40);
		List<Integer> list = al.stream().filter(x-> x > 20).sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		Set<Integer> list1 = al.stream().filter(x-> x > 20).sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toSet());
		Integer n1 = al.stream().max((i1,i2) -> -i1.compareTo(i2)).get();
		System.out.println(n1);
		Supplier<List<Integer>> su = ArrayList::new;
		List<Integer> fromSupply = su.get();
		fromSupply.add(0);
		fromSupply.add(10);
		fromSupply.add(11);
		System.out.println(fromSupply);
		
	}

}
