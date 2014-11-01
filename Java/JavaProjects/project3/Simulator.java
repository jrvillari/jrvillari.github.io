/**
 * Assignment: Project 3
 * Due date: Novemeber 22, 2013
 * Instructor: Dr. DePasquale
 * Submitted by: JR Villari
 */

import java.util.*;
import java.io.*;
import java.net.*;
import java.lang.*;
import jsjf.*;
import jsjf.exceptions.*;

/**
 * The Simulator class simulates the traffic flow of a four-way traffic intersection given specific flow
 * requirements. It creates eight queues of which it populates with a random number of vehicle objects in a
 * given interval. It randomly assigns these objects a direction, street, and destination and runs through the
 * simulation until all of the queues are empty.
 
 * @author JR Villari
 */
public class Simulator
{
    /**
     * Creates a random object called rand that allow the program to generate random numbers.
     */
	private Random rand = new Random();
    
    /**
     * Integer name for the number that counts how many times a vehicle object is instantiated and assigned
     * a queue.
     */
	private int x;
    
    /**
     * Integer name for the number that counts how many minutes have elapsed.
     */
	private int clock = 0;
    
    /**
     * Integer name for the number that corresponds to each vehicle.
     */
	private int carNum = 1;
    
    /**
     * Integer names for the counter that ensures that the movement loop is only executed a given number of
     * time and the number of vehicles that are instantiated.
     */
	private int count, numCars;
    
    /**
     * Creates a vehicle object name vehicle that is used to populate the queues.
     */
	Vehicle vehicle;
    
    /**
     * Creates a EmptyCollectionException that prevents operation on an empty queue.
     */
	EmptyCollectionException error;
    
    /**
     * Creates an IOException that prevents input or output errors when writing to the file.
     */
	IOException f;
	
    /**
     * Creates a FileWriter called file that enables the output to be written in a file called "output.txt".
     */
	FileWriter file;
    
    /**
     * Creates a BufferedWriter called buffer that enables the output to be interpreted and therefore written in
     * a file called "output.txt".
     */
	BufferedWriter buffer;
    
    /**
     * Creates a PrintWriter called print that enables the program to print to the file.
     */
	PrintWriter print;
	
	/**
     * Creates an empty Linked Queue for vehicles traveling north and straight.
     */
	private LinkedQueue<Vehicle> northStraight = new LinkedQueue<Vehicle>();
    
    /**
     * Creates an empty Linked Queue for vehicles traveling north and right.
     */
	private LinkedQueue<Vehicle> northRight = new LinkedQueue<Vehicle>();
    
    /**
     * Creates an empty Linked Queue for vehicles traveling south and straight.
     */
	private LinkedQueue<Vehicle> southStraight = new LinkedQueue<Vehicle>();
    
    /**
     * Creates an empty Linked Queue for vehicles traveling south and right.
     */
	private LinkedQueue<Vehicle> southRight = new LinkedQueue<Vehicle>();
    
    /**
     * Creates an empty Linked Queue for vehicles traveling east and straight.
     */
	private LinkedQueue<Vehicle> eastStraight = new LinkedQueue<Vehicle>();
    
    /**
     * Creates an empty Linked Queue for vehicles traveling east and right.
     */
	private LinkedQueue<Vehicle> eastRight = new LinkedQueue<Vehicle>();
    
    /**
     * Creates an empty Linked Queue for vehicles traveling west and straight.
     */
	private LinkedQueue<Vehicle> westStraight = new LinkedQueue<Vehicle>();
    
    /**
     * Creates an empty Linked Queue for vehicles traveling west and right.
     */
	private LinkedQueue<Vehicle> westRight = new LinkedQueue<Vehicle>();
	
    /**
     * Constuctor that instantiates a simulator object.
     */
	public Simulator()
	{}
    
    /**
     * The simulate method is where the majority of the program is run from. First it creates an output file 
     * to be written to called "output.txt". Next it randomly populates the queues. Then the north and south
     * cars are moved first. Lastly the light changes and the east and west sides are moved. It repeats until
     * all of the queues are empty.
     */
	public void simulate()
	{
        /**
         * The try block checks to ensure there a no errors. The catch block catches the errors if they occur
         * with an IOException.
         */
		try
		{
            /**
             * Creates a new FileWriter called file that writes to "output.txt".
             */
			file = new FileWriter("output.txt");
            
            /**
             * Creates a new BufferedWriter called buffer allows the program to write to the file.
             */
			buffer = new BufferedWriter(file);
            
            /**
             * Creates a new PrintWriter called print that enables the program to print.
             */
			print = new PrintWriter(buffer);
			
			print.println("---Start of simulation, time set to 0.");
			prePopulate(1);
            
            
            /**
             * Terminates when there are no more vehicles in any of the queues.
             */
			while (!northStraight.isEmpty() || !northRight.isEmpty() || !southStraight.isEmpty() || !southRight.isEmpty() || !eastStraight.isEmpty() || !eastRight.isEmpty() || !westStraight.isEmpty() || !westRight.isEmpty())
            {
                print.println("---Light changed. Now processing north/south-bound traffic---");
                
                /**
                 * Calls the northSouth method which allows the cars on Church Street to go.
                 */
                northSouth();
                prePopulate(2);
                print.println();
                print.println("---Light changed. Now processing east/west-bound traffic---");
                /**
                 * Calls the eastWest method which allows the cars on Main Street to go.
                 */
                eastWest();
                prePopulate(3);
                print.println();
            }
            print.close();
		}
        /**
         * If there is an error with the output file an IOException is caught.
         */
		catch (IOException f)
		{
			System.out.println("Input/Output Error");
		}
	}
	
    /**
     * The prePopulate method randomly populates the eight queues with a random number of vehicle
     * objects within a given interval. Then it repeats until the random maximum is reached or if there has
     * been 120 vehicles instantiated.
     *
     * @param r is the integer that represents the interval that a random number is to be drawn from.
     */
	private void prePopulate(int r)
	{
        /**
         * The integer name that represents the interval that a random number is to be drawn from.
         */
		int choice = r;
		
        /**
         * If-statement that assigns the random number within the given interval to numCars.
         */
        if (choice == 1)
			numCars = rand.nextInt(6) + 7;
		else if (choice == 2)
			numCars = rand.nextInt(8) + 8;
		else
			numCars = rand.nextInt(13) + 3;
        
        /**
         * While loop that terminates when the numCars or 120 is exceeded.
         */
		while (x <= numCars && carNum <= 120)
		{
			x = 0;
            
            /**
             * Determines the position of the car in the simulation.
             */
			int carPosition = rand.nextInt(8) + 1;
            
			/**
             * If-else statements that determine which queue to enqueue a vehicle object into. 
             */
            if (carPosition == 1)
			{
                /**
                 * Instantiates a new vehicle with the parameters of a vehicle going north and straight.
                 */
				vehicle = new Vehicle(carNum, 1, 1, 1, 0, 0);
                
                /**
                 * Enqueues the vehicle into the northStraight queue.
                 */
				northStraight.enqueue(vehicle);
				x++;
                carNum++;
			}
			else if (carPosition == 2)
			{
                /**
                 * Instantiates a new vehicle with the parameters of a vehicle going north and right.
                 */
				vehicle = new Vehicle(carNum, 1, 1, 0, 0, 0);
                
                /**
                 * Enqueues the vehicle into the northRight queue.
                 */
				northRight.enqueue(vehicle);
				x++;
                carNum++;
			}
			else if (carPosition == 3)
			{
                /**
                 * Instantiates a new vehicle with the parameters of a vehicle going south and straight.
                 */
				vehicle = new Vehicle(carNum, 1, 2, 1, 0, 0);
                
                /**
                 * Enqueues the vehicle into the southStraight queue.
                 */
				southStraight.enqueue(vehicle);
				x++;
                carNum++;
			}
			else if (carPosition == 4)
			{
                /**
                 * Instantiates a new vehicle with the parameters of a vehicle going south and right.
                 */
				vehicle = new Vehicle(carNum, 1, 2, 0, 0, 0);
                
                /**
                 * Enqueues the vehicle into the southRight queue.
                 */
				southRight.enqueue(vehicle);
				x++;
                carNum++;
			}
			else if (carPosition == 5)
			{
                /**
                 * Instantiates a new vehicle with the parameters of a vehicle going east and straight.
                 */
				vehicle = new Vehicle(carNum, 2, 3, 1, 0, 0);
                
                /**
                 * Enqueues the vehicle into the eastStraight queue.
                 */
				eastStraight.enqueue(vehicle);
				x++;
                carNum++;
			}
			else if (carPosition == 6)
			{
                /**
                 * Instantiates a new vehicle with the parameters of a vehicle going east and right.
                 */
				vehicle = new Vehicle(carNum, 2, 3, 0, 0, 0);
                
                /**
                 * Enqueues the vehicle into the eastRight queue.
                 */
				eastRight.enqueue(vehicle);
				x++;
                carNum++;
			}
			else if (carPosition == 7)
			{
				/**
                 * Instantiates a new vehicle with the parameters of a vehicle going west and straight.
                 */
                vehicle = new Vehicle(carNum, 2, 4, 1, 0, 0);
                
                /**
                 * Enqueues the vehicle into the westStraight queue.
                 */
                westStraight.enqueue(vehicle);
				x++;
                carNum++;
			}
			else 
			{
                /**
                 * Instantiates a new vehicle with the parameters of a vehicle going west and right.
                 */
				vehicle = new Vehicle(carNum, 2, 4, 0, 0, 0);
                
                /**
                 * Enqueues the vehicle into the westRight queue.
                 */
				westRight.enqueue(vehicle);
				x++;
                carNum++;
			}
			
		}
	}
	
    /**
     * The northSouth method moves the cars traveling north and south by dequeing them and printing them to 
     * the file. It runs for a total of six seconds (with three seconds per vehicle) and allows up to eight
     * vehicles to pass through the intersection.
     */
	private void northSouth()
	{
		count = 0;
        
        /**
         * While loop that runs twice for a total of six seconds on the clock. Try statements catches an empty
         * queue with an EmptyCollectionException.
         */
		while (count < 2)
		{
			clock = clock + 3;
			/**
             * The try block ensures the queue is not empty. If it is, the catch block catches it with an 
             * EmptyCollectionException .
             */
			try
			{
                /**
                 * If statements that runs if the queue is not empty and dequeues the queue, sets the clock, and
                 * prints the dequeued vehicle.
                 */
				if (!northStraight.isEmpty())
				{
                    /**
                     * Dequeues the element in the queue and sets it equal to vehicle.
                     */
					vehicle = northStraight.dequeue();
                    
                    /**
                     * Sets the departure time equal to the time on the clock.
                     */
					vehicle.setDepartureTime(clock);
					print.println(vehicle.toString());
				}
			}
			catch(EmptyCollectionException error)
			{
                print.println("Queue is empty.");
			}
            
            /**
             * The try block ensures the queue is not empty. If it is, the catch block catches it with an
             * EmptyCollectionException .
             */
			try
			{
                /**
                 * If statements that runs if the queue is not empty and dequeues the queue, sets the clock, and
                 * prints the dequeued vehicle.
                 */
				if (!northRight.isEmpty())
				{
                    /**
                     * Dequeues the element in the queue and sets it equal to vehicle.
                     */
					vehicle = northRight.dequeue();
                    
                    /**
                     * Sets the departure time equal to the time on the clock.
                     */
					vehicle.setDepartureTime(clock);
					print.println(vehicle.toString());
				}
                
			}
			catch(EmptyCollectionException error)
			{
                print.println("Queue is empty.");
			}
            
            /**
             * The try block ensures the queue is not empty. If it is, the catch block catches it with an
             * EmptyCollectionException .
             */
			try
			{
                /**
                 * If statements that runs if the queue is not empty and dequeues the queue, sets the clock, and
                 * prints the dequeued vehicle.
                 */
				if (!southStraight.isEmpty())
				{
                    /**
                     * Dequeues the element in the queue and sets it equal to vehicle.
                     */
					vehicle = southStraight.dequeue();
                    
                    /**
                     * Sets the departure time equal to the time on the clock.
                     */
					vehicle.setDepartureTime(clock);
					print.println(vehicle.toString());
				}
                
			}
			catch(EmptyCollectionException error)
			{
                print.println("Queue is empty.");
			}
            
            /**
             * The try block ensures the queue is not empty. If it is, the catch block catches it with an
             * EmptyCollectionException .
             */
			try
			{
                /**
                 * If statements that runs if the queue is not empty and dequeues the queue, sets the clock, and
                 * prints the dequeued vehicle.
                 */
				if (!southRight.isEmpty())
				{
                    /**
                     * Dequeues the element in the queue and sets it equal to vehicle.
                     */
					vehicle = southRight.dequeue();
                    
                    /**
                     * Sets the departure time equal to the time on the clock.
                     */
					vehicle.setDepartureTime(clock);
					print.println(vehicle.toString());
				}
                
			}
			catch(EmptyCollectionException error)
			{
                print.println("Queue is empty.");
			}
			count++;
		}
	}
	
    /**
     * The eastWest method moves the cars traveling east and west by dequeing them and printing them to
     * the file. It runs for a total of nine seconds (with three seconds per vehicle) and allows up to twelve
     * vehicles to pass through the intersection.
     */
	private void eastWest()
	{
		count = 0;
        
        /**
         * While loop that runs three times for a total of nine seconds on the clock. Try statements catches 
         * an empty queue with an EmptyCollectionException.
         */
		while (count < 3)
		{
			clock = clock + 3;
			
            /**
             * The try block ensures the queue is not empty. If it is, the catch block catches it with an
             * EmptyCollectionException .
             */
			try
			{
                /**
                 * If statements that runs if the queue is not empty and dequeues the queue, sets the clock, and
                 * prints the dequeued vehicle.
                 */
				if (!eastStraight.isEmpty())
				{
                    /**
                     * Dequeues the element in the queue and sets it equal to vehicle.
                     */
					vehicle = eastStraight.dequeue();
                    
                    /**
                     * Sets the departure time equal to the time on the clock.
                     */
					vehicle.setDepartureTime(clock);
					print.println(vehicle.toString());
				}
               
			}
			catch(EmptyCollectionException error)
			{
                print.println("Queue is empty.");
			}
            
            /**
             * The try block ensures the queue is not empty. If it is, the catch block catches it with an
             * EmptyCollectionException .
             */
			try
			{
                /**
                 * If statements that runs if the queue is not empty and dequeues the queue, sets the clock, and
                 * prints the dequeued vehicle.
                 */
				if (!eastRight.isEmpty())
				{
                    /**
                     * Dequeues the element in the queue and sets it equal to vehicle.
                     */
					vehicle = eastRight.dequeue();
                    
                    /**
                     * Sets the departure time equal to the time on the clock.
                     */
					vehicle.setDepartureTime(clock);
					print.println(vehicle.toString());
				}

			}
			catch(EmptyCollectionException error)
			{
                print.println("Queue is empty.");
			}
            
            /**
             * The try block ensures the queue is not empty. If it is, the catch block catches it with an
             * EmptyCollectionException .
             */
			try
			{
                /**
                 * If statements that runs if the queue is not empty and dequeues the queue, sets the clock, and
                 * prints the dequeued vehicle.
                 */
				if (!westStraight.isEmpty())
				{
                    /**
                     * Dequeues the element in the queue and sets it equal to vehicle.
                     */
					vehicle = westStraight.dequeue();
                    
                    /**
                     * Sets the departure time equal to the time on the clock.
                     */
					vehicle.setDepartureTime(clock);
					print.println(vehicle.toString());
				}
			}
			catch(EmptyCollectionException error)
			{
                print.println("Queue is empty.");
			}
            
            /**
             * The try block ensures the queue is not empty. If it is, the catch block catches it with an
             * EmptyCollectionException .
             */
			try
			{
                /**
                 * If statements that runs if the queue is not empty and dequeues the queue, sets the clock, and
                 * prints the dequeued vehicle.
                 */
				if (!westRight.isEmpty())
				{
                    /**
                     * Dequeues the element in the queue and sets it equal to vehicle.
                     */
					vehicle = westRight.dequeue();
                    
                    /**
                     * Sets the departure time equal to the time on the clock.
                     */
					vehicle.setDepartureTime(clock);
					print.println(vehicle.toString());
				}
                    
			}
			catch(EmptyCollectionException error)
			{
                print.println("Queue is empty.");
			}
			count++;
		}
	}
	
	
}	

