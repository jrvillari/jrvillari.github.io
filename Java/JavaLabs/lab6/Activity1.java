/**
 * Assignment: Lab 6
 * Due Date: 11/25/2013
 * Instructor: Dr. DePasquale
 * Submitted by: Matt Holsten, Jenny Villari
 */

/**
 * Activity1 instantiates a writeVerticalProcessor object and calls its writeVertical method
 * passing in a single digit, triple digit, and quadruple digit number.
 * @author Matt Holsten
 * @author Jenny Villari
 */
public class Activity1
{
	/**
	 * The main method instantiates run as a writeVerticalProcessor object.
 	 * The method then calls the writeVertical method.
  	 */
	public static void main(String[] args)
	{	
		writeVerticalProcessor run = new writeVerticalProcessor();
		
		run.writeVertical(3);
		System.out.println();
		run.writeVertical(123);
		System.out.println();
		run.writeVertical(1234);		
	}
}