// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Problem 5.2 : Write a method that sums up all the digits from a given integer.
//               For example, sumDigits(234) should return 9 (2 + 3 + 4).
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number; // Integer value entered by the user
        int sum;    // Sum of digits of number


        // Prompting the user to enter a number
        System.out.println("Enter an integer:");
        number = input.nextInt();

        // Getting sum of the digits of number
        sum = sumDigits(number);

        // Outputting Result
        System.out.println("Entered integer : " + number);
        System.out.println("Sum of Digits   : " + sum);
        input.close();
    }


    // Method that sums up all the digits from a given integer
    public static int sumDigits(int integer) {
        int sum;    // Sum of integers
        int temp;   // Temporary variable

        // Computing sum of digits
        sum = 0;
        while (integer > 0) {
            // Assigning the last digit to temp
            temp = integer % 10;

            // Adding value of temp to sum
            sum += temp;

            // Removing the last digit off of integer
            integer /= 10;
        }

        // Returning sum
        return sum;
    }
}