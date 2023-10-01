// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Listing 5.1 : Write a program that prompts the user to enter two integers, and returns
//               the highest value.
//               The program should invoke a method called 'max'
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;      // Integer 1
        int j;      // Integer 2
        int high;   // Highest Integer


        // Prompting the user to enter two integers
        System.out.println("Enter two integers:");
        i = input.nextInt();
        j = input.nextInt();

        // Assigning the highest integer to the variable
        high = max(i, j);

        //Displaying Result
        System.out.println("The maximum between " + i + " and " + j + " is " + high);

        input.close();
    }


    // Method that returns the highest integer
    // If n1 is greater than n2, the method would return n1
    // Otherwise, the method would return n2
    public static int max(int n1, int n2) {
        int result;

        if (n1 > n2) {
            result = n1;
        }
        else if (n2 > n1) {
            result = n2;
        }
        else {
            result = n1;
        }

        return result;
    }
}