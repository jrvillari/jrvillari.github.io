/**
*	Student.java 	Assignment: Lab 3	Due: October 10th	Professor DePasquale
*	The Student class represents an individual student enrolled in the course.
*	
*	@author JR Villari
*	@author Elizabeth Davis
*/

public class Student
{
	/**	
	*	@param quiz# the double value of each quiz score, each student has up 
	*				 to five quiz scores, varying from 1-5.
	*	@param first the string first name of the student.
	*	@param last	 the string last name of the student.
	*/
	
	private float quiz, quiz1, quiz2, quiz3, quiz4, quiz5;
	private String first, last;
	
	/**
	*	Sets up a Student constructor that accepts two string objects a first name 
	*	and a last name as parameters for the Student.
	*	
	*	@param firstName a parameter for the first name of the student.
	*	@param lastName  a paramater for the last name of the student.
	*/
	
	public Student(String firstName, String lastName)
	{
		first = firstName;
		last = lastName;
	}
	
	/**	
	*	Sets a specified quiz score for a students quiz. Program will output a warning 
	*	message each time the quiz score is below 0.0 or above 100.0 when the program
	*	is run.
	*
	*	@param quizNumber variable that scans the quiz number and sets that specific quiz score.
	*	@param quizScore  variable that stores the new quiz score
	*/
	
	public void setScore(int quizNum, float quizSco)
	{
		int quizNumber = 0;
		float quizScore = 0;
		quizNumber = quizNum;
		quizScore = quizSco;
		if (quizNumber == 1)
		{
			quiz1 = quizScore;
			if (quiz1 < 0 || quiz1 > 100)
			{
				quiz1 = 0;
				System.out.println("Warning! All scores outside the 0-100 range will be set to 0.");
			}	
		}
		else if (quizNumber == 2)
		{
			quiz2 = quizScore;
			if (quiz2 < 0 || quiz2 > 100)
			{
				quiz2 = 0;
				System.out.println("Warning! All scores outside the 0-100 range will be set to 0.");		
			}	
		}	
		else if (quizNumber == 3)
	    {
			quiz3 = quizScore;
			if (quiz3 < 0 || quiz3 > 100)
			{
				quiz3 = 0;
				System.out.println("Warning! All scores outside the 0-100 range will be set to 0.");		
			}	
		}	
		else if (quizNumber == 4)
		{
			quiz4 = quizScore;
			if (quiz4 < 0 || quiz4 > 100)
			{
				quiz4 = 0;
				System.out.println("Warning! All scores outside the 0-100 range will be set to 0.");		
			}	
		}	
		else if (quizNumber == 5)
		{
			quiz5 = quizScore;
			if (quiz5 < 0 || quiz5 > 100)
			{
				quiz5 = 0;
				System.out.println("Warning! All scores outside the 0-100 range will be set to 0.");		
			}	
		}	
	}
	
	/**
	*	Gets a specified quiz score and returns the value.
	*
	*	@return quiz returns the specified quiz value. 
	*/
	
	public float getScore(int quizNum)
	{
		if (quizNum == 1)
			quiz = quiz1;
		else if (quizNum == 2)
			quiz = quiz2;
		else if (quizNum == 3)
			quiz = quiz3;
		else if (quizNum == 4)
			quiz = quiz4;
		else if (quizNum == 5)
			quiz = quiz5;
		
		return quiz;
	}
	
	/**
	*	Returns the description of the student and their quiz scores.
	*
	*	@return result returns the course information, student names, and quiz scores.
	*/
	
	public String toString()
	{
		String result = first + " " + last + ":   " + quiz1 + "%,   " + quiz2 + "%,   " + quiz3 + "%,   " + quiz4 + "%,   " + quiz5 + "%";
		System.out.println();
		return result;
	}
}
