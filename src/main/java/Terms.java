import java.util.Scanner;

public class Terms {

    public static void main(String[] args) {
        /** Types of data vs data types

         There are 2 Types of data: Objects and primitives

         Object's can be anything:  Person, Car, Cat, Scanner

         primitive data types are numbers, single characters, or true/false
         int, double, char, boolean
         */
        int time = 10;
        double sec;

        Scanner keyboard = new Scanner(System.in);

        /**
         variables - are simply identifiers that are programmer-defined
         names that represent some element of a program.
         They point to a space in memory and that space in memory stores
         a value or values (depending on the type of data).

         Every variable must be declared.

         A declaration only specifies the data type and variable name.
         No value is assigned to be stored in the memory space,
         but a memory space is allocated for the variable with a
         size based on the data type.
         */

        int value;
        Scanner scan;


        /**  initialize - primitives are initialized
         Strings can also be initialized
         */
        int number = 28; // equal sign is known as the assignment operator
        String name = "Bob";

        System.out.println();

        /**  instantiate an Object using an instantiation
         */
        Person person = new Person();
        /**
         Person - is the data type
         person (lower case p) - is the object/variable name
         new - is ALWAYS used in an instantiation because you are making a
         NEW Object reference (a new space in memory)
         Person() - is a method call (notice the parenthesis), calling the
         Constructor of the Person class to create the new Object

         Strings can also be instantiated but are not usually
         */
        String word = new String("Hi");


        /**     Decision Structures/ Conditionals
         */

        if (number > 50) {
            System.out.println("it prints");
        }
        /**
         for just one condition, the print only happens
         IF number has a value over 50

         2 conditions: looking for a true or false
         */
        if (number > 50) {

        }
        else System.out.println("Nope");

        /**
         2 conditions (or more): looking for true statements only
         */
        if (number > 50) {

        }
        else if (number > 100) {

        }
        else if (number > 150) {
        }
        //etc..

        /**
         multiple conditions of true and only 1 false
         */

        if (number > 50) {

        }
        else if (number > 100) {

        }
        else System.out.println("nope");


        /** loops - covered 3 in Java 1.

         All of these loops contain the same aspects:
         a loop control variable - below they are found or i
         a test of the loop control variable
         an update of the loop control variable


         while loop
         */
        boolean found = false;
        while(!found) {
            /**
             The ! (the not logical operator) shown above before the
             variable found to flip its value for the loop,
             but doesn't affect its value in memory.

             if what is being looked for is found, change found to true
             */
            found = true;
            /** without the above statement updating the variable
             can the loop ever end?
             */
        }

        /**  do while - notice the while is after the closing curly
         brace, and it has a semicolon at the end of the
         statement.
         */
        do {
            /**
             again, if what is being looked for is found,
             change found to true
             */
        } while(!found);


        /** for loop
         */
        for(int i = 0; i < 5; i++){

        }




        /**           methods

         method call
         */
        sumValues();
        /** Just by looking at this method call, what can you
         tell me about the method sumValues???
         */



        /** values in the parenthesis of a method call are known as
         arguments. You pass arguments to methods.
         */
        printInfo(50, "Bob", "Oxford");


        /** Working with a Class like the Person Class
         */

        person.setName("Bob");
        person.setAge(20);


        System.out.print("Name: " + person.getName());
        System.out.println(" Age: " + person.getAge());

        System.out.println("Name: " + person.getName() + " Age: " + person.getAge());
        Person p2 = new Person("Bob", 30);
    }

    private static int sumValues() {
        int[] nums = {2, 4, 6, 8, 10};
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    private static void printInfo(int i, String name, String town) {
        // 1        2       3           4
    }
    /**
     Before we dive into Classes let's revisit the parts of a method

     1. access/method specifier - public or private (for now)
     and static or not - static should only be used for methods
     found in the class with the main method.
     2. return type - does it return a value or not
     3. method name
     4. parenthesis - empty parameter list or non-empty
     */

}
