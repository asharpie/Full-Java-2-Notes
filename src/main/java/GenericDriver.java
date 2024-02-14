import java.util.ArrayList;
import java.util.Arrays;

public class GenericDriver {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

        /**
         Generic classes can only store/be used with Objects and
         use angle brackets < > in the instantiation of the class.

         What other class have we used that only stores Objects and uses
         angle brackets??















         ArrayLists are the perfect example of a Generic class
         and just like with ArrayLists, you must use the Wrapper classes
         with Generic classes.

         You will use a Generic class (usually called Node) a lot in Java 3
         so lets look at how to create a Generic class.

         */





        Gener<Integer> number = new Gener<>();
        number.setElement(875324);
        Gener<String> num = new Gener<>("Hi there");

        System.out.println(number.toString());
        System.out.println(num.toString());

        System.out.println();









        number.setNext(new Gener("hello world"));
        System.out.println(number.toString());
        System.out.println();

        Gener<Integer> nextNext = number.getNext();
        Gener<Double> another = new Gener<>(124.84);
        nextNext.setNext(new Gener(124.84));
        System.out.println(number);
        System.out.println();


//        Gener<Integer> current = number;
//        while(current.getNext()!=null){
//            System.out.println(current);
//            current = current.getNext();
//        }

        ArrayList<Gener> multi = new ArrayList<Gener>();

        multi.add(new Gener<>(83));
        multi.add(new Gener<>("Wow"));

        for(Gener g : multi) {
            System.out.println(g.toString());
        }

        multi.get(0).setNext(new Gener("Dumb"));
        System.out.println(multi.get(0).toString());

        /** As an extra bit of info for you.

         expanding an array

         I cannot stress this enough, you CANNOT change an array's
         length once it has been instantiated. But, you can
         re-instantiate it copying the contents to the new array
         while changing the length */
        int[] numbers = {1, 3, 4, 5, 7, 9};

        numbers = Arrays.copyOf(numbers, numbers.length * 2);


        /** This makes a copy of the array's data (copying the data
         from the old instance of the array to a new instance), but
         doubles the length, so it can store more data.

         numbers is now a new array twice as long as the previous array
         named numbers, but also containing the same information as
         the previous array */

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();

        /** There are limitations to the length of an array.
         Array indexes are int's, so an array can only ever
         have 2,147,483,647 cells, the max number of an int. */

    }

}