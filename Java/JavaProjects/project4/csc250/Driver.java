package csc250;

/**
 * Assignment: Project 4
 * Due date: 12/6/2013
 * Instructor: Dr. DePasquale
 * Submitted by: J.R. Villari
 */

import java.net.URL;
import java.net.MalformedURLException;
import java.text.DecimalFormat;
import java.io.*;
import java.util.*;

/**
 * The Driver class reads each line from an input file located at
 * http://s3.amazonaws.com/depasquale/datasets/namesWithBloodType.txt
 * and creates a Person object for each line and stores it in an array.
 * Then it prompts the user to ask how many lines they would like to be
 * sorted. It then makes 5 copies of the array and calls bubble, selection, 
 * insertion, merge and quick sort on each and outputs the number of 
 * comparisons made and the time it took for each sorting method. 
 *
 * @author J.R. Villari
 */

public class Driver
{
	/**
	 * The main method is where all the commands are performed and is 
	 * neccessary to run the program. The throws MalformedURLException 
	 * prevents a malformed URL error and IOException prevents a failed or
	 * interrupted I/O operation error.
	 *
	 * @throws MalformedURLException prevents a malformed URL error
	 * @throws IOException prevents a failed or interrupted I/O operation error
 	 */
	public static void main(String[] args) throws MalformedURLException, IOException
	{
		/**
		 * Creates a URL object called location with the URL that contains the input
		 * file.
		 */
		URL location = new URL("http://s3.amazonaws.com/depasquale/datasets/namesWithBloodType.txt");
		
		/**
		 * Constructs a new scanner that reads data from the input file for use within
		 * the program.
		 */
		Scanner input = new Scanner(location.openStream());
		
		/**
		 * Disregards the headings in the first line of the input file.
		 */
		input.nextLine();
		
		/**
		 * Stores the first line in the input file.
		 */
		String line = input.nextLine();
		
		/**
		 * Constructs a new scanner that reads data from each line for use within the 
		 * program.
		 */
		Scanner personalData = new Scanner(line);
		
		/**
		 * Creates a DecimalFormat object to ensure that the specified numbers have
		 * commas where needed.
		 */
		DecimalFormat fmt = new DecimalFormat("###,###,###,###,###");
		
		
		/**
		 * String names that store the given name, surname, street address, city, state,
		 * zip code, and blood type.
		 */
		String givenName, surname, streetAddress, city, state, zipCode, bloodType;
		
		/**
		 * Creates a new array of Person objects called person using 70000
		 * as the number of objects in the array.
		 */
		Person[] person = new Person[70000];
		
		/**
		 * Creates a scanner object called scan that reads input from the user.
		 */
		Scanner scan = new Scanner(System.in);
		
		/**
		 * Creates a variable called num that stores the number entered by the user.
		 */
		int num = 0;
		
		/**
		 * Creates a counter that stores the number of comparisons for bubble sort.
		 */
		long counter1 = 0;
		
		/**
		 * Creates a counter that stores the number of comparisons for selection sort.
		 */
		long counter2 = 0;
		
		/**
		 * Creates a counter that stores the number of comparisons for insertion sort.
		 */
		long counter3 = 0;
		
		/**
		 * Creates a counter that stores the number of comparisons for merge sort.
		 */
		long counter4 = 0;
		
		/**
		 * Creates a counter that stores the number of comparisons for quick sort.
		 */
		long counter5 = 0;
		
		/**
		 * For loop that uses the pipe symbol as the delimiter and scans in the first name, 
		 * last name, street, city, state, zip code, and blood type of each person. A 
		 * Person object is then created and stored in the person array.
		 */
		for (int x = 0; x < 70000; x++)
		{
			personalData.useDelimiter("\\|");
			
			givenName = personalData.next();
			surname = personalData.next();
			streetAddress = personalData.next();
			city = personalData.next();
			state = personalData.next();
			zipCode = personalData.next();
			bloodType = personalData.next();
			
			person[x] = new Person(givenName, surname, streetAddress, city, state, zipCode, bloodType);
			
			if (input.hasNextLine())
			{
				line = input.nextLine();
				personalData = new Scanner(line);
			}
		}
		
		/**
		 * Do-while loop that prompts the user for input and ensures that the number 
		 * entered is a positive integer and nothing else.
		 */
		do
		{
			System.out.println("Enter a positive number of elements to sort: ");
			while (!scan.hasNextInt())
			{
				System.out.println("Invalid input. Please enter a postitive integer: ");
				scan.next();
			}
			num = scan.nextInt();
		} while (num <= 0);
		
		/**
		 * Creates a new FileOutputStream called out that directs the output
		 * to a file that is created called output.txt.
		 */
		FileOutputStream out = new FileOutputStream("output.txt");
		
		/**
		 * Sets the program output to the FileOutputStream called out.
		 */
		System.setOut(new PrintStream(out));
		System.out.println("Sorting results for (" + fmt.format(num) + " Person objects)");
		System.out.println();
		System.out.println("Sort Name" + "\t" + "# Comparisons" + "    " + "# Nanoseconds");
		System.out.println("-------------------------------------------------");
			
		
		
		
		
		/**
		 * Creates a copy of the person array with the number specified by the user.
		 */
		Person[] modPerson1 = Arrays.copyOf(person, num);
		
		/**
		 * Stores the start time prior to the sort.
		 */
		long startTime1 = System.nanoTime();
		
		/**
		 * Sorts the array using the bubble sort method.
		 */
		Sorting.bubbleSort(modPerson1);
		
		/**
		 * Calculates the total time it took to sort by subtracting the ending time from 
		 * the starting time.
		 */
		long estimatedTime1 = System.nanoTime() - startTime1;
		
		/**
		 * Adds each individual person object's counter together.
		 */
		for (int a = 0; a < num; a++)
			counter1 = counter1 + (long)modPerson1[a].getCount();
		
		/**
		 * Resets each individual peron object's counter to zero.
		 */
		for (int f = 0; f < num; f++)
			modPerson1[f].setCount(0);
		
		/**
		 * Clears the array in order to save memory.
		 */
		modPerson1 = null;
		
	
		
		
		
		/**
		 * Creates a copy of the person array with the number specified by the user.
		 */
		Person[] modPerson2 = Arrays.copyOf(person, num);
		
		/**
		 * Stores the start time prior to the sort.
		 */
		long startTime2 = System.nanoTime();
		
		/**
		 * Sorts the array using the selection sort method.
		 */
		Sorting.selectionSort(modPerson2);
		
		/**
		 * Calculates the total time it took to sort by subtracting the ending time from 
		 * the starting time.
		 */
		long estimatedTime2 = System.nanoTime() - startTime2;
		
		/**
		 * Adds each individual person object's counter together.
		 */
		for (int b = 0; b < num; b++)
			counter2 = counter2 + (long)modPerson2[b].getCount();
		
		/**
		 * Resets each individual peron object's counter to zero.
		 */
		for (int g = 0; g < num; g++)
			modPerson2[g].setCount(0);
		
		/**
		 * Clears the array in order to save memory.
		 */
		modPerson2 = null;
		
		
		
		
		
		/**
		 * Creates a copy of the person array with the number specified by the user.
		 */
		Person[] modPerson3 = Arrays.copyOf(person, num);
		
		/**
		 * Stores the start time prior to the sort.
		 */
		long startTime3 = System.nanoTime();
		
		/**
		 * Sorts the array using the insertion sort method.
		 */
		Sorting.insertionSort(modPerson3);
		
		/**
		 * Calculates the total time it took to sort by subtracting the ending time from 
		 * the starting time.
		 */
		long estimatedTime3 = System.nanoTime() - startTime3;
		
		/**
		 * Adds each individual person object's counter together.
		 */
		for (int c = 0; c < num; c++)
			counter3 = counter3 + (long)modPerson3[c].getCount();
		
		/**
		 * Resets each individual peron object's counter to zero.
		 */
		for (int h = 0; h < num; h++)
			modPerson3[h].setCount(0);
		
		/**
		 * Clears the array in order to save memory.
		 */
		modPerson3 = null;
		
		
		
		
		
		/**
		 * Creates a copy of the person array with the number specified by the user.
		 */
		Person[] modPerson4 = Arrays.copyOf(person, num);
		
		/**
		 * Stores the start time prior to the sort.
		 */
		long startTime4 = System.nanoTime();
		
		/**
		 * Sorts the array using the merge sort method.
		 */
		Sorting.mergeSort(modPerson4);
		
		/**
		 * Calculates the total time it took to sort by subtracting the ending time from 
		 * the starting time.
		 */
		long estimatedTime4 = System.nanoTime() - startTime4;
		
		/**
		 * Adds each individual person object's counter together.
		 */
		for (int d = 0; d < num; d++)
			counter4 = counter4 + (long)modPerson4[d].getCount();
		
		/**
		 * Resets each individual peron object's counter to zero.
		 */
		for (int i = 0; i < num; i++)
			modPerson4[i].setCount(0);
		
		/**
		 * Clears the array in order to save memory.
		 */
		modPerson4 = null;
	
		
		
		
		/**
		 * Creates a copy of the person array with the number specified by the user.
		 */
		Person[] modPerson5 = Arrays.copyOf(person, num);
		
		/**
		 * Stores the start time prior to the sort.
		 */
		long startTime5 = System.nanoTime();
		
		/**
		 * Sorts the array using the quick sort method.
		 */
		Sorting.quickSort(modPerson5);
		
		/**
		 * Calculates the total time it took to sort by subtracting the ending time from 
		 * the starting time.
		 */
		long estimatedTime5 = System.nanoTime() - startTime5;
		
		/**
		 * Adds each individual person object's counter together.
		 */
		for (int e = 0; e < num; e++)
			counter5 = counter5 + (long)modPerson5[e].getCount();
		
		/**
		 * Clears the array in order to save memory.
		 */
		modPerson5 = null;
		
		
		/**
		 * Creates an array of NanoSort objects of size 5 in order to store each
		 * of the five sort method's information.
		 */
		NanoSort[] output = new NanoSort[5];
		
		/**
		 * Instantiates 5 NanoSort objects and stores them in the array with each
		 * of the sort method's and their respective data.
		 */
		output[0] = new NanoSort("bubble   ", counter1, estimatedTime1);
		output[1] = new NanoSort("selection", counter2, estimatedTime2);
		output[2] = new NanoSort("insertion", counter3, estimatedTime3);
		output[3] = new NanoSort("merge    ", counter4, estimatedTime4);
		output[4] = new NanoSort("quick    ", counter5, estimatedTime5);
		
		/**
		 * Uses the quick sort method to sort the NanoSort objects by descending 
		 * estimated sort times.
		 */
		Sorting.quickSort(output);
		
		/**
		 * For loop that outputs each NanoSort object by descending sort time into
		 * the file output.txt.
		 */
		for (int j = 0; j < 5; j++)
			System.out.println(output[j]);
		
	}	
			
}
			
