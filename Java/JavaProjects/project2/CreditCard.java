/**
 * Assignment: Project 2
 * Due date: 11/6/2013
 * Instructor: Dr. DePasquale
 * Submitted by: J.R. Villari
 */

/**
 * The CreditCard class stores the credit card type, expiration date, number, 
 * and CVV2 and provides accessor methods that return each of the stored variables.
 *
 * @author J.R. Villari
 */
public class CreditCard
{
	/**
   	 * Names that stores the string that represents the credit card type and 
   	 * credit card expiration date.
   	 */
	private String aCCType, aCCExpires;
	
	/**
   	 * Name that stores the integer that represents the CVV2.
   	 */
	private int aCVV2;
	
	/**
   	 * Name that stores the long that represents the credit card number.
   	 */
	private long aCCNumber;
	
	/**
	 * The constructor that accepts the credit card type, number, CVV2 and
	 * expiration date as parameters and stores them in the variables aCCType, 
	 * aCCNumber, aCVV2, aCCExpires.
	 *
	 * @param ccType is the credit card type
	 * @param ccNumber is the credit card number
	 * @param cvv2 is the CVV2 value
	 * @param ccExpires is the credit card's expiration date
	 */
	public CreditCard(String ccType, long ccNumber, int cvv2, String ccExpires)
	{
		aCCType = ccType;
		aCCNumber = ccNumber;
		aCVV2 = cvv2;
		aCCExpires = ccExpires;
	}
	
	/**
	 * This is an accessor method that returns the credit card type.
	 *
	 * @return aCCType returns the credit card type
	 */
	public String getType()
	{
		return aCCType;
	}
	
	/**
	 * This is an accessor method that returns the credit card number.
	 *
	 * @return aCCNumber returns the credit card number
	 */
	public long getNumber()
	{
		return aCCNumber;
	}
	
	/**
	 * This is an accessor method that returns CVV2 value.
	 *
	 * @return aCVV2 returns the CVV2 value
	 */
	public int getCVV2()
	{
		return aCVV2;
	}
	
	/**
	 * This is an accessor method that returns the credit card's expiration date.
	 *
	 * @return aCCExpires returns the credit card's expiration date
	 */
	public String getExpires()
	{
		return aCCExpires;
	}

}
