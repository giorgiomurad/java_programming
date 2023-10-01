// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Problem 5.31 : Write a program that prompts the user to enter a credit card number, and
//                verifies if the entered card number is valid or not. (Ex. 4388576018402626)
//                A credit card number must have between 13 and 16 digits, and must start with:
//                - 4 for Visa cards
//                - 5 for Master cards
//                - 37 for American Express cards
//                - 6 for discover cards
//
//                In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers.
//                The 'Luhn-check' algorithm is as follows:
//
//                Step 1:
//                Double every second digit from right to left. If doubling a digit results in a
//                two-digit number, add up the two digits to get a single-digit number.
//                2 * 2 = 4
//                2 * 2 = 4
//                4 * 2 = 8
//                1 * 2 = 2
//                6 * 2 = 12 (1 + 2 = 3)
//                5 * 2 = 10 (1 + 0 = 1)
//                8 * 2 = 16 (1 + 6 = 7)
//                4 * 2 = 8
//
//                Step 2:
//                Now add all single-digit digit numbers from Step 1.
//                4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
//
//                Step 3:
//                Add all digits in odd places from right to left.
//                6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
//
//                Step 4:
//                Sum of the results from steps 2 and 3.
//                37 + 38 = 75
//
//                Step 5:
//                If the result of Step 4 is divisible by 10, the card number is valid.
//
//
//                Design the program to use the following methods:
//                - boolean isValid(long )              Returns true if the card number is valid.
//                - int     sumOfDoubleEvenPlace(long ) Returns the result of Step 2.
//                - int     getDigit(int )              Returns the number if it is a single digit.
//                                                      Otherwise, returns the sum of its two digits.
//                - int     sumOfOddPlace(long )        Returns the result of Step 3.
//                - boolean prefixMatched(long, int)    Returns true if the integer is a prefix for of
//                                                      long number.
//                - int     getSize(long )              Returns the number of digits.
//                - int     getPrefix(long ,int )       Based on the given integer, returns the first
//                                                      digits of the long number.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;       // String to take user input
        long cardNB;    // Card Number entered by the user


        // Prompting the user to enter credit card number
        s      = JOptionPane.showInputDialog("Enter credit card number:");
        cardNB = Long.parseLong(s);

        // Displaying Result
        if (isValid(cardNB))
            JOptionPane.showMessageDialog(null, "Card Number Valid.");
        else
            JOptionPane.showMessageDialog(null, "Card Number Not Valid!!");
    }


    // Method that returns true if the credit card number is valid.
    public static boolean isValid(long number) {
        int size;   // Size of the card number
        boolean v1; // Validity 1
        boolean v2; // Validity 2

        // Assigning Values
        size = getSize(number);
        v1   = false;
        v2   = false;


        // Validity 1
        if (size >= 13 && size <= 16) {
            if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6))
                v1 = true;

            else if (prefixMatched(number, 3))
                if (prefixMatched(number, 37))
                    v1 = true;

        }

        // Validity 2
        if (v1) {
            int totalSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

            v2 = (totalSum % 10 == 0);
        }


        return (v1 && v2);
    }


    // Method that returns the sum of all digits in odd places from right to left
    public static int sumOfOddPlace(long number) {
        int sum;    // Sum

        sum = 0;
        while (number > 0){

            // Extract the last digit off of 'number', and adding it to 'sum'
            sum += number % 10;

            // Removing the last 2 digits from 'number'
            number /= 100;
        }

        return sum;
    }


    // Method that doubles every second digit from right to left, and returns their sum.
    // If doubling a digit results in a two-digit number, the two digits are added up to get a single-digit number.
    public static int sumOfDoubleEvenPlace(long number) {
        int sum;    // The Sum
        int even;   // Integer at even position


        // Removing the last digit off of 'number'
        number /= 10;

        // Finding the sum
        sum = 0;
        while (number > 0) {
            // 1. Extracting the last digit from 'number'
            even = (int)(number % 10);

            // 2. Doubling even, and adding it as a single-digit to 'sum'
            even *= 2;
            sum += getDigit(even);

            // 3. Removing again the last digit off of 'number'
            number /= 100;
        }

        // Returning the final sum
        return sum;
    }


    // Method that returns the number if it is a single digit.
    // Otherwise, the method returns the sum of its two digits.
    public static int getDigit(int number) {
        int result;


        if (getSize(number) == 2) {

            result = number / 10 + number % 10;
        }
        else
            result = number;


        return result;
    }


    // Method that returns true if the given prefix matches that of the number, false otherwise
    public static boolean prefixMatched(long number, int prefix) {
        int prefDigits; // Number of digits in 'prefix'


        // Assigning the size of 'prefix' to 'prefDigits'
        prefDigits = getSize(prefix);

        // Returning Result
        return (getPrefix(number, prefDigits) == prefix);
    }


    // Method that returns the prefix of the card number
    public static int getPrefix(long number, int k) {
        int limit;  // Limited number of digits depending on the value of 'k'
        int prefix; // Prefix of 'number'


        // If k = 1, limit = 10
        // If k = 2, limit = 100
        limit = (int)(Math.pow(10, k));

        // Getting the first digit(s) of 'number'
        while (number > limit) {

            // Removing the last digit from 'number'
            number /= 10;
        }


        // After the loop, assigning the prefix of 'number' to 'prefix', and returning it
        prefix = (int)(number);
        return prefix;
    }


    // Method that returns the size of the number
    public static int getSize(long number) {
        int digits; // Number of digits

        digits = 0;
        while (number > 0) {

            number /= 10;
            digits++;
        }

        // Returning the number of integers
        return digits;
    }
}