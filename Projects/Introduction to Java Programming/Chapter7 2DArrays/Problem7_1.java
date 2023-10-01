// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Multidimensional Arrays
//
// Problem 7.1 : Write a function that adds all the elements in a four-by-four matrix.
//               The program is set to prompt the user to enter the elements of the array
//               before displaying their sum.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] arr  = new int[4][4];   // Array of Integers
        int sum;                         // Sum


        // Prompting the user to enter the elements of the array
        System.out.println("Enter a 4-by-4 matrix :");
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = input.nextInt();
            }

        // Retrieving the sum
        sum = sumMatrix(arr);

        // Displaying the sum
        System.out.println();
        System.out.println("The total sum of the array is " + sum);

        input.close();
    }


    // Method that adds all the elements in the matrix
    public static int sumMatrix(int[][] matrix) {
        int sum = 0;    // Sum


        // Getting the sum of all the elements in the array
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++) {

                sum += matrix[i][j];
            }

        return sum;
    }
}