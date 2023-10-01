// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Listing 3.2 : Write a program that prompts the user to enter an integer.
//               If the integer is divisible by 5, The program should display 'HiFive'
//               If the integer is divisible by 2, The program should display 'HiEven'
//               If divisible by both, Both Messages should be displayed.
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

        if (integer % 5 == 0)
            System.out.println("HiFive");

        if (integer % 2 == 0)
            System.out.println("HiEven");

        System.out.println("Done.");
        input.close();
    }
}