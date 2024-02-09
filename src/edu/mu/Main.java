package edu.mu;


public class Main {

	public static void main(String[] args) {
		StudentManager m1 = new StudentManager();
		m1.readFromFile("file/studentData.txt");
		m1.displayStudents();

	}

}
