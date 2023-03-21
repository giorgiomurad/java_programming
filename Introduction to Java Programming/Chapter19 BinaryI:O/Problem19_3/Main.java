// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Problem 19.3 : Suppose a binary file called 'Exercise19_3.dat' contains an unspecified number of integers.
//                Write a program that finds and displays the sum of all integers.
//
//
// Author : Giorgio Murad
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        int var;        // Integer read from the binary file
        int sum = 0;    // Sum of the integers in the binary file


        // Creating a File object that directs to the file
        File file = new File("Exercise19_3.dat");

        // Creating a FileInputStream that directs to the file
        FileInputStream inputStream = new FileInputStream("Exercise19_3.dat");

        // Reading from the binary file and adding them to the integer 'sum'
        int count = 0;
        while ((var = inputStream.read()) != -1)
            sum += var;

        // Displaying the sum in the output
        System.out.println("The sum of all integers in the file is " + sum);
    }
}