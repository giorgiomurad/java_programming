// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 6 : Single-Dimensional Arrays
//
// Problem 6.10 : Write a method that takes an array, and returns the index of the
//                smallest element in the array.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input    = new Scanner(System.in);
        double[] numbers = new double[10];


        // Prompting the user to enter ten numbers
        System.out.println("Enter a sequence of ten numbers:");
        for (int j = 0; j < 10; j++)
            numbers[j] = input.nextDouble();

        // Displaying the index
        System.out.println("The index of the smallest element is: " + smallestIndex(numbers));

        input.close();
    }


    // Method that returns the index of the smallest element in a given array
    public static int smallestIndex(double[] array) {
        int minIndex;   // Index of the smallest element in the array
        double min;     // The minimum value


        // Initializing values
        minIndex = -1;
        min = array[0];


        // Deducing the minimum value in the array, and it's index
        for (int i = 0; i < array.length; i++)
            if (min > array[i]) {
                min = array[i];

                minIndex = i;
            }

        // Returning the index
        return minIndex;
    }
}