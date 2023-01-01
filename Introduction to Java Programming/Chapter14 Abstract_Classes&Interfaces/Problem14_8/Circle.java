public class Circle extends GeometricObject {
    private double radius;  // Radius of the circle


    // No-arg constructor that constructs a circle with radius 1
    public Circle() {

        this(1.0);
    }

    // Constructor that constructs a circle with the specified radius
    public Circle(double radius) {

        super();
        setRadius(radius);
    }

    // Method that sets the radius of the circle
    public void setRadius(double radius) {

        this.radius = radius;
    }

    // Method that returns the value of the radius
    public double getRadius() {

        return radius;
    }

    // Method that returns the area of the circle
    public double getArea() {
        double area;

        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
