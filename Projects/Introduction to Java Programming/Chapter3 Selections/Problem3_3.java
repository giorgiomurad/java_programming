// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Problem 3.3 : Write a program that uses Cramer's rule to solve the following linear equation:
//
//                  ax + by = e
//                  cx + dy = f
//
//               where  x = (ed - bf)/(ad - bc)
//               and    y = (af - ec)/(ad - bc).
//               The program should prompt the user to enter the values of a, b, c, d, e, and f, and display the
//               values of x and y.
//               Condition: If ad - bc = 0, the program should report that the equation has no solution.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference to read user input
        double a, b, c, d, e, f;                // Values to be inserted by the user
        double x, y;                            // Values to be computed
        double condition;                       // Value that deduces whether the equation is solvable or not


        // Prompting the user to enter the values
        System.out.println("Enter the values of a, b, c, d, e, and f :");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();


        // Condition
        condition = a * d - b * c;
        if (condition == 0) {

            System.out.println("The equation has no solution");
        }
        else {

            // Computing the values of x and y
            x = (e * d - b * f)/(a * d - b * c);
            y = (a * f - e * c)/(a * d - b * c);

            // Displaying Result
            System.out.printf("Equation : %2.0fx + %2.0fy = %2.0f"
                            + "\n           %2.0fx + %2.0fy = %2.0f"
                            + "\n"
                            + "\nSolution :"
                            + "\n x = %2.0f"
                            + "\n y = %2.0f",
                            a, b, e, c, d, f, x, y);
        }

        input.close();
    }
}