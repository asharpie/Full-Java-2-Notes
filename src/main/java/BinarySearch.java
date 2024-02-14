
public class BinarySearch {

    /** To perform a binary search the data MUST be sorted
     A binary search works by splitting the array in half
     over and over again until it finds the value it is looking for,
     this cuts the search time in half */

    private int[] numbers = { 2, 4, 5, 7, 9, 13, 17, 18, 27, 31, 55, 61 };
    private Boat[] boats = new Boat[10];
    int index = 0;

    public void addBoat(String make, double cost){
        boats[index] = new Boat(make, cost);
        index++;
    }

    public Boat getCar(int i) {
        return boats[i];
    }

    public int binarySearch(int value) {
        /** create the variables needed for the method */
        int firstIndex = 0; // the first index always starts at zero
        int lastIndex = numbers.length - 1;  // why - 1 ??
        int middleIndex;	// this will be calculated later
        int position = -1;  // If we find the value this will change
        boolean found = false; // we haven't found the value yet

        /** create a while-loop that stops looping if we find the value
         or if the first index passes the last index */
        while(!found && firstIndex <= lastIndex) {

            /** find the middle index */
            middleIndex = (firstIndex + lastIndex)/2;
            /** this gives the concept of splitting the array in half
             all the larger values are in the upper half
             and all the lower values lower half */

            /** now testing if the value is in the array */
            if(numbers[middleIndex] == value) {
                found = true;	// we found it, stops the loop
                position = middleIndex; // and where we found it
            }
            else if(numbers[middleIndex] > value) {
                /** we didn't find the value, but now we know it can't
                 be in the upper half now, so we move the
                 last index 1 lower than the middle index
                 cutting the search area in half */
                lastIndex = middleIndex - 1;
            }
            else {
                /** if the value isn't at the middle index,
                 and it's not in the lower half (both the if and the else if
                 were false) then the value should be in the upper half */
                firstIndex = middleIndex + 1;
            }
        } // ends the while loop
        /** if we find the value, position will be the index the value was found,
         if the value wasn't found it will be -1 */
        return position;
    }



    /** This method is to show you how to search an Object array */

    public int binarySearch(double value) {
        int firstIndex = 0; // the first index always starts at zero
        int lastIndex = index - 1;  // this could be the logical length variable minus 1
        int middleIndex;	// this will be calculated later
        int position = -1;  // If we find the value this will change
        boolean found = false; // we haven't found the value yet

        while(!found && firstIndex <= lastIndex) {
            middleIndex = (firstIndex + lastIndex)/2; // find the middle index
            /** now testing if the value is in the array */
            if(boats[middleIndex].getCost() == value) {
                found = true;	// we found it, stops the loop
                position = middleIndex; // and where we found it
            }
            else if(boats[middleIndex].getCost() > value) {
                lastIndex = middleIndex - 1;
            }
            else {
                firstIndex = middleIndex + 1;
            }
        } // ends the while loop
        return position; // returns the index where the value was found or -1
    }


}