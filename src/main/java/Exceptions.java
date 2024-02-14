import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) throws IOException {

        /**	Exceptions

         An exception is an object that is generated as the result of an
         error or unexpected event.

         To prevent exceptions from crashing your program, you
         must write code that detects and handles them.

         By reading the first sentence above, you should realize that exceptions
         are predefined Java classes (since they are objects and objects
         are created from classes). Some have to be imported
         (like those dealing with I/O) while others do not (like
         IndexOutOfBoundsException - when you try to access a cell outside
         an array).

         As stated before, the Object class is the highest class in Java, and
         every class either directly or indirectly inherits from it, this
         includes Exceptions.

         There is a hierarchy (inheritance) of exception classes

         Object
         ^
         Throwable -	the root class of exceptions
         _________________^_______________
         |								  |
         Error						   Exception
         ^					_______________^_________________
         critical errors		    |			|					|
         like running out of	   ...		IOException		RuntimeException
         memory	or internal 	   		________^_________
         error in the Java 				|				  |
         Virtual Machine		  	EOFException	FileNotFoundException



         All Exceptions are said to be "thrown" by a program, and to detect
         that an exception was thrown and prevent it from halting your
         application, Java allows you to create exception handlers.

         An exception handler is a section of code that gracefully responds
         to exceptions when they are thrown.

         The process of intercepting and responding to exceptions is called
         exception handling.

         3 types of exception handlers

         - default exception handler - if your code doesn't handle an
         exception when it is thrown, the default exception handler
         deals with it. It is not graceful, it stops your program
         and outputs a stack trace (a line by line propagation of
         where the exception originated and ends)

         - throws declaration (clause) - I have had you use this before,
         (and you should have seen it in Java 1, but may not have)
         when reading from a file. You place a throws declaration
         at the end of method header of the exception
         (like FileNotFoundException) that could be thrown in the
         method.

         - try/catch clauses or blocks - You cannot have a try block without
         a catch block.

         The try block is a section of code (within its curly
         braces, its "block") that a statement or statements
         could cause an exception/s

         The catch block specifies a possible exception by defining
         a variable with that exception type, then performs an action,
         usually a print statement informing the user what exception
         happened and what they can do about it.

         The great thing about try/catch blocks is that they do not end
         the program unlike the other 2 handlers


         */

//		File file = new File("hi.txt");
//		Scanner scan2 = new Scanner(file);


        Scanner keyboard = new Scanner(System.in);

        String str = "isgew";
        int number = 0;
        try {
            number = Integer.parseInt(str);
            System.out.println(number);
            System.out.println("Did it make it here");
        } catch (Exception e) {
            System.out.println("Conversion error " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("still prints");
        System.out.println(number);


        /**
         You can have multiple catch blocks per a single try block.
         So, a try that has a lot of code within its block, with multiple
         possible exceptions can be handled.

         */

        String stri = "isgew";
        int num = 20;
        try {
            System.out.println("Enter a whole number");
            int userInput = keyboard.nextInt();
            System.out.println("after the user input");
            int number1 = Integer.parseInt(stri);
            System.out.println(num);
        } /*catch (NumberFormatException | InputMismatchException ex) {

		} */
        catch (InputMismatchException e) {
            System.out.println("Incorrect user input " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Conversion error " + e.getMessage());
            e.printStackTrace();
        }


        System.out.println("after the catches");




        /**
         As I said earlier, exceptions have a hierarchy (inheritance), so
         the above code has an error, because the InputMismatchException is
         a sub, sub, sub, subclass of the Exception class.
         You MUST place the more specific (subclass) before the broader
         superclass exception, since the specific exception "is a"
         broader exception, the broader exception technically covers the
         specific exception.

         Since Java version 7 a catch clause can now handle more than one
         type of exception to reduce extra code, but it removes the ability
         to be specific about what happened in the message you give
         to a user about the exception.



         The finally clause - The try statement may have an optional finally
         clause, which appears after all the catch clauses. The code
         in a finally clause always execute whether an exception was
         caught or not.

         You will usually see it used to close a file after being read
         through.

         */

        Scanner scan = null;
        try {
            File file = new File("newData.txt");
            scan = new Scanner(file);
            String strin = "1623f";
            int number2 = Integer.parseInt(strin);
            System.out.println(num);
        } catch (FileNotFoundException e) {
            System.out.println("Conversion error " + e.getMessage());
        } finally {
            System.out.println("An exception was thrown, but this still happened");
            scan.close();
        }

        System.out.println("Did it make it here?");


        /** Two categories of Exceptions
         - unchecked - NEVER handle these.
         Error and Most Runtime
         - checked - you can/should handle these


         Compile time vs Runtime

         Compile time errors are the ones that are found when you compile
         your code (using Cmd Prompt in Java 1). They were forgetting
         a semicolon, or spelling a variable wrong, etc. IntelliJ points
         most of these out to you now as you type the code.

         Runtime happens when you run the code. They are not syntax issue,
         but things that can only happen while the code is running.
         Trying to access a cell outside an array, user input
         mismatch, etc.

         IO is the one group of odd Exceptions, you can't use the default
         exception handler and must use either a throws declaration or
         a try/catch at Compile time. The main reason is that you are
         dealing with files outside your code.


         The 3 Tense's of throw - (exceptions)
         - thrown - all exceptions are thrown
         - throws declaration - informs the compiler that a method throws an
         exception (or at least could)
         - throw statement - you can make your own exceptions which causes
         an exception to be thrown.

         When using the throw statement, you throw an exception manually.
         Specify an exception and make a message for it. You may see this
         used during the creation and debugging stages of coding.
         But isn't used that often otherwise.
         */

        try {
            throw new Exception("Help me I'm lost");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Did it make it here");
    }

}