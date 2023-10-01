// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Listing 20.2 : Write a program that prompts the user to enter an index, and computes the Fibonacci number for that
//                index.
//                The Fibonacci series begins with 0 and 1, and each subsequent number is the sum of the preceding two
//                as represented:
//
//                The series:   0   1   1   2   3   5   8   13  21  34  55  89  ...
//                Indices:      0   1   2   3   4   5   6   7   8   9   10  11  ...
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index;      // Index given by the user

        // Prompting the user to enter the index value
        System.out.println("Enter an index value:");
        index = input.nextInt();

        // Displaying the fibonacci value of the index
        System.out.println("The Fibonacci of " + index + " is " + fib(index));
    }

    // Method that returns the Fibonacci number of the given index
    public static long fib(long index) {
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return fib(index - 1) + fib(index - 2);
    }
}