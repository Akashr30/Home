package com.mypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.tomcat.util.http.fileupload.util.Streams;

class Employee {
	private String name;
	private String salary;
	public Employee(String name, String sal) {
		this.name =name;
		this.salary=sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
public class StreamPractice {
	
	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Deva","9999"));
		emp.add(new Employee("Akash", "999"));
		emp.add(new Employee("abr", "9500"));
		
		
//		List<Employee> EmpSalary = emp.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
//		List<Employee> EmpSalary = emp.stream().sorted(
//				(obj1, obj2) -> new Integer(obj1.getSalary()).compareTo(new Integer(obj2.getSalary()))
//				).collect(Collectors.toList());
		
//		List<Employee> EmpSalary = emp.stream().sorted(
//				(obj1, obj2) -> new Integer(obj1.getSalary()).compareTo(new Integer(obj2.getSalary()))
//				).collect(Collectors.toList());
		
		Comparator<Employee> myComparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return new Integer(o1.getSalary()).compareTo(new Integer(o2.getSalary()));
			}
		};
		
		System.out.println("..."+emp.stream().min(myComparator).get().getSalary());
		
//		
//		System.out.println(EmpSalary.get(0).getName()+"..."+EmpSalary.get(0).getSalary());
//		System.out.println(EmpSalary.get(1).getName()+"..."+EmpSalary.get(1).getSalary());
//		System.out.println(EmpSalary.get(2).getName()+"..."+EmpSalary.get(2).getSalary());
		
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 6, 5, 7, 8, 8);
		input.forEach(System.out::println);  //internal iterator
				input.stream()
					 .map(String::valueOf)
					 .forEach(System.out::println); // method Reference
				
		System.out.println(input.stream()
								.reduce(0, (a, b) -> Integer.sum(a, b))); //reduce
		System.out.println(
				input.stream().reduce(Integer::max) // reduce with method reference
				);
		
		System.out.println(
				input.stream()
					 .filter(e -> e%2 ==0)
					 .mapToInt(e -> e*2)
					 .sum()
				);
		
		
	
		System.out.println(
					input.parallelStream()
						 .filter(e -> e % 2 == 0)
						 .mapToInt(StreamPractice::compute)
						 .sum()
				);
		
		System.out.println("List"+
				input.stream()
					 .filter(e -> e %2 ==0)
					 .map(e -> e *2)
					 .collect(Collectors.toList())
			);
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("Set"+
					input.stream()
						 .filter(e -> e %2 ==0)
						 .map(e -> e *2)
						 .collect(Collectors.toSet())
				);
		
		System.out.println("Grouping by name" +
				emp.stream()
				   .collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())))
			);
		
		System.out.println("Lazy Function " +
				input.stream()
				   .filter(StreamPractice::isEven)
				   .map(StreamPractice::doubleIt)
				   .findFirst()
				);
		
		System.out.println("MaxFunction " +
				input.stream()
				   .filter(StreamPractice::isEven)
				   .map(StreamPractice::doubleIt)
				   .max((o1, o2) -> o1.compareTo(o2))
				   .get()
				);
	}
	
	public static int compute (int input) {
		return input *3;
	}
	
	public static boolean isEven (int input) {
		return input % 2 == 0;
	}
	public static int doubleIt (int input) {
		return input *2;
	}
}
