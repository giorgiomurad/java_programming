public class MyRectangle2D {
    private double x, y;
    private double width;
    private double height;


    // No arg constructor that creates a default rectangle
    public MyRectangle2D() {

        this(0, 0, 1, 1);
    }

    // Constructor that creates a rectangle with specified x, y, width, and height
    public MyRectangle2D(double x, double y, double width, double height) {

        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }


    // Method to set X
    public void setX(double x) {

        this.x = x;
    }

    // Method to set Y
    public void setY(double y) {

        this.y = y;
    }

    // Method to set the width
    public void setWidth(double width) {

        this.width = width;
    }

    // Method to set the height
    public void setHeight(double height) {

        this.height = height;
    }

    // Method to get X
    public double getX() {

        return x;
    }

    // Method to get Y
    public double getY() {

        return y;
    }

    // Method to get the width
    public double getWidth() {

        return width;
    }

    // Method to get the height
    public double getHeight() {

        return height;
    }

    // Method that returns the area of the rectangle
    public double getArea() {
        double area;

        area = width * height;
        return area;
    }

    // Method that returns the parameter of the rectangle
    public double getParameter() {
        double parameter;

        parameter = 2 * width + 2 * height;
        return parameter;
    }

    // Method that returns true if the specified point is in the rectangle
    public boolean contains(double x, double y) {
        double distance;

        distance = distance(x, y);
        return (distance < width/2);
    }

    // Method that returns true if the specified rectangle is inside this rectangle
    public boolean contains(MyRectangle2D rectangle) {
        double distance;
        double width2;

        distance = distance(rectangle.x, rectangle.y);
        width2   = rectangle.getWidth();

        return (distance + width2/2 <= width);
    }

    // Method that returns true if the specified rectangle overlaps this rectangle
    public boolean overlaps(MyRectangle2D rectangle) {
        double distance;
        double width1;
        double width2;

        distance = distance(rectangle.x, rectangle.y);
        width1   = getWidth();
        width2   = rectangle.getWidth();

        return (!contains(rectangle) && distance < (width1+width2)/2);
    }

    // Method that returns the distance between the center and the specified point
    public double distance(double x, double y) {
        double diffX;
        double diffY;
        double distance;


        diffX = (this.x > x)?this.x - x:x - this.x;
        diffY = (this.y > y)?this.y - y:y - this.y;

        distance = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
        return distance;
    }
}
