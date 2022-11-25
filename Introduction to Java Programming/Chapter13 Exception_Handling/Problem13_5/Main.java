// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Exception Handling
//
// Problem 13.5 : Create a class IllegalTriangleException, and modify the constructor of the class
//                Triangle, created in Exercise 11.1, to throw an exception in case the addition of
//                the triangle's two sides is greater than the third.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        Triangle traingle;  // Triangle Object

        try {
            traingle = new Triangle(-1, 3, 4);

        } catch (IllegalTriangleException ex) {

            System.out.println(ex.getMessage());
        } finally {

            System.out.println("Program Closed.");
        }
    }
}