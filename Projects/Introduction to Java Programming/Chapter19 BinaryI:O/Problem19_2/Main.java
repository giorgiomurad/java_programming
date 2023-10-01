// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Problem 19.2 : Write a program that creates a file called 'Exercise19_2.dat' in case the file does not exist.
//                The program should write 100 random integers into the file using binary I/O.
//
//
// Author : Giorgio Murad
import java.io.*;
import java.util.Random;

class Main {
    public static void main(String[] args) throws IOException {
        // Creating a file with the specified filename
        File file = new File("Exercise19_2.dat");

        // Creating a file output stream for the specified file
        FileOutputStream outputStream = new FileOutputStream(file, false);

        // Creating a data output stream for the file output stream
        DataOutputStream dataOutput = new DataOutputStream(outputStream);

        // Writing 100 random integers into the file
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Random temp = new Random();

                dataOutput.writeUTF(temp.nextInt(10) + "\t");
            }
            dataOutput.writeUTF("\n");
        }

        // Closing the data output stream
        dataOutput.close();
    }
}