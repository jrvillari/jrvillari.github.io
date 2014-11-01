/**
 * J.R. Villari
 * Phil Baldoni
 *
 * Lab 2 - Truck Class
 * 9.30.13
 * DePasquale
 */

/**
 * A class called Truck which stores information on the trucks name, model, year, and miles. It includes a toString method,
 * and an accesor and mutator for its miles.
 *
 * @author Phil Baldoni
 * @author JR Villari
 *
 */
public class Truck
{
	/**
	 * Two strings, one holding the data for a truck objects name, and the other for its model.
	 *
	 */
	private String name, model;

	/**
	 * Two integers, one holding the data for a truck objects year, and the other holding its miles.
	 *
	 */
	private int year, miles;

	/**
	 * A constructer method which instantiates a Truck object. It sets the miles to zero, and the other
	 * variables to the given parameters.
	 *
	 * @param truckName A string for the name of a manufacturer of a truck object.
	 * @param truckModel A string for the model of a truck object.
	 * @param truckYear An integer for the year of a truck object
	 *
	 */
	public Truck(String truckName, String truckModel, int truckYear)
	{
		name = truckName;
		model = truckModel;
		year = truckYear;
		miles = 0;
	}

	/**
	 * A mutator to set the miles for a truck object.
	 *
	 */
	public void setMiles(int truckMiles)
	{
		miles = truckMiles;
	}

	/**
	 * An accessor which will return an integer containing the miles of a truck object.
	 *
	 */
	public int getMiles()
	{
		return miles;
	}

	/**
	 * A toString method which returns a truck objects name, model, year, and miles as a single string.
	 *
	 */
	public String toString()
	{
		
		String result =  Integer.toString(year) + " " + name + " " + model + " with " + miles + " miles." ;
		return result;
	}

}
