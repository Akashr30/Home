package zohoInterviewQstns;

import java.util.HashSet;
import java.util.Scanner;

public class Student {
	static HashSet<String> records = new HashSet<>();
	
	private static void save(String str) {
		
		if (records.contains(str)) {
			System.out.println("Student record is already available");
		} else {
			records.add(str);
			System.out.println("Student record added");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = Integer.parseInt(sc.next());
		
		while (numberOfStudents-- > 0) {
			String name = sc.next();
			String dob = sc.next();
			
			save(name+","+dob);
		}
	}
}
