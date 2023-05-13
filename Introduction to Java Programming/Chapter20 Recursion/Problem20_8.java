// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Problem 20.8 : Write a recursive method that displays an integer value reversely.
//                The program prompts the user to enter an integer value, and calls the method
//                with the given integer.
//
//
// Author : Giorgio Murad

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;      // Integer value given by the user


        // Prompting the user to enter an integer (that is more than zero)
        System.out.println("Enter an integer value (more than 0) :");
        value = input.nextInt();

        // Verifying if the integer value is valid
        while (isValid(value)) {

            System.out.println("Please enter a valid integer value (more than 0) :");
            value = input.nextInt();
        }

        // Displaying the integer reversely
        reverseDisplay(value);
    }

    // Method that displays the integer in the output
    public static void reverseDisplay(int value) {

        if (value > 0) {
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
    }

    // Method that verifies if the integer is more than zero
    public static boolean isValid(int value) {

        return (value > 0);
    }
}