/**
 * Assignment: Lab 4
 * Due date: 11/4/2013
 * Instructor: Dr. DePasquale
 * Submitted by: Dan Chawla and J.R. Villari
 */

/**
 * The Rate class stores each line of data that is read in by RateDriver, including the month, day, year, and rate value.
 * This class implements Comparable.
 * @author Dan Chawla
 * @author J.R. Villari
 */


public class Rate implements Comparable
{

	/**
	* day stores the integer representing the day of the month
	*/
	private int day;

	/**
	* month stores the integer representing the month of the year
	*/
	private int month;

	/**
	* year stores the year
	*/
	private int year;

	/**
	* rate stores the rate as a float
	*/
	private float rate;


	/**
	* The constructor accepts values corresponding to all instance data
	* @param month is the month
	* @param day is the day
	* @param year is the year
	* @param rate is the rate
	*/
	public Rate(int month, int day, int year, float rate){
	this.day = day;
	this.month = month;
	this.year = year;
	this.rate = rate;
}
	
	/**
	* This is an accessor method
	* @return year
	*/
	public int getYear(){
	return year;
	}

	/**
	* This is an accessor method
	* @return month
	*/
	public int getMonth(){
	return month;
	}

	/**
	* This is an accessor method
	* @return day
	*/
	public int getDay(){
	return day;
	}

	/**
	* This is an accessor method
	* @return rate
	*/
	public float getRate(){
	return rate;
	}


	/**
	* This method allows Rate to implement Comparable.
	* @param Object obj, which is then cast to Rate
	* @return an integer: negative if the object being passed to the method has a higher rate, 
	* positive if it has a lower rate to sort the rate in ascending order. If the rates are the
	* same, then the method returns the difference of their years, then months, 
	* then days to sort date in descending order.
	*/
	public int compareTo(Object obj){
	
		int otherYear = ((Rate)obj).getYear();
		int otherMonth = ((Rate)obj).getMonth();
		int otherDay = ((Rate)obj).getDay();
		float otherRate = ((Rate)obj).getRate();
	
		int nYear = this.year;
		if (nYear > 50)
		nYear += 1900;
		else
		nYear += 2000;
	
		if (otherYear > 50)
		otherYear += 1900;
		else
		otherYear += 2000;
	
		
	if ((this.rate - otherRate)>0)
		return 1;
	else if((this.rate - otherRate)<0)
		return -1;
	else if((nYear - otherYear) != 0)
		return (otherYear - nYear);
	else{
			if((this.month - otherMonth) != 0)
				return (otherMonth - this.month);
			else {
					return(otherDay - this.day);
			}
		}
	}

	/**
	* The toString method constructs a String representation of the object
	* @return a string with the format: "month/day/year     rate"
	*/
	public String toString(){
	return(month+"/"+day+"/"+year+"\t"+rate);


}
}