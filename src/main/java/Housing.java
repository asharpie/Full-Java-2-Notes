
public interface Housing {

    /** Interfaces are not classes, they force behavior in the classes
     that use them.

     the only class variables/attributes in an interface are CONSTANTS */

    final static String LETTERS = "hi there";  // old way

    /** you used to have to specify final and static,
     but now you only need the data type, variable name, and value */

    int NUMBERS = 87152;  // new way
    int LAST_NUMBERS = 4127;

    /** Generally all methods in an Interfaces are abstract */

    public abstract void genHouseNum(); // old way

    /** like wise, you used to need the keywords public and abstract at the start,
     but now you don't, you just need the return type, method name, and parameter list */

    String makeNumber(String housingNum);  // new way

    /** Not needing to use public and abstract in the method header
     is only available in interfaces and not abstract classes */


    /** Default methods are new and the exception to the general rule of Interface methods,
     and can be overridden by the classes that use the interface. */
    default void display() {
        System.out.println("This is the display method");
    }

}