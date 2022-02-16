// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Problem 3.5 : Using System.currentTimeMillis(), Write a program that generates 3 integers
//               less than 10, and prompts the user to enter their sum.
//               The program should then report if the answer provided by the user is correct
//               or not.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;           // String variable that takes user input
        int nb1, nb2, nb3;  // Three integers generated by the program
        int sysAns;         // Correct sum
        int userAns;        // The answer provided by the user


        // Generating three integers less than 10
        nb1 = (int) (System.currentTimeMillis() % 10);
        nb2 = (int) (System.currentTimeMillis() * 3 % 10);
        nb3 = (int) (System.currentTimeMillis() * 7 % 10);

        // Prompting the user to enter the sum
        s       = JOptionPane.showInputDialog("What is " + nb1 + " + " + nb2 + " + " + nb3 + "?");
        userAns = Integer.parseInt(s);

        // Condition
        sysAns = nb1 + nb2 + nb3;
        if (userAns == sysAns) {

            JOptionPane.showMessageDialog(null, "That is Correct!");
        }
        else {

            JOptionPane.showMessageDialog(null, "I Believe That You Are Wrong. :(");
        }
    }
}