package edu.mu;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

//This is the StudentManager class that contains the main logic for this assignment
public class StudentManager {	
	
	//creating the instance variable which is an array of Student objects
	private Student[] students;
	
	//default constructor
	public StudentManager() {
		this.students = new Student[5];
	};
	
	//This method is used to display all of the students in the Student object array
	//This method will take no parameters and won't return anything to the calling class/method
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
	
	//This method is used to search the Student object array for a specific student based on ID
	//This method will take in an integer representing the id and return a boolean value to indicate if it was found
	public boolean searchStudentById(int id) {
		for(int i = 0; i < students.length; i++)
		{
			//uses the equals method in the Student class
			boolean found = students[i].equals(id);
			if(found)
			{
				//will return true if the student is found
				return true;
			}
			
		}
		//returns false if the student is not found
		return false; 
	}

	
	//This method will update a students grade. It will find the correct student by using their ID
	//This method will take in an integer ID value and a double grade value and return a boolean value to 
	//indicate if the students grade has been updated
	public boolean updateStudentGradeById(int id, double grade) {
		//will use the searchStudentById to determine if the student ID is in the Student object array
		if(this.searchStudentById(id))
		{
			for(int i = 0; i < students.length; i++)
			{
				boolean found = students[i].equals(id);
				if(found)
				{
					students[i].setGrade(grade);
					
					//will return true if the update was successful
					return true;
				}
			}
		}
		//will return false if the update was not successful or the student ID wasn't able to be matched
		return false;
	}

	//This method will read from a file and store the contents of that file into a Student object array
	//This method will take in a string that is the fileName and then return a boolean value if the file was read correctly
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
        	//return false if the file was correctly read
            return false;
        }
		//return true if the file was correctly read
		return true;
	}
	
}