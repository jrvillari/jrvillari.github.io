/**
 * Assignment: Project 1
 * Due date: 9/25/2013
 * Instuctor: Dr. DePasquale
 * Submitted by: JR Villari
 */

import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * The Calculator class reads input from an input file titled "calculator.txt" and processes 
 * and prints the commands provided. It reads the first integer in the input file and 
 * processes that number of subsequent lines. For the lines that follow that integer, it
 * reads the first token as a string but only recognizes the  +, -, *, /, %, sin, cos, tan,
 * sqrt, n!, power, min, precision and round commands. It then reads the next number(s)
 * provided and performs the given command on the number(s). The command, number(s) and
 * answer are all outputted for each line. The purpose of the class is to perform simple
 * calculations on provided numbers with given commands.
 *
 * @throws an IOException is thrown if the file "calculator.txt" is not found
 *
 * @author JR Villari
 */
public class Calculator 
{
    public static void main (String[] args) throws IOException
    {
        /**
         * The integer names that store the first integer number in the file "calculator.txt"
         * which determines how many lines will be read (commandTotal), the integers and
         * answer in the % and precision calculations (inum1, inum2, ians) and the current
         * mimimum in the min calculation (currentMin).
         */
        int commandTotal, inum1, inum2, ians, currentMin;
        
        /**
         * The integer name that keeps count of how many lines are read in the file 
         * "calculator.txt" and increments at the end of each command execution.
         */
        int commandCount = 0;
        
        /**
         * The integer name that stores the ultimate minimum in the min calculation. 
         */
        int min = 0;
        
        /**
         * The integer name that stores the integer required to perform the factorial command. 
         */
        int n = 0;
        
        /**
         * The name of the ultimate product of the factorial command; it is equivalent to 1 
         * because if it were 0 it would make the product always equal 0.
         */
        long fact = 1;
        
        /**
         * The double names that store the integers and answer involved in the +, -, *, /,
         * sin, cos, tan, sqrt, power, and round calculations.
         */
        double num1, num2, ans;
        
        /**
         * The string name that stores the contents of each line in the file "calculator.txt".
         */
        String line;
        
        /**
         * The name of the scanner that reads the file "calculator.txt".
         */
        Scanner fileScan;
        
        
        /**
         * Sets the default output precision to 3 decimal places following the decimal point.
         */
        DecimalFormat fmt = new DecimalFormat("0.000");
        
        
        /**
         * Constructs a new scanner that reads values scanned from "calculator.txt" so that
         * they can be used within the program.
         */
        fileScan = new Scanner(new File("calculator.txt"));
        
        /**
         * Scans for the first int in the file and assigns it to the commandTotal variable so
         * it can be used as the maximum number of executions of the while loop.
         */
        commandTotal = fileScan.nextInt();
        
        /**
         * While loop that executes until the number of executions is equal to the maximum 
         * number of lines to be read provided in the first line of the file "calculator.txt".
         * In the loop, the next line in the file is scanned and the first string token is
         * read, interpreted, and executed by several if and if-else statements. If the string 
         * token is not recognized, nothing is outputted. At the end of the loop commandCount
         * is incremented to ensure that the correct number of lines are read.
         */
        while (commandCount < commandTotal)
        {
            /**
             * Scans the file "calculator.txt" for the first token of the next line and stores 
             * it as a string named string 
             */
            line = fileScan.next();
            
            /**
             * If the first token of the string is equal to +, the addition command is 
             * executed in which the next two numbers are scanned and stored as num1 and num2. 
             * num1 and num2 are then added together and the result is stored in ans. The
             * original line from the file is outputted followed by = and the result.
             */
            if (line.equals("+"))
            {
                num1 = fileScan.nextDouble();
                num2 = fileScan.nextDouble();
                ans = num1 + num2;
                System.out.println("+ " + num1 + " " + num2 + " = " + fmt.format(ans));
            }
            /**
             * If the first token of the string is equal to -, the subtraction command is
             * executed in which the next two numbers are scanned and stored as num1 and num2.
             * num2 is then subtracted from num1 and the result is stored in ans. The
             * original line from the file is outputted followed by = and the result.
             */
             else if (line.equals("-"))
             {
                 num1 = fileScan.nextDouble();
                 num2 = fileScan.nextDouble();
                 ans = num1 - num2;
                 System.out.println("- " + num1 + " " + num2 +" = " + fmt.format(ans));
             }
            /**
             * If the first token of the string is equal to *, the multiplication command is
             * executed in which the next two numbers are scanned and stored as num1 and num2.
             * num1 is then multiplied by num2 and the product is stored in ans. The
             * original line from the file is outputted followed by = and the result.
             */
             else if (line.equals("*"))
             {
                 num1 = fileScan.nextDouble();
                 num2 = fileScan.nextDouble();
                 ans = num1 * num2;
                 System.out.println("* " + num1 + " " + num2 +" = " + fmt.format(ans));
             }
            /**
             * If the first token of the string is equal to /, the division command is
             * executed in which the next two numbers are scanned and stored as num1 and num2.
             * num1 is then divided by num2 and the result is stored in ans. The
             * original line from the file is outputted followed by = and the result.
             */
             else if (line.equals("/"))
             {
                 num1 = fileScan.nextDouble();
                 num2 = fileScan.nextDouble();
                 ans = num1 / num2;
                 System.out.println("/ " + num1 + " " + num2 +" = " + fmt.format(ans));
             }
            /**
             * If the first token of the string is equal to %, the modular command is
             * executed in which the next two integer numbers are scanned and stored as inum1
             * and inum2. inum1 is then divided by inum2 and the remainder is stored in ans.
             * The original line from the file is outputted followed by = and the result.
             */
             else if (line.equals("%"))
             {
                 inum1 = fileScan.nextInt();
                 inum2 = fileScan.nextInt();
                 ians = inum1 % inum2;
                 System.out.println("% " + inum1 + " " + inum2 +" = " + fmt.format(ians));
             }
            /**
             * If the first token of the string is equal to sin, the sine command is
             * executed in which the following number is stored as num1. num1 is then
             * converted to radians and stored as num2. The sine of num2 is then calculated
             * using the Math class and the original line from the file is outputted followed
             * by = and the result.
             */
             else if (line.equals("sin"))
             {
                 num1 = fileScan.nextDouble();
                 num2 = Math.toRadians(num1);
                 ans = Math.sin(num2);
                 System.out.println("sin " + num1 + " = " + fmt.format(ans));
             }
            /**
             * If the first token of the string is equal to cos, the cosine command is
             * executed in which the following number is stored as num1. num1 is then
             * converted to radians and stored as num2. The cosine of num2 is then calculated
             * using the Math class and the original line from the file is outputted followed
             * by = and the result.
             */
             else if (line.equals("cos"))
             {
                 num1 = fileScan.nextDouble();
                 num2 = Math.toRadians(num1);
                 ans = Math.cos(num2);
                 System.out.println("cos " + num1 + " = " + fmt.format(ans));
             }
            /**
             * If the first token of the string is equal to tan, the tangent command is
             * executed in which the following number is stored as num1. num1 is then
             * converted to radians and stored as num2. The tangent of num2 is then calculated
             * using the Math class and the original line from the file is outputted followed
             * by = and the result.
             */
             else if (line.equals("tan"))
             {
                 num1 = fileScan.nextDouble();
                 num2 = Math.toRadians(num1);
                 ans = Math.tan(num2);
                 System.out.println("tan " + num1 + " = " + fmt.format(ans));
             }
            /**
             * If the first token of the string is equal to sqrt, the square root command is
             * executed in which the following number is scanned and stored as num1.
             * The square root of num1 is calculated using the math class and the result is
             * stored in ans. The original line from the file is outputted followed by = and
             * the result.
             */
             else if (line.equals("sqrt"))
             {
                 num1 = fileScan.nextDouble();
                 ans = Math.sqrt(num1);
                 System.out.println("sqrt " + num1 + " = " + fmt.format(ans));
             }
            /**
             * If the first token of the string is equal to n!, the factorial command is
             * executed in which the following number is scanned and stored as n.
             * Using a for loop that only repeats when i is less than or equal to n, an
             * integer i is initialized and set equal to 1. In the loop the variable fact is
             * multiplied by i and stored in back in fact. This is done in order to
             * calculate the factorial. Then i is incremented by 1 so that the same number is
             * not multiplied more than once. The original line from the file is then
             * outputted followed by = and the result.
             */
             else if (line.equals("n!"))
             {
                 n = fileScan.nextInt();
                 for(int i = 1;i <= n;++i)
                     fact *= i;
                 System.out.println("n! " + n + " = " + fact);
             }
            /**
             * If the first token of the string is equal to power, the exponent command is
             * executed in which the next two numbers are scanned and stored as num1 and num2.
             * Using the math class, num1 is set to the power of num2 and stored in ans. The
             * original line from the file is outputted followed by = and the result.
             */
             else if (line.equals("power"))
             {
                 num1 = fileScan.nextDouble();
                 num2 = fileScan.nextDouble();
                 ans = Math.pow(num1, num2);
                 System.out.println("power " + num1 + " " + num2 + " = " + fmt.format(ans));
             }
            /**
             * If the first token of the string is equal to min, the minimum command is
             * executed in which the next integer is scanned and stored as inum1 which is the
             * number of numbers that follow it. The next int is than scanned and stored in
             * currentMin. Then a while loop is exectuted only is the line has a next integer.
             * If it does, the next integer is scanned and stored in min. Then an if loop
             * checks to see if min is less than the currentMin. If it is, currentMin is set
             * equal to min.The original line from the file is outputted followed by = and the 
             * result.
             */
             else if (line.equals("min"))
             {
                 inum1 = fileScan.nextInt();
                 currentMin = fileScan.nextInt();
                 
                 System.out.print("min " + currentMin + " ");
               
                 while (fileScan.hasNextInt() == true)
                 {
                     min = fileScan.nextInt();
                     System.out.print(min + " ");
                     if (min < currentMin)
                         currentMin = min;
                 }
                 System.out.println("= " + currentMin);
                

             }
            /**
             * If the first token of the string is equal to precision, the precision command
             * is executed which scans the next integer and stores it as inum1. Being all
             * the values being affected by the formatting are doubles and doubles can only
             * have a maximum of 17 decimal places, 17 if and if-else statements are used and
             * executed depending on the number following the precision command. Then using
             * the DecimalFormat class a new decimal format is stored in fmt depending on the
             * number following the precision command. There is no output produced.
             */
             else if (line.equals("precision"))
             {
                 inum1 = fileScan.nextInt();
                 if (inum1 == 0)
                     fmt = new DecimalFormat("0");
                  else if (inum1 == 1)
                      fmt = new DecimalFormat("0.0");
                  else if (inum1 == 2)
                      fmt = new DecimalFormat("0.00");
                  else if (inum1 == 3)
                      fmt = new DecimalFormat("0.000");
                  else if (inum1 == 4)
                      fmt = new DecimalFormat("0.0000");
                  else if (inum1 == 5)
                      fmt = new DecimalFormat("0.00000");
                  else if (inum1 == 6)
                      fmt = new DecimalFormat("0.000000");
                  else if (inum1 == 7)
                      fmt = new DecimalFormat("0.0000000");
                  else if (inum1 == 8)
                      fmt = new DecimalFormat("0.00000000");
                  else if (inum1 == 9)
                      fmt = new DecimalFormat("0.000000000");
                  else if (inum1 == 10)
                      fmt = new DecimalFormat("0.0000000000");
                  else if (inum1 == 11)
                      fmt = new DecimalFormat("0.00000000000");
                  else if (inum1 == 12)
                      fmt = new DecimalFormat("0.000000000000");
                  else if (inum1 == 13)
                      fmt = new DecimalFormat("0.0000000000000");
                  else if (inum1 == 14)
                      fmt = new DecimalFormat("0.00000000000000");
                  else if (inum1 == 15)
                      fmt = new DecimalFormat("0.000000000000000");
                  else if (inum1 == 16)
                      fmt = new DecimalFormat("0.0000000000000000");
                  else if (inum1 == 17)
                      fmt = new DecimalFormat("0.00000000000000000");
             }
            /**
             * If the first token of the string is equal to round, the round command is
             * executed in which the following number is scanned and stored as num1.
             * num1 is then rounded using the Math class and the result is stored in ans. The
             * original line from the file is outputted followed by = and the result.
             */
             else if (line.equals("round"))
             {
                 num1 = fileScan.nextDouble();
                 ans = Math.round(num1);
                 System.out.println("round " + num1 + " = " + ans);
             }
            /**
             * If the first token of the string is equal to anything other than +, -, *, /, %,
             * sin, cos, tan, sqrt, n!, power, min, precision or round nothing is outputted.
             */
             else
             {
                 System.out.print("");
             }
            
            /**
             * After each execution of the if-else statements, commandCount is incremented by
             * 1 to ensure that only the number of lines provided in the first line of the 
             * "calculator.txt" file are executed. 
             */
            commandCount = commandCount + 1;
            
        }
        
    }
}
