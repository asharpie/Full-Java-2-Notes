import java.text.DecimalFormat;
import java.util.Random;

public class Formatting {

    public static void main(String[] args) {

        Random rand = new Random();

        int n = rand.nextInt();
        /** without a number in the parenthesis, nextInt would
         create a random number between -2,147,483,648 and 2,147,483,647
         */








        int num = rand.nextInt(10);
        /** placing 10 in the parenthesis produces numbers from 0 to 9 */









        /** What if I wanted values from 1 to 10




         That's right add 1 to the number after it is generated
         from 0 to 9 */
        int num1 = rand.nextInt(10) + 1;










        /** If I wanted values from 5 to 15 */










        int num2 = rand.nextInt(15 - 5 + 1) + 5;




        /** If I wanted 125 to 400 */





        int num3 = rand.nextInt(400 - 125 + 1) + 125;

        /** Formatting numeric decimals */

        double number = 8623265.248021;

        double number2 = 0.50;

        int number3 = 25;

        System.out.println(number2);


        DecimalFormat deform = new DecimalFormat("#.00");
        /** Do you notice what output DecimalFormat produces
         The # is for all values excluding zero
         The 0 is for all values including zero */



        System.out.println(deform.format(number2));
        System.out.println();
        System.out.println("The value is $" + deform.format(number));

        /** printf 	precision */

        System.out.printf("The value is $%.2f\n", number);
        System.out.println("hello");
        System.out.println();
        /**
         Chapter 3 covers printf

         format specifier syntax
         %[flags][width][.precision]conversion character


         for printf - all format specifiers begin with a % character

         flags - optional - causes values to be formatted in a
         certain way, comma separators, pad numbers with leading
         zeros %08, left justify numbers -8
         width - optional - after flags, specify min width
         .precision - optional - floating point numbers

         The conversion characters (most commonly used)
         s - is for Strings       			%s
         d - is for decimal integers 		%d
         f - is for floating point numbers 	%f
         */
        System.out.printf("The value is $%,f\n", number);
        System.out.printf("The value is $%.10f\n", number2);
        System.out.printf("The value is $%10d\n", number3);
        System.out.printf("The value is $%010d\n", number3);


        /** Formatting Strings */
        System.out.println();

        String name1 = "Jennifer";
        String name2 = "Bay";
        String name3 = "Dan";
        String name4 = "Washington";

        System.out.println(name1 + " " + name2);
        System.out.println(name3 + " " + name4);
        System.out.println();


        System.out.printf("%11s %11s\n", name1, name2);
        System.out.printf("%11s %11s\n", name3, name4);
        System.out.println();

        System.out.printf("%-10s %-10s\n", name1, name2);
        System.out.printf("%-10s %-10s", name3, name4);
        System.out.println();




        /** you can use the String class to format
         The format method can be used to create a String
         that is formatted the same way printf format, but it doesn't
         print the String */
        String output = String.format("%-11s %-11s", name1, name2);
        String output2 = String.format("%-11s %-11s", name3, name4);

        /** You still need a print statement to print */
        System.out.println(output);
        System.out.println(output2);
        System.out.println();

        /** or you can place it directly in a print statement */
        System.out.println(String.format("The value is $%,.2f", number));
        System.out.println("hi"); // How do you get this output on the next line
    }

}