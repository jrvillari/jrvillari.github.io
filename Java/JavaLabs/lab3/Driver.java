/**
 * Assignment: Lab 3
 * Due date: 10/10/2013
 * Instructor: Dr. DePasquale
 * Submitted by: Elizabeth Davis and JR Villari
 */
 
import java.io.*;
import java.util.Scanner;

/**
 * The Driver class reads input from an input file titled "lab3.dat" and stores the first line as courseName,
 * the second line (which contains an integer) as numStudents and the remaining lines in an array of 
 * student objects that is created using the numStudents variable. Next a 'for' loop is used to scan each
 * line of the file and store the first two strings as firstName and lastName, create a repective student object,
 * and pass the quiz scores to the Student class. Then a course object is created and seven students are added
 * to the course using the addStudent method. Finally the course name, course roll (using the toString method 
 * of the student class and the roll mehtod of the Course class), and overall course average (using the 
 * average method of the Course class) are outputted to the screen. 
 * 
 * @author Elizabeth Davis
 * @author JR Villari
 */

public class Driver
{
	/**
	 * The main method is where all of the commands are addressed and performed. It exists because it needed to
	 * run the program. The throws IOException is added to handle errors during the running of the program.
	 *
	 * @throws IOException    thrown if the file "calculator.txt" is not found
	 */
	public static void main (String[] args) throws IOException 
	{
		/** 
		 * The integer name that stores the number of students, which is also the number of subsequent lines,
		 * in the file "calculator.txt".
		 */
		int numStudents;
		/**
		 * The float name that stores the overall average of every student's individual average in the 
		 * course Calculus.
		 */
		float overallAverage;
		/**
		 * The string names that store the course name for the course and the first name and last name for each
		 * student or line.
		 */
		String courseName, firstName, lastName;
		/**
		 * The name of the scanner that reads the file "lab3.dat".
		 */
		Scanner fileScan;
		
		/**
		 * Constructs a new scanner that reads information from "lab3.dat" for use within the program.
		 */
		fileScan = new Scanner(new File("lab3.dat"));
		
		
		courseName = fileScan.nextLine();
		numStudents = fileScan.nextInt();
		
		/**
		 * Creates a new array of student objects using numStudents as the number of objects created.
		 */
		Student[] student = new Student[numStudents];
		
		/**
		 * For loop that scans each line of the file and stores it as a student object, with a first name and 
		 * last name, and passes each quiz score to the Student class using setScore. It runs until there are no more students
		 * in the file.
		 */
			for (int x = 0; x < numStudents; x++)
			{
				firstName = fileScan.next();
				lastName = fileScan.next();
				
				student[x] = new Student(firstName, lastName);
				
				if (fileScan.hasNextFloat())
					student[x].setScore(1, fileScan.nextFloat());
				else
					student[x].setScore(1, 0);
				
				
				if (fileScan.hasNextFloat())
					student[x].setScore(2, fileScan.nextFloat());
				else
					student[x].setScore(2, 0);
				
				
				if (fileScan.hasNextFloat())
					student[x].setScore(3, fileScan.nextFloat());
				else
					student[x].setScore(3, 0);
				
		
				if (fileScan.hasNextFloat())
					student[x].setScore(4, fileScan.nextFloat());
				else
					student[x].setScore(4, 0);
		
				
				if (fileScan.hasNextFloat())
					student[x].setScore(5, fileScan.nextFloat());
				else
					student[x].setScore(5, 0);
				
				if (fileScan.hasNextLine())
				{
					fileScan.nextLine();
				}
		  }
		  
		  /**
		   * Creates a new course object using the courseName scanned in from the file "lab3.dat".
		   */
		  Course course = new Course(courseName);
		 
		  /**
		   * Adds each student to the course using the addStudent method from the Course class.
		   */
		  course.addStudent(student[0]);
		  course.addStudent(student[1]);
		  course.addStudent(student[2]);
		  course.addStudent(student[3]);
		  course.addStudent(student[4]);
		  course.addStudent(student[5]);
		  course.addStudent(student[6]);
		  
		  /**
		   * Outputs the course name.
		   */
		  System.out.println("Course Name: " + courseName);
		  
		  /**
		   * Calls the roll method from the Course class which outputs all the students in the course and their 
		   * respective grades.
		   */
		  course.roll();
		  
		  /**
		   * Stores the course average in overall average and outputs the overall course average to the screen.
		   */
		  overallAverage = course.average();
		  System.out.println();
		  System.out.println("The overall average is " + overallAverage + "%");
		  
		  
		
	}	
}
