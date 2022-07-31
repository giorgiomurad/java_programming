// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.20 : Write a program that takes user input from the command prompt to replace all
//                text occurances in a text file.
//                The user input should include the source file, the string value that is to be
//                replaced, and the new string value.
//
//
// Author : Giorgio Murad
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder builder;  // String Builder
        Scanner scan;           // Scanner
        String oldStr;          // Old String
        String newStr;          // New String
        File file;              // File Object

        // Initializing variables
        file    = new File(args[0]);
        scan    = new Scanner(file);
        builder = new StringBuilder();
        oldStr  = args[1];
        newStr  = args[2];


        while (scan.hasNext()) {
            String temp;    // Temporary String

            temp    = scan.nextLine();
            builder = builder.append(temp.replaceAll(oldStr, newStr));
            builder = builder.append("\n");
        }

        // Closing the scanner
        scan.close();


        // Deploying a PrintWriter object to print into the text file
        PrintWriter print = new PrintWriter(file);

        // Emptying the whole file, and printing back the updated content
        print.flush();
        print.print(builder.toString());

        // Closing the PrintWriter object
        print.close();
    }
}