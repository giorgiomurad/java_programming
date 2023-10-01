// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Listing 5.5 : Write a program that prompts the user to enter two integers num1 and num2.
//               The program should include a method that swaps the two values, meaning
//               assigning the value of num2 to num1, and assigning the value of num1 to num2.
//               The method must print the values of the two values before the program prints
//               the values of num1 and num2 from the main.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference that reads user input
        int num1, num2;                         // Integer values determined by the user


        // Prompting the user to input two integers
        System.out.println("Enter two integers:");
        num1 = input.nextInt();
        num2 = input.nextInt();

        // Calling the method
        swap(num1, num2);

        // Printing their values
        System.out.println("After calling the method," +
                "\nthe values of num1 and num2 are " + num1 + " and " + num2);

        input.close();
    }


    // Method that swaps the values of two variables, and displays them
    public static void swap(int num1, int num2) {
        int temp;   // Temporary Integer

        // Swapping the values
        temp = num1;
        num1 = num2;
        num2 = temp;

        // Printing the values
        System.out.println("In the method, the values of num1 and num2 are " + num1 + " and " + num2);
    }
}