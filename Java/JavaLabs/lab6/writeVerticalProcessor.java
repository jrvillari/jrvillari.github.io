/**
 * Assignment: Lab 6
 * Due Date: 11/25/2013
 * Instructor: Dr. DePasquale
 * Submitted by: Matt Holsten, Jenny Villari
 */

/**
 * Takes the number passed in from Activity1. If the number is less than one it returns zero.
 * If not, the modular function is performed on the number and the result is stored and subtracted
 * from the original number. That number is divided by ten and outputted to the screen. It is recursive
 * and repeats for the previous digit in the number.
 * 
 * @author Matt Holsten
 * @author Jenny Villari
 */
public class writeVerticalProcessor
{
    int number;
    /**
     * The writeVerticalProcessor is the constructor that creates the writeVerticalProcessor 
     * object and takes no parameters.
     */	
    public writeVerticalProcessor()
    {}

    /**
     * The writeVertical method is a recursive and takes an integer as a parameter and finds its remainder using the modular
     * function and stores it as a variable called number. The remainder is then subtracted from the 
     * original number and divided by ten. The result is outputted and the method repeats for the previos digit because
     * it is recursive.
     * @param num number that the user wants to output descending by digit.
     * @return writeVertical(num) continues recursion
     */	
    public int writeVertical(int  num)
    {
        if(num < 1)
           return 0;
        else
        {
            int number = num % 10;
            num = (num - number)/10;
            System.out.println(number);
            return writeVertical(num);
        }

    }

}