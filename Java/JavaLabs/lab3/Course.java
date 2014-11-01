/**
 *	Course.java 	
 *  Assignment: Lab 3	
 *  Due: October 10th	
 *  Professor DePasquale
 *	The Course class represents a course that adds students, includes a method called roll
 *	that prints the student information as a string, and calculates the average of 
 *	all of the test scores of the students enrolled in the course.
 *	
 *	@author JR Villari
 *	@author Elizabeth Davis
 */


public class Course
{
	private String name;
	private int number = 1;
	private Student student1, student2, student3, student4, student5, student6, student7;
	
	/**
	*	A constructor that only accepts the name of the course.
	*
	*	@param name 	The string for the course name.
	*	@param number 	The number of students enrolled in the course.
	*	@param student# The string name for each student enrolled. Numbers vary from 1-7.
	*/
	
	public Course(String courseName)
	{
		name = courseName;
	}

	/**
	*	A method that adds a student to the course. Accepts one reference variable and adds
	*	the student to a variable student#, varying from 1 to 7 students. The assignment
	*	of the variable is based of the number variable, and uses a switch statement
	*	to add students to the course.
	*
	*	@param studentObject reads the string name of the student.
	*/
	
	public void addStudent(Student studentObject)
	{
		switch (number)	
		{
		case 1:
			student1 = studentObject;
			number++;
			break;
		case 2:
			student2 = studentObject;
			number++;
			break;
		case 3:
			student3 = studentObject;
			number++;
			break;
		case 4:
			student4 = studentObject;
			number++;
			break;
		case 5:
			student5 = studentObject;
			number++;
			break;
		case 6:
			student6 = studentObject;
			number++;
			break;
		case 7:
			student7 = studentObject;
			number++;
			break;
		
		}
	}
	
	/**
	*	The roll method prints a listing of all of the students enrolled in the course.
	*/
	
	public void roll()
	{
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		System.out.println(student5.toString());
		System.out.println(student6.toString());
		System.out.println(student7.toString());
	}
	
	/**
	*	The average method calculates the average quiz scores of all of the students 
	*	enrolled in the course, and returns the average as output on the screen. 
	*
	*	@param avrg# 		 calculates individual averages of each student, varying from 1-7.
	*	@param courseAverage calculates the average of all of the quiz grades in the course.
	*/
	
	public float average()
	{
		float avrg1, avrg2, avrg3, avrg4, avrg5, avrg6, avrg7, courseAverage;
		
		avrg1 = (student1.getScore(1) + student1.getScore(2) + student1.getScore(3) + student1.getScore(4) + student1.getScore(5)) / 5;
		avrg2 = (student2.getScore(1) + student2.getScore(2) + student2.getScore(3) + student2.getScore(4) + student2.getScore(5)) / 5;
		avrg3 = (student3.getScore(1) + student3.getScore(2) + student3.getScore(3) + student3.getScore(4) + student3.getScore(5)) / 5;
		avrg4 = (student4.getScore(1) + student4.getScore(2) + student4.getScore(3) + student4.getScore(4) + student4.getScore(5)) / 5;
		avrg5 = (student5.getScore(1) + student5.getScore(2) + student5.getScore(3) + student5.getScore(4) + student5.getScore(5)) / 5;
		avrg6 = (student6.getScore(1) + student6.getScore(2) + student6.getScore(3) + student6.getScore(4) + student6.getScore(5)) / 5;
		avrg7 = (student7.getScore(1) + student7.getScore(2) + student7.getScore(3) + student7.getScore(4) + student7.getScore(5)) / 5;
		courseAverage = (avrg1 + avrg2 + avrg3 + avrg4 + avrg5 + avrg6 + avrg7) / 7;
		
		return courseAverage;
	}
}
