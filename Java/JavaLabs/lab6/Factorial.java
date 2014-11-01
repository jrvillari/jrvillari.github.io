/**
 * Assignment: Lab 6
 * Due Date: 11/25/2013
 * Instructor: Dr. DePasquale
 * Submitted by: Matt Holsten, Jenny Villari
 */

/**
 * The factorial class calculates n factorial, r factorial, and finally (n-r) factorial, then passes them 
 * back to Activity2.
 * @author Matt Holsten
 * @author Jenny Villari
 */

public class Factorial
{

	/**
	 * The nFact method calculates the factorial of n.
 	 * @param n
	 * @return result1
	 * @return 1
  	 */
	public int nFact(int n)
	{
		int result1;

		if(n==1)
			return 1;
		result1 = nFact(n-1) * n;
		
		return result1;
	}

	/**
	 * The rFact method calculates the factorial of r.
 	 * @param r
	 * @return result2
	 * @return 1
  	 */
	public int rFact(int r)
	{
		int result2;

		if(r==1)
			return 1;
		result2 = rFact(r-1) * r;
		
		return result2;
	}

	/**
	 * The nMinusRFact method calculates the factorial of nr.
 	 * @param nr
	 * @return result3
	 * @return 1
  	 */
	public int nMinusRFact(int nr)
	{
		int result3;

		if(nr==1)
			return 1;
		result3 = nMinusRFact(nr-1) * nr;
		
		return result3;
	}
}