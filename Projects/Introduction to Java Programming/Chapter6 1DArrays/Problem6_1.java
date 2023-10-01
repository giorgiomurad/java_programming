// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.) (Edited)
// Chapter 6 : Single-Dimensional Arrays
//
// Problem 6.1 : Write a program that prompts the user to input the number of students.
//               And based on the number of students, prompts the user to enter scores,
//               and displays the grade of each student.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores;   // Array of Scores
        int total;      // Total Number of Students
        int grade;      // Student Grade


        // Prompting the user to enter the total number of students
        System.out.println("Enter the total number of students:");
        total  = input.nextInt();

        // Creating the array of scores with length 'total'
        scores = new int[total];
        System.out.println();

        // Prompting the user to enter the grades
        System.out.println("Enter the grades:");
        for (int i = 0; i < total; i++) {
            grade = input.nextInt();

            // Assigning the value of 'grade' to the element of the array
            scores[i] = grade;
        }
        System.out.println();

        // Printing Results
        for (int j = 0; j < total; j++) {

            System.out.println("Student " + (j+1) + " score is " + scores[j] +
                               " and the grade is " + getGrade(scores[j]));
        }

        input.close();
    }


    // Method that returns the students' grade based on the score
    public static char getGrade(int score) {
        char grade;     //Grade


        //Assigning grade based on the score value
        if (score >= 90)
            grade = 'A';

        else if (score >= 80)
            grade = 'B';

        else if (score >= 70)
            grade = 'C';

        else if (score >= 60)
            grade = 'D';

        else
            grade = 'C';


        // Returning Grade
        return grade;
    }
}