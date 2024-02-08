package edu.mu;

public class Student {
	private int Student = 4;//id;
	/**
	 * 
	 */
	private Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int getStudent() {
		return Student;
	}
	private void setStudent(int student) {
		Student = student;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private double getGrade() {
		return grade;
	}
	private void setGrade(double grade) {
		this.grade = grade;
	}
	private String name = "name"; //import from studentData.txt
	private double grade; //import from studentData.txt
	
	//toString
	//setting up student class
	//equals
	//print out student manager information
}
