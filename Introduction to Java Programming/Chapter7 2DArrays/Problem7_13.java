// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Multidimensional Arrays
//
// Problem 7.13 : Write a function that returns the location of the largest element
//                in a multidimensional array.
//                The function returns an integer array that contains two elements.
//                The first element value representing the row value, and the second
//                representing the column value.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] arr;     // Array of decimal numbers
        int[] largest;      // Location of the largest number
        int row, column;    // Number of rows and columns


        // Prompting the user to enter the number of rows followed by the number of columns
        System.out.println("Enter the number of rows and the number of columns:");
        row    = input.nextInt();
        column = input.nextInt();

        // Initializing and filling the array with values
        arr = new double[row][column];
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }

        // Assigning the location of the largest value to 'largest'
        largest = locateLargest(arr);

        // Displaying the result
        System.out.println("The location of the largest value in the array is (" + largest[0]
                                            + ", " + largest[1] + ")");

        input.close();
    }


    // Method that returns the location of the largest element
    public static int[] locateLargest(double[][] arr) {
        int row, column;
        double temp;

        row    = 0;
        column = 0;
        temp   = 0;

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] > temp) {
                    temp   = arr[r][c];
                    row    = r;
                    column = c;
                }
            }
        }

        return new int[] {row, column};
    }
}