// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.28 : Write a method that returns the common prefix of two given string values.
//                For example, the common prefix of "distance" and "disinfection" is "dis".
//                If the two strings have no common prefix, the method should return an empty
//                string.
//                Write a test program that prompts the user to enter two string values, and
//                displays their prefix.
//
//
// Author : Giorgio Murad

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner that reads user input
        String prefix;                          // Prefix
        String str1;                            // String 1
        String str2;                            // String 2


        // Prompting the user to enter two string values
        System.out.print("Enter two string values in order to display their prefix: ");
        str1 = input.next();
        str2 = input.next();

        // Displaying their prefix
        prefix = prefix(str1, str2);
        if (prefix.isEmpty())
            System.out.println("The two strings do not have a prefix");
        else
            System.out.println("The prefix of the two strings is " + prefix);

        input.close();
    }

    // Method that returns the prefix of two given strings
    public static String prefix(String str1, String str2) {
        StringBuilder builder = new StringBuilder();            // Local String Builder
        int minLength = Math.min(str1.length(), str2.length()); // Minimum Length


        for (int i = 0; i < minLength; i++) {
            char temp1 = str1.charAt(i);
            char temp2 = str2.charAt(i);

            if (temp1 == temp2) {
                builder.append(temp1);
            }
        }

        if (builder.isEmpty())
            return "";
        else
            return builder.toString();
    }
}