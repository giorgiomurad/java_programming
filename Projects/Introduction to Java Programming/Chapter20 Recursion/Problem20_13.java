// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Problem 20.13 : Write a recursive method that returns the largest integer in an integer array.
//
//
// Author : Giorgio Murad
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;    // Integer Array
        int size;       // Size of the array


        // Prompting the user to enter the values of an array
        System.out.print("Enter the size of the array: ");
        size = input.nextInt();

        // Initializing the array
        array = new int[size];

        // Prompting the user to enter the array values
        System.out.print("Enter the values of the array: ");
        for (int i = 0; i < size; i++)
            array[i] = input.nextInt();

        // Displaying the largest value of the array
        System.out.println("The largest value in the array is " + largest(array));
    }

    // Recursive method that returns the largest integer in an integer array
    public static int largest(int[] array) {
        int first = array[0];   // First integer of the array
        int[] temp;             // Temporary Array


        // If the array contains only one integer, it is returned
        if (array.length == 1)
            return first;

        // If the array contains more than one integer
        else {

            // Initializing the temporary array with values starting from array[1]
            temp = new int[array.length - 1];
            for (int i = 0, j = 1; i < temp.length; i++, j++)
                temp[i] = array[j];

            // Returning the largest value between 'first' and the integer returned by recalling the method
            return Math.max(first, largest(temp));
        }
    }
}