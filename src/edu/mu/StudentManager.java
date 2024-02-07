package edu.mu;

public class StudentManager {
	private int Student = 4;//id;
	private String name = "name"; //import from studentData.txt
	private double grade; //import from studentData.txt

	
	public static void main(String[] args) {
		// Instantiate StudentManager, perform operations based on the requirements.
		StudentManager studentManager = new StudentManager();
		// Read student data from a file and initialize Student objects.
		boolean fileReadStatus = studentManager.readFromFile("studentData.txt");
		// Display all students.
		studentManager.displayStudents();
		// Search for a student by ID.
		boolean studentFound = studentManager.searchStudentById(101);
		// Update the grade of a student by ID.
		boolean studentGradeUpdateStatus = studentManager.updateStudentGradeById(102, 95);
		// Display all students after the update.
		studentManager.displayStudents();
		}

	public void displayStudents() {
		System.out.println("print from StudentData.txt");
		//Display the details of all students in StudentManager
			//use toString() from Student class
		//check if Student[] is empty, display a message to inform the user


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
	public boolean readFromFile(String string) {
		//return true if can read data;
		return false;
	}
	

}
/*
implement a default constructor and a parameterized constructor that initializes the fields
include a getter and setter methods for each field
implement a toString() method to display the student information
-----
read file student data from FileInputStream and Scanner
Use data from files to initialize student objects
store the objects in array Student[]
----
Each team is required to create a GitHub repository for the project
• The repository should include all the required Java files (Main.java, Student.java, and
	StudentManager.java) and any other necessary files to run the program.
• Team members are expected to contribute equally to the project.
• Each team member should make meaningful contributions, and commit messages must be
	descriptive and related to the changes made. Your grades will be affected by your commits.
• The GitHub repository should demonstrate good version control practices, with commits logically
	organized and documenting the evolution of the code.
• Make sure to include a README.md file providing clear instructions on how to run the program,
	any dependencies, and a brief explanation of the project.
• Verify that the repository is accessible and properly organized, allowing anyone to clone and run
	the program without additional configuration.
• Your program must use the classes with described methods, given prototypes and signatures
	exactly. You are allowed to implement additional helper methods and classes.
• Late submission between 0hrs < late <= 24hrs will lose half of the grade. After 24 hours,
	submissions will receive a grade of 0 for the assignment
*/
