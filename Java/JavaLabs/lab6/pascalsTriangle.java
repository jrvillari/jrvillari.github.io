/**
 * Assignment: Lab 6
 * Due Date: 11/25/2013
 * Instructor: Dr. DePasquale
 * Submitted by: Matt Holsten, Jenny Villari
 */

/**
 * pascalsTriangle returns 1 if n or r equals zero or if n is equal to r. If not, it recalls createPascalsTriangle with
 * n-1 and r-1 as parameters and adds another method call with n-1 and r as parameters to construct the triangle because
 * it is recursive.
 * @author Matt Holsten
 * @author Jenny Villari
 */

public class pascalsTriangle
{
	/**
         * Constructor that creates a pascalsTriangle object.
	 */
	public pascalsTriangle()
	{}
	
	/**
         * The createPascalsTriangle method is a recursive method that returns 1 if n or r equals zero or if n is equal to r.
	 * If it is not, it recalls createPascalsTriangle with n-1 and r-1 as parameters and adds another method call with 
         * n-1 and r as parameters to onstruct the triangle being it is recursive.
         *
         * @param n number of rows constructed
	 * @param r number that continues until the number entered is reached; also outputs a space for formatting
	 * @return 1
	 * @return createPascalsTriangle(n - 1, r - 1) + createPascalsTriangle(n - 1, r)
	 */
	public int createPascalsTriangle(int n, int r) 
	{
		if ((n == 0) || (r == 0) || (n == r)) 
			return 1;
		else 
			return (createPascalsTriangle(n - 1, r - 1) + createPascalsTriangle(n - 1, r));
    	}
}
