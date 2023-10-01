// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Problem 19.4 : Write a program that reads lines of texts from a text file, writes each
//                line as a UTF-8 string into a binary file, and displays the sizes of the
//                text file and the binary file.
//                The program should run from the command prompt.
//
//
// Author : Giorgio Murad
import java.io.*;
import java.util.Scanner;


class Main {
    public static void main(String[] args) throws IOException {
        // Setting a scanner that directs to the text file
        Scanner input = new Scanner(args[0]);

        // Initializing a new StringBuilder object
        StringBuilder builder = new StringBuilder();

        // Reading texts from the file, and storing the string values into the string builder
        while(input.hasNext())
            builder.append(input.next() + " ");

        // Closing the Scanner
        input.close();


        // Creating a FileOutputStream that directs to the binary file
        FileOutputStream outputStream = new FileOutputStream(args[1]);

        // Creating a DataOutputStream that directs to the file
        DataOutputStream dataOutput = new DataOutputStream(outputStream);

        // Writing the string values as UTF-8 into the binary file
        dataOutput.writeUTF(builder.toString());

        // Closing the output stream
        outputStream.close();
    }
}