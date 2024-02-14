
public class QuickSort {

    public static void main(String[] args) {

        /** Quick sort

         a recursive sort - the algorithm selects an element, called the
         pivot, in the array (usually the first value since it is arbitrary
         which value is picked first). It divides the array into two parts,
         so that all the elements in the first part are less than or equal
         to the pivot and all the elements in the second part are greater
         than the pivot. The quick sort algorithm is then recursively
         applied to the first part and then the second part.


         ** notice that it said the first part is less than or equal to
         and the second part is just greater than. If you use "or equal to"
         for both parts you will create an infinite loop

         It uses a method called partitioning to place the pivot value in
         the proper location in the array

         Example:
         indexes:	0	1	2	3	4	5	6	7	8	9	10	11
                    --|---|---|---|---|---|---|---|---|---|---|---
                    12, 46, 2, 17, 54,  9, 25,  7,  5, 31,  3, 8
                    l                                           r


         pivot value = 12

         left index = 6
         right index = 7


         Quick sort is the fastest sort we will cover in this course.
         */

        int[] array = {12, 46, 2, 17, 54, 9, 25, 7, 5, 31, 3, 8};

        quickSort(array, 0, array.length - 1);

        System.out.println("quick sorted");
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void quickSort(int[] array, int min, int max){
        int pivot;
        if(min < max){
            pivot = partition(array, min, max);
            quickSort(array, min, (pivot-1));
            quickSort(array, (pivot + 1), max);
        }
    }

    public static int partition(int[] array, int min, int max){

        int pivot = array[min];
        int left = min;
        int right = max;
        while(left < right){
            while(array[left] <= pivot && left < right){
                left++;
            }
            while(array[right] > pivot){
                right--;
            }
            if(left < right){
                swap(array, left, right);
            }
        }
        swap(array, min, right);

        return right;
    }

    public static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}