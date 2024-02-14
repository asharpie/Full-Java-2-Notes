import java.util.Scanner;

public class WrapperClasses {

    public static void main(String[] args) {

        /** Java provides wrapper classes for primitive data types. They
         provide methods that perform operations related to the type.

         Integer, Double, Character, Boolean, etc.

         They are used most often with ArrayLists but are also
         used when converting values and in tests

         You probably used one during Java 1 when converting
         a String of numbers to an int parsing the String
         */
        String nums = "7625";
        int numb = Integer.parseInt(nums);
        /** This converts the String of numbers to an int that can
         be used for calculations

         This is quite often used when reading from a text file,
         as text files contain Strings and when those values need
         to be converted, the parse method comes in handy.

         Converting a numeric value to a String
         There are two ways */

        int num = 786234;

        /** Using the Integer class toString method
         to convert an integer to a String */
        String number1 = Integer.toString(num);

        /** or the String class valueOf method */
        String number2 = String.valueOf(num);

        /** Many times the class Character is used for input validation
         to ensure users entered the correct information
         */

        /** example */
        Scanner keyboard = new Scanner(System.in);

        boolean good = false;
        /** create a variable to know whether to loop or not */

        int number = 0; /** will store the number */

        while(!good) {  /** loop as long as good is false
         and the input is incorrect */
            System.out.println("Enter 5 numbers without a decimal");
            /** I'm getting the user input as a String */
            String input = keyboard.nextLine();
            /** I will then test the users input
             First, test the length of the input */
            if(input.length() != 5) {
                System.out.println("Invalid input length");
                System.out.println();
            }
            else {
                int index = 0;	/** to keep track of the index */
                boolean valid = true;
                /** next test the input for all numbers */
                while(valid && index < input.length()) {
                    if(!Character.isDigit(input.charAt(index))) {
                        valid = false;
                    }
                    index++;
                }
                if(valid) {
                    /** if the correct length and all numbers
                     convert the String to an int */
                    number = Integer.parseInt(input);
                    /** assign good true to stop the outer loop */
                    good = true;
                }
                else {
                    System.out.println("Invalid, input was not all numbers");
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.printf("Math equation: %d + 1000 = %d\n", number, number + 1000);


        /** Scanner Issue with user input */

        System.out.println("Enter a whole number");
        int testNumber = keyboard.nextInt();
        System.out.println("The number the user entered " + testNumber);
        System.out.println();

        System.out.println("Enter a word");
        String word = keyboard.nextLine();
        System.out.println("The word the user entered " + word);
        System.out.println();

        /** The Scanner never waited for the user to enter
         a value!! Why?? */





        /** place keyboard.nextLine() on line 94 to correct the issue
         explained below

         It has to do with the input buffer and what the Scanner's method looks for.
         When the computer reaches the .nextInt method, it waits for the user
         to hit the enter button.
         Whatever the user enters is first written to a buffer (a waiting area
         between the keyboard and the CPU).
         The Scanner classes nextInt method (and all the numeric methods really)
         reads the value from the buffer as an int (or corresponding numeric),
         but ignores the carriage return (the symbol for the return or enter button)
         However, Scanner classes nextLine method looks for a carriage return and
         returns all the data before it.
         Because the nextInt doesn't remove the carriage return, the nextLine
         finds the leftover carriage return in the buffer, grabs what was in front
         of the carriage return (which is nothing) and doesn't wait for any
         user input anything. It treats the leftover carriage return as user input.

         This only happens when read a number then a String.
         To fix this issue, clear the buffer before reading a String after
         reading a number, by calling a nextLine without assigning a variable.
         Example placed between the above code.
         */



    }

}