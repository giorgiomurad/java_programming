// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.8 : Write a program that prompts the user to enter an integer between 0 and 128,
//               reads it as an ASCII code and displays its character.
//               Ex. : The ASCII code of 69 is E.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference that reads integer by user
        int integer;                            // Variable that carries integer by the user
        char ascii;                             // ASCII code determined by the integer


        // Retrieving integer entered by the user
        System.out.println("Enter an integer between 0 and 128 :");
        integer = input.nextInt();

        // Determining the ASCII code by the integer
        ascii = (char)integer;

        // Displaying Result
        System.out.println("The ASCII code of " + integer + " is " + ascii);

        input.close();
    }
}
