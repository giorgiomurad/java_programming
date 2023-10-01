// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.) (Edited)
// String & Text I/O
//
// Problem 9.19 :
//                - Part 1: Write a program that writes into a text file, creates the text file in case it
//                          does not exist, and write one-hundred random integers into the file.
//
//                - Part 2: The program should deploy a scanner that reads data from the updated file, and
//                          prints the sorted integers into the console.
//
//
// Author : Giorgio Murad
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;


class Main {
    public static void main(String[] args) throws Exception {
        // Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.22 : Write a program that repeatedly prompts the user to enter a state of a city,
//                and upon user input, reports whether the answer is correct or not.
//
//
// Author : Giorgio Murad

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Creating a print writer object, and referencing it to the text file
        // Creates the text file in case the file does not exist
        PrintWriter print = new PrintWriter("integers.txt");

        // Creating an instance to reference the text file
        File file = new File("integers.txt");

        // Creating a instance of a Random object
        Random generator = new Random();


        // Generating 100 random integers into the file
        for (int i = 1; i <= 100; i++) {
            int temp;   // Temporary Integer

            temp = generator.nextInt(101);
            print.print(temp + "\t");
            if (i % 5 == 0)
                print.println();
        }

        // Closing the file after finishing with it
        print.close();



        // Creating an instance to a Scanner with the specified file
        Scanner scanner = new Scanner(file);
        int[] integers  = new int[100];

        // Printing the integers from the file into the console
        for (int i = 0; scanner.hasNext(); i++) {

            integers[i] = scanner.nextInt();
        }

        // Sorting the integer values in the array, and displaying them
        Arrays.sort(integers);
        for (int j = 1; j <= integers.length; j++) {
            System.out.print("|\t" + integers[j-1] + "\t|");

            if (j % 5 == 0)
                System.out.println();
        }

        // Closing the scanner
        scanner.close();
    }
}
    }
}