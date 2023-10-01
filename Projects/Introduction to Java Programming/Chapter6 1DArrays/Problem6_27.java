// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 6 : Single-Dimensional Arrays
//
// Problem 6.27 : Write a function that verifies if two integer arrays are identical.
//                In this case, two arrays are identical if they have the same contents.
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
            System.out.println("The arrays are identical");

        else
            System.out.println("The arrays are not identical");

        input.close();
        }


        // Method that returns true if two arrays are strictly identical, false otherwise
        public static boolean equal(int[] list1, int[] list2) {
            int temp1;  // Temporary Integer 1
            int temp2;  // Temporary Integer 2


            // Checking every array value
            for (int i : list1) {
                temp1 = nbOfOccurances(i, list1);
                temp2 = nbOfOccurances(i, list2);

                if (temp1 != temp2)
                    return false;
            }

            return true;
        }


        // Method that how many times a number is found in an array
        public static int nbOfOccurances(int n, int[] nb) {
            int count = 0;

            for (int i : nb)
                if (n == i)
                    count++;

            return count;
        }
    }