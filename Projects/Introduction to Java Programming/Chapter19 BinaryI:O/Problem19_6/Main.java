// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Problem 19.6 : Update the loan class of Listing 10.2 so that it implements the Serializable interface.
//                The program creates five Loan objects, and stores them in the file 'Exercise19_6.dat'.
//
//
// Author : Giorgio Murad
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // Creating five Loan object
        Loan loan1 = new Loan();
        Loan loan2 = new Loan();
        Loan loan3 = new Loan();
        Loan loan4 = new Loan();
        Loan loan5 = new Loan();


        // Creating a file object that directs to 'Exercise19_6.dat'
        File file = new File("Exercise19_6.dat");

        // Initializing an object output stream
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file, false));

        // Storing the loan objects into the file
        outputStream.writeObject(loan1);
        outputStream.writeObject(loan2);
        outputStream.writeObject(loan3);
        outputStream.writeObject(loan4);
        outputStream.writeObject(loan5);

        // Closing the output stream
        outputStream.close();
    }
}