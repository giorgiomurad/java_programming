// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Listing 19.2 : Write a program that uses a DataOutputStream to write student names and scores into
//                a file, and a DataInputStream that reads data from the file to display in the output.
//
//
// Author : Giorgio Murad
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // Create an output stream for the file 'temp.dat'
        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));

        // Writing student names and their test scores into the file
        output.writeUTF("John");
        output.writeDouble(85.5);
        output.writeUTF("Jim");
        output.writeDouble(185.5);
        output.writeUTF("George");
        output.writeDouble(105.5);

        // Closing the output stream
        output.close();


        // Creating an input stream for the file
        DataInputStream inputStream = new DataInputStream(new FileInputStream("temp.dat"));

        // Reading the student names and scores from the file
        System.out.println(inputStream.readUTF() + " \t " + inputStream.readDouble());
        System.out.println(inputStream.readUTF() + " \t " + inputStream.readDouble());
        System.out.println(inputStream.readUTF() + " \t " + inputStream.readDouble());
    }
}