/**
 * Assignment: Lab 5
 * Due date: 11/15/13
 * Instructor: Dr. DePasquale 
 * Submitted by: Zachary Nelson and Jenny Villari
 */

import jsjf.*;
import jsjf.exceptions.EmptyCollectionException;
import java.util.Scanner;
import java.io.*;

/**
 * The Driver class first creates an object named professors that will be used to create a stack. Next,
 * the class opens an input file and reads in one line at a time. The first input on each line is the 
 * command. Based on the command the class performs various diffrent operations. If the command is 
 * not one of the given commands and Invalid Command message is displayed. 
 *
 * @author Zachary Nelson and Jenny Villari
 */
public class Driver
{

	/**
  	 * Starts the driver of the program.
  	 *
  	 * @throws an IOException if there is a problem with the input file. 
  	 */
	public static void main(String[] args) throws IOException
	{

		Scanner fileScan, lineScan;
		String command, line;
		
		LinkedStack<String> professors = new LinkedStack<String>();

		fileScan = new Scanner(new File("lab5.inp"));

		while (fileScan.hasNextLine())
		{

			line = fileScan.nextLine();
			lineScan = new Scanner(line);
			command = lineScan.next();

			if (command.equals("push"))
			{
				lineScan.useDelimiter("\n");
				String name = lineScan.next();  
				professors.push(name);
			}

			else if (command.equals("pop"))
			{	
				try
				{
					String output=professors.pop();
					System.out.println(output);
				}
				catch (EmptyCollectionException error)
				{
					System.out.println("Nothing to pop.");	
				}
			}
			
			else if (command.equals("peek"))
			{
				try
				{
					String result= professors.peek();
					System.out.println(result);
				}
				catch (EmptyCollectionException e)
				{
					System.out.println("Nothing to peek.");
				}
			}

			else if (command.equals("size"))
			{
				int size = professors.size();
				System.out.println("The size of the stack is currently " + size);
			}

			else if (command.equals("isEmpty"))
			{
				boolean empty = professors.isEmpty();
				if (empty == true)
				System.out.println("The stack is empty.");
				else
				System.out.println("The stack is not empty.");
			}	

			else if (command.equals("toString"))
			{
				String output = professors.toString();
				System.out.println(output);
			}

			else
			{
				System.out.println("Invalid Command.");
			}
	
		}
    }
}