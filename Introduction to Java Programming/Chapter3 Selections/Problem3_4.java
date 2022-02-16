// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Problem 3.4 : Write a program that generates two random numbers under 100, and asks the
//               user to enter the sum of these two numbers.
//               The program should then display whether the user answered correctly or not.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;       // String variable that takes user input
        int nb1, nb2;   // Two integers generated by the program
        int ans;        // The answer provided by the user


        // Generating two random integers less than 100
        nb1 = (int)(Math.random() * 100);
        nb2 = (int)(Math.random() * 100);

        // Prompting the user to enter the sum of the two numbers
        s   = JOptionPane.showInputDialog("What is " + nb1 + " + " + nb2 + "?");
        ans = Integer.parseInt(s);

        // Condition
        if (nb1 + nb2 == ans) {

            JOptionPane.showMessageDialog(null, "That is Correct!");
        }
        else {

            JOptionPane.showMessageDialog(null, "I Believe You're Wrong. :(");
        }
    }
}