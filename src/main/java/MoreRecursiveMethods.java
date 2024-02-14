public class MoreRecursiveMethods {
    public static void main(String[] args) {

        /**
         Terminology:

         The number of times that a method calls itself is known as the
         depth of recursion

         tail recursion is a recursive method that the last statement in the method
         is the recursive call (no other code can come after the call).


         Solving problems with recursion:
         Concept: A problem can be solved with recursion if it can be broken
         into successive smaller problems that are identical to the over all
         problem.
         The test of a recursive method is either the:
         base case - which is the one case in which the problem can be
         solved without recursion (the case that stops the recursions).
         Or the:
         recursive case - which is the way to solve the problem in all other
         circumstances using recursion. It must always reduce the problem
         into a smaller version of the original problem. (all the other
         cases (calls) before reaching the base case)


         In mathematics, finding the factorial of a number is a prime example

         if n = 0 then		factorial(n) = 1
         if n > 0 then		factorial(n) = n X factorial(n - 1)

         5! would be 5, 4, 3, 2, 1, 1 = 120

         Recursion is also great for the Fibonacci Series and can be easily
         implemented for the mathematical game Towers of Hanoi



         Another recursive method Example: lets sum a range of values from
         an array.

         */
        int[] numbers = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        int range = rangeSum(numbers, 1, 4);
        System.out.println("The sum of the range is " + range);


        int sum = sumArray(numbers, 0);
        System.out.println("The sum is " + sum);

    }

    // tail recursion example
    public static void tail(int n) {
        if(n > 0) {
            System.out.println("The value of n: " + n);
            tail( n - 1); // the last executable statement
        }
    }


    // notice the two return statements
    public static int rangeSum(int[] nums, int start, int end) {
        if(start > end) {
            return 0;
        }
        return nums[start] + rangeSum(nums, start + 1, end);
    }

    // another way would be
    public static int sumArray(int[] nums, int start) {
        if(start < nums.length) {
            return nums[start] + sumArray(nums, start + 1);
        }
        return 0;
    }

}





