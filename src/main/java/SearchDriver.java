public class SearchDriver {
    public static void main(String[] args) {
        int index;

        BinarySearch bSearch = new BinarySearch();

        int value = 25;
        index = bSearch.binarySearch(value);
        /** The returned index will either be -1 (the value wasn't found)
         or the index where the value was found.
         It is easier to check for -1 since it is an index not found
         in an array (no array will ever have a -1 index */
        if(index == -1) {
            System.out.println("The value " + value + " wasn't found in the array");
        }
        else System.out.println("The value " + value + " was found at index " + index);
        System.out.println();

        // This class "has a" Car array - Aggregation
        bSearch.addBoat("MasterCraft", 13872.4);
        bSearch.addBoat("Lund",14128.5 );
        bSearch.addBoat("Chaparral", 20234.3);
        bSearch.addBoat("Bertram", 29863.8);
        bSearch.addBoat("Yamaha", 32897.5);

        index = bSearch.binarySearch(20234.3);
        /** The returned index will either be -1 (the value wasn't found
         or the index where the value was found */
        if(index == -1) {
            System.out.println("The car wasn't found in the array");
        }
        else {
            System.out.println("The car was found at index " + index);
            System.out.println(bSearch.getCar(index).toString());
        }

    }
}