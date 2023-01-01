// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Abstract Classes & Interfaces
//
// Problem 14.21 : Design a class called Complex that represents a complex number in the
//                 form of a + bi where 'a' is known as the real part of the complex number,
//                 and 'b' is known as the imaginary part of the complex number. Implement the
//                 class methods 'add', 'subtract', 'divide', 'multiply', and 'abs' for absolute,
//                 and override the toString method to return a representation of the complex
//                 number.
//
//                 Write a test program that prompts the user to enter two complex numbers, and
//                 displays the result of their addition, subtraction, and division.
//
//
// Author : Giorgio Murad

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Complex c1, c2; // Complex Numbers
        double a, b;    // Real and imaginary values assigned by the user


        // Prompting the user to enter the real followed by the imaginary values of the first complex number
        System.out.println("Enter the real value followed by the imaginary value of the first complex:");
        a = input.nextDouble();
        b = input.nextDouble();
        c1 = new Complex(a, b);

        // Prompting the user to enter the real followed by the imaginary values of the second complex number
        System.out.println("Enter the real value followed by the imaginary value of the second complex:");
        a = input.nextDouble();
        b = input.nextDouble();
        c2 = new Complex(a, b);


        // Performing operations on the two complex numbers
        System.out.println();
        System.out.println(c1 + " \t  + \t " + c2 + " \t = \t " + c1.add(c2));
        System.out.println(c1 + " \t  - \t " + c2 + " \t = \t " + c1.subtract(c2));
        System.out.println(c1 + " \t  * \t " + c2 + " \t = \t " + c1.subtract(c2));
        System.out.println(c1 + " \t  / \t " + c2 + " \t = \t " + c1.subtract(c2));
        System.out.println("|" + c1 + "| \t = \t " + c1.abs());

        input.close();
    }
}