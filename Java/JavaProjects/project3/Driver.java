/**
 * Assignment: Project 3
 * Due date: Novemeber 22, 2013
 * Instructor: Dr. DePasquale
 * Submitted by: JR Villari
 */

/**
 * The Driver class serves as a user friendly interface to run the intersection
 * simulator. It instantiates a simulator object called run and calls the method simulate.
 *
 * @author JR Villari
 */
public class Driver
{
    /**
     * The main method simply runs the simulator by instantiating a Simulator object and calling
     * the simulate method.
     */
	public static void main(String[] args)
	{
        /**
         * Creates a Simulator object called run.
         */
		Simulator run = new Simulator();
        
        /**
         * Calls the simulate method in the Simulator class which runs the intersection
         * simulation.
         */
		run.simulate();
	}
}

