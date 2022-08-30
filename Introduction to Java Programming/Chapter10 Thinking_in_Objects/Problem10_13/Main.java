// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Thinking in Objects
//
// Problem 10.13 : Design a class called Triangle2D that contains:
//                  - Three points p1, p2, p3 of type MyPoint (class defined in Problem 10.4)
//                  - Set and get methods of the three points
//                  - A no-arg constructor that creates a triangle with points (0, 0), (1, 1), and (2, 5)
//                  - A constructor that creates a triangle with specified points
//                  - A method getArea() that returns the area of the triangle
//                  - A method getParameter() that returns the parameter of the triangle
//                  - A method contains(MyPoint p) that returns true if the point is inside the triangle
//                  - A method contains(Triangle2D t) that returns true if the triangle is inside this triangle
//                  - A method overlaps(Triangle2D t) that returns true if the triangle overlaps this triangle
//
//                  Write a test program that creates a triangle with points (2.5, 2), (4.2, 3), and (5, 3.5).
//                  The program should display:
//                  - The area
//                  - The parameter
//                  - If the triangle contains the point (3, 3)
//                  - If the triangle contains a triangle of points (2.9, 2), (4, 1), (1, 3.4)
//                  - If the triangle overlaps a triangle of points (2, 5.5), (4, -3), 2, 6.5)
//                  (the java.awt.geom.Line2D class in the Java API can be used to implement the Triangle2D class)
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        // Initializing Points
        MyPoint p1 = new MyPoint(2.5, 2);
        MyPoint p2 = new MyPoint(4.2, 3);
        MyPoint p3 = new MyPoint(5, 3.5);
        MyPoint p4 = new MyPoint(2.9, 2);
        MyPoint p5 = new MyPoint(4, 1);
        MyPoint p6 = new MyPoint(1, 3.4);
        MyPoint p7 = new MyPoint(2, 5.5);
        MyPoint p8 = new MyPoint(4, -3);
        MyPoint p9 = new MyPoint(2, 6.5);

        // Initializing Triangles
        Triangle2D t1 = new Triangle2D(p1, p2, p3);
        Triangle2D t2 = new Triangle2D(p4, p5, p6);
        Triangle2D t3 = new Triangle2D(p7, p8, p9);


        // Displaying Results
        System.out.printf("Area\t\t\t\t : \t %.3f" +
                "\nParameter\t\t\t : \t %.3f" +
                "\nContains (3, 3)?\t : \t %b" +
                "\nContains t2?\t\t : \t %b" +
                "\nOverlapped by t3?\t : \t %b",
                t1.getArea(), t1.getParameter(),
                t1.contains(new MyPoint(3, 3)),
                t1.contains(t2), t1.overlaps(t3));
    }
}