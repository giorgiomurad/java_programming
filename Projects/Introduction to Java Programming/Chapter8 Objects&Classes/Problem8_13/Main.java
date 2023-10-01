// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Objects & Classes
//
// Problem 8.13 : Design a class named Location that locates the maximal value in a multidimensional
//                array.
//                The class contains public data fields which are 'row', 'column', and 'maxvalue', and
//                includes a static method locateLargest that returns an instance of a Location object.
//
//                Write a program that creates a two-dimensional array, and calls the method in order to
//                display the array's largest element along with its indices.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;            // Row value specified by the user
        int column;         // Column value specified by the user
        double[][] numbers; // Array of numbers entered by the user
        Location largest;   // Location instance that carries the location of the largest element


        // Prompting the user to specify the row and column of the array
        System.out.println("Enter the number of rows and columns of the array:");
        row = input.nextInt();
        column = input.nextInt();

        // Initializing the two-dimensional array
        numbers = new double[row][column];

        // Prompting the user two enter the array values
        System.out.println("Enter the values of the given array:");
        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[r].length; c++) {

                numbers[r][c] = input.nextDouble();
            }
        }

        // Locating the largest value and displaying its location
        largest = Location.locateLargest(numbers);
        System.out.println("The largest element is " + largest.maxValue +
                " located at (" + largest.row + ", " + largest.column + ")");
    }
}