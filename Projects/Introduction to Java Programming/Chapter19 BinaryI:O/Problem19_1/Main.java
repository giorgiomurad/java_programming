// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Problem 19.1 : Write a program that creates a text file called 'Exercise19_1.txt' if it does not exist.
//                The program should write 100 random integers into the file using text I/O.
//                Integers are separated by a space.
//
//
// Author : Giorgio Murad
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;


class Main {
    public static void main(String[] args) throws FileNotFoundException{
        // Creating a File with the specified name
        File file = new File("Exercise19_1.txt");

        // Creating a PrintWriter object for the specified file
        PrintWriter print = new PrintWriter(file);


        // Writing 100 random integers into the file
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Random temp = new Random();

                print.print(temp.nextInt(10) + "\t");
            }
            print.print("\n");
        }

        // Closing the PrintWriter
        print.close();
    }
}