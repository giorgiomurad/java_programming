// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Abstract Classes & Interfaces
//
// Problem 14.7 : Write a class named Octagon that extends GeometricObject and implements
//                the Comparable and Cloneable interfaces. Assume that all eight sides of the
//                octagon are equal, and the area can be computed using the following formula:
//
//                Area = (2 + 4 / radical(2)) * side * side.
//
//                Write a test program that creates an Octagon with side value 5, and displays its area
//                and parameter. Create another object using the 'clone' method from Cloneable, and compare
//                the two objects using the 'compareTo' method.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        // Creating an octagon with side value equal to five
        Octagon octagon = new Octagon(5);

        // Displaying the octagon's area and parameter
        System.out.println("The area of the octagon is " + octagon.getArea());
        System.out.println("The parameter of the octagon is " + octagon.getParameter());


        // Cloning the object, and comparing the two objects
        Octagon octagon1 = Octagon.clone(octagon);
        System.out.println("The difference between the two objects is " + octagon.compareTo(octagon1));
    }
}