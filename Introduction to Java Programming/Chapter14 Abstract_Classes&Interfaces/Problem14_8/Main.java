// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Abstract Classes & Interfaces
//
// Problem 14.8 : Write a method that sums the areas of all geometric objects in an array.
//                The method signature is:
//
//                public static void sumArea(GeometricObject[] a)
//
//                Write a test program that creates an array of four objects
//                (two rectangles and two circles), and computes their
//                total area using the method.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[4];
        double sumArea;

        // Creating two circles and two rectangles
        objects[0] = new Circle(5);
        objects[1] = new Circle(2);
        objects[2] = new Rectangle(2, 4);
        objects[3] = new Rectangle(1, 1);

        // Assigning the sum of the areas to 'sumArea'
        sumArea = sumArea(objects);

        // Displaying Output
        System.out.println("The sum of the areas of the geometrics objects is " + sumArea);
    }

    // Method that takes an array of geometric objects, and returns the sum of all the areas of the objects in the array
    public static double sumArea(GeometricObject[] a) {
        double sum;

        sum = 0;
        for (GeometricObject o : a)
            if (o instanceof Circle)
                sum += ((Circle) o).getArea();
            else
                sum += ((Rectangle) o).getArea();

        return sum;
    }
}