import java.util.ArrayList;

public class SortDriver {
    public static void main(String[] args) {

        /** Selection Sort */
        SelectionSort selSort = new SelectionSort();

        /** using an int array */
        selSort.selectionSort();
        selSort.printArray();

        /** using an Array of Objects */
//        selSort.addTruck("Ford", 25400.5);
//        selSort.addTruck("GMC", 11000.5);
//        selSort.addTruck("Chevy", 13000.4);
//        selSort.addTruck("Honda", 38000.3);
//        selSort.addTruck("Toyota", 29000.8);
//
//        selSort.selectionSort2();
//        selSort.printTrucks();
//        System.out.println();


        /** Bubble Sort */
        BubbleSort bubSort = new BubbleSort();

        /** using an int array */
//        bubSort.bubbleSort();
//        bubSort.printArray();

        /** using an Array of Objects */
//        bubSort.addTruck("Ford", 25400.5);
//        bubSort.addTruck("GMC", 11000.5);
//        bubSort.addTruck("Chevy", 13000.4);
//        bubSort.addTruck("Honda", 38000.3);
//        bubSort.addTruck("Toyota", 29000.8);
//
//        bubSort.bubbleSort2();
//        bubSort.printTrucks();
//        System.out.println();



        /** Insertion Sort */
        InsertionSort inSort = new InsertionSort();
        /** using an int array */
//        inSort.insertionSort();
//        inSort.printArray();

        /** using an ArrayList of Objects */
//        inSort.addTruck("Ford", 25400.5);
//        inSort.addTruck("GMC", 11000.5);
//        inSort.addTruck("Chevy", 13000.4);
//        inSort.addTruck("Honda", 38000.3);
//        inSort.addTruck("Toyota", 29000.8);
//
//        inSort.insertionSort2();
//        inSort.printTrucks();
//
//        System.out.println();
    }
}