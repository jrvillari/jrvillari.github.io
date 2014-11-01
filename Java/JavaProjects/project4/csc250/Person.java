package csc250;

/**
 * Assignment: Project 4
 * Due date: 12/6/2013
 * Instructor: Dr. DePasquale
 * Submitted by: J.R. Villari
 */
 
 /**
 * The Person class stores the person's first name, surname, street, city, state,
 * zip code, and blood type. It provides accessor methods for the person's blood
 * type and state so that they can be compared. It also provides an accessor method
 * for the counter that counts the number of comparisons made and a toString method 
 * that returns all of the person's data. It implements Comparable and uses a compareTo
 * method to compare the people in the array to one another by blood type and then state.
 *
 * @author J.R. Villari
 */
 
public class Person implements Comparable<Person>
{
	/**
   	 * Names that store the strings that represent the person's first name, surname,
   	 * street, city, state, zip code, and blood type. 
   	 */
	private String givenName, surname, streetAddress, city, state, zipCode, bloodType;
	
	/**
   	 * Stores the number of comparisons made by the sort method using the compareTo method.
   	 */
	private long count = 0;

	/**
	 * The constructor that accepts and stores the person's first name, surname, street, 
	 * city, state, zip code and blood type.
	 *
	 * @param first is the person's first name
	 * @param last is the person's last name
	 * @param street is the person's street address
	 * @param cit is the person's city
	 * @param sta is the person's state
	 * @param zip is the person's zip code
	 * @param blood is the person's blood type
	 */
	public Person(String first, String last, String street, String cit, String sta, String zip, String blood)
	{
		givenName = first;
		surname = last;
		streetAddress = street;
		city = cit;
		state = sta;
		zipCode = zip;
		bloodType = blood;
	}
	
	/**
	 * This is an accessor method that returns the person's blood type so that it 
	 * can be used by the compareTo method to compare two person objects' 
	 * blood types.
	 *
	 * @return bloodType returns the person's blood type
	 */
	private String getBloodType()
	{
		return bloodType;
	}
	
	/**
	 * This is an accessor method that returns the person's state so that it 
	 * can be used by the compareTo method to compare two person objects' 
	 * states.
	 *
	 * @return state returns the person's state
	 */
	private String getState()
	{
		return state;
	}
	
	/**
	* This method allows Person to implement Comparable. First it stores another 
	* person objects blood type and state. Then it compares the current person's
	* blood type to the other person's blood type and either returns 1 or -1 
	* to sort the blood types like so {A+,A-,AB+,AB-,B+, B-, O+, O-}. If two people
	* have the same exact blood type the person objects are sorted by ascending
	* state. Each time a comparison is made, count is incremented in order to 
	* calculate how many comparisons are made for each sort method.
	* 
	* @param other which is the person object being compared to
	*
	* @return 1 or -1 to sort the person objects by blood type and state
	*/
	public int compareTo(Person other)
	{
		/**
		 * Name that stores the String that represents the other blood type. 
		 */
		String otherBloodType = (other.getBloodType());
		
		/**
		 * Name that stores the String that represents the other state. 
		 */
		String otherState = (other.getState());
		
		/**
		 * If-else statement and nested if statements that compares the current
		 * person object's blood type and state to the other person's blood type
		 * and state.
		 */
		if ((bloodType.compareTo(otherBloodType)) > 0)
		{
			count++;
			return 1;
		}
		else if ((bloodType.compareTo(otherBloodType)) < 0)
		{
			count++;
			return -1;
		}
		else 
		{
			if ((state.compareTo(otherState)) > 0)
			{
				count++;
				return 1;
			}
			else 
			{
				count++;
				return -1;
			}
		}
	}
	
	/**
	 * This is an accessor method that returns count which represents the number
	 * of comparisons made by the compareTo method and allows us to compare the 
	 * efficiency of the different sort methods.
	 *
	 * @return count returns the number of comparisons made by the compareTo method
	 */
	public long getCount()
	{
		return count;
	}
	
	/**
	 * This is a mutator method that allows us to reset the person object's count to 
	 * zero after each sort method.
	 *
	 * @param setNum sets the counter to the specified integer
	 */
	public void setCount(int setNum)
	{
		count = setNum;
	}
	
	/**
	 * This is a toString method that creates a string of all of the person's 
	 * data and stores it in a variable called result and returns result.
	 *
	 * @return result is the string of all the person's data
	 */
	public String toString()
	{
		/**
		 * Creates a string of all of the member's information called result. 
		 */
		String result = givenName + " " + surname +  "   " + streetAddress + "   " + city + " " + state + " " + zipCode + "   " + bloodType;
		return result;
	}
}
