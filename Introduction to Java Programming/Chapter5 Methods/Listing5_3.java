// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Listing 5.3 : Write a program that prompts the user to enter a double value representing
//               a student's score, and displays whether the student got an A, B, C, D, or F.
//               The program should call a char method that returns the student's grade, and
//               display it from the main.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score;   // Student's Score
        char grade;     // Student's Grade


        // Prompting the user to enter a score value
        System.out.println("Enter the student's score:");
        score = input.nextDouble();

        // Retrieving the student's grade, and assigning it to the variable 'grade'
        grade = getGrade(score);

        // Displaying Result
        System.out.println("The student's grade is " + grade);

        input.close();
    }


    
    // Method that returns the student's grade depending on the given score
    public static char getGrade(double scr) {
        char grd;


        if (scr >= 90)
            grd = 'A';

        else if (scr >= 80)
            grd = 'B';

        else if (scr >= 70)
            grd = 'C';

        else if (scr >= 60)
            grd = 'E';

        else
            grd = 'F';


        return grd;
    }
}