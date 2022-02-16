// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.5 : Write a program that prompts the user to enter the subtotal and gratuity rate
//               then computes and displays the gratuity and the total.
//
//               Ex.: If the user enters 10 for subtotal and 15 for the gratuity rate, the program
//                    will then display $1.5 for the gratuity and $11.5 as the total.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference that reads user input
        double subtotal;                        // Variable whose value is assigned by the user
        double gratrate;                        // Variable whose value is assigned by the user
        double gratuity;                        // Variable whose value is computed
        double total;                           // Variable whose value is computed


        // Prompting the user to input the subtotal and the gratuity rate
        System.out.println("Enter the subtotal followed by the gratuity rate :");
        subtotal = input.nextDouble();
        gratrate = input.nextDouble();

        // Computing gratuity and the total
        gratuity = subtotal * (gratrate / 100);
        total    = gratuity + subtotal;

        // Displaying Output
        System.out.println("Subtotal      : " + subtotal
                       + "\nGratuity Rate : " + gratrate
                       + "\nGratuity      : " + gratuity
                       + "\nTotal         : " + total);

        input.close();
    }
}
