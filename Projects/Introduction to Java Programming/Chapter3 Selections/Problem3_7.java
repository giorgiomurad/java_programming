// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Problem 3.7 : Write a program that prompts the user to enter any number, and displays
//               the nonzero denominations only using singular words for single units such
//               as 1 dollar and 1 penny, and plural words for more than one unit such as
//               2 dollars and 3 pennies.
//               Example : $23.67  is  23 dollars and 67 pennies.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;       // String to retrieve user input
        double amount;  // Amount determined by the user
        int dollars;
        int pennies;


        // Prompting user input
        s = JOptionPane.showInputDialog("How many dollars do you have in your pocket?");
        amount = Double.parseDouble(s);

        // Computing dollars and pennies
        dollars = (int) ((amount * 100) / 100);
        pennies = (int) ((amount * 100) % 100);

        // Displaying Result
        System.out.print("$" + amount + " is ");
        if (dollars == 0) {
            if (pennies == 0)
                JOptionPane.showMessageDialog(null, "Nothing.");

            else if (pennies == 1)
                JOptionPane.showMessageDialog(null, pennies + " penny.");

            else
                JOptionPane.showMessageDialog(null, pennies + " pennies.");
        }

        else if (dollars == 1) {
            if (pennies == 0)
                JOptionPane.showMessageDialog(null, dollars + " dollar.");

            else if (pennies == 1)
                JOptionPane.showMessageDialog(null, dollars + " dollar and " + pennies + " penny.");

            else
                JOptionPane.showMessageDialog(null, dollars + " dollar and " + pennies + " pennies.");
        }

        else {
            if (pennies == 0)
                JOptionPane.showMessageDialog(null, dollars + " dollars.");

            else if (pennies == 1)
                JOptionPane.showMessageDialog(null, dollars + " dollars and " + pennies + " penny.");

            else
                JOptionPane.showMessageDialog(null, dollars + " dollars and " + pennies + " pennies.");
        }
    }
}