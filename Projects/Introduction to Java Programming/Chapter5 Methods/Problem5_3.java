// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Problem 5.3 : Write the following two methods :
//               1. A method that returns the reversal of an integer.
//               2. A method that verifies if an integer is a palindrome.
//
//               Write a program that prompts the user to enter an integer, and displays
//               whether the entered number is a palindrome or not.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;   // String to take user input
        int number; // Number Entered by the user


        // Prompting the user to enter an integer
        s      = JOptionPane.showInputDialog("Enter an integer :");
        number = Integer.parseInt(s);

        // Displaying Result
        if (isPalindrome(number))
            JOptionPane.showMessageDialog(null, "Palindrome!!!");
        else
            JOptionPane.showMessageDialog(null, "Not a Palindrome :(");
    }


    // Method that returns the reversal of an integer
    public static int reversal(int num) {
        int temp;   // Temporary Integer
        int rev;    // Reversal


        rev = 0;
        while (num > 0) {
            // Assigning the last digit of num to temp
            temp = num % 10;

            // Adding the value of temp as a digit to rev
            rev = rev * 10 + temp;

            // Removing the last digit from num
            num /= 10;
        }

        // Returning the reversal of num
        return rev;
    }


    // Method that returns true if the number is a palindrome, false otherwise
    public static boolean isPalindrome(int number) {
        int reversal;   // Reversal of number

        // Assigning the reversal of 'number' to 'reversal'
        reversal = reversal(number);

        // Returning true if 'reversal' is equal to 'number', false otherwise
        return (reversal == number);
    }
}