// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Exception Handling
//
// Problem 13.3 : Write a program that creates an integer array containing a hundred random integer values.
//                The program should prompt the user to enter the index value, and display the element value
//                at the given index.
//                In case the user enters an index out of bounds, the program should inform the user.
//                (Use ArrayIndexOutBoundsException)
//
//
// Author : Giorgio Murad

import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index;      // Index of the array
        int[] array;    // Integer Array

        // Initializing and filling the array
        array = new int[100];
        for (int i = 0; i < array.length; i++) {
            Random temp = new Random();

            array[i] = temp.nextInt(100);
        }

        // Prompting to enter the index value of the array
        System.out.println("Enter the index to display the element value (0 - 100):");
        try {
            index = input.nextInt();

            System.out.println("The value at index " + index + " is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("Index must be between 0 and 100, and not out of bounds.");
        } finally {

            System.out.println("Program Closed.");
        }
    }
}