package javaclass.week5;

public class Student {
	private int regId;
	private String name;
	
	//default constructor
	public Student() {
		regId = 1;
		name = "Sarbesh";
	}
	
	//constructor: parameterized
	public Student(int regId, String name) {
		this.regId = regId;
		this.name = name;
	}
	
	//getter -- as we cannot access private attributes
	public int getRegId() {
		return regId;
	}
	
	public String getName() {
		return name;
	}
	
	//setter
	public void setRegId(int value) {
		regId = value;
	}
	
	public void setName(String value) {
		name = value;
	}
	
	// first word should be verb of methods
	public void displayDetails() {
		System.out.println("Registration Id:" + regId);
		System.out.println("Name:" + name);
	}
}
