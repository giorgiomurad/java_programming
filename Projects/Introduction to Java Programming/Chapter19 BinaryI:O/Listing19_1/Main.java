// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Listing 19.1 : Write a program that creates an output stream object for the file 'temp.dat'.
//                The program should allow the object to write numbers from 1 to 10, then deploy
//                an input stream object to read from the file, before displaying the data in the
//                output.
//
//
// Author : Giorgio Murad
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

class Main {
    public static void main(String[] args) throws IOException {
        // Creates an output stream object to a file
        FileOutputStream output = new FileOutputStream("temp.dat");

        // Output values into the file
        for (int i = 1; i <= 10; i++)
            output.write(i);

        // Close the output stream
        output.close();


        // Create an input stream for the file
        FileInputStream input = new FileInputStream("temp.dat");

        // Read values from the file
        int value;
        while ((value = input.read()) != -1)
            System.out.print(value + " ");

        // Close the input stream
        input.close();
    }
}