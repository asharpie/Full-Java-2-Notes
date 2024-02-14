
public class RecursiveMethods {

    public static void main(String[] args) {

        /**		Recursion

         Recursion uses a method or methods to perform repetitive actions,
         like calculations, printing, searching, or sorting.

         It is a loop, but instead of a single memory space being used
         over and over again, a new memory space is created for each
         iteration of the loop and stays open and active until the method
         it calls closes.

         Concept:
         A recursive method is a method that calls itself. This causes the loop.

         2 types of recursion:
         Direct - the general concept of recursion, where a method calls
         itself. Basically, in the body of the method, there is
         a method call to itself (the same method name with
         a new value). This is more commonly used.


         Indirect - not common - this is where a method (A) calls another
         method (B) and method B then calls to method A, creating
         a loop. The loop could include more methods, A to B to C
         then back to A, but it is still a loop.



         Before I show you a recursive method, lets go back over the 3 parts
         of a loop.

         1. initialize a loop control variable
         2. test the loop control variable, to know whether to stop or not
         3. update the loop control variable

         for(int i = 0; i < array.length; i++){

         }

         Recursive methods have the same parts, but they have different names

         1. parameter list variable
         2. the base case or recursive case
         3. the recursive call

         ***** See Demo method below

         okay lets run this and see some output
         */

//        Demo2(3);
        System.out.println("recursions ended");
        System.out.println();
        Demo3(0, 3);
        /**
         If you have identical code before and after the recursive call,
         the output will be mirrored

         */

    }

    public static void Demo (int n) {	// 1. n is the common recursion control variable
        /** it is a normal method except it calls itself
         perform some code here or not */
        if( n > 0 ){	/** 2. the base case testing the control variable
         perform some code here or not */
            Demo( n - 1);	/** 3. the recursive call updating the control variable
             Notice the n - 1, why not n-- (postfix) like in a for loop??
             you could do it as a prefix, but it's not common
             perform some code here or not */
        }
        // perform some code here or not
    }







    public static void Demo2 (int n) {  // initialize variable

        if( n > 0 ){ // base case
            System.out.println(n); // code
            Demo2(n  - 1);	// recursive call update
            System.out.println(n); // code
        }

    }









    public static void Demo3(int n, int stop){
        if(n < stop){
            for(int i = 0; i < n; i++){
                System.out.println(n);
            }
            System.out.println();
            Demo3(n+1, stop);
            System.out.println(n);
        }
    }


}