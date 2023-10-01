// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Problem 19.12 : Write a program that can combine the number of files into a single file.
//                 The program runs from the command prompt, allowing the user to input names
//                 of a number of binary files followed by the name of the target file in the end.
//                 The program should combine all the files into a single file named after the
//                 target file.
//
//
// Author : Giorgio Murad

import java.io.*;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream scanner;                                // Input stream to read from the files
        DataOutputStream writer;                                // Output stream to write into the target file
        ArrayList<String> fileNames = new ArrayList<String>();  // List of filenames
        ArrayList<String> data = new ArrayList<String>();       // List of data from the files
        File targetFile = new File(args[args.length-1]);        // Target File

        // Gathering the file names into an array list
        for (int i = 0; i < args.length-1; i++)
        fileNames.add(args[i]);

        for (int i = 0; i < fileNames.size(); i++) {
            String fname = fileNames.get(i);
            File file = new File(fname);                                // Referencing the file

            scanner = new DataInputStream(new FileInputStream(file));   // Input stream to read from the given file
            try {

                // Reading the data from the file to store it into the list
                for (; ; ) {
                    String temp = scanner.readUTF();

                    data.add(temp + " ");
                }
            } catch (Exception ig) {
            } finally {
                // Closing the scanner
                scanner.close();
            }
        }

        // Writing all the data into the target file
        // If the target file does not exist, it is automatically created
        writer = new DataOutputStream(new FileOutputStream(targetFile, false));
        for (int i = 0; i < data.size(); i++) {
            String temp = data.get(i);

            writer.writeUTF(temp);
        }

        // Closing the output stream
        writer.close();
    }
}