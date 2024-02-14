import java.text.DecimalFormat;

public class TermsAndConcepts {

    public static void main(String[] args) {
        DecimalFormat deform = new DecimalFormat("#.00");

        /** The concept that you simply pass data (information) to a class is
         inaccurate.
         What you actually have to do is pass the data to a METHOD of the class,
         so that data can be received, stored, or processed.

         Passing data is done in one of to manors depending on the data.

         Primitives are passed by value to methods
         this means that when you pass a primitive value from one method,
         like the main method, to another method, there are two memory locations
         with the same value. Any change to one value does not affect the other

         Objects are passed by reference. A reference is the memory location where
         the Object is stored.
         This means that when an Object is passed from one method to another,
         there is only one memory location, and both variables point
         to the same location. Any change to one variable will affect both
         So, if I have an array, and pass it to another method, then I
         change the value stored in the third cell in the second method, it
         will also change the third cell for the first method.

         Please be sure to read about the difference of the two in the book.
         */



        /** Aggregation - occurs when an instance of one class is a field
         in another class
         It is said to make a "has a" relationship between the two classes
         Where one class "has a" reference to the other class

         Class A "has a" class B object */

        MotorCycle rocket = new MotorCycle();
        /** This class "TermsAndConcepts" now "has a" instance of a MotorCycle Object
         This class can now access to all the methods in the MotorCycle class
         using the variable rocket */
        rocket.setMake("Harley");

        /** But the MotorCycle class can't access any of this classes methods
         And no, you would not have aggregations both ways between classes.

         the "static" keyword
         this makes 1 and only one memory location */

        MotorCycle[] rockets = new MotorCycle[6];
        rockets[0] = new MotorCycle("honda", 25008.4);
        rockets[1] = new MotorCycle("ford", 29867.8);
        rockets[2] = new MotorCycle("chevy", 4986.5);
        rockets[3] = new MotorCycle("kia", 8752.3);
        rockets[4] = new MotorCycle("lexus", 37826.5);
        rockets[5] = new MotorCycle("toyota");

        for(int i = 0; i < rockets.length; i++){
            System.out.println("Make: " + rockets[i].getMake() + " costs: $" + deform.format(rockets[i].getCost()) +
                    " the memory address: " + rockets[i].toString());
        }

        System.out.println();

        MotorCycle[] rock;

        rock = rockets;
        /** does this make a copy of the original array,
         so that there are two arrays in memory? */



        /** using rock array (the second array), I'll make a change */
        rock[3].setMake("Mazda");

        /** then print the value in the rockets array (the first array) */
//        System.out.println("Make: " + rockets[2].getMake() + " costs: $" + deform.format(rockets[2].getCost()));
        /** or using the toString method */
//        System.out.println(rockets[3].toString());
//        System.out.println();


    }

}