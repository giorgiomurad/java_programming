// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Listing 5.2 : Write a program that prompts the user to enter a double value representing
//               a student's score, and displays whether the student got an A, B, C, D, or F.
//               The program should call a void method that prints the student's grade.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score;   // Student's Score


        // Prompting the user to enter a score value
        System.out.println("Enter the student's score:");
        score = input.nextDouble();

        // Displaying the student's grade
        printGrade(score);

        input.close();
    }


    // Method that prints the student's grade depending on the given score
    public static void printGrade(double scr) {

        if (scr >= 90)
            System.out.println("The student got an A");

        else if (scr >= 80)
            System.out.println("The student got a B");

        else if (scr >= 70)
            System.out.println("The student got a C");

        else if (scr >= 60)
            System.out.println("The student got a D");

        else
            System.out.println("The student got an F");
    }
}