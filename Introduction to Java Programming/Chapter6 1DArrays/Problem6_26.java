// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 6 : Single-Dimensional Arrays
//
// Problem 6.26 : Write a function that verifies if two integer arrays are strictly
//                identical.
//                The program should prompt the user to enter integer values of the
//                two arrays, and display the result.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 6;                  // Number of integers in each array
        int[] list1 = new int[x];   // Array 1
        int[] list2 = new int[x];   // Array 2


        // Prompting the user to enter a sequence of 'x' integers for each array
        System.out.println("Enter " + x + " integers for each array:");
        for (int i = 0; i < x; i++)
            list1[i] = input.nextInt();

        for (int j = 0; j < x; j++)
            list2[j] = input.nextInt();


        // Displaying final result
        if (equal(list1, list2))
            System.out.println("The arrays are strictly identical");

        else
            System.out.println("The arrays are not strictly identical");

        input.close();
        }


        // Method that returns true if two arrays are strictly identical, false otherwise
        public static boolean equal(int[] list1, int[] list2) {

            // Checks if list1[p] is equal to list2[p] for every 'p'
            for (int p = 0; p < list1.length; p++)
                if (list1[p] != list2[p])
                    return false;

            // In case false is not returned, true is returned
            return true;
        }
    }