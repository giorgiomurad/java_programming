// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Problem 3.2 : Write a program that reads an integer from the user, and displays whether the
//               integer is odd or even.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference to read integer from the user
        int number;


        // Prompting user to enter an integer
        System.out.println("Enter an integer:");
        number = input.nextInt();

        // Checking and displaying if the integer is odd or even
        if (number % 2 == 0)
            System.out.println("The integer is even.");

        else
            System.out.println("The integer is odd.");
    }

    input.close();
}