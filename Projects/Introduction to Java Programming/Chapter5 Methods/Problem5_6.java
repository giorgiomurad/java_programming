// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Problem 5.6 : Write a program that prompts the user to enter an integer,
//               and displays the following pattern:
//
//                                                  1
//                                                2 1
//                                              3 2 1
//                                                ...
//                                        n-1 n 3 2 1
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;   // String reference to read user input
        int nb;     // Integer value determined by the user


        // Prompting the user to enter an integer
        s  = JOptionPane.showInputDialog("Enter an integer:");
        nb = Integer.parseInt(s);

        // Displaying the pattern
        displayPttrn(nb);
    }


    // Method that displays the pattern based on the integer value
    public static void displayPttrn(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= 1; j--) {

                if (j <= i)
                    System.out.printf(" %2d", j);
                else
                    System.out.printf(" %2s", " ");
            }
            System.out.println();
        }
    }
}