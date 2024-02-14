import java.util.ArrayList;

public class AbstractInterfaceDriver {

    public static void main(String[] args) {

        /** Abstract classes

         An abstract class is not instantiated, but other classes extend it.
         From this statement, what can you infer about them.

         In a UML diagram - an Abstract class is drawn like regular classes,
         except the name of the class and abstract methods are in italics


         Abstract class Rules

         - To define a class as abstract, you use the keyword abstract
         in the class header.
         - You CANNOT instantiate an instance of an abstract class
         - It must serve as a superclass. It can be a subclass, but must
         have a subclass connected to it to be used.
         - Abstract classes do not have to have an abstract method, but if
         a class has an abstract method, the class MUST be abstract.
         (There is no real reason to have an abstract class without
         having an abstract method in it)
         - BUT an abstract class can be used to define an array or ArrayList
         and every cell must be a subclass (by way of polymorphism)

         Abstract classes are a great way to force subclasses to have methods
         you want them to have.

         */

//		 Insect ins = new Insect();

        Insect[] se = new Insect[100];
        ArrayList<Insect> insects = new ArrayList<Insect>();
        se[0] = new Cricket();
        se[1] = new BumbleBee();

        insects.add(new Cricket());
        insects.add(new BumbleBee());


        /** Abstract methods

         Abstract Method Rules

         - To define an abstract method, you use the keyword abstract
         - An abstract method has no body and their header must end with a
         semicolon.
         - Abstract methods must be overridden in a subclass. The subclass is
         forced to implement a superclasses abstract method.
         - If a class has an abstract method, the class MUST be abstract
         and cannot be instantiated.


         */


        /** Interface

         An interface specifies behavior for a class

         They are class like in structure but are not a class. They are used to force
         classes to have certain methods.

         Interface Rules
         - Interfaces can't be instantiated (like abstract classes), but are instead
         implemented by other classes.
         - Must use the keyword interface in the header instead of class
         - Classes use the keyword implements in their class header
         to connect to an interface
         - A class can implements more than one interface
         - Interface fields/variables (if they have them) are CONSTANTS only.
         - Each will have at least one method and all the methods are abstract
         (except since Java version 8, interfaces may now have default methods
         which have a body, and any class that uses the interface can
         (but not required to) override the default method)


         */
    }

}