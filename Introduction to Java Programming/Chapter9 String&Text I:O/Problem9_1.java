// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.1 : Write a program that prompts the user to enter a social security number
//               in the format XXX-XX-XXXX.
//               The program should display "Valid SSN" if the entered number is correct.
//               Otherwise, "Invalid SSN" is displayed.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner to take user input
        String ssn;     // Social Security Number


        // Prompting the user to enter the social security number
        System.out.println("Enter the Social Security Number :");
        ssn = input.next();

        // Displaying Result
        if (isValid(ssn)) {

            System.out.println("SSN Valid.");
        }
        else {

            System.out.println("SSN Not Valid. (Must be in format XXX-XX-XXXX where X is a digit)");
        }
    }

    // Method that checks whether the SSN is valid or not
    public static boolean isValid(String ssn) {
        boolean valid;  // True if valid, false otherwise


        valid = false;
        if (ssn.length() == 11) {
            if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
                for (char i : ssn.toCharArray()) {
                    if (!Character.isDigit(i)) {
                        if (i != '-') {

                            return valid;
                        }
                    }
                }

                valid = true;
            }
        }

        return valid;
    }
}