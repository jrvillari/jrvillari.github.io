/**
 * J.R. Villari
 * Phil Baldoni
 *
 * Lab 2 - Person Class
 * 9.30.13
 * DePasquale
 */

/**
 * A class called person which stores the first name, last name, and zipcode of a person object. It includes a toString method and
 * accesors and mutators for all of its data.
 *
 * @author Phil Baldoni
 * @author JR Villari
 *
 */
public class Person
{
	/**
	 * Two strings, one to hold the data for the person objects first name and one for the last name.
	 *
	 */
	private String firstName, lastName;

	/**
	 * An integer created to hold the data of a person objects zip code.
	 *
	 */
	private int zipCode;
	
	/**
	 * A constructer method which instantiates a person object. It sets the values of firstName, lastName, and zipCode
	 * to the given parameters.
	 *
	 * @param first A string holding the first name.
	 * @param last A string holding the last name.
	 * @param zip A integer holding the zipcode.
	 *
	 */
	public Person(String first, String last, int zip)
	{
		firstName = first;
		lastName = last;
		zipCode = zip;
	}

	/**
	 * An accesor method which can be called to return the first name of a person object as a string.
	 *
	 */
	public String getfirstName()
	{
		return firstName;
	}

	/**
	 * An accessor method which can be called to return the last name of a person object as a string.
	 *
	 */
	public String getlastName()
	{
		return lastName;
	}

	/**
	 * An accesor method which can be called to return the zipcode of a preson object as an integer.
	 *
	 */
	public int getZipCode()
	{
		return zipCode;
	}

	/**
	 * A mutator method which can be called to change the the first name of a person object.
	 *
	 * @param first A string to be set as the new first name.
	 *
	 */
	public void setfirstName(String first)
	{
		firstName = first;
	}

	/**
	 * A mutator method which can be called to change the last name of a person object.
	 *
	 * @param last A string to be set as the new last name.
	 *
	 */
	public void setlastName(String last)
	{
		lastName = last;
	}

	/**
	 * A mutator method which can be called to change the zip code of a person object.
	 *
	 * @param zip An integer to be set as the new zip code.
	 *
	 */
	public void setZipCode(int zip)
	{
		zipCode = zip;
	}
	
	/**
	 * A two string method, which will return the persons first and last name followed by their zip code, all as a single string.
	 *
	 */
	public String toString()
	{
		String result = firstName + " " + lastName + " " + zipCode;
		return result;
	}

}
