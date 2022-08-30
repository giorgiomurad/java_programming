// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Thinking in Objects
//
// Problem 10.5 : Write a program that prompts the user to enter an integer, and displays all
//                the integer's prime factors in decreasing order.
//                (Using the StackOfIntegers custom class described throughout the chapter)
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input           = new Scanner(System.in);
        StackOfIntegers stack   = new StackOfIntegers();
        int integer;    // Integer value entered by the user
        int size;       // Size of the stack
        int[] values;   // Integer array to store stack values


        // Prompting the user to enter an integer value
        System.out.println("Enter an integer value:");
        integer = input.nextInt();

        // Adding the integer's prime factors into the stack
        while (integer > 1) {
            int temp;   // Temporary integer

            temp = greatestPrimeFactor(integer);
            stack.push(temp);

            integer /= temp;
        }

        // Adding the stack values into the array
        size   = stack.getSize();
        values = new int[size];
        for (int i = size-1; !stack.empty(); i--)
            values[i] = stack.pop();

        // Displaying the prime factors of the integer in decreasing order
        System.out.println("The prime factors of " + integer + " are:")
        for (int i : values)
            System.out.print(i + " ");

        input.close();
    }

    // Method that returns the greatest prime factor of an integer
    public static int greatestPrimeFactor(int integer) {
        int greatest;
        int n = 2;

        greatest = n;
        while (n < integer) {
            if (integer % n == 0 && isPrime(n))
                greatest = n;

            n++;
        }

        return greatest;
    }

    // Method that checks if the specified integer is prime or not
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