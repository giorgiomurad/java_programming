// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Problem 19.5 : Write a program that stores an array that holds five integers, a Date object, and a double
//                value 5.5 into a file named 'Exercise19_5.dat'.
//
//
// Author : Giorgio Murad
import java.io.*;
import java.util.Date;

class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Initializing data type instances to store in the stream
        int[] integers = {1, 2, 3, 4, 5};
        Date date = new Date();
        double value = 5.5;

        
        // Creating the file instance directing to the file 'Exercise19_5.dat'
        File file = new File("Exercise19_5.dat");
        
        // Creating an output stream for the file
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file, false));
        
        // Inserting the objects into the file
        outputStream.writeObject(integers);
        outputStream.writeObject(date);
        outputStream.writeDouble(value);

        // Closing the output stream
        outputStream.close();
    }
}