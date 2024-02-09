package edu.mu;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class StudentManager {	
	
	private Student[] students;
	
	public StudentManager() {
		this.students = new Student[5];
	};
	
	public Student[] getStudents() {
		return students;
	}
	
	public void setStudents(Student[] students) {
		this.students = students;
	}
		
	public void displayStudents() {
		for(int i=0; i<students.length; i++) {
			if(students[i] != null) {
				System.out.println(students[i].toString());
			}
			else {
				System.out.println("The Student[] array is empty");
			}
		}

	}
	public boolean searchStudentById(int id) {
		//Hint: implement and use the equals() method from the Student class
		//Display the details of the student if found (toString()) was found
		//report error or message if not found
		//return true; //if student ID was found
		return false; //if student ID was not found
	}

	public boolean updateStudentGradeById(int id, double grade) {
		//use the search method to search if a student ID exists
		//update a student's grade by ID
		//return true; //if successful
		return false; //if not found
	}

	public boolean readFromFile(String fileName) {
		try {
			File myFile = new File(fileName);
			int i=0;
            Scanner fileIn = new Scanner(myFile);
            while(fileIn.hasNextLine()) {
                int id = fileIn.nextInt();
                String name = fileIn.next() + " " + fileIn.next();
                double grade = fileIn.nextDouble();
                
                students[i] = new Student(id, name, grade);
                i++;
            }
            fileIn.close();
        } catch(FileNotFoundException e){
        	e.printStackTrace();
            return false;
        }
		return true;
	}
	
}