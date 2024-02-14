import java.util.Random;

public class NestedLoops2Darrays {
    public static void main(String[] args) {

        Random rand = new Random();

        /** Nested loops */

        /** variables declared here toward the top of the main method
         can be used in any following/below loops
         Any statements (code) here are not affected by the loops below
         */
        for(int outer = 0; outer < 5; outer++) { // this loop counts from zero to 5
            /** The variable "outer" must reach the value of 5 so that the test
             fails because 5 is not less than 5.
             Variables declared here can be used in the following inner loop.
             Any print statement here, happens before anything code in the
             following inner loop happens
             */

            for(int inner = 3; inner > 0; inner--) { // this loop counts from 3 down to 0
                /** The variable "inner" must reach the vale of 0 so that the test fails
                 because 0 is not greater than zero
                 This inner loop happens for every iteration of the outer loop
                 if the outer loop loops 5 times, this inner loop loops
                 3 time each iteration of the outer loop,
                 so 15 times in total, but not all at the same time
                 Any statement in here happens for every iteration of the inner loop
                 Any variable declared here can only be used here
                 */
            }
            /** Any statement here are not connected to the inner loop, it is part of
             the outer loop.
             */
        }

        /** example */
        for(int i = 4; i > 0; i--) {
            System.out.print("hi ");
            for(int k = 0; k < i; k++) { // i will be 4 3 2 1
                System.out.print("there ");
            }
            System.out.println("end");
        }
        System.out.println();

        /** Summing values from an array, ArrayList, or user input
         you MUST have a variable and a loop and the variable
         MUST be declared outside (before) the loop */

        int[] numbers = { 1, 2, 3, 5, 6, 9, 7 };
        /** I am going to sum the values in this array "numbers"
         to do that I must have an int variable, since the array
         stores int values */
        int sum = 0; /** notice I initialize the variable here before any loop */
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            /** or it could be: sum = sum + numbers[i];
             printing the sum here is bad and wrong */
        }
        System.out.println("the sum is " + sum);
        /** to get the average simply divide by the array length */
//        System.out.println("the average is " + sum/numbers.length);

        /** 2D arrays are a data structure like arrays
         but two-dimensional like a grid

         You do not need to import 2D arrays, they are built in
         the same as arrays are.

         Why are 2D arrays so important?
         - graphs and charts
         - games
         - Artificial Intelligence
         - and more

         single integer array literal example */
        int[] nums = { 1, 4, 6, 3, 9, 2 };
        /** its length is 6, both physical and logical */
        System.out.println(nums[3]); /** accesses index 3 */
        /** of the array which is the fourth cell */
        System.out.println();

        /** 2D array literal */
        int[][] nums2D = { { 1, 2, 5, 6 },
                { 2, 4, 5, 1 },
                { 8, 6, 3, 2 } };

        /** notice the inner curly braces separating rows
         this is a 3 x 4 2D array
         rows always come first, columns second
         rows go from top to bottom
         columns go from left to right

         2D arrays are also known as arrays of arrays

         Print a value from a cell of a 2D array */
        System.out.println(nums2D[2][2]);
        System.out.println();


        /** What do we need to be able to print all the values from the 2D array? */


        for(int rows = 0; rows < nums2D.length; rows++) { // 0 1 2
            for(int cols = 0; cols < nums2D[rows].length; cols++) { //0 1 2 3
                System.out.print(nums2D[rows][cols] + " ");
            }
            System.out.println();
        }
        System.out.println();


        /** Placing values in a single array */
        int[] nums2 = new int[5];
        nums2[0] = 84;
        nums2[1] = 26;
        /** and so on to fill the array */

        int[][] number3 = new int[6][4]; // 6 x 4
        /** This 2D array has 6 rows, each with 4 columns
         to place values in a 2D array you would */
        number3[0][0] = 42;
        number3[0][1] = 73;
        number3[0][2] = 21;
        number3[0][3] = 36;
        number3[1][0] = 58;
        /** and so on to fill the 2D array
         or create a loop and ask the user for values
         If the 2D array is large, placing a value in each cell
         either way would be mind-numbing

         A faster way would be to use a Random number generator
         or reading values from a text file */




        for(int rows = 0; rows < number3.length; rows++) {
            for(int cols = 0; cols < number3[rows].length; cols++) { /** 0 1 2 3 */
                /** range 25 - 99 */
                number3[rows][cols] = rand.nextInt(75) + 25;
            }
        }






        System.out.println("the random values in the 2D array");
        for(int rows = 0; rows < number3.length; rows++) { // 0 1 2
            for(int cols = 0; cols < number3[rows].length; cols++) { // 0 1 2 3 4
                System.out.print(number3[rows][cols] + " ");
            }
            System.out.println();
        }

        System.out.println();


        System.out.println("columns first");
        for(int cols = 0; cols < number3[0].length; cols++) { // 0 1 2 3
            for(int rows = 0; rows < number3.length; rows++) { // 0 1 2 3 4 5
                System.out.print(number3[rows][cols] + " ");
            }
            System.out.println();
        }

        /** Since each row of a 2D array are also an array, each row
         can have its own length


         2D arrays where each row is a different length
         are called - Ragged arrays

         To create a ragged array, you simply create a 2D array
         with the specific number of rows but not the columns */

        int[][] rag = new int[5][];
        /** You would then instantiate each rows length */
        rag[0] = new int[10];
        rag[1] = new int[3];
        rag[2] = new int[15];
        rag[3] = new int[7];
        rag[4] = new int[9];

        /** to show you each row has a different length, I'll print
         the lengths */
        System.out.println();
        for(int row = 0; row < rag.length; row++) {
            System.out.println("The number of columns in row " + row
                    + " is " + rag[row].length);
        }
        System.out.println();

        /** Inserting values would be the same as a normal 2D array */

        /** I am reusing the nested loops from the earlier videos */
        for(int row = 0; row < rag.length; row++) {
            for(int col = 0; col < rag[row].length; col++) { /** 0 1 2 3 */
                /** range 25 - 99 */
                rag[row][col] = rand.nextInt(99 - 25 + 1) + 25;
            }
        }

        System.out.println("the random values in the ragged array");
        for(int row = 0; row < rag.length; row++) { // 0 1 2
            for(int col = 0; col < rag[row].length; col++) { //0 1 2 3
                System.out.print(rag[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();







        /** And yes there is even a 3D array */
        int[][][] crazy = new int[3][5][8];

    }
}