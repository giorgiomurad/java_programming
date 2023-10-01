// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Listing 5.4 : Write a program that prompts the user to enter an integer value.
//               The program call a method that increments the integer by one,
//               displays its value.
//               The program will then display the value from the main after calling
//               the method.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;   // String reference that takes user input
        int x;      // Integer whose value is determined by the user


        // Prompting the user to enter an integer value
        s = JOptionPane.showInputDialog("Enter an integer value:");
        x = Integer.parseInt(s);

        // Calling the method
        increment(x);

        // Printing the value of x
        JOptionPane.showMessageDialog(null, "The value of x in the main is " + x);
    }


    // Method that increments the integer by one and prints the value
    public static void increment(int x) {
        int result = x + 1;

        JOptionPane.showMessageDialog(null, "The value of x in the method is " + result);
    }
}