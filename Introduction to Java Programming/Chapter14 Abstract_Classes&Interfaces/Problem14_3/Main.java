// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Abstract Classes & Interfaces
//
// Problem 14.3 : Design an interface name Colorable with a void method named howToColor().
//                Design a class named square that extends GeometricObject and implements Colorable.
//                Implement the howToColor method to display the message "Color all four sides of the square."
//                Write a test program that creates an array of five GeometricObjects. For each object in the
//                array, invoke its howToColor method if it is colorable.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        // Creating an array of five geometric objects
        GeometricObject[] mySquares = new GeometricObject[5];

        // Initializing the square objects
        mySquares[0] = new Square(5, "Blue", true);
        mySquares[1] = new Square(2);
        mySquares[2] = new Square();
        mySquares[3] = new Square(3);
        mySquares[4] = new Square(2.5, "Yellow", true);


        // Implementing every square's howToColor method if the square is colorable
        for (int i = 0; i < mySquares.length; i++)
            if (mySquares[i].isFilled()) {
                System.out.println(String.format("Square %d :", i+1));
                ((Square) mySquares[i]).howToColor();

                System.out.println();
            }
    }
}