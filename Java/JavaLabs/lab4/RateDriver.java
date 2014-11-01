/**
 * Assignment: Lab 4
 * Due date: 11/4/2013
 * Instructor: Dr. DePasquale
 * Submitted by: Dan Chawla and J.R. Villari
 */
 
import java.net.URL;
import java.net.MalformedURLException;
import java.util.*;
import java.io.IOException;

/**
 * The RateDriver class reads each line of an input from a file 
 * located at http://s3.amazonaws.com/depasquale/datasets/fedfunds.txt
 * and creates a rate object for each line, containing the rate and date.
 * The rate objects are then stored in an array called list. Then the
 * earliest, highest rate and latest, lowest rate are printed to the screen.
 * Last the rates are printed out for the dates 3/19/68, 9/11/01, 8/29/97
 * and 11/31/99 if they can be found. 
 *
 * @author Dan Chawla
 * @author J.R. Villari
 */

public class RateDriver
{
	/**
	 * The main method is where all the commands are performed and is 
	 * neccessary to run the program. The throws MalformedURLException 
	 * prevents a malformed URL error and IOException prevents a failed or
	 * interrupted I/O operation error.
	 *
	 * @throws MalformedURLException
	 * @throws IOException
 	 */
	public static void main(String[] args)throws MalformedURLException, IOException
	{
		/**
		 * Creates a URL object called location with the URL that contains the input
		 * file.
		 */
		URL location = new URL("http://s3.amazonaws.com/depasquale/datasets/fedfunds.txt");
		
		/**
		 * Constructs a new scanner that reads data from the input file for use within
		 * the program.
		 */
		Scanner input = new Scanner(location.openStream());
		
		/**
		 * Stores the first line in the input file.
		 */
		String line = input.nextLine();
		
		/**
		 * Constructs a new scanner that reads data from each line for use within the 
		 * program.
		 */
		Scanner readIn = new Scanner(line);
		
		/**
		 * String name that stores the entire date.
		 */
		String date;
		
		/**
		 * Integer name that stores the individual month, day, and year.
		 */
		int month, day, year;
		
		/**
		 * Float name that stores the rate
		 */
		float r;
		
		/**
		 * Integer constant name that represents the number of lines of input in the 
		 * file.
		 */
		final int SIZE = 21257;
		
		/**
		 * Creates a new array of rate objects called list using the SIZE constant 
		 * as the number of objects in the array.
		 */
		Rate[] list = new Rate[SIZE];


		/**
		 * For loop that scans the date and rate, then breaks the date up into 
		 * month, day and year. Then a new rate object is created using this data
		 * and the object is stored in an array called list.
		 */
		for(int x = 0; x < SIZE; x++)
		{
			readIn.useDelimiter("\t");
			date = readIn.next();
			r = readIn.nextFloat();

			Scanner scan = new Scanner(date);
			scan.useDelimiter("/");
			month = scan.nextInt();
			day = scan.nextInt();
			year = scan.nextInt();

			Rate rate = new Rate(month, day, year, r);
			list[x] = rate;

			if(input.hasNextLine()){
				line = input.nextLine();
				readIn = new Scanner(line);
			}
		}
		

		Arrays.sort(list);

		/**
		* Prints the latest, highest rate, which is always position SIZE because the rates are ascending and dates are descending.
		*/

		System.out.println("The earliest, highest rate is: ");
		System.out.println(list[SIZE-1] + "\n");


		/**
		* Prints the latest, lowest rate, which is always position 0 because rates are ascending and dates are descending.
		*/

		System.out.println("The latest, lowest rate is: ");
		System.out.println(list[0] + "\n");


		/**
		 * Determines whether the dates 3/19/68, 9/11/01, 8/29/97 and 11/31/99 can 
		 * be found within the file. If they are found they are printed to the 
		 * screen with their respective rates. If the cannot be found an informational
		 * message is printed stating that the date was not found.
		 */
		int test1=0, test2=0, test3=0, test4=0;
		for(int x = 0; x< SIZE; x++){
		if(list[x].getYear() == 68)
			if (list[x].getMonth()== 3)
				if(list[x].getDay() == 19){
					test1 = 1;
					System.out.println(list[x]);
					}}
		if (test1 == 0)
			System.out.println("The date 3/19/1968 was not found");		

		for(int x = 0; x< SIZE; x++){
		if(list[x].getYear() == 1)
			if (list[x].getMonth()== 9)
				if(list[x].getDay() == 11){
					test2 = 1;
					System.out.println(list[x]);
					}}
		if (test2 == 0)
			System.out.println("The date 9/11/2001 was not found");

		for(int x = 0; x< SIZE; x++){
		if(list[x].getYear() == 77)
			if (list[x].getMonth()== 8)
				if(list[x].getDay() == 29){
					test3 = 1;
					System.out.println(list[x]);
					}}
		if (test3 == 0)
			System.out.println("The date 8/29/1977 was not found");

		for(int x = 0; x< SIZE; x++){
		if(list[x].getYear() == 99)
			if (list[x].getMonth()== 11)
				if(list[x].getDay() == 31){
					test4 = 1;
					System.out.println(list[x]);
					}

		}
		if (test4 == 0)
			System.out.println("The date 11/31/1999 was not found");
	} 

}
