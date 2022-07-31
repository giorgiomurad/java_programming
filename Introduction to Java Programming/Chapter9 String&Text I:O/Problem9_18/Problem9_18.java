// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.) (Edited)
// String & Text I/O
//
// Problem 9.18 : Suppose a text file (.txt) contains an unspecified number of scores.
//                Write a program that reads from the file, and displays their sum and average.
//                Scores in the file are separated by blanks.
//
//
// Author : Giorgio Murad
import java.io.File;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        File file    = new File("scores.txt");  // File object that references the text file
        Scanner scan = new Scanner(file);       // Scanner object set to read from the file

        int sum;        // Sum of all scores
        int average;    // The average
        int count;      // Number of scores


        // Displaying the scores from the text file in the console
        sum = 0;
        count = 0;
        System.out.println("Scores:");
        while (scan.hasNext()) {
            int temp = scan.nextInt();
            sum += temp;
            count++;

            // Printing score
            System.out.print("|\t" + temp + "\t|");

            // Inserting a line-break for every five iterations
            if (count % 5 == 0)
                System.out.println();
        }
        average = sum / count;

        // Displaying the score's total and average
        System.out.println("Their total is " + sum);
        System.out.println("Their average is " + average);

        // Closing the file after being done with it
        scan.close();
    }
}