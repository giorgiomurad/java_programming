// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Problem 3.10 : Write a program that randomly generates a subtraction question.
//                The program should first generate two random integers less than 100.
//                The program should then prompt the user to input the answer, and report
//                if the answer is correct or not.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;       // String to retrieve user input
        int nb1, nb2;   // Integers generated by the system
        int answer;     // User's answer


        // Generating two random integers less than 100
        nb1 = (int)(Math.random() * 100);
        nb2 = (int)(Math.random() * 100);

        // Prompting the user to input the answer
        s      = JOptionPane.showInputDialog("What is " + nb1 + " - " + nb2 + "?");
        answer = Integer.parseInt(s);

        //Displaying Result
        if (nb1 - nb2 == answer)
            JOptionPane.showMessageDialog(null, "That is correct!");

        else
            JOptionPane.showMessageDialog(null, "That is incorrect :(");
    }
}