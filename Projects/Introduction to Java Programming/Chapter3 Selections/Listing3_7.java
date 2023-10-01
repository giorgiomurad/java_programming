// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Listing 3.7 : Write a program that prompts the user to enter an integer.
//               The program should then display:
//                                                  - If the integer is divisible by two and three
//                                                  - If the integer is divisible by two or three, but not both
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference to read user input
        int integer;                            // Integer value provided by the user


        // Prompting the user to enter an integer
        System.out.println("Enter an integer :");
        integer = input.nextInt();

        if ((integer % 3 == 0) && (integer % 2 == 0))
            System.out.println("- Divisible by 2 and 3");

        if ((integer % 3 == 0) ^ (integer % 2 == 0))
            System.out.println("- Divisible by 2 or 3, but not both");

        System.out.println("Done");
        input.close();
    }
}