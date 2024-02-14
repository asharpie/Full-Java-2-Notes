import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        /** Rules of Arrays as a reminder

         1. Arrays are never imported like other objects
         2. Arrays always use square brackets
         3. Can store primitives or Objects
         4. All Arrays have a physical length that must be specified
         on instantiation.
         a. The physical length is how many values the array can
         store. For array literals the physical length is dictated
         by how many values are in the curly braces
         b. the actual amount of data stored in an array is known
         as the logical length
         E.g. An array with a physical length of 10
         could just store 5 values (the logical length)
         Arrays have a built-in field or attribute that keeps up
         with an arrays physical length
         You must create a variable to keep up with an arrays
         logical length.
         5. To instantiate an array you would use the keyword "new"
         and specify the length
         EX:	String[] words = new String[100];
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



        /** ArrayList's are another data structure
         they are similar to arrays but use methods
         and unlike arrays you can easily remove or insert items
         */

        /** Rules of ArrayList
         1. The ArrayList class MUST be imported
         2. You use angle brackets in the instantiation
         ArrayList<Employee> employees = new ArrayList<Employee>();
         3. ArrayLists can ONLY store Objects
         For Primitives like int, you have to use the Object class
         Integer instead, or Double, Float, Boolean, etc.
         4. You NEVER specify the length of an arraylist during the
         instantiation unlike an array.
         The default capacity of an arraylist is 10
         (number of items it can store), but as you insert more items
         the arraylist is automatically adjusted by doubling its
         capacity. E.G. when you insert the 11'th value the ArrayList
         would double to a capacity of 20, insert the 21'st
         value, and it would double again to 40, and so on
         Unlike arrays, you can ONLY every really know the logical size
         of an arraylist E.G. how many cells store a value
         The logical length of an arraylist can grow or shrink as
         values are inserted or removed
         There is no method to get the physical length of an ArrayList
         5. To instantiate an arraylist you would use the keyword "new"
         EX: ArrayList<Integer> numbers = new ArrayList<Integer>();
         6. ArrayList are random accessible (you can access any cell
         without having to start at the beginning of the ArrayList).
         7. ArrayLists are broken into elements, aka cells, that store
         the individual Objects.
         You MUST use methods to access cells, add, or remove data
         8. ArrayLists indexing (cell numbering) begins at zero just
         like arrays, and the index numbering is ALWAYS integers,
         never doubles
         9. to step or iterate through the cells of an ArrayList you would
         use a loop

         */


        /** when running this code be sure to uncomment the gray code
         and statements that begin with //
         */
        int[] number = {1, 2, 3, 4, 5};
        String[] terms = {"Hi", "What", "Yeah"};

        /** instantiation */
        ArrayList<Integer> numbers = new ArrayList<>();

        /** to get the logical size use the "size" method */
        System.out.println("How many values are in the arraylist " + numbers.size());
        System.out.println();


        /** to place a value in an arrayList use "add" method
         without the need for an assignment operator */
        numbers.add(5);     /** instead of array[0] = 5; */

        System.out.println("How many values are now in the arraylist " + numbers.size());
        System.out.println();


        numbers.add(1);
        numbers.add(10);
        numbers.add(22);
        numbers.add(7);

        /** The method "get" is just like [] square brackets for arrays
         It along with an index specifies a single cell of an arraylist
         */
        System.out.println("The value at index 2 is: " + numbers.get(2));// array[2]
        System.out.println("How many values are now in the arraylist " + numbers.size());
        System.out.println();


        /** the method "remove" deletes a value at a specified index
         once deleted the values after the removed index shift up
         */
        numbers.remove(2);
        System.out.println("The value at index 2 after a remove: " + numbers.get(2));
        System.out.println("How many values are now in the arraylist " + numbers.size());
        System.out.println();



        /** adding more values to the arraylist */
        numbers.add(3);
        numbers.add(16);
        numbers.add(27);
        numbers.add(17);
        numbers.add(12);
        numbers.add(109);
        numbers.add(212);
        numbers.add(73);
        System.out.println(numbers.size());

        /** Printing values in an arraylist can be done the same as arrays
         But using the "size" method */
        System.out.println("The values in the arraylist");
        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            /** Notice how similar this is to an array
             If you replaced the .get(i) with [i] it would be the same as arrays */
        }
        System.out.println();
        System.out.println("How many values are now in the arraylist " + numbers.size());
        System.out.println();


        /** The method "add(index, value)" specifying an index and a value
         inserts that value into the index. This will shift all the values
         after the specified index down 1 */
        numbers.add(0, 86);

        System.out.println("The values in the arraylist after the insert");
        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println();
        System.out.println("The arraylist has 1 more cell now " + numbers.size());
        System.out.println();



        /** The method "set" lets you replace a value at a specific index */
        numbers.set(0, 63);
        System.out.println("The value at the 0 index now " + numbers.get(0));
        System.out.println();
        System.out.println("The number of cells after the set " + numbers.size());
        System.out.println();

        /** prints the object */
        System.out.println(numbers);
        /** would print all the values in the arraylist */
        System.out.println(number);
        /** only prints the memory address/location of the array */
        System.out.println();

        /** Enhanced for loop */
        System.out.println("Using an enhanced for loop to Print the values in the arraylist");
        /** for each value in the arraylist (or array) */
        for(Integer num : numbers) {
            /** 1	2   3	4
             1. specifies the data type that is stored by the arraylist
             Here it is Integer because that is what numbers stores
             you could replace Integer with int here, and it would still work
             2. num is a variable name, as the loop loops it stores a single value
             from the arraylist, in the first iteration it would store
             the value from index 0, next index 1, and so on
             3. for the enhanced for loop is symbol means "in"
             4. is the arraylist (or array) that the loop is iterating through */

            System.out.println(num);
            /** 1 and 2 are the data type and the variable name for
             a single value "in" the arraylist (or array)
             which loops for every value in the arraylist (or array) */
        }
        /** an enhanced for loop iterates from the start of an array or
         arraylist to the end one value at a time
         the main drawback is that you can not know where in the arraylist
         (or array) the loop is an iteration */
        System.out.println();
        for(String t : terms){
            System.out.println(t);
        }
        System.out.println();

        ArrayList<Employee> emps = new ArrayList<>();
        /** instantiating a cell of an arraylist */
        emps.add(new Employee());


        Employee[] people = new Employee[50];
        people[0] = new Employee(); /** very similar to arrays */

        emps.get(0).setName("Bob");
        System.out.println(emps.get(0).getName());
        /** the first get is for the arraylist to know which cell
         the second get is getting the Name */

        emps.get(0).setId("983sjs6");
        emps.add(new Employee("Sue", "9823bsdjhd"));
        emps.add(new Employee("Tyron", "873bdsjde"));
        for(int i = 0; i < emps.size(); i++) {
            System.out.println("The Employee data: " + emps.get(i).getName() +
                    " and id: " + emps.get(i).getId());
        }
    }

}