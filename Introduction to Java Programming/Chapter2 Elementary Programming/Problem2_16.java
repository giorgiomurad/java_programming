// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.16 : Write a program that calculates the energy needed to heat water from an initial
//                temperature to a final temperature.
//                The program should sdk the user to enter the amount of water in kg, and the initial
//                and final temperatures in celsius.
//
//                The formula to compute the required energy is :
//                          Q = M * (finalTemp - initTemp) * 4184
//                M is the amount of water in kg, while Q is the energy measured in Joules.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;           // String variable that retrieves user input
        double initTemp;    // Initial Temperature
        double finalTemp;   // Final Temperature
        double M;           // Amount of water in kilograms
        double Q;           // Energy in Joules


        // Prompting the user to enter the amount of water in kg
        s = JOptionPane.showInputDialog("Enter the amount of water in kilograms :");
        M = Double.parseDouble(s);

        // Prompting for the water's initial temperature
        s = JOptionPane.showInputDialog("Enter the water's initial temperature :");
        initTemp = Double.parseDouble(s);

        // Prompting for the water's final temperature
        s = JOptionPane.showInputDialog("Enter the water's final temperature :");
        finalTemp = Double.parseDouble(s);

        // Calculating the required energy
        Q = M * (finalTemp - initTemp) * 4184;

        // Displaying Result
        JOptionPane.showMessageDialog(null,
                "Amount of water     : " + M + " KG"
                     + "\nInitial Temperature : " + initTemp + "C"
                     + "\nFinal Temperature   : " + finalTemp + "C"
                     + "\nRequired Energy     : " + Q + "J");
    }
}