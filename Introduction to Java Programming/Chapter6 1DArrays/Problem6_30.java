// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 6 : Single-Dimensional Arrays
//
// Problem 6.30 : Write a function that determines if a given array has an integer
//                that is repeating four consecutive times.
//                The program should prompt the user to enter the values in an array
//                before the function is called.
//
//
// Author : Giorgio Murad

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;   // Size of the array determined by the user
        int[] list; // Array of integers


        // Prompting the user to enter the size of the array
        System.out.println("Enter the size of the array :");
        size = input.nextInt();

        // Creating the array
        list = new int[size];
        System.out.println();

        // Prompting the user to fill the array with 'size' values
        System.out.println("Input " + size + " values into the array :");
        for (int i = 0; i < size; i++)
            list[i] = input.nextInt();

        // Displaying the result
        if (isConsecutiveFour(list))
            System.out.println("The array has four consecutive elements with equal values.");
        else
            System.out.println("The array does not have four consecutive elements with equal values.");

        input.close();
        }



    // Method that returns true if the given array has for consecutive elements
    // with equal values, false otherwise
    public static boolean isConsecutiveFour(int[] array) {
        int count = 1;  // Number of occurances


        // Going through the elements of the array
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i])
                count++;
            else
                count = 1;

            // Returning true if count is equal to false
            if (count == 4)
                return true;
        }

        // In case true is not returned, returning false
        return false;
    }
    }