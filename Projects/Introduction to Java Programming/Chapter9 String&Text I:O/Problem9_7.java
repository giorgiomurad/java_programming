// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.7 : The following international standard letter/number mapping found
//               on the telephone is shown below:
//
//               1       2       3
//                      ABC     DEF
//               4       5       6
//              GHI     JKL     MNO
//               7       8       9
//              PQRS    TUV     WXYZ
//                       0
//
// Write a programs that prompts the user to enter a phone number as a string,
// and calls a method that returns a number given the uppercase letter.
// The inputted string may contain letters, the program should translate each
// letter into a digit, and leaves all the other characters intact. The following
// is a sample run:
//
// 1. Enter a string: 1-800-Flowers
//    1-800-3569377
//
// 2. Enter a string: 1800flowers
//    18003569377
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String oldStr;  // Old String
        String newStr;  // New String



        //Prompting the user to enter a string
        System.out.print("Enter a string: ");
        oldStr = input.next();

        // Translating the inputted string
        newStr = translate(oldStr);

        // Displaying Result
        System.out.println(newStr);
    }


    // Method that converts every character into a digit
    public static String translate(String str) {
        // Converting str into a char array, and assigning it to init (Initial array)
        char[] init = str.toCharArray();
        // Creating an empty array as size of init, and assigning it to updt (Updated array)
        char[] updt = new char[init.length];


        // Iterating through the initial array
        for (int i = 0; i < init.length; i++) {
            char temp = init[i];

            if (Character.isLetter(temp)) {
                temp = Character.toUpperCase(temp);

                int nb = getNumber(temp);
                updt[i] = String.valueOf(nb).charAt(0);
            }
            else {

                updt[i] = init[i];
            }
        }


        // Returning the updated array as a string
        return String.valueOf(updt);
    }

    // Method that takes a specified character, and converts it to a number based on the
    // international standard before returning it.
    public static int getNumber(char letter) {
        int nb;

        nb = 0;
        switch (letter) {
            case 'A', 'B', 'C':
                nb = 2;
                break;

            case 'D', 'E', 'F':
                nb = 3;
                break;

            case 'G', 'H', 'I':
                nb = 4;
                break;

            case 'J', 'K', 'L':
                nb = 5;
                break;

            case 'M', 'N', 'O':
                nb = 6;
                break;

            case 'P', 'Q', 'R', 'S':
                nb = 7;
                break;

            case 'T', 'U', 'V':
                nb = 8;
                break;

            case 'W', 'X', 'Y', 'Z':
                nb = 9;
                break;
        }

        return nb;
    }
}