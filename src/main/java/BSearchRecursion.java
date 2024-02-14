import java.util.Scanner;

public class BSearchRecursion {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // integer array literal
        int[] array = {2, 3, 5, 7, 8, 9, 12, 17, 25, 31, 46, 54};


        /** the recursive binary search, works exactly the same as the iterative
         binary search by cutting the search area in half on each
         iteration, but it is done recursively.


         indexes:	0	1	2	3	4	5	6	7	8	9	10	11
         --|---|---|---|---|---|---|---|---|---|---|---
         values 		2,  3,  5,  7,  8,  9,  12, 17, 25, 31, 46, 54
         f                                           l

         mid-index = (first index + last index) / 2
         0 + 11 / 2 = 5		integer division!!!
         mid-value = 9

         is it higher than the value we're looking for or less than
         adjust first or last index based on this.

         */

        System.out.println("how many numbers do you want to look for?");
        int num = keyboard.nextInt();

        for(int i = 0; i < num; i++) {
            System.out.println("Enter a whole number to search for in the array");
            int value = keyboard.nextInt();

            int index = RecurBinSearch(array, 0, array.length - 1, value);

            if (index == -1) {
                System.out.println("The number " + value + " wasn't in the array");
            } else System.out.println("The number " + value + " was found at index " + index);
        }
    }



    public static int RecurBinSearch(int[] array, int first, int last, int value){
        if(first > last){
            return -1;
        }
        int mid = (first + last)/2;
        if( value == array[mid]){
            return mid;
        }
        else if(value > array[mid]){
            return RecurBinSearch(array, mid + 1, last, value);
        }
        else return RecurBinSearch(array, first, mid - 1, value);
    }
}