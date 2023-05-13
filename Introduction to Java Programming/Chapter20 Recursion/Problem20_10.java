// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Problem 20.10 : Write a recursive method that finds the number of occurrences of a specified character
//                 in a string value.
//                 For example:     count("Welcome", 'e') returns 2
//
//
// Author : Giorgio Murad

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;        // String value to be entered by the user
        char letter;        // Character value to be entered by the user
        int occurrences;    // Number of occurrences of the letter in the word


        // Prompting the user to enter a string value followed by a character
        System.out.print("Enter a word followed by a letter : ");
        word    =   input.next();
        letter  =   input.next().charAt(0);

        // Calling the method, and retrieving the integer
        occurrences = count(word, letter);

        // Displaying the result
        System.out.println("The number of " + letter + "(s) in \"" + word + "\" is " + occurrences);

        input.close();
    }

    // Recursive method that finds the number of occurrences of a specified character
    public static int count(String str, char a) {
        int count = 0;  // Number of occurrences


        // Allow the recursion to halt when the length of the string is zero
        if (str.length() == 0)
            return 0;
        else {

            // If the first character of 'str' is equal to 'a', 'count' is incremented by one
            if (str.charAt(0) == a)
                count++;

            return count + count(str.substring(1), a);
        }
    }
}