package edu.mu;

//This is the Student class
public class Student {
	//setting up the instance variables for the Student class
	private int id;
	private String name;
	private double grade;

	//default constructor 
	public Student() {

	}

	//parameterized constructor 
	public Student(int id, String name, double grade){
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	//getter for the id variable
	public int getId() {
		return id;
	}
	
	//setter for the id variable
	public void setId(int id) {
		this.id = id;
	}
	
	//getter for the name variable
	public String getName() {
		return name;
	}
	
	//setter for the name variable
	public void setName(String name) {
		this.name = name;
	}
	
	//getter for the grade variable
	public double getGrade() {
		return grade;
	}
	
	//setter for the grade variable
	public void setGrade(double grade) {
		this.grade = grade;
	}

	//toString method that will print out the variable values of a Student object
	@Override
	public String toString() {
        return "Student [ID: " + id + ", Name: " + name + ", Grade: " + grade + "]";
    	}
	

	//equals method that will determine if a student object's id matches and id passed into the method
    public boolean equals(int id) {
		if(id == this.getId()) {
			return true;
		}
		return false;
    }
}
