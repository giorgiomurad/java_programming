// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Problem 3.8 : Write a program that prompts the user to enter three integers.
//               The program must then sort the integers, and displays them in order.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference to retrieve user input
        int num1, num2, num3;                   // Integers entered by the user
        int great;                              // Greatest integer
        int moderate;                           // Moderate integer
        int least;                              // Least integer


        // Prompting the user to enter 3 integers
        System.out.println("Enter three integers : ");
        num1 = input.nextInt();
        great = num1;

        num2 = input.nextInt();
        if (num2 > great) {
            moderate = great;
            great = num2;
        }
        else {
            moderate = num2;
        }

        num3 = input.nextInt();
        if (num3 > great) {
            least = moderate;
            moderate = great;
            great = num3;
        }
        else {
            if (num3 > moderate) {
                least = moderate;
                moderate = num3;
            }
            else {
                least = num3;
            }
        }

        // Displaying the integers in order
        System.out.println(great + " " + moderate + " " + least);
        input.close();
    }
}