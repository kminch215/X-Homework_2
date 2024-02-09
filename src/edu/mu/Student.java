package edu.mu;

public class Student {
	private int id;
	private String name;
	private double grade;

	public Student() {

	}

	public Student(int id, String name, double grade){
		this.id = id;
		this.name = name;
		this.grade = grade;
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
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
        return "Student [ID: " + id + ", Name: " + name + ", Grade: " + grade + "]";
    	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; 
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        Student other = (Student) obj; 
        return id == other.id; 
    }
}
