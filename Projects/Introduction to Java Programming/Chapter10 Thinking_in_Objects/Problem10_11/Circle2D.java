public class Circle2D {
    private double x, y;    // Coordinates of the center
    private double radius;  // Radius of the center


    // No-arg constructor that creates a default circle
    public Circle2D() {

        this(0, 0, 1);
    }

    // Constructor that creates a circle with the specified x, y, and radius
    public Circle2D(double x, double y, double radius) {

        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    // Method that returns the x coordinate of the center
    public double getX() {

        return x;
    }

    // Method that returns the y coordinate of the center
    public double getY() {

        return y;
    }

    // Method that returns the radius of the circle
    public double getRadius() {

        return radius;
    }

    // Method that returns the area of the circle
    public double getArea() {
        double area;

        area = Math.PI * radius * radius;
        return area;
    }

    // Method that returns the parameter of the circle
    public double getParameter() {
        double parameter;

        parameter = Math.PI * 2 * radius;
        return parameter;
    }

    // Method that returns true if the specified point is inside this circle.
    public boolean contains(double x, double y) {
        double distance;    // Distance between the center and the specified point
        double radius;      // Radius of the circle


        distance = distance(x, y);
        radius   = getRadius();

        return (distance <= radius);
    }

    // Method that returns true if the specified circle is inside this circle
    public boolean contains(Circle2D circle) {
        double distance;    // Distance between the centers of the two circles
        double radius1;     // Radius of this circle
        double radius2;     // Radius of the other circle


        distance = distance(circle.x, circle.y);
        radius1  = getRadius();
        radius2  = circle.getRadius();

        return (distance + radius2 <= radius1);
    }

    // Method that returns true if the specified circle overlaps this circle
    public boolean overlaps(Circle2D circle) {
        double distance;    // Distance between the two centers
        double radius1;     // Radius of this circle
        double radius2;     // Radius of the other circle


        distance = distance(circle.x, circle.y);
        radius1  = getRadius();
        radius2  = circle.getRadius();

        return ((!contains(circle)) && (radius1 + radius2 > distance));
    }

    // Method that returns the distance between the center, and the point with specified x and y coordinates
    private double distance(double x, double y) {
        double diffX;
        double diffY;
        double distance;

        diffX = (this.x > x)?this.x - x : x - this.x;
        diffY = (this.y > y)?this.y - y : y - this.y;

        distance = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
        return distance;
    }
}
