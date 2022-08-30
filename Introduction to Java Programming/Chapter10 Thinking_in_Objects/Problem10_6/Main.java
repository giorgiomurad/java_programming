// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Thinking in Objects
//
// Problem 10.6 : Write a program that displays all prime numbers less than 120 in an increasing order.
//                (Using the StackOfIntegers custom class described throughout the chapter)
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        int max = 120;

        // Adding the prime numbers into the stack
        int x = max - 1;
        while (x > 1) {
            if (isPrime(x))
                stack.push(x);

            x--;
        }

        // Displaying the prime numbers in increasing order
        System.out.println("All prime numbers less than " + max + " are the following:");
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }

    // Method that returns true if the specified integer is prime.
    public static boolean isPrime(int integer) {
        int n = 2;

        while (n < integer) {
            if (integer % n == 0)
                return false;

            n++;
        }
        return true;
    }
}