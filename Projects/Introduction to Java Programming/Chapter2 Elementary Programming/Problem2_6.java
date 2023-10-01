// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.6 : Write a program that reads an integer between 0 and 1000, adds all
//               the digits of the integer, and displays the result.
//               If the user inputs 932, the sum of its digits is 14.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Reference that reads the inputted digit
        int number;                             // Integer entered by the user
        int d1, d2, d3, d4;                     // Variables representing digits of the integer
        int sum;                                // Sum of the digits


        // Prompting the user to input an integer
        System.out.println("Enter an integer between 0 and 1000 :");
        number = input.nextInt();

        // Extracting the digits from the integer, and assigning each digit by itself
        // number = 9876
        d1 = number / 1000;
        d2 = number / 100  % 10;
        d3 = number / 10   % 10;
        d4 = number % 10;

        // Computing their sum
        sum = d1 + d2 + d3 + d4;

        // Displaying Output
        System.out.println("The sum of the digits of " + number + " is " + sum);

        input.close();
    }
}
