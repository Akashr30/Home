package zohoInterviewQstns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;



class StudentRecords {
	
	private int id;
	private String name;
	private boolean gender;
	private List<Subject> subject;
	private int subjectCounts;
	
	public StudentRecords(int id, String name, boolean gender, List<Subject> subject, int subjectCounts) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.subject = subject;
		this.subjectCounts = subjectCounts;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getSubjectCounts() {
		return subjectCounts;
	}
	public void setSubjectCounts(int subjectCounts) {
		this.subjectCounts = subjectCounts;
	}
	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
}


class Subject {
	
	private String subjectId;
	private String subjectName;
	
	public Subject() {}
	
	public Subject(String subName) {
		this.subjectId = UUID.randomUUID().toString();
		this.subjectName = subName;
	}
	
	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}


public class ClgManagement {
     static int id = 0;
     private static HashMap<Integer,StudentRecords > records = new HashMap<>();
     
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students records to be added");
		int numberOfStudents = Integer.parseInt(sc.next());
		
		while (numberOfStudents-- > 0) {
			System.out.println("Enter Student name");
			String name = sc.next();
			
			int flag;
			while (true) {
				System.out.println("Enter 1 for male and 0 for female");
				flag = Integer.parseInt(sc.next());
				if (flag == 0 || flag == 1) {
					break;
				} else {
					System.out.println("Invalid option");
				}
			}
			boolean maleOrFemale = flag == 1;
			
			System.out.println("Enter no. of subjects");
			int numberOfSubjects = Integer.parseInt(sc.next());
			List<Subject> listOfSubjects = new ArrayList<>();
			
			while (numberOfSubjects-- > 0) {
				System.out.println("Enter the subject Name");
				String subject = sc.next();
				listOfSubjects.add(new Subject(subject));
			}
			
			StudentRecords studentRecords = new StudentRecords(id,name,
											maleOrFemale,listOfSubjects,
											listOfSubjects.size());
			records.put(id, studentRecords);
			System.out.println(name+"'s details are added in the DB");
			id++;
		}
	}
}
