// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Objects & Classes
//
// Problem 8.1 : Design a class that represents a rectangle object.
//               The rectangle object should include:
//               - Width and height with default values 1
//               - No-arg constructor that creates a default rectangle
//               - A constructor that creates a rectangle with specified width and height
//               - A function that returns the area of the rectangle
//               - A function that returns the parameter of the rectangle
//
//               Write a program that creates two rectangle objects. One rectangle with
//               width 4 and height 40, and the other rectangle with width 3.5 and height
//               35.9.
//               Of each rectangle object, the program should display the width, height,
//               area, and parameter in order.
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {
        // Initializing rectangle objects
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);


        // Displaying the info of rectangle 1
        System.out.println("Rectangle 1:" +
                "\nWidth     : " + r1.width +
                "\nHeight    : " + r1.height +
                "\nArea      : " + r1.getArea() +
                "\nParameter : " + r1.getParameter());
        System.out.println();
        System.out.println();

        // Displaying the info of rectangle 2
        System.out.println("Rectangle 2:" +
                "\nWidth     : " + r2.width +
                "\nHeight    : " + r2.height +
                "\nArea      : " + r2.getArea() +
                "\nParameter : " + r2.getParameter());
    }
}