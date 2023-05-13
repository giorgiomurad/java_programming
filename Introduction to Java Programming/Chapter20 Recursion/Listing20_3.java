// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Listing 20.3 : Write a program that calls a method that checks if a given string is considered to be a
//                palindrome for the program to display the result.
//
//
// Author : Giorgio Murad

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;


        // Asking the user to input a string
        System.out.println("Enter a string value:");
        str = input.next();

        // 1. Using the method to check if the string is a palindrome
        // 2. Displaying the result according to the result
        if (isPalindrome(str))
            System.out.println("The given string " + str + " is a palindrome.");

        else
            System.out.println("The given string " + str + " is not a palindrome.");
    }

    // Method that returns true if the given string is considered to be a palindrome.
    // Otherwise, false is returned
    public static boolean isPalindrome(String toString) {

        if (toString.length() <= 1)
            return true;
        else if (toString.charAt(0) != toString.charAt(toString.length()-1))
            return false;
        else
            return isPalindrome(toString.substring(1, toString.length()-1));
    }
}