/**
 * Assignment: Project 3
 * Due date: Novemeber 22, 2013
 * Instructor: Dr. DePasquale
 * Submitted by: JR Villari
 */

import java.text.DecimalFormat;

/**
 * The Vehicle class stores the vehicle's number, arrival time, departure time, street, direction, and
 * destination. It also provides a method that allows the Simulator class to set the departure time. 
 * Moreover, it provides a toString method that creates and returns a string of the vehicle object's data.
 *
 * @author JR Villari
 */
public class Vehicle
{
    /**
     * Variable names that point to the integers that represent the vehicle's number, arrival time and 
     * departure time.
     */
	private int vehicleNumber, arrivalTime, departureTime;
    
    /**
     * Enumerated type called street that can either represent Church or Main street.
     */
	public enum street
	{
		Church, Main
	}
    
    /**
     * Enumerated type called direction that represents the four cardinal directions: north, south, east, 
     * and west.
     */
	public enum direction
	{
		N,S,E,W
	}
    
    /**
     * Enumerated type called destination that represents whether the vehicle is going straight or right.
     */
	public enum destination
	{
		Right, Straight
	}
    
    /**
     * Name of the enumerated type street.
     */
	private street str;
    
    /**
     * Name of the enumerated type direction.
     */
	private direction dir;
    
    /**
     * Name of the enumerated type destination.
     */
	private destination dest;
    
    /**
     * Constructor that creates a Vehicle object given the vehicle's number, the vehicle's integer
     * representation of street, direction, destination, and the vehicle's arrival and departure
     * times.
     *
     * @param number the number that the vehicle is assigned
     * @param vStreet the integer representation of the vehicle's street
     * @param vDirection the integer representation of the vehicle's direction
     * @param vDestination the integer representation of the vehicle's destination
     * @param vArrivalTime the integer that represents the vehicle's arrival time
     * @param vDepartueTime the integer that represents the vehicle's arrival time
     */
	public Vehicle(int number, int vStreet, int vDirection, int vDestination, int vArrivalTime, int vDepartureTime)
	{
        /**
         * Stores the vehicle's number.
         */
		vehicleNumber = number;
		
        /**
         * If-statement that sets the vehicle's street to either Church (if a 1 is passed in) or 
         * Main (if a 2 is passed in).
         */
		if (vStreet == 1)
			str = street.Church;
		else
			str = street.Main;
		
        /**
         * If-statement that sets the vehicle's direction to either North (if a 1 is passed in), 
         * South (if a 2 is passed in), East (if a 3 is passed in) or West (if a 4 is passed in).
         */
		if (vDirection == 1)
			dir = direction.N;
		else if (vDirection == 2)
			dir = direction.S;
		else if (vDirection == 3)
			dir = direction.E;
		else
			dir = direction.W;
		
        /**
         * If-statement that sets the vehicle's destination to going straight (if a 1 is passed in) or 
         * going right (if a 2 is passed in).
         */
		if (vDestination == 1)
			dest = destination.Straight;
		else
			dest = destination.Right;
		
        /**
         * Stores the vehicle's arrival time.
         */
		arrivalTime = vArrivalTime;
        
        /**
         * Stores the vehicle's departure time.
         */
		departureTime = vDepartureTime;
	}
	
    /**
     * Mutator method that allows the Simulator class to set the vehicle's departure time.
     *
     * @param departs the time that the vehicle departs 
     */
	public void setDepartureTime(int departs)
	{
		departureTime = departs;
	}
	
    /**
     * Method that allows different adjectives to be used, depending on the vehicle's direction, for 
     * the toString method.
     *
     * @return "northbound" if the vehicle is heading north
     * @return "southbound" if the vehicle is heading south
     * @return "eastbound" if the vehicle is heading east
     * @return "westbound" if the vehicle is heading west
     */
    public String output1()
    {
        /**
         * If-statement that returns northbound for vehicles heading north, southbound for vehicles 
         * heading south, eastbound for vehicle's heading east, and westbound for vehicle's heading
         * west.
         */
        if (dir == direction.N)
            return "northbound";
        else if (dir == direction.S)
            return "southbound";
        else if (dir == direction.E)
            return "eastbound";
        else 
            return "westbound";
        
    }
    
    /**
     * Method that allows different descriptions to be used in the vehicle's toString depending on the 
     * destination and direction of the vehicle.
     *
     * @return "turned right and headed eastbound" if the vehicle is going north and turns right  
     * @return "turned right and headed westbound" if the vehicle is going south and turns right
     * @return "turned right and headed northbound" if the vehicle is going west and turns right
     * @return "turned right and headed southbound" if the vehicle is going east and turns right
     * @return "continued straight" if the vehicle is not making a right
     */
    public String output2()
    {
        /**
         * If-statement that describes whether the vehicle turned and in which direction the vehicle
         * is now headed. Allows the proper output of the toString method.
         */
        if (dest == destination.Right && dir == direction.N)
            return "turned right and headed eastbound";
        else if (dest == destination.Right && dir == direction.S)
            return "turned right and headed westbound";
        else if (dest == destination.Right && dir == direction.W)
            return "turned right and headed northbound";
        else if (dest == destination.Right && dir == direction.E)
            return "turned right and headed southbound";
        else
            return "continued straight";
        
    }
	
    /**
     * Method return the string representation of the vehicle object stored in a variable called result
     *
     * @return result the string representation of the vehicle object
     */
	public String toString()
	{
        /**
         * Creates a new DecimalFormat object called fmt that prefixes the specified number with a 0.
         */
		DecimalFormat fmt = new DecimalFormat("00");
        /**
         * Stores and returns the proper output of the string representation of the vehicle object.
         */
        String result = "[Time " + fmt.format(departureTime) + "] Vehicle #" + fmt.format(vehicleNumber) + " (" + output1() + ") " + output2() + ". Total wait time " + fmt.format((departureTime - arrivalTime)) + " seconds.";
		return result;
	}
    
	
}
