// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.12 : Write a function that verifies if two words are considered to be anagrams or not.
//                Two words are anagrams if the two words are different, and all letters of the first
//                word are included in the second.
//
//                The program must prompt the user to enter two strings, call the function, and
//                display whether the two inputted strings are anagrams or not.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string1;
        String string2;


        // Prompting the user to enter two strings
        System.out.print("Enter two strings: ");
        string1 = input.next();
        string2 = input.next();

        // Displaying whether the two string are anagrams or not
        if (isAnagram(string1, string2))
            System.out.println("The two strings are anagrams.");

        else
            System.out.println("The two strings are not anagrams.");
    }

    // Method that returns true if the two strings are anagrams, false otherwise.
    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() == str2.length()) {
            int temp1, temp2;

            for (int i = 0; i < str1.length(); i++) {
                temp1 = occurances(str1, str1.charAt(i));
                temp2 = occurances(str2, str1.charAt(i));

                if (temp1 != temp2)
                    return false;
            }

            return true;
        }

        return false;
    }

    // Method that returns the number of occurances of a character in a string
    public static int occurances(String str, char letter) {
        int count;

        count = 0;
        for (char i : str.toCharArray())
            if (i == letter)
                count++;

        return count;
    }
}