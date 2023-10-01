// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 21: Generics
//
// Listing 21.3 : Write a program that calls a generic method that computes and compares the areas of two
//               geometric objects, a circle and a rectangle, and displays if the areas are equal or not.
//               The generic type of the method should be a bounded generic type, specifying that E is a
//               generic subtype of GeometricObject.
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {
        // Initializing two different geometric objects
        GeometricObject rectangle = new Rectangle(2, 2);
        GeometricObject circle    = new Circle(2);

        // Displaying the final result
        if (equalArea(rectangle, circle))
            System.out.println("The two geometric objects have equal areas.");
        else
            System.out.println("The two geometric objects do not have equal areas.");
    }


    // Boolean method that takes in a generic type that extends GeometricObject.
    // The method compares the areas of the two objects, and returns true if the areas were equal.
    // Otherwise, the method returns false.
    public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {

        return (object1.getArea() == object2.getArea());
    }
}
