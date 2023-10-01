// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 6 : Single-Dimensional Arrays
//
// Problem 6.19 : Write a method that prompts the user to enter the number of students,
//                their names, and scores.
//                The programs should then print the student names in decreasing order
//                of their scores.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stds;      // Student Names
        int[] scores;       // Student Scores
        int nbOfStudents;   // Number of Students


        // Prompting the user to enter the number of students
        System.out.println("Enter the number of students:");
        nbOfStudents = input.nextInt();

        // Initializing the arrays
        stds   = new String[nbOfStudents];
        scores = new int[nbOfStudents];

        //- Prompting the user to enter every students' name followed by the score
        //- Filling the array and storing the information by the user
        System.out.println("\nEnter every students\' name followed by the score");
        for (int i = 0; i < nbOfStudents; i++) {

            stds[i]   = input.next();
            scores[i] = input.nextInt();
        }

        // Sorting the arrays, and displaying the grades in decreasing order
        sortScores(stds, scores);
        for (int j = 0; j < nbOfStudents; j++)
            System.out.printf("\n%-10s \t | \t %d", stds[j], scores[j]);

        input.close();
    }


    // Method that sorts the students and grades in decreasing order with respect to the grades
    public static void sortScores(String[] names, int[] scores) {
        String temp1;   // Temporary String
        int temp2;      // Temporary Integer

        for (int i = 0; i < scores.length; i++) {
            for (int j = i+1; j < scores.length; j++) {
                if(scores[i] < scores[j]) {
                    temp1 = names[i];
                    names[i] = names[j];
                    names[j] = temp1;

                    temp2 = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp2;
                }
            }
        }
    }
}