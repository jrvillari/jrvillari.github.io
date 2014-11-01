/**
 * Assignment: Project 2
 * Due date: 11/6/2013
 * Instructor: Dr. DePasquale
 * Submitted by: J.R. Villari
 */
 
import java.text.DecimalFormat;

/**
 * The Member class stores the member's number, name, gender, address, email, 
 * phone number, national ID, and birthday. It provides accessor methods for 
 * the member's zip code, state, street and surname so that they can be compared.
 * It also provides a toString method that returns all of the member's data. 
 * It implements Comparable and uses a compareTo method to compare the members 
 * in the array to one another by zip code, state, street address and then surname.
 *
 * @author J.R. Villari
 */
public class Member implements Comparable
{
	/**
   	 * Names that store the strings that represent the member's gender, first name,
   	 * middle initial, last name, street address, city, state, email, phone number,
   	 * national ID and birthday. It is protected to allow GoldMember access to
   	 * the data.
   	 */
	protected String mGender, mGivenName, mMiddleInitial, mSurname, mStreetAddress, mCity, mState, mEmailAddress, mTelephoneNumber, mNationalID, mBirthday;
	
	/**
   	 * Names that store the integers that represent the member's number and zip
   	 * code. It is protected to allow GoldMember access to the data.
   	 */
	protected int mNumber, mZipCode;
	
	/**
	 * The constructor that accepts the member's number, Address object and
	 * MemberInfo object and uses the accessor methods provided by the Address and 
	 * MemberInfo objects to store the member's street, city, state, zip code, 
	 * first name, middle initial, surname, gender, email, national ID, phone
	 * number and birthday.
	 *
	 * @param number is the member's number
	 * @param mAddress is the member's Address object that provides methods
	 * to access the member's address information
	 * @param mInfo is the member's MemberInfo object that provides methods
	 * to access the member's general information 
	 */
	public Member(int number, Address mAddress, MemberInfo mInfo)
	{
		mNumber = number;
		
		/**
		 * Uses the accessor methods in the Address class to store the member's
		 * address information.
		 */
		mStreetAddress = mAddress.getStreet();
		mCity = mAddress.getCity();
		mState = mAddress.getState();
		mZipCode = mAddress.getZip();
		
		/**
		 * Uses the accessor methods in the MemberInfo class to store the member's
		 * general information.
		 */
		mGivenName = mInfo.getFirstName();
		mMiddleInitial = mInfo.getMiddleName();
		mSurname = mInfo.getLastName();
		mGender = mInfo.getGender();
		mEmailAddress = mInfo.getEmail();
		mNationalID = mInfo.getNational();
		mTelephoneNumber = mInfo.getTelephone();
		mBirthday = mInfo.getBirthday();		
	}
	
	/**
	 * This is an accessor method that returns the member's zip code so that it 
	 * can be used by the compareTo method to compare two member objects' zip
	 * codes.
	 *
	 * @return mZipCode returns the member's zip code
	 */
	public int getZip()
	{
		return mZipCode;
	}

	/**
	 * This is an accessor method that returns the member's state so that it 
	 * can be used by the compareTo method to compare two member objects' 
	 * states.
	 *
	 * @return mState returns the member's state
	 */
	public String getState()
	{
		return mState;
	}

	/**
	 * This is an accessor method that returns the member's street address so that 
	 * it can be used by the compareTo method to compare two member objects' street
	 * addresses.
	 *
	 * @return mStreetAddress returns the member's street address
	 */
	public String getStreet()
	{
		return mStreetAddress;
	}

	/**
	 * This is an accessor method that returns the member's last name so that it 
	 * can be used by the compareTo method to compare two member objects' last
	 * names.
	 *
	 * @return mSurname returns the member's last name
	 */
	public String getLastName()
	{
		return mSurname;
	}
	
	/**
	* This method allows Member to implement Comparable. First it stores another
	* member object's zip code, state, street, and last name using the accessors
	* provided by the Member class. It casts each object as member objects so that
	* they can be compared. Then it returns one if the zip code is higher than
	* the other zip code or zero if it is not. This allows the zip code to be 
	* in descending order. If both memebers have the same zip code it checks to 
	* see which state comes first in the alphabet, if it comes first it returns 
	* and 1 and if not it returns a -1. This allows the state abbreviations to be
	* descending. If they have the same state then it check to see which street 
	* address comes first and returns and -1 or 1 if it does not come first. This 
	* allows the street addresses to be in descending order. Last, if the street
	* addresses are the same, the surnames are compared so that the surname that 
	* comes first in the alphabet returns a 1 and those that do not return a -1. 
	* This allows the surnames to be in ascending order.
	* 
	* @param Object obj, which is then cast to Member
	*
	* @return 1 or -1: 1 if the zip code is higher and -1 if its lower, which 
	* allows the zip code to be descending; if the zip codes are the same it 
	* returns 1 if the state is higher and -1 if its lower, which allows the 
	* state to be acending; if the states are the same it returns 1 if the street
	* name is higher and -1 if its lower, which allows the street address to be 
	* descending; if the street addresses are the same, it returns 1 if the surname 
	* is higher and -1 if it is lower which allows the surnames to be ascending
	*
	*/
	public int compareTo(Object obj) 
	{
		
		/**
		 * Name that stores the integer that represents the other zip code. Cast 
		 * as a member object so that it can call the accessor getZip.
		 */
		int otherZipCode = ((Member)obj).getZip();
		
		/**
		 * Name that stores the String that represents the other state. Cast 
		 * as a member object so that it can call the accessor getState.
		 */
		String otherState = ((Member)obj).getState();
		
		/**
		 * Name that stores the String that represents the other street. Cast 
		 * as a member object so that it can call the accessor getStreet.
		 */
		String otherStreetAddress = ((Member)obj).getStreet();
		
		/**
		 * Name that stores the String that represents the other surname. Cast 
		 * as a member object so that it can call the accessor getLastName.
		 */
		String otherSurname = ((Member)obj).getLastName();
		
		/**
		 * If-else statement that returns 1 if the zip code is higher and -1 if 
		 * its lower, which allows the zip code to be descending; if the zip codes
		 * are the same it returns 1 if the state is higher and -1 if its lower,
		 * which allows the state to be acending; if the states are the same it 
		 * returns 1 if the street name is higher and -1 if its lower, which allows
		 * the street address to be descending; if the street addresses are the same,
		 * it returns 1 if the surname is higher and -1 if it is lower which allows
		 * the surnames to be ascending.
		 */
		if ((mZipCode - otherZipCode) < 0)
			return 1;
		else if ((mZipCode - otherZipCode) > 0)
			return -1;
		else 
		{
			if ((mState.compareTo(otherState)) > 0)
				return 1;
			else if ((mState.compareTo(otherState)) < 0)
				return -1;
			else 
			{
				if ((mStreetAddress.compareTo(otherStreetAddress)) < 0)
					return 1;
				else if ((mStreetAddress.compareTo(otherStreetAddress)) > 0)
					return -1;
				else
				{
					if ((mSurname.compareTo(otherSurname)) > 0)
						return 1;
					else 
						return -1;
				}
			}
		}
	}
	
	/**
	 * This is toString method that creates a string of all of the member's 
	 * data and stores it in a variable called result and returns result. It
	 * also creates a DecimalFormat object that allows the zip codes that are
	 * less than 5 digits to be prefixed with zeros.
	 *
	 * @return result is the string of all the member's data
	 */
	public String toString()
	{
		/**
		 * Creates a DecimalFormat object called fmt that is 5 zeros long
		 * and is used to prefix zip codes with less than 5 digits with zeros.
		 */
		DecimalFormat fmt = new DecimalFormat("00000");
		
		/**
		 * Creates a string of all of the member's information called result. 
		 */
		String result = Integer.toString(mNumber) + "\t" + mGender + "\t" + mGivenName + "\t" + mMiddleInitial + "\t" + mSurname + "\t" + mStreetAddress + "\t" + mCity + "\t" + mState + "\t" + fmt.format(mZipCode) + "\t" + mEmailAddress + "\t" + mTelephoneNumber + "\t" + mNationalID + "\t" + mBirthday;
		return result;
	}
	


}
