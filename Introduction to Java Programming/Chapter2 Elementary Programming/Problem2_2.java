// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.2 : Write a program that reads in the radius and length of a cylinder and computes
//               the volume using the following formulas:
//
//               area   = radius * radius * PI
//               volume = area * length
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference that reads user input
        final double PI = 3.14;                 // The value of Pi assigned to a constant instead of a variable
        double length;                          // Variable that carries the length of the cylinder
        double radius;                          // Variable that carries the radius of the cylinder
        double area;                            // Variable whose value is computed from the radius and Pi
        double volume;                          // Variable whose value is computed from the area and length


        // Prompting the user to input the values of length and radius
        System.out.println("Enter the length of a cylinder followed by its radius:");
        length = input.nextDouble();
        radius = input.nextDouble();

        // Computing area of the cylinder
        area = radius * radius * PI;

        // Computing the volume of the cylinder
        volume = area * length;


        // Displaying the details of the cylinder
        System.out.println("Length : " + length
                       + "\nRadius : " + radius
                       + "\nArea   : " + area
                       + "\nVolume : " + volume);

        input.close();
    }
}
