import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        /** The StringBuilder class is similar to the String class,
         except that you may change the contents of a StringBuilder
         Object without creating a new memory location and also provides
         useful methods that the String class doesn't have */

        /** Immutable vs. Mutable */

        /** The statement "you may change the contents of a StringBuilder
         Object without creating a new memory location" above may be
         confusing. You can of course change the value a String stores,
         BUT when you do, the computer has to create a new memory
         location for the new String value and the old memory location
         is deleted

         example:
         */
        String name = "Bob";
        name = "Ayesha";

        /** Unlike primitives, when you change what a String stores,
         you have to make a new memory location for the "new" String
         This is known as being Immutable

         StringBuilder Objects on the other hand and primitives
         are Mutable, which means that as you change the value
         stored by a StringBuilder or a primitive
         you reuse the same memory location */

        /** StringBuilders are similar to ArrayLists in the fact
         that they use methods to add, insert, delete, and replace values */
        StringBuilder words = new StringBuilder();
        /** You can place an initial String ^   here in the parenthesis,
         but you don't have to. */

        /** to add a String to the first open cell */
        words.append("Hello");

//        System.out.println(words);
//        System.out.println();

        /** you can know the length of a StringBuilder just like a String */
//        System.out.println(words.length());

//        words.append(" World");

//        System.out.println(words);
//        System.out.println(words.length());

        /** you can "insert" Strings into the StringBuilder at a specific
         index, it will shift the other cells
         words.insert(offset, String); offset is the starting index where the
         String will be placed */
//        words.insert(6, "huge ");
//        System.out.println(words);



        /** try on a different example */
//        StringBuilder phrase = new StringBuilder("Luke, am your ");
//        phrase.insert(6, "I ");
////        phrase.insert(16, "Father!");
//        phrase.append("Father!");
//        System.out.println();
//        System.out.println(phrase);

        /** "replace" a section of the StringBuilder
         words.replace(start, end, String);
         start is the starting index, end is the ending index, but up to that
         ending index not including it. If the String you are entering is long
         or shorter than the String you are replacing, cells are shifted
         automatically for you */
//        words.replace(6, 10, "ah");
//        System.out.println(words);
//        words.replace(6, 8, "cruel");
//        System.out.println(words);


        /** "delete" a String from the StringBuilder
         words.delete(start, end)
         start and end work the same as in the "replace" */
//        words.delete(5, 11);
//        System.out.println(words);


        /** you can even "reverse" the StringBuilder */
//        words.reverse();
//        System.out.println(words);
        /** A reverse is permanent. You would have to reverse it again
         if you wanted it back in the normal order */
//        words.reverse();
//        System.out.println(words);

        /** The book lists the common methods of StringBuilder and String */


        /** You can convert a StringBuilder object into a regular String
         if needed */
        String str = words.toString();
        /** and even convert a String to a StringBuilder */
        StringBuilder s2 = new StringBuilder(str);

        /** there is also
         deleteCharAt(int index)  deletes the char at the specified location

         setCharAt(int index, char) changes/replaces a single char at the
         specified location.
         */


    }
}