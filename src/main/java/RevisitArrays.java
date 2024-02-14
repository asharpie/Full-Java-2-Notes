public class RevisitArrays {
    public static void main(String[] args) {
        /**         Chapter 7

         Arrays are known as a data structure because they are an
         object that can store multiple values of the
         same data type simultaneously

         Arrays are a built-in class, like the String class,
         you do not need to import the class to use it.

         Arrays can store primitive values like int, double, etc.
         or they can store Objects like a Person, Dog, or Truck
         */

        int[] number = new int[100];
        String[] terms = {"uhm", "yeah", "time"};

        Person[] people = new Person[50];
//        System.out.println(people[0].getName()); // This statement causes an error

        /** each cell of an object array must be instantiated before it
         can be accessed
         */
        people[0] = new Person();
        /** and so on for each cell or use a loop */

        for(int i = 0; i < people.length; i++) {
            people[i] = new Person();
        }

        /** Rules of Arrays

         1. Arrays are never imported like other objects
         2. Arrays always use square brackets
         3. Can store primitives or Objects
         4. All Arrays have a physical length that must be specified
         on instantiation.
         A. The physical length is how many values the array can
         store. For array literals the physical length is dictated
         by how many values are in the curly braces
         B. The actual amount of data stored in an array is known
         as the logical length.
         E.g. An array with a physical length of 10
         could just store 5 values (the logical length).
         Arrays have a built-in field or attribute that keeps up
         with an arrays physical length.
         You must create a variable to keep up with an arrays
         logical length.
         5. To instantiate an array you would use the keyword "new"
         and specify the length
         EX:	        String[] words = new String[100];
         6. arrays are random accessible (you can access any cell
         without having to start at the beginning of the array).
         7. Arrays are broken into elements, aka cells, that store
         the individual values or Objects.
         8. Array's indexing (cell numbering) begins at zero just
         like String's, and the index numbering is ALWAYS integers,
         never doubles
         9. to step or iterate through the cells of an array you would
         use a loop
         */
    }
}
