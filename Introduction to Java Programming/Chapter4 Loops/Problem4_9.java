// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 4 : Loops
//
// Problem 4.9 : Write a program that prompts the user to enter the number of students, and
//               each student's name and score, and finally displays the student with the
//               highest score, and the student with the second-highest score.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input;      // Scanner reference to read user input
        String stdName;     // Name of any student
        String std1;        // Name of student with the highest score
        String std2;        // Name of student with the second-highest score
        double stdScore;    // Score of any student
        double score1;      // Highest Score
        double score2;      // Second-Highest Score
        int nbOfStds;       // Number of Students



        // Prompting the user to enter the number of students
        input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        nbOfStds = input.nextInt();

        // Initializing the variables to avoid compilation error
        std1   = "";
        std2   = "";
        score1 = 0;
        score2 = 0;
        System.out.println();

        // Prompting the user to enter each student's name and score
        System.out.println("Enter each student's name followed by his score:");
        for (int i = 0; i < nbOfStds; i++) {
            stdName  = input.next();
            stdScore = input.nextInt();

            // After assigning values to 'stdScore'
            if (stdScore > score1) {

                // If 'stdScore' is greater than 'score1',
                // The value of 'stdScore' is assigned to 'score1',
                // and the value of 'stdName' is assigned to 'std1'
                score1 = stdScore;
                std1   = stdName;
            }
            else if (stdScore > score2) {

                // If 'stdScore' is greater than 'score1',
                // The value of 'stdScore' is assigned to 'score1',
                // and the value of 'stdName' is assigned to 'std1'
                score2 = stdScore;
                std2   = stdName;
            }
        }

        // Displaying the result
        System.out.println();
        System.out.printf("The student with the highest score is %s with a score of %.2f / 100" +
                        "\nThe student with the second-highest score is %s with a score of %.2f / 100",
                           std1, score1, std2, score2);

        input.close();
    }
}