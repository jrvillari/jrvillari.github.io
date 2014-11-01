/**
 * Phil Baldoni
 * JR Villari
 * Lab 2 - Activity 3
 * 9.30.13
 * DePasquale
 */

/**
 * The Flight class is a representation of an airline flight. It contains instance data that represents a flight object's
 * airline name, number, origin, and destination city. This class allows the user to view as well as set each of the four 
 * variables. It can also return a string containing all variables.
 *
 * @author Phil Baldoni
 * @author JR Villari
 */
 
public class Flight
{
    /**
     * The string name, origin and destination of the flight.
     */
    private String name, origin, destination;
    /**
     * The integer number of the flight.
     */
    private int number;
    
    /**
     * Creates a Flight object from the provided data. 
     *
     * @param   flightName   The string name of this flight's airline name.
     * @param   flightNumber   The integer that represents the flight's number.
     * @param   flightOrigin   The string name of the city in which the flight is departing from.
     * @param   flightDestination   The string name of the flight's destination. 
     */
    public Flight(String flightName, int flightNumber, String flightOrigin, String flightDestination)
    {
        name = flightName;
        number = flightNumber;
        origin = flightOrigin;
        destination = flightDestination;
    }
    
    /**
     * Sets the name of the flight's airline.
     *
     * @param   flightName   The string name of this flight's airline name.
     */
    public void setName(String flightName)
    {
        name = flightName;
    }
    
    /**
     * Sets the number of the flight.
     *
     * @param   flightNumber   The integer that represents the flight's number.
     */
    public void setNumber(int flightNumber)
    {
        number = flightNumber;
    }
    
    /**
     * Sets the city that the flight is departing from.
     *
     * @param   flightOrigin   The string name of the city in which the flight is departing from.
     */
    public void setOrigin(String flightOrigin)
    {
        origin = flightOrigin;
    }
    
    /**
     * Sets the flight's destination.
     *
     * @param   flightDestination   The string name of the flight's destination.
     */
    public void setDestination(String flightDestination)
    {
        destination = flightDestination;
    }
    
    /**
     * Returns the name of the flight's airline. 
     *
     * @return the flight's airline name.
     */
    public String getName(String name)
    {
        return name;
    }
    
    /**
     * Returns the number of the flight.
     *
     * @return the flight's number.
     */
    public int getNumber(int number)
    {
        return number;
    }
    
    /**
     * Returns the city that the flight is departing from.
     *
     * @return the flight's origin.
     */
    public String getOrigin(String origin)
    {
        return origin;
    }
    
    /**
     * Returns the destination of the flight.
     *
     * @return the flight's destination.
     */
    public String getDestination(String destination)
    {
        return destination;
    }
    
    /**
     * Returns a string result of concatenating the flight's airline name, the flight's number, origin, and 
     * destination cities.
     *
     * @return string result containing flight's airline name, number, origin and destination. 
     */

    public String toString()
    {
        String result = name + " " + Integer.toString(number) + " Origin: " + origin + " Destination: " + destination;
        return result;
    }
}