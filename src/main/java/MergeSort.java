
public class MergeSort {

    public static void main(String[] args) {

        /** Merge Sort


         a recursive sort - the algorithm divides the array into two halves
         and applies a merge sort on each half recursively. After the two
         halves are sorted it merges them.


         It looks at smaller and smaller sub-sections of the array until
         each subsection is a single cell, as the recursion unwinds, it
         merges the subsections in a sorted order.

         it is a post-recursion sort - it sorts the values as the recursion
         unwinds

         Example:

         indexes:	0	1	2	3	4	5
                   |--|---|---|---|---|---|
                   46	12	2	54	17	9

         |---|--|--|	 	|--|---|---|
         46  12 2	  	     54  17   9

         |---|---| 	|--|	|---|---|	|--|
          46  12	 2		 54  17	     9

         *  	|--|	|--|	|--|	|--|	|--|	|--|
         46		 12		  2		 54		 17		  9

         |---|---| 	|--|	|---|---|	|--|
          12  46	 2		 17  54	     9

         |---|---|---|	   |--|----|---|
           2  12  46		9	17	54

           0  1	  2	  3	  4	  5
         |--|---|---|---|---|---|
          2  9	 12  17	 46	 54

         */

        int[] array = {12, 46, 2, 17, 54, 9, 25, 7, 5, 31, 3, 8};

        mergeSort(array, 0, array.length-1);

        System.out.println("merge sorted");
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void mergeSort(int[] array, int min, int max){
        if(min < max){
            int mid = (min + max)/2;
            mergeSort(array, min, mid);
            mergeSort(array, mid+1, max);
            merge(array, min, mid, max);
        }
    }

    public static void merge(int[] array, int first, int mid, int last){
        int[] temp = new int[array.length];
        int first1 = first;
        int last1 = mid;
        int first2 = mid + 1;
        int last2 = last;
        int index = first1;

        while(first1 <= last1 && first2 <= last2){
            if(array[first1] < array[first2]){
                temp[index] = array[first1];
                first1++;
            }
            else {
                temp[index] = array[first2];
                first2++;
            }
            index++;
        }
        while(first1 <= last1){
            temp[index] = array[first1];
            first1++;
            index++;
        }
        while(first2 <= last2){
            temp[index] = array[first2];
            first2++;
            index++;
        }
        for(index = first; index <= last; index++){
            array[index] = temp[index];
        }
    }
}