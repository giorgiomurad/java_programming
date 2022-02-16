// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 4 : Loops
//
// Problem 4.1 : Write a program that prompts the user to enter an unspecified number of integers.
//               After reading the integers, the program should display the number of positive
//               numbers entered, the number of negative integers entered, and the average.
//               The program should stop after reading the integer zero.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference to read user input
        int readInt;                        // Integer Variable
        int nbOfIntegers;                       // Total Number of Integers
        int positives;                          // Number of Positive Integers
        int negatives;                          // Number of Negative Integers
        int totalSum;                           // Total Sum of Integers
        double avg;                             // Computed Average


        // Prompting the user to enter a sequence of integers
        System.out.println("Enter a sequence of integers:");
        readInt      = 1;
        nbOfIntegers = 0;
        positives    = 0;
        negatives    = 0;
        totalSum     = 0;

        // While-Loop that keeps iterating till 'readInt' is equal to zero
        while (readInt != 0) {

            readInt = input.nextInt();
            nbOfIntegers++;

            if (readInt < 0)
                negatives++;

            else if (readInt > 0)
                positives++;

            totalSum += readInt;
        }
        nbOfIntegers--;

        // Computing the average
        avg = totalSum / nbOfIntegers;

        System.out.println();
        System.out.println("Number of positive integers : " + positives);
        System.out.println("Number of negative integers : " + negatives);
        System.out.println("Total number of integers    : " + nbOfIntegers);
        System.out.println("Computed Average            : " + avg);
    }
}