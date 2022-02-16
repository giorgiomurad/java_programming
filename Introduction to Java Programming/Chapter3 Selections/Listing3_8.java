// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Listing 3.8 : Write a program that asks the user to enter an integer representing a year.
//               The program should then report if the year is a leap year or not.
//
//               A leap year is a year when it is a number that is divisible by 400, or
//               divisible by 4, and not by 100.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;       // String to retrieve user input
        int year;       // Year inputted by the user
        boolean leap;   // True if the year is a leap year, False otherwise


        // Prompting the user to enter a year
        s    = JOptionPane.showInputDialog("Enter a year:");
        year = Integer.parseInt(s);

        // Assigning True to 'leap' if the year is a leap year, and False otherwise
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            leap = true;
        else
            leap = false;
        /* or leap = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) */


        // Displaying Result
        if (leap)
            JOptionPane.showMessageDialog(null, "The year is a leap year.");
        else
            JOptionPane.showMessageDialog(null, "The year is not a leap year.");
    }
}