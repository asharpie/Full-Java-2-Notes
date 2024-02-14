public class Person {
    /**
     A Class represents any Object (thing - real or not)
     imaginable.

     examples: Puppy, Car, House, Chair, Course,
     Student, SpaceShip, Alien, etc.

     When you write a Class, you must determine the class
     attributes (also known as class variables, fields, or
     global variables)
     that specifies what constitutes or makes up that object.

     For example:
     a Person - what makes up a person?
     - a name
     - an age
     - maybe a hometown
     - Depending on the country: a SS number?
     - height
     - weight
     - hair color
     the list goes on and there could even be an array
     or arrayList (we'll cover these later)

     Once you know the attributes, you should declare them at the
     top of the class after the class header and make them private,
     since you don't want outside classes accessing the attributes
     directly.
     This includes arrays or arrayLists classes.

     You generally don't initialize the attributes at the top
     of the class. That way you can reuse the class multiple
     times like a blueprint for a house.

     These attributes are needed to instantiate one Person
     object in another class like the Driver or in an
     intermediate class (which is an Object class that has another
     Object class as an attribute).
     */

    /** class attributes declared only  */
    private String name;
    private int age;


    /**
     So how do we give values to the attributes to store?


     The 4 primary methods of an Object Class
     Constructor - builds the memory locations for the Class and attributes
     Accessor - getter - returns the value of a single attribute
     Mutator - setter - changes the value of a single attribute
     toString - returns a String that represents the state of the
     object. The String will be appropriate for displaying
     the information of a Class  with labels to the screen
     for a user.


     2 types of Constructors
     empty parameter list - assigns the attributes null or non values
     non-empty parameter list - assigns attributes values
     that have been passed to the method
     you should generally have 2 Constructors (1 empty and 1 non-empty),
     but can have more, as needed by the class or design of the program.
     */

    /** empty parameter list */
    public Person(){
        name = "";
        age = 0;
        // name = null;
        /** Strings and Objects can be assigned a null
         primitives cannot
         */
    }

    /** non-empty parameter list */
    public Person(String n, int a) {
        name = n;
        age = a;
    }


    /** looking at these two methods what rules can you discern?


     1. The name of a Constructor MUST match the name of the class
     2. a Constructor NEVER has a return type
     */


    /** setters */
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }


    /** What rules can you discern from the method?


     setters
     1. does not return any value
     2. has a single parameter
     3. the method name begins with set
     4. Assigns the value passed to the method to the attribute
     associated with the method name
     */

    /** getters */

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


    /**
     getters
     1. always returns the value stored by the attribute associated
     with the name of the method - doesn't normally have a
     parameter but there are circumstances when one is needed
     (usually for Junit testing only)
     2. the method name starts with get
     */

    @Override
    public String toString() {
        return "Name: " + name + ", age " + age;
    }

    /** a toString
     returns a String
     */
}