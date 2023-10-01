// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.11 : Write a function that takes a string as parameter, and returns the string with
//                its characters sorted.
//                The program should prompt the user to input a string, call the function, and
//                display the resulted string.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data;


        // Prompting the user to enter a string value
        System.out.print("Enter a string: ");
        data = input.next();

        // Sorting the string, and displaying it
        System.out.print("After sorting the string: " + sort(data));
    }

    // Method that sorts all the characters of the string before returning it
    public static String sort(String value) {
        char[] letters = value.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 1+i; j < letters.length; j++) {
                if (letters[i] > letters[j]) {
                    char temp;

                    temp = letters[i];
                    letters[i] = letters[j];
                    letters[j] = temp;
                }
            }
        }

        return String.valueOf(letters);
    }
}