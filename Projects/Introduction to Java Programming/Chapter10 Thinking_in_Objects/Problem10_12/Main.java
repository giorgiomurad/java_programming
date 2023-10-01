// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Thinking in Objects
//
// Problem 10.12 : Create a class MyRectangle2D that contains:
//                  - Data fields for x and y that represent the coordinates of the center of the rectangle
//                  - Data fields for the width and height of the rectangle
//                  - Set and get methods for x, y, width, and height
//                  - No-arg constructor that creates a rectangle of center (0, 0), width 1, and height 1
//                  - Constructor that creates a rectangle with specified x, y, width, and height
//                  - getArea() that returns the area of the rectangle
//                  - getParameter() that returns the parameter of the rectangle
//                  - contains(double x, double y) that returns true if the specified point is in this rectangle
//                  - contains(MyRectangle2D rectangle) that returns true if the specified rectangle is in this
//                    rectangle.
//                  - overlaps(MyRectangle2D rectangle) that returns true if the specified rectangle overlaps this
//                    rectangle.
//
//                  Write a test program creates a MyRectangle2D object r1(new MyRectangle2D(2, 2, 5.5, 4.9).
//                  Display it's area, parameter, and the result of:
//                  - r1.contains(3, 3)
//                  - r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2))
//                  - r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4))
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        MyRectangle2D r2 = new MyRectangle2D(4, 5, 10.5, 3.2);
        MyRectangle2D r3 = new MyRectangle2D(3, 5, 2.3, 5.4);


        System.out.println("Contains (3, 3)? " + r1.contains(3, 3));
        System.out.println("Contains R2? " + r1.contains(r2));
        System.out.println("Overlaps R3? " + r1.overlaps(r3));
    }
}