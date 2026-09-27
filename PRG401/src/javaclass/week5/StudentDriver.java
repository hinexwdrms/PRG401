package javaclass.week5;

public class StudentDriver {
	public static void main(String[] args) {
		//calls default constructor
		Student s1 = new Student();
		s1.displayDetails();
		
		//calls parameterized constructor
		Student s2 = new Student(2, "Prajula");
		s2.displayDetails();
		
		Student s3 = new Student();
		s3.setRegId(3);
		s3.setName("Rishav");
		
		System.out.println(s3.getRegId());
		System.out.println(s3.getName());
	}
}
