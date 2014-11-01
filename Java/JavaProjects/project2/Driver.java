/**
 * Assignment: Project 2
 * Due date: 11/6/2013
 * Instructor: Dr. DePasquale
 * Submitted by: J.R. Villari
 */

import java.net.URL;
import java.net.MalformedURLException;
import java.io.*;
import java.util.*;

/**
 * The Driver class reads each line from a input file located at
 * https://s3.amazonaws.com/depasquale/datasets/personalData.txt
 * and creates a gold member object for each line with credit 
 * card information and a member object for each line without 
 * credit card information. The member object contains the member
 * number, an address object (with address info) and an info object
 * (with member info). The gold member object contains the same information
 * with the addition of a credit card object (with credit card info) and 
 * the UPS tracking code. The object is then stored in an array of members
 * and repeats for each of the 40000 members. The array of member objects 
 * is then sorted and outputted to a file called sortedData.txt.
 * 
 * @author J.R. Villari
 */

public class Driver
{
	/**
	 * The main method is where all the commands are performed and is 
	 * neccessary to run the program. The throws MalformedURLException 
	 * prevents a malformed URL error and IOException prevents a failed or
	 * interrupted I/O operation error.
	 *
	 * @throws MalformedURLException prevents a malformed URL error
	 * @throws IOException prevents a failed or interrupted I/O operation error
 	 */
	public static void main(String[] args) throws MalformedURLException, IOException
	{
		/**
		 * Creates a URL object called location with the URL that contains the input
		 * file.
		 */
		URL location = new URL("https://s3.amazonaws.com/depasquale/datasets/personalData.txt");
		
		/**
		 * Constructs a new scanner that reads data from the input file for use within
		 * the program.
		 */
		Scanner input = new Scanner(location.openStream());
		/**
		 * Disregards the headings in the first line of the input file.
		 */
		input.nextLine();
		
		/**
		 * Stores the first line in the input file.
		 */
		String line = input.nextLine();
		
		/**
		 * Constructs a new scanner that reads data from each line for use within the 
		 * program.
		 */
		Scanner personalData = new Scanner(line);
		
		/**
		 * String names that store the first name, last name, surname, street address
		 * city, state, email, telephone number, national ID, birthday, credit card 
		 * type, credit card expiration date and UPS tracking code.
		 */
		String gender, givenName, middleInitial, surname, streetAddress, city, state, emailAddress, telephoneNumber, nationalID, birthday, ccType, ccExpires, upsTrackingCode;
		
		/**
		 * Integer constant name that represents the number of lines of input in the 
		 * file and, as a result, the size of the array.
		 */
		final int SIZE = 40000;
		
		/**
		 * Names that store the integers that represent the member number, zip code, 
		 * cvv2 value, and length of the input following the member's birthday. 
		 */
		int number, zipCode, cvv2, length1;
		
		/**
		 * Name that stores the long that represents the credit card number.
		 */
		long ccNumber;
		
		/**
		 * Creates a new array of member objects called members using the SIZE constant 
		 * as the number of objects in the array.
		 */
		Member[] members = new Member[SIZE];

		/**
		 * For loop that uses tab as the delimiter and scans in the number, gender, name, 
		 * address, email, phone number, national ID, and birthday of each member. An 
		 * address and member object is then created. If the line has more information
		 * credit card information is then scanned in and stored in an object called 
		 * CreditCard and a gold member object is created and stored in the array of member
		 * objects. If the line has no more information, a member object is created and 
		 * stored in the array of member objects.
		 */
		for (int x = 0; x < SIZE; x++)
		{
			/**
			 * Sets the delimiter to tab to match the input file.
		 	 */
			personalData.useDelimiter("\t");
			
			/**
			 * Reads in all the data and stores it in the corresponding variable.
		 	 */
			number = personalData.nextInt();
			gender = personalData.next();
			givenName = personalData.next();
			middleInitial = personalData.next();
			surname = personalData.next();
			streetAddress = personalData.next();
			city = personalData.next();
			state = personalData.next();
			zipCode = personalData.nextInt();
			emailAddress = personalData.next();
			telephoneNumber = personalData.next();
			nationalID = personalData.next();
			birthday = personalData.next();
			
			/**
			 * Creates an Address object called address that takes the street address, 
			 * city, state and zip code as its parameters.
		 	 */	
			Address address = new Address(streetAddress, city, state, zipCode);
			
			/**
			 * Creates a MemberInfo object called info that takes the name, gender, 
			 * email, national ID, phone number, and birthday as its parameters.
		 	 */
			MemberInfo info = new MemberInfo(givenName, middleInitial, surname, gender, emailAddress, nationalID, telephoneNumber, birthday);
			
			ccType = personalData.next();
			
			/**
			 * Determines the length of credit card type, which is 0, if the member 
			 * is not a gold member, and stores it in the variable name length1.
		 	 */
			length1 = ccType.length();	
			
			/**
			 * If statement that executes if length1 is not equal to 0, which means
			 * that the member is a gold member because they have credit card
			 * information.
		 	 */
			if (length1 != 0) 
			{
				/**
				 * Reads in all the credit card data and stores it in the 
				 * corresponding variable.
				 */
				ccNumber = personalData.nextLong();
				cvv2 = personalData.nextInt();
				ccExpires = personalData.next();
				upsTrackingCode = personalData.next();
				
				/**
				 * Creates a CreditCard object called creditcard that takes the 
				 * credit card type, number, cvv2, and expiration date as its
				 * parameters.
		 	 	 */
				CreditCard creditcard = new CreditCard(ccType, ccNumber, cvv2, ccExpires);
				
				/**
				 * Creates a gold member object that is a type of member and takes
				 * the member number, address object, member info object and the 
				 * UPS tracking code as its parameters.
				 */
				Member goldMember = new GoldMember(number, address, info, creditcard, upsTrackingCode);
				
				/**
				 * Stores the gold member object in the array of member objects
				 * called members.
				 */
				members[x] = goldMember;
			}
			
			/**
			 * Else statement that executes if length1 is equal to 0, which means
			 * that the member is not a gold member because they do not have
			 * credit card information.
			 */
			else
			{
				/**
				 * Creates a member object that takes the member number, address 
				 * object and member info object as its parameters.
				 */
				Member member = new Member(number, address, info);
				
				/**
				 * Stores the member object in the array of member objects
				 * called members.
				 */
				members[x] = member;
			}
			
			/**
			 * If statement that executes if the input file has another line.
			 * If it does, the line replaces the previously stored line in 
			 * in the variable called line. Then a scanner is created to scan
			 * the line.
			 */
			if(input.hasNextLine())
			{
				/**
				 * Reads the next line and stores it in the variable line.
				 */
				line = input.nextLine();
				
				/**
				 * Creates a scanner to scan the next line.
				 */
				personalData = new Scanner(line);
			}
		}
		
		/**
		 * Calls the sort method to sort the array of Member objects, called members,
		 * by zip code, then state, then street address and last surname.
		 */
	    Arrays.sort(members);
		
	    /**
		 * Creates a new FileOutputStream called out that directs the output
		 * to a file that is created called sortedData.txt.
		 */
		FileOutputStream out = new FileOutputStream("sortedData.txt");
		
		/**
		 * Sets the program output to the FileOutputStream called out.
		 */
		System.setOut(new PrintStream(out));
		
		System.out.println("NUMBER" + "\t" + "GENDER" + "\t" + "NAME" + "\t" + "MIDDLE" + "\t" + "SURNAME" + "\t" + "STREET ADDRESS" + "\t" + "CITY" + "\t" + "STATE" + "\t" + "ZIP CODE" + "\t" + "EMAIL ADDRESS" + "\t" + "TELEPHONE NUMBER" + "\t" + "NATIONAL ID" + "\t" + "BIRTHDAY" + "\t" + "CARD TYPE" + "\t" + "CARD NUMBER" + "\t" + "CVV2" + "\t" + "CARD EXPIRES" + "\t" + "UPS");
		
		/**
		 * For loop that outputs each array member into the file sortedData.txt.
		 */
		for (int x = 0; x < SIZE; x++)
			System.out.println(members[x]);
	
		
	}
		

}
