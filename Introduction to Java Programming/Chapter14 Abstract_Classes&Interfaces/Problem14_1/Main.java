// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Abstract Classes & Interfaces
//
// Problem 14.1 : Modify the GeometricObject class to implement the Comparable interface,
//                and define a static max method in the GeometricObject class for finding the
//                larger of the two different GeometricObject objects.
//                Write a test program that uses the max method that finds the larger of two
//                circles, and the larger of two rectangles.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        // Creating two circles
        GeometricObject circle1 = new Circle(8);
        GeometricObject circle2 = new Circle(10);

        // Creating two rectangles
        GeometricObject rectangle1 = new Rectangle(5, 5);
        GeometricObject rectangle2 = new Rectangle(8, 8);


        // Displaying the max of the two circles
        if (GeometricObject.max(circle1, circle2).equals(circle1))
            System.out.println("The max of the two circles is Circle 1.");
        else
            System.out.println("The max of the two circles is Circle 2.");

        // Displaying the max of the two rectangles
        if (GeometricObject.max(rectangle1, rectangle2).equals(rectangle1))
            System.out.println("The max of the two circles is Rectangle 1.");
        else
            System.out.println("The max of the two circles is Rectangle 2.");
    }
}