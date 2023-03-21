// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Listing 19.8 : Write a program that creates a RandomAccessFile object that can read from and write to a file called
//                'inout.dat'. If the file already exists, clear out all of its contents.
//                The program should do the following actions:
//                                                      - Write to the file integers from zero to two-hundred
//                                                      - Display the first, second, and tenth integer
//                                                      - Write 555 as the eleventh number
//                                                      - Append the file with 999
//                                                      - Display the length of the file
//                                                      - Display the eleventh number in the file
//
//
// Author : Giorgio Murad
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Creating a random-access file object
        RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");

        // Clearing the file of all of its contents in case the file exists
        inout.setLength(0);

        // Writing integers from 0 to 200 into the file
        for (int i = 0; i <= 200; i++)
            inout.writeInt(i);

        // Displaying the current length of the file
        System.out.println("The current length of the file is " + inout.length());

        // Displaying the first number from the file
        inout.seek(0);
        System.out.println("The first number in the file is " + inout.readInt());

        // Displaying the second number from the file
        inout.seek(1 * 4);
        System.out.println("The second number in the file is " + inout.readInt());

        // Displaying the tenth number from the file
        inout.seek(9 * 4);
        System.out.println("The tenth number in the file is " + inout.readInt());

        // Writing 555 as the eleventh number
        inout.write(555);

        // Appending 999 to the file
        inout.seek(inout.length());
        inout.writeInt(999);

        // Displaying the new length of the file
        System.out.println("The new length of the file is " + inout.length());

        // Displaying the eleventh number of the file
        inout.seek(10 * 4);
        System.out.println("The eleventh number in the file is " + inout.length());
    }
}