// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Problem 3.1 : Write a program that that solves a quadratic equation.
//               The formula of a quadratic equation is ax^2 + bx + c = 0.
//               The program should first compute the discriminant whose formula is b^2 - 4ac.
//               If the discriminant is positive, the program should display the two roots.
//               If the discriminant is zero, the program should display one root.
//               And if the discriminant is negative, the equation would have no root.
//
//               The program should prompt the user to input values for a, b, and c to proceed.
//               In the case of two roots, the formulas to compute each root are:
//
//               r1 = (-b + (b^2 - 4ac)^0.5)/2a         r2 = (-b - (b^2 - 4ac)^0.5)/2a
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // Scanner reference that reads user-input
        double a, b, c;                             // Coefficients of the equation
        double r1;                                  // Root 1
        double r2;                                  // Root 2
        double delta;                               // Discriminant of the equation


        // Prompting user to enter values of a, b, and c
        System.out.println("Enter the values of a, b, and c :");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        // Calculating the discriminant
        delta = b * b - 4 * a * c;

        // Conditions
        if (delta > 0) {

            // Calculating the two roots and displaying them
            r1 = (-b + Math.pow(delta, 0.5))/(2 * a);
            r2 = (-b - Math.pow(delta, 0.5))/(2 * a);

            // Displaying Output
            System.out.println("The equation has two roots:"
                           + "\nRoot 1 : " + r1
                           + "\nRoot 2 : " + r2);
        }
        else if (delta == 0) {

            // Calculating the root
            r1 = -b / (2 * a);

            //Displaying
            System.out.println("The equation only has one root:" +
                             "\nRoot : " + r1);
        }
        else {

            System.out.println("The equation does not have any root.");
        }

        input.close();
    }
}