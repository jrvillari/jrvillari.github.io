/**
 * Assignment: Lab 6
 * Due Date: 11/25/2013
 * Instructor: Dr. DePasquale
 * Submitted by: Matt Holsten, Jenny Villari
 */

import java.lang.*;
import java.io.*;
import java.util.*;

/**
 * Activity3 prompts the user for the number of rows of Pascal's Triangle. It checks for invalid input using a 
 * do-while statement. It also instantiates a pascalsTriangle object and calls its method createPascalsTriangle
 * to create Pascal's Triangle to the specified number.
 * @author Matt Holsten
 * @author Jenny Villari
 */

public class Activity3
{	/**
 	* The main method prompts for a number of pascals's triangle rows, checks for invalid input, and creates a 
        * pascalsTriangle object. Then it calls the createPascalsTriangle method and creates the triangle. Instantiates
        * a scanner and pascalsTriangle object.
 	*/
	public static void main(String args[])
	{
		int num = 0;
		Scanner scan = new Scanner(System.in);
		pascalsTriangle tri = new pascalsTriangle();
		
		do
		{
			System.out.println("Enter a positive number: ");
			while (!scan.hasNextInt())
			{
				System.out.println("Invalid input. Please enter a postitive integer: ");
				scan.next();
			}
			num = scan.nextInt();
		} while (num <= 0);
				
		for (int i = 0; i <= num-1; i++) 
		{
        		for (int k = 0; k <= i; k++) 
        			System.out.print(tri.createPascalsTriangle(i,k) + " ");
        		System.out.print("\n");
        	} 
    	}
}

