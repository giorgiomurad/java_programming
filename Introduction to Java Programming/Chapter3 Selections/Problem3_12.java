// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Problem 3.12 : Write a program that prompts the user to enter an integer, and checks
//                whether the number is divisible by 5 or 6, one of them, or none of them.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;       // String to retrieve user input
        int number;     // Integer entered by the user


        // Prompting the user to enter an integer
        s      = JOptionPane.showInputDialog("Enter an integer :");
        number = Integer.parseInt(s);

        // Displaying Result
        if (number % 5 == 0 && number % 6 == 0)
            JOptionPane.showMessageDialog(null, number + " is divisible by 5 and 6.");

        else if (number % 5 == 0 ^ number % 6 == 0)
            JOptionPane.showMessageDialog(null,
                    number + " is divisible by 5 or 6, but not both");

        else
            JOptionPane.showMessageDialog(null,
                    number + " is not divisible by 5 nor 6.");
    }
}