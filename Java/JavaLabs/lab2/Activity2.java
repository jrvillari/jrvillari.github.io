/**
 * Phil Baldoni
 * JR Villari
 * Lab 2 - Activity 3
 * 9.30.13
 * DePasquale
 */

/**
 * The Activity2 class instantiates 3 flight objects and provides the airline name, number, origin, and destination city as 
 * parameters. Then, through use of the flight class, each variable is modified and outputted as 3 individual strings.
 *
 * @author Phil Baldoni 
 * @author JR Villari
 */
public class Activity2
{
    
    public static void main(String[] args)
    {
        /**
         * Creates 3 Flight objects named flight1, flight2, and flight3 with respective unique parameters.
         *
         * @param   flightName   The string name of this flight's airline name.
         * @param   flightNumber   The integer that represents the flight's number.
         * @param   flightOrigin   The string name of the city in which the flight is departing from.
         * @param   flightDestination   The string name of the flight's destination.
         */
        Flight flight1 = new Flight("Continental", 308, "Ewing", "London");
        Flight flight2 = new Flight("United", 509, "Trenton", "Los Angeles");
        Flight flight3 = new Flight("JetBlue", 907, "Paris", "Montreal");
        
        /**
         *Prints the original flight name, number, origin, and destination for each flight as individual strings.
         */
        System.out.println("Original Flight: ");
        System.out.println(flight1.toString());
        System.out.println(flight2.toString());
        System.out.println(flight3.toString());
        
        /**
         *Calls the setName method to set the 3 flight object's airline name to American, Delta, and Spirit respectively.
         */
        flight1.setName("American");
        flight2.setName("Delta");
        flight3.setName("Spirit");
        
        /**
         *Calls the setNumber method to set the 3 flight object's numbers to 1212, 1002, and 922 respectively.
         */
        flight1.setNumber(1212);
        flight2.setNumber(1002);
        flight3.setNumber(922);
        
        /**
         *Calls the setOrigin method to set the 3 flight object's origin to Austin, Vancouver and Sacramento respectively.
         */
        flight1.setOrigin("Austin");
        flight2.setOrigin("Vancouver");
        flight3.setOrigin("Sacramento");
        
        /**
         *Calls the setDestination method to set the 3 flight object's destinations to Venice, Tokyo and Berlin respectively.
         */
        flight1.setDestination("Venice");
        flight2.setDestination("Tokyo");
        flight3.setDestination("Berlin");
        
        /**
         *Prints the modified flight name, number, origin, and destination for each flight as individual strings.
         */

        System.out.println("Updated Flight: ");
        System.out.println(flight1.toString());
        System.out.println(flight2.toString());
        System.out.println(flight3.toString());
    }
    
}