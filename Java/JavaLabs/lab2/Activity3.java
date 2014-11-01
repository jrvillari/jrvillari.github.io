/**
 * J.R. Villari
 * Phil Baldoni
 *
 * Lab 2 - Activity 3
 * 9.30.13
 * DePasquale
 */

import java.util.Scanner;
import java.text.*;
import java.io.*;

/**
 * Activity3 is a class which uses the person class to create 25 objects of people which includes their first name, last name, and zipcode. 
 * It will read a file which includes 25 lines on names and zip codes. It takes the information from the file and creates 25 person objects, 
 * storing the information in the objects, which are then called to print their string represnetations.
 *
 * @author Phil Baldoni
 * @author JR Villari
 *
 */
public class Activity3
{

	/**
 	 * The main statement first creates variables for the first name, last name, and zipcode. It also creates the instances of a scanner and
 	 * an array containing 25 person objects. It continues to a while loop to be sure thre is abother line to read in the file. The method then
 	 * continues to a for loop, which scans and saves the first and last name and zip code in variables. It then sets those variables as the data 
 	 * for the current person object being created. When these loops are complete the main continues to a for loop which prints out the string 
 	 * representation of each object.
	 *
	 * @author Phil Baldoni
	 * @author JR Villari
	 *
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		Person[] person = new Person[25];
		
		Scanner scan = new Scanner(new File("activity1.inp"));

		String first, last;
		int zip;
		
		while (scan.hasNext())
		{
			for (int x = 0; x < 25; x++)
			{
				first = scan.next();
				last = scan.next();
				zip = scan.nextInt();
			
				person[x] = new Person(first, last, zip);

				if (scan.hasNextLine())
				{
					scan.nextLine();
				}
			}
		}

		for (int x = 0; x < 25; x++)
		{
			System.out.println(person[x].toString());
		}

	}
}
