/**
 * J.R. Villari
 * Phil Baldoni
 *
 * Lab 2 - Activity 1
 * 9.30.13
 * DePasquale
 */

import java.util.*;


/**
 * Activity1 will being by creating 3 truck objects and setting them with given data, declaring their make model and year. It proceeds to print out all
 * the details about them, including the miles that are set to zero when the truck is initialized. The program continues by assignining random miles to the 
 * 3 trucks, ranging between 100 and 104500. The trucks details, including the updated miles will be printed and the truck with the highest amount of miles
 * will also be declared.
 * 
 * @author Phil Baldoni
 * @author JR Villari
 *
 */
public class Activity1
{

	/**
	 * The main statement begins by creating 3 instances of the Truck class, and setting their parameters. Then using the toString method of the Truck class, 
	 * all 3 of the truck objects data will be printed. The miles of each truck are then set to random miles, using the setMiles method. Again, the data of each 
	 * truck will be printed to the screen, with the updated miles. Finally, several if else statements are implemented to find the truck with the highest miles,
	 * and that truck and data is printed, showing it has the highest miles.
	 *
	 * @author Phil Baldoni
	 * @author JR Villari
	 *
	 */
	public static void main(String[] args)
	{
		Truck truck1 = new Truck("Ford", "F150", 2004);
		Truck truck2 = new Truck("Chevy", "Trailblazer", 2011);
		Truck truck3 = new Truck("GMC", "Sierra", 1999);

		System.out.println("Truck 1: " + truck1.toString());		
		System.out.println("Truck 2: " + truck2.toString());		
		System.out.println("Truck 3: " + truck3.toString());	

		Random randNum = new Random();	

		truck1.setMiles(randNum.nextInt(104400) + 100);
		truck2.setMiles(randNum.nextInt(104400) + 100);
		truck3.setMiles(randNum.nextInt(104400) + 100);
		
		System.out.println("\nThe trucks with changed miles: \n");
		System.out.println("Truck 1: " + truck1.toString());		
		System.out.println("Truck 2: " + truck2.toString());		
		System.out.println("Truck 3: " + truck3.toString() + "\n");

		if (truck1.getMiles() > truck2.getMiles())
		{
			if (truck1.getMiles() > truck3.getMiles())
			{
				System.out.println("The truck with the most miles is the " + truck1.toString());
			}
			else
			{
				System.out.println("The truck with the most miles is the " + truck3.toString());

			}
		}
		else if (truck2.getMiles() > truck3.getMiles())
		{
			System.out.println("The truck with the most miles is the " + truck2.toString());
		}
		else
		{
			System.out.println("The truck with the most miles is the " + truck3.toString());
		}
	}
}
