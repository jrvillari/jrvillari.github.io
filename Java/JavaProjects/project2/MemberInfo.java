/**
 * Assignment: Project 2
 * Due date: 11/6/2013
 * Instructor: Dr. DePasquale
 * Submitted by: J.R. Villari
 */

/**
 * The MemberInfo class stores the name, gender, email, national ID, phone number, and 
 * birthday and provides accessor methods that return each of the stored variables.
 *
 * @author J.R. Villari
 */
public class MemberInfo
{
	/**
   	 * Names that store the strings that represent the name, gender, email,
   	 * national ID, phone number, and birthday of each member.
   	 */
	private String aGivenName, aMiddleInitial, aSurname, aGender, aEmail, aNationalID, aTelephone, aBirthday;
	
	/**
	 * The constructor that accepts the first, middle and surname, gender, email,  
	 * national ID, phone number and birthday as parameters and stores them in 
	 * the variables aGivenName, aMiddleInitial, aSurname, aGender, aEmail, 
	 * aNationalID, aTelephone, and aBirthday.
	 *
	 * @param givenName is the member's first name
	 * @param middleInitial is the member's middle initial
	 * @param surname is the member's last name
	 * @param gender is the member's gender
	 * @param email is the member's email address
	 * @param nationalID is the member's national ID
	 * @param telephone is the member's phone number
	 * @param birthday is the member's birthdate
	 */
	public MemberInfo(String givenName, String middleInitial, String surname, String gender, String email, String nationalID, String telephone, String birthday)
	{
		aGivenName = givenName;
		aMiddleInitial = middleInitial;
		aSurname = surname;
		aGender = gender;
		aEmail = email;
		aNationalID = nationalID;
		aTelephone = telephone;
		aBirthday = birthday;
	}
	
	/**
	 * This is an accessor method that returns the member's first name.
	 *
	 * @return aGivenName returns the member's first name
	 */
	public String getFirstName()
	{
		return aGivenName;
	}
	
	/**
	 * This is an accessor method that returns the member's middle initial.
	 *
	 * @return aMiddleInitial returns the member's middle initial
	 */
	public String getMiddleName()
	{
		return aMiddleInitial;
	}
	
	/**
	 * This is an accessor method that returns the member's last name.
	 *
	 * @return aSurname returns the member's last name
	 */
	public String getLastName()
	{
		return aSurname;
	}
	
	/**
	 * This is an accessor method that returns the member's gender.
	 *
	 * @return aGender returns the member's gender
	 */
	public String getGender()
	{
		return aGender;
	}
	
	/**
	 * This is an accessor method that returns the member's email address.
	 *
	 * @return aEmail returns the member's email address
	 */
	public String getEmail()
	{
		return aEmail;
	}
	
	/**
	 * This is an accessor method that returns the member's national ID.
	 *
	 * @return aNationalID returns the member's national ID
	 */
	public String getNational()
	{
		return aNationalID;
	}
	
	/**
	 * This is an accessor method that returns the member's phone number.
	 *
	 * @return aTelephone returns the member's phone number
	 */
	public String getTelephone()
	{
		return aTelephone;
	}
	
	/**
	 * This is an accessor method that returns the member's birthday.
	 *
	 * @return aBirthday returns the member's birthday
	 */
	public String getBirthday()
	{
		return aBirthday;
	}
}
