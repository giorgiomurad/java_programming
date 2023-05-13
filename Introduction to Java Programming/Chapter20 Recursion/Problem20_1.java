// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Problem 20.1 : Using the BigInteger class, write a program that finds the factorial of an integer
//                entered by the user using a recursive method, and displays the result in the output.
//
//
// Author : Giorgio Murad
import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String integer;

        // Prompting the user to enter an integer
        System.out.println("Enter an integer to display its factorial:");
        integer = input.next();

        // Initializing a new BigInteger object using the given value
        BigInteger val = new BigInteger(integer);

        // Displaying the factorial
        System.out.println("The factorial of " + integer + " is " + factorial(val));
    }

    // Method that returns the factorial of an integer
    public static BigInteger factorial(BigInteger integer) {

        if (integer.intValue() == 1)
            return integer;

        else {
            String temp1 = String.valueOf(integer.intValue() - 1);

            BigInteger temp2 = new BigInteger(temp1);
            return integer.multiply(factorial(temp2));
        }
    }
}