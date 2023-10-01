// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Thinking in Objects
//
// Problem 11.1  :  Design a class named Triangle that extends GeometricObject. The class contains:
//                          - side1, side2, and side3 with default values 1.0
//                          - A no-arg constructor that creates a default triangle
//                          - A constructor that creates a triangle with specified values for side1, side2, and side3
//                          - The accessor methods for all three data fields
//                          - A method named getArea() that returns the area of the triangle
//                          - A method named getParameter() that returns the parameter of the triangle
//                          - A method named toString() that returns the description of the triangle
//
//                  Write a test program that creates a triangle object with sides 1, 1.5, and 1, color set to
//                  yellow, and filled set to true.
//                  The output of the program should involve description of the triangle.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        // Constructing a triangle object
        Triangle triangle = new Triangle(1, 1.5, 1);

        // Setting the color to yellow, and filled to true
        triangle.setColor("Yellow");
        triangle.setFilled(true);

        // Display Output
        System.out.println(triangle);
    }
}