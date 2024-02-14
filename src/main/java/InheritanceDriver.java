import java.util.Scanner;

public class InheritanceDriver {


    public static void main(String[] args) {

        /** Inheritance

         It is another way classes are connected.
         We have covered Aggregation where one class "has a" Object
         reference of another class (A Doctor has a Patient)

         Inheritance connections have an "is a" relationship between
         the classes, where one class is a specialized version
         of another class.

         examples of Inheritance:
         A bee is an insect
         A poodle is a dog
         A flower is a plant

         * Inheritance allows a new class to extend an existing
         class. The new class inherits the members (methods) of the
         class it extends.


         Instead of making an instantiation, you use the keyword "extends"
         in the header of the specialized class to make the connection
         between the classes


         Inheritance involves a superclass (the class being inherited from)
         and a subclass (the specialized class)
         They are sometimes called:
         parent		    and 	child
         or
         base class      and		derived class

         To show inheritance in a UML Diagram you would have a line
         (a solid line not dashes) with an open arrowhead from
         the subclass to the superclass

         superclass <|--- subclass

         For Aggregation, it is a solid line with an open diamond from the
         regular Object to the class that has the variable

         Doctor <>---- Patient


         Just like in Aggregation, Inheritance is a one way street and does
         not work in reverse
         The subclass has access to the members and methods of the superclass,
         but the superclass has no access to the subclass.


         A subclass can only extend from ONE superclass!!! But a superclass
         can have multiple subclasses


         a Dog class can be a superclass to Poodle, Boxer, Rottweiler,
         and Retriever classes (basically all types of dog classes)

         Also, due to chains of inheritance, a subclass's superclass
         can be a subclass to another superclass

         Animal  <|---  Mammal  <|----  Human

         In this example the Human class extends the Mammal class, which
         extends the Animal class.
         The Human class has access to the Mammal classes members and methods
         AND it also has access to Animal class members and methods
         because the Mammal class has access to them.



         The Object class

         Java has a class called Object, which ALL other classes in Java
         directly or indirectly inherit from the Object class.
         Many of you may have experienced this when printing an array,
         and you got something like a@97e53b the memory address
         instead of the data in the memory location. This is the
         Object classes toString method at work.
         If you ever noticed when you typed an Object name and
         then hit a period, some methods listed have "Object"
         to the side, those are the inherited methods from
         the Object class



         The keyword "super" can be used in a subclasses Constructor to call
         the superclasses Constructor
         It must be the first statement in the subclass Constructor

         public Dog() {
         super(); MUST be first statement above anything else
         pet = false;
         huntingType = sight;
         }


         Overriding

         A subclass may have a method with the same
         signature (name and parameter list) as a superclass method.
         In such a case, the subclass method overrides the superclass
         method.
         This is important as sometimes a subclass inherits a method
         from the superclass, but the method is inadequate for the subclass
         since it is a more specialized class. So the subclass must
         "override" the superclass method to replace it with a more
         suitable method (one that reflects the special aspects of the
         subclass).

         Overloading vs. Overriding
         Overloading is where multiple methods have the same name but different
         parameter lists. Can happen in the same class and Inheritance classes
         Overriding however the methods have the same signature
         (name and parameter list). can only happen in Inheritance classes


         There are times when you want both the superclasses overridden method
         and the subclasses' method to happen (like to print data
         from both classes). In the subclass method, you can use the keyword
         "super" to reference the superclasses overridden method

         Example: If both the superclass and subclass have a print method
         public void print(){
         - print the subclass's info
         super.print(); --- would force the superclasses print method
         to happen
         }
         */
        Mammal mam = new Mammal();
        mam.print();
        System.out.println();


        Dog spot = new Dog(true, "smell", false);
        spot.print();
        System.out.println();

        /**

         Two new access specifiers: protected and package (aka no modifier or default)
         the tables can be found in the book

         A Variable in a class:                        package   public  protected   private
         accessible to subclass inside same package      yes      yes      yes        no
         accessible to all other classes same package    yes      yes      yes        no
         accessible to subclass outside same package     no       yes      yes        no
         accessible to all other classes outside same    no       yes      no         no

         Universal Modeling Language

         In a UML public is denoted by a +	in IntelliJ	green lock open
         private is denoted by a -				red lock closed
         protected by a #						gray key
         package by a ~							gray circle
         */

        Poodle fluff = new Poodle("white", "curly", true, "sight");

        System.out.println("The poodle hunts by " + fluff.getHuntingType());
        System.out.println("The poodle is a family pet " + fluff.isPet());
        fluff.print();
        System.out.println();

        /**

         polymorphism - means the ability to take many forms
         A superclass reference variable can reference objects of
         a subclass

         normally in an instantiation the Object name is the same on both
         sides of the = new

         Lizard fred = new Lizard();


         But with Inheritance, the superclass name can be on the
         left and a subclass name on the right

         superclass variableName = new subclass();

         Lizard fred = new Gecko();

         THEY CAN NOT BE SWITCHED/REVERSED!!!

         */

        System.out.println();
        Mammal fido = new Dog(true, "smell", true);
        fido.print();
        System.out.println();






        /** because of polymorphism, you can have an array or ArrayList
         where every cell of the structure is a different subclass */
        Mammal[] mams = new Mammal[20];
        mams[0] = new Dog();
        mams[1] = new Fox();



        /** instanceof operator */
        if (fido instanceof Dog){
            System.out.println("Yes fido is an instance of Dog");
        }
        else {
            System.out.println("nope, fido is just fido");
        }
        if (fido instanceof Mammal){
            System.out.println("But fido is also an instance of Mammal");
        }
        else {
            System.out.println("nope, fido is just fido");
        }

        /** casting an object to another object */
        System.out.println("Fido hunts by " + ((Dog) fido).getHuntingType());


    }

}