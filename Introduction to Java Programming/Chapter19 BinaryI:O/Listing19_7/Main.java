// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Listing 19.7 : Write a program that stores an array of integers, and an array of strings into a file 'array.dat',
//                Rereads the arrays from the same file, and displays their element values in the output.
//
//
// Author : Giorgio Murad
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Jim", "John", "Jake"};


        // Creating an output stream for the file array.dat
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat"));

        // Storing the arrays into the file
        output.writeObject(numbers);
        output.writeObject(names);

        // Closing the output stream
        output.close();


        // Creating an input stream for the file array.dat
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"));

        // Reading arrays from the file, and assigning their variables
        int[] newNbs = (int[])(input.readObject());
        String[] newNames = (String[])(input.readObject());
        input.close();

        // Displaying the element values of the arrays
        for (String i : newNames)
            System.out.print(i + " ");

        System.out.println();
        for (int i : newNbs)
            System.out.print(i + " ");
    }
}