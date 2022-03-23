// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.) (Edited)
// Chapter 6 : Single-Dimensional Arrays
//
// Problem 6.5 : Write a program that prompts the user to enter 10 integers, and displays the distinct
//               numbers.
//               If an integer is read more than once, it is displayed once.
//               ChallenG : Make an array that only carries the integers distinctively
//
//
// Author : Giorgio Murad
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integers;       // Number of integers
        int[] ints;         // Integers
        int[] distincts;    // Distinct integers

        integers = 10;
        ints      = new int[integers];

        // Prompting the user to enter the integers
        System.out.println("Enter integers:");
        for (int i = 0; i < integers; i++)
            ints[i] = input.nextInt();

        // Displaying the integers in a distinct form
        distincts = getDistincts(ints);
        for (int j : distincts)
            System.out.print(j + " ");

        input.close();
    }


    // Method that returns an array containing only distinct numbers
    public static int[] getDistincts(int[] ints) {
        int[] initial;
        int[] nullDuplicates;
        int d;

        initial = nullDuplicates(ints);
        d = getNbOfDistincts(initial);
        nullDuplicates = new int[d];

        d = 0;
        for (int j : initial) {
            if (isDistinct(j, initial)) {

                nullDuplicates[d] = j;
                d++;
            }
        }

        return nullDuplicates;
    }


    // Method that updates the array where all duplicate values are set to zero
    public static int[] nullDuplicates(int[] ints) {
        int[] copy = new int[ints.length];
        int temp;

        System.arraycopy(ints, 0, copy, 0, ints.length);
        for (int i = 0; i < copy.length; i++) {
            temp = ints[i];

            for (int j = i+1; j < copy.length; j++) {
                if (temp == copy[j])
                    copy[j] = 0;
            }
        }

        return copy;
    }


    // Method that returns the number of distinct numbers
    public static int getNbOfDistincts(int[] ints) {
        int count;
        int temp;

        count = 0;
        for (int i = 0; i < ints.length; i++){
            temp = ints[i];

            if (isDistinct(temp, ints))
                count++;
        }

        return count;
    }


    // Method that returns true if 'x' is distinct, and false otherwise
    public static boolean isDistinct(int x, int[] array) {
        int count = 0;

        for (int z : array) {

            if (x == z)
                count++;

            if (count == 2)
                return false;
        }

        return true;
    }
}