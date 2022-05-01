// Rectangle Class
public class Rectangle {
    double width;   // Rectangle Width
    double height;  // Rectangle Height


    // No-arg constructor that creates a default rectangle
    public Rectangle() {

        width  = 1;
        height = 1;
    }

    // Constructor that creates rectangle with specified width and height
    public Rectangle(double newWidth, double newHeight) {

        width  = newWidth;
        height = newHeight;
    }

    // Method that returns the area of the rectangle
    public double getArea() {

        return width * height;
    }

    // Method that returns the parameter of the rectangle
    public double getParameter() {

        return (width * 2) + (height * 2);
    }
}
