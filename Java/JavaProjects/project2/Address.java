/**
 * Assignment: Project 2
 * Due date: 11/6/2013
 * Instructor: Dr. DePasquale
 * Submitted by: J.R. Villari
 */

/**
 * The Address class stores the street address, city, state and zip code of each
 * member and provides accessor methods that return each of the stored variables.
 *
 * @author J.R. Villari
 */
public class Address
{
    /**
   	 * Names that store the strings that represent the street address, city, 
   	 * and state of each member.
   	 */
	private String aStreetAddress, aCity, aState;
	
    /**
   	 * Name that stores the integer that represents the zip code of each member.
   	 */
	private int aZipCode;
	
	
    /**
	 * The constructor that accepts the street address, city, state, and zip code
	 * as parameters and stores them in the variables aStreetAddress, aCity, 
	 * aState and aZipCode.
	 *
	 * @param streetAddress is the member's streetAddress
	 * @param city is the city that the member lives in
	 * @param state is the state that the member lives in
	 * @param zipCode is the member's zip code
	 */
	public Address(String streetAddress, String city, String state, int zipCode)
	{
		aStreetAddress = streetAddress;
		aCity = city;
		aState = state;
		aZipCode = zipCode;
	}
	
    /**
	 * This is an accessor method that returns the member's street address.
	 *
	 * @return aStreetAddress returns the member's street address
	 */
	public String getStreet()
	{
		return aStreetAddress;
	}
	
    /**
	 * This is an accessor method that returns the member's city.
	 *
	 * @return aCity returns the city that the member lives in
	 */
	public String getCity()
	{
		return aCity;
	}
	
	/**
	 * This is an accessor method that returns the member's state.
	 *
	 * @return aState returns the state that the member lives in
	 */
	public String getState()
	{
		return aState;
	}
	
	/**
	 * This is an accessor method that returns the member's zip code.
	 *
	 * @return aZipCode returns the member's zip code
	 */
	public int getZip()
	{
		return aZipCode;
	}
	
		
}
