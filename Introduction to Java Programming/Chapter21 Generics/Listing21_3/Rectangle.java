public class Rectangle extends GeometricObject {
    private double width;   // Rectangle Width
    private double height;  // Rectangle Height


    // No-arg constructor that creates a default rectangle
    public Rectangle() {

        this(1, 1);
    }

    // Constructor that creates rectangle with specified width and height
    public Rectangle(double width, double height) {

        super();
        setWidth(width);
        setHeight(height);
    }

    // Method that sets the width of the rectangle
    public void setWidth(double width) {

        this.width = width;
    }

    // Method that sets the height of the rectangle
    public void setHeight(double height) {

        this.height = height;
    }

    // Method that returns the width of the rectangle
    public double getWidth() {

        return width;
    }

    // Method that returns the height of the rectangle
    public double getHeight() {

        return height;
    }

    // Method that returns the parameter of the rectangle
    public double getParameter() {

        return (width * 2) + (height * 2);
    }

    // Method that returns the area of the rectangle
    public double getArea() {

        return width * height;
    }
}
