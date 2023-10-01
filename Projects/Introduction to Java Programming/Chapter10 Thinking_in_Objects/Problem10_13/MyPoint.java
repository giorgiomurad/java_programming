public class MyPoint {
    private final double x;
    private final double y;

    // No-arg constructor that constructs a point of coordinates (0, 0)
    public MyPoint() {

        this(0, 0);
    }

    // Constructor that constructs a point with the specified x and y coordinates
    public MyPoint(double x, double y) {

        this.x = x;
        this.y = y;
    }


    // Method that returns the value of x
    public double getX() {

        return x;
    }

    // Method that returns the value of y
    public double getY() {

        return y;
    }

    // Method that returns the distance from this point to another MyPoint object
    public double distance(MyPoint obj) {
        double objX = obj.getX();
        double objY = obj.getY();
        double diffX, diffY;
        double distance;


        diffX = (objX > x)?objX - x:x - objX;
        diffY = (objY > y)?objY - y:y - objY;

        distance = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
        return distance;
    }

    // Method that returns the distance from this point to the specified x and y coordinates
    public double distance(double x, double y) {
        double diffX, diffY;
        double distance;


        diffX = (this.x > x)?this.x - x:x - this.x;
        diffY = (this.y > y)?this.y - y:y - this.y;

        distance = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
        return distance;
    }
}
