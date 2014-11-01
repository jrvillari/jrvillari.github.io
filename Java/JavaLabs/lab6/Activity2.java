/**
 * Assignment: Lab 6
 * Due Date: 11/25/2013
 * Instructor: Dr. DePasquale
 * Submitted by: Matt Holsten, Jenny Villari
 */


import java.util.*;

/**
 * Activity2 prompts users to enter values for n and r to be used in the the factorial
 * class.
 * @author Matt Holsten
 * @author Jenny Villari
 */
public class Activity2
{	
	/**
	 * The main method scans the users input for the values of n and r then passes them into the
 	 * factorial class to calculate the number of ways to choose r out of n things.
  	 */
	public static void main (String[] args)
	{
		int n;
		int r;
		System.out.println("Please enter a value for n greater than 0: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		while (n<=0)
		{
			System.out.println("Invalid value, please enter a valid value of n: ");
			n = scan.nextInt();
		}
		
		System.out.println("Enter a value for r greater than 0 and less than n: ");
		r = scan.nextInt();
		while (r<=0)
		{
			System.out.println("Invalid value, please enter a valid value of r: ");
			r = scan.nextInt();
		}

		Factorial blah = new Factorial();
		int nFact = blah.nFact(n);
		int rFact = blah.rFact(r);
		int nMinRFact = blah.nMinusRFact(n-r);	

		System.out.println("\nFrom " + n + " things you can choose " + r + " things " + (nFact)/((rFact)*(nMinRFact)) + " times.");
	}
}
