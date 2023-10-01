// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Problem 20.9 : Write a recursive method that displays a string value reversely.
//                The program prompts the user to enter a string value, and calls the method
//                with the given string.
//
//
// Author : Giorgio Murad

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value;      // String value given by the user


        // Prompting the user to enter an integer (that is more than zero)
        System.out.println("Enter an string value :");
        value = input.next();

        // Displaying the integer reversely
        reverseDisplay(value);
    }

    // Method that displays the integer in the output
    public static void reverseDisplay(String value) {

        if (value.length() > 0) {
            int temp = value.length() - 1;

            System.out.print(value.charAt(temp));
            reverseDisplay(value.substring(0, temp));
        }
    }


}