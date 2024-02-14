public class MotorCycle {

    /** open the Structure on side to show UML

     class attributes */

//	 static String make;
    /** static is great for CONSTANT class attributes (storing values that
     never or rarely change - like tax rates or years), but not for
     normal variables which store values that change often.

     The keyword static creates one and only one memory location.
     A static class member belongs to the class, not objects
     instantiated from the class.
     By using static every instance of the MotorCycle class will use one
     make variable memory location, so all of them have the same make




     Once you know the attributes, you should declare them at the
     top of the class after the class header and make them private,
     since you don't want outside classes accessing the attributes
     directly.
     This includes arrays or arrayLists classes.

     You generally don't initialize the attributes at the top
     of the class. That way you can reuse the class multiple
     times like a blueprint for a house. */

    private String make;
    private double cost;

    /** empty parameter list Constructor
     */
    public MotorCycle() {
        make = "";
        cost = 0.0;
    }

    /** non-empty parameter list Constructor
     * @param Make
     * @param cost
     */
    public MotorCycle(String Make, double cost) {
//        make = make;  /** <-- this is known as shadowing. */
        /** Shadowing is caused by having a local variable and
         class (global) variable/attribute spelled the same
         as they are here. */
        make = Make; /** change the spelling fixes the issue */
        this.cost = cost;
        /** notice the keyword "this"
         it is used to overcome shadowing
         Or you could spell the local variable with a capitol
         letter or just differently from the global variable
         The key word "this" refers to this current instance of the object. */
    }

    /** calling an overloaded Constructor with the keyword "this"
     * @param make
     */
    public MotorCycle(String make) {
        this(make, 0.0);
        /** you won't see code like this often, but it is possible
         For this example, only the make of the motorcycle was available
         for the instantiation, so the cost is blank (a non-value)
         As I've said before, you usually only have the empty and
         non-empty Constructors */
    }


    // setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    // getters
    public String getMake() {
        return make;
    }
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("Make %s, cost $%.2f" , make, cost);
    }
}