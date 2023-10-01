// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.34 : Write a program that takes user-input from the terminal.
//                The first input should specify a directory containing a number of files,
//                The second input should specify the string that value the user wants to
//                replace in every one of the files,
//                And the third input should specify the string value that the user wants
//                to replace with.
//                The program should replace an old string with a new string value in all
//                files of a specified directory.
//
//
// Author : Giorgio Murad

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File(args[0]);   // File object that references the given directory
        File[] childFiles;                       // Array of file objects


        // Assigning all the child files of 'dir' in a File array to 'childFiles'
        childFiles = dir.listFiles();

        // Going through every file in the array of files
        for (File file : childFiles)
            replaceTextInFile(file, args[1], args[2]);
    }

    // Method that replaces an old string with a new string in a specified file
    public static void replaceTextInFile(File file, String oldStr, String newStr) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();    // String Builder Object
        Scanner scanner   = new Scanner(file);          // Scanner to read from the given file


        // Reading from the file
        while (scanner.hasNext()) {
            String temp = scanner.next();

            // Replacing the old string with the new string value
            if (temp.equals(oldStr))
                temp = newStr;

            // Appending the string value followed by a space
            builder.append(temp + " ");
        }

        // Closing the scanner
        scanner.close();

        // Initializing a new Print Writer object referencing the given file
        PrintWriter print = new PrintWriter(file);

        // Removing all contents of the file, and printing the string of the builder object
        print.flush();
        print.print(builder);

        // Closing the reference
        print.close();
    }
}