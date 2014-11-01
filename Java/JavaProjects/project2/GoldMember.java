/**
 * Assignment: Project 2
 * Due date: 11/6/2013
 * Instructor: Dr. DePasquale
 * Submitted by: J.R. Villari
 */
 
import java.text.DecimalFormat;

/**
 * The GoldMember class stores the credit card type, number, CVV2, expiration 
 * date and UPS Tracking Code. It also creates a member object and provides a 
 * toString method that returns all of a gold member's data. It extends the 
 * Member class. 
 *
 * @author J.R. Villari
 */
public class GoldMember extends Member
{
	/**
   	 * Names that store the strings that represent the credit card type, expiration
   	 * date, and UPS Tracking Code.
   	 */
	private String mCCType, mCCExpires, mUPSTrackingCode;
	
	/**
   	 * Name that stores the long that represents the credit card number.
   	 */
	private long mCCNumber;
	
	/**
   	 * Name that stores the integer that represents the CVV2 value.
   	 */
	private int mCVV2;
	
	/**
	 * The constructor that accepts the gold member's number, Address object, 
	 * MemberInfo object, CreditCard object, and UPS Tracking Code and uses the 
	 * number, address, and info to create a member object and the uses the 
	 * credit card object to get and store the credit card information. It also
	 * stores the UPS Tracking Code.
	 *
	 * @param number is the gold member's number
	 * @param gmAddress is the gold member's Address object that provides methods
	 * to access the gold member's address information
	 * @param gmInfo is the gold member's MemberInfo object that provides methods
	 * to access the gold member's general information 
	 * @param gmCreditCard is the gold member's CreditCard object that provides methods
	 * to access the gold member's credit card information
	 * @param trackingCode is the gold member's UPS Tracking Code
	 */
	public GoldMember(int number, Address gmAddress, MemberInfo gmInfo, CreditCard gmCreditCard, String trackingCode)
	{
		/**
		 * Creates a member object with the member's number, Address object, and 
		 * MemberInfo object as its parameters.
		 */
		super(number, gmAddress, gmInfo);
		
		/**
		 * Uses the CreditCard class's accessor methods to access each member's 
		 * credit card type, number, CVV2, and expiration date and stores it.
		 * Also stores the UPS Tracking Code.
		 */
		mCCType = gmCreditCard.getType();
		mCCNumber = gmCreditCard.getNumber();
		mCVV2 = gmCreditCard.getCVV2();
		mCCExpires = gmCreditCard.getExpires();
		mUPSTrackingCode = trackingCode;
	}
	
	/**
	 * This is toString method that creates a string of all of the gold member's 
	 * data and stores it in a variable called result and returns result. It
	 * also creates a DecimalFormat object that allows the zip codes that are
	 * less than 5 digits to be prefixed with zeros.
	 *
	 * @return result is the string of all the gold member's data
	 */
	public String toString()
	{
		/**
		 * Creates a DecimalFormat object called fmt that is 5 zeros long
		 * and is used to prefix zip codes with less than 5 digits with zeros.
		 */
		DecimalFormat fmt = new DecimalFormat("00000");
		
		/**
		 * Creates a DecimalFormat object called fmt2 that is 16 zeros long
		 * and is used to prefix credit card numbers with less than 16 digits 
		 * with zeros.
		 */
		DecimalFormat fmt2 = new DecimalFormat("0000000000000000");
		
		/**
		 * Creates a DecimalFormat object called fmt3 that is 3 zeros long
		 * and is used to prefix CVV2 values with less than 3 digits with zeros.
		 */
		DecimalFormat fmt3 = new DecimalFormat("000");
		
		/**
		 * Creates a string of all of the member's information called result. 
		 */
		String result = Integer.toString(mNumber) + "\t" + mGender + "\t" + mGivenName + "\t" + mMiddleInitial + "\t" + mSurname + "\t" + mStreetAddress + "\t" + mCity + "\t" + mState + "\t" + fmt.format(mZipCode) + "\t" + mEmailAddress + "\t" + mTelephoneNumber + "\t" + mNationalID + "\t" + mBirthday + "\t" + mCCType + "\t" + fmt2.format(mCCNumber) + "\t" + fmt3.format(mCVV2) + "\t" + mCCExpires + "\t" + mUPSTrackingCode;
		return result;
	}
}
