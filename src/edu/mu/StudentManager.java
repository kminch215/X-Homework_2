package edu.mu;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

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
				System.out.println(students[i]);
			}
			else {
				System.out.println("The Student[] array is empty");
			}
		}

	}
	
	public boolean searchStudentById(int id) {
		for(int i = 0; i < students.length; i++)
		{
			boolean found = students[i].equals(id);
			if(found)
			{
				System.out.println(students[i]);
				return true;
			}
			
		}
		
		return false; //if student ID was not found
	}

	public boolean updateStudentGradeById(int id, double grade) {
		if(this.searchStudentById(id))
		{
			for(int i = 0; i < students.length; i++)
			{
				boolean found = students[i].equals(id);
				if(found)
				{
					students[i].setGrade(grade);
					//delete before submission
					System.out.println(students[i].toString());

					return true;
				}
			}
		}
		
		return false; //if not found
	}

	public boolean readFromFile(String fileName) {
		try {
			int i=0;
            Scanner fileIn = new Scanner(new FileInputStream(fileName));
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