package csc250;

/**
 * Assignment: Project 4
 * Due date: 12/6/2013
 * Instructor: Dr. DePasquale
 * Submitted by: J.R. Villari
 */
 
import java.text.DecimalFormat;

/**
 * The NanoSort class stores the sorting method's type, number of comparisons, and 
 * time it took to run. It provides an accessor method for the sort method's time
 * so that it can be compared. It also provides a toString method that returns the 
 * sorting method's type, number of comparisons and run time. It implements Comparable
 * and uses a compareTo method to compare each sorting method's run time to one 
 * another.
 *
 * @author J.R. Villari
 */

public class NanoSort implements Comparable<NanoSort>
{
	/**
   	 * Stores the String that represents the type of sorting method.
   	 */
	private String type;
	
	/**
   	 * Stores the long that represents the number of comparisons and time of each
   	 * sorting method.
   	 */
	private long comparisons, time;
	
	/**
	 * The constructor that accepts and stores the sorting method's type, number of
	 * comparisons, and the time it took to run.
	 *
	 * @param sortType the type of sort method used
	 * @param numComparisons the number of comparisons the sort method made
	 * @param numTime the time it took to sort 
	 */
	public NanoSort(String sortType, long numComparisons, long numTime)
	{
		type = sortType;
		comparisons = numComparisons;
		time = numTime;
	} 
	
	/**
	 * This is an accessor method that returns the sorting method's run time so 
	 * that it can be used by the compareTo method to compare to the other sorting
	 * method's data.
	 *
	 * @return time returns the time it took for the sorting method to run
	 */
	private long getTime()
	{
		return time;
	}
	
	/**
	* This method allows NanoSort to implement Comparable. First it stores another 
	* sorting method's run time. Then it compares the current sorting method's
	* run time to the other sorting method's run time and either returns 1 or -1 
	* to sort the run times in descending order. 
	* 
	* @param other which is the NanoSort object being compared to
	*
	* @return 1 or -1 to sort the NanoSort objects in descending order by run time
	*/
	public int compareTo(NanoSort other)
	{
		/**
		 * Name that stores the long that represents the other sorting method's run 
		 * time. 
		 */
		long otherTime = (other.getTime());
		
		/**
		 * If-else statement that compares the current sorting method's runtime to 
		 * the other sorting method's runtime. 
		 */
		if (otherTime > time)
			return 1;
		else 
			return -1;
	}
	
	/**
	 * This is a toString method that creates a string of the sorting method's
	 * data and stores it in a variable called result and returns result.
	 *
	 * @return result is the string of all the sorting method's data
	 */
	public String toString()
	{
		/**
		 * Creates a DecimalFormat object to ensure that the specified numbers have
		 * commas where needed.
		 */
		DecimalFormat fmt = new DecimalFormat("###,###,###,###,###");
		
		/**
		 * Creates a string of all of the member's information called result. 
		 */
		String result = type + "\t" + fmt.format(comparisons) + "\t" + fmt.format(time);
		return result;
	}
}
	
		
