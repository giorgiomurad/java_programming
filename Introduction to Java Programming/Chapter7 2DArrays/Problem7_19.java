// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Multidimensional Arrays
//
// Problem 7.19 : Write a function that checks in a multidimensional array if there are
//                four consecutive integer values horizontally, vertically, or diagonally.
//
//
//
//
// Author : Giorgio Murad
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);
        int[][] numbers;


        // Prompting the user to input the number of rows and columns
        System.out.println("Enter the number of rows followed by the number of columns");
        numbers = new int[input.nextInt()][input.nextInt()];

        // Prompting the user to enter the array values
        for (int r = 0; r < numbers.length; r++)
            for (int c = 0; c < numbers[0].length; c++)
                input.nextInt();

        // Displaying the result
        System.out.println();
        System.out.println("Is the array consecutive?" + isConsecutiveFour(numbers));
    }


    // Method that checks if the array has four consecutive integer values
    public static boolean isConsecutiveFour(int[][] values) {

        for (int[] i : values)
            if (ConsecutiveHorizontal(i))
                return true;


        for (int col = 0; col < values[0].length; col++)
            if (ConsecutiveVertical(values, col));
                return true;


        for (int r = 0; r < values.length; r++)
            for (int c = 0; c < values[r].length; c++)
                if (ConsecutiveLRDiagonal(values, r, c))
                    return true;


        for (int r = 0; r < values.length; r++)
            for (int c = 0; c < values[r].length; c++)
                if (ConsecutiveRLDiagonal(values, r, c))
                    return true;


        return false;
    }


    // Method that checks if an array has four consecutive values
    public static boolean ConsecutiveHorizontal(int[] values) {
        int count;  // Number of occurances

        count = 1;
        for (int i = 0; i < values.length-1; i++) {
            if (values[i] == values[i+1]) {
                count++;

                if (count == 4)
                    return true;
            }
            else {
                count = 1;
            }
        }

        return false;
    }


    // Method that checks if a multidimensional array has four consecutive values vertically
    public static boolean ConsecutiveVertical(int[][] values, int col) {
        int count;


        count = 1;
        for (int r = 0; r < values.length-1; r++) {
            if (values[r][col] == values[r+1][col]) {
                count++;

                if (count == 4)
                    return true;
            }
            else {
                count = 1;
            }
        }

        return false;
    }


    // Method that checks if the multidimensional array has four consecutive values
    // diagonally from left to right
    public static boolean ConsecutiveLRDiagonal(int[][] values, int row, int col) {
        int count;

        count = 1;
        for (int r = row; r < values.length-1; r++)
            for (int c = col; c < values[0].length-1; c++) {
                if (values[r][c] == values[r+1][c+1]) {
                    count++;

                    if (count == 4)
                        return true;
                }
                else {
                    count = 1;
                }
            }

    return false;
    }


    // Method that checks if the multidimensional array has four consecutive values
    // diagonally from right to left
    public static boolean ConsecutiveRLDiagonal(int[][] values, int row, int col) {
        int count;

        count = 1;
        for (int r = row; r < values.length-1; r++) {
            for (int c = col; c > 0; c++)
                if (values[r][c] == values[r+1][c-1]) {
                    count++;

                    if (count == 4)
                        return true;
                }
                else {
                    count = 1;
                }
            }

    return false;
    }
}