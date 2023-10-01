public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
    private double side;   // Side of the octagon


    // Constructor that constructs an octagon object with the default side value 1.0
    public Octagon() {

        this(1.0);
    }

    // Constructor that constructs an octagon object with the specified side value
    public Octagon(double side) {

        setSide(side);
    }


    // Method that sets the value of the side
    public void setSide(double side) {

        this.side = side;
    }

    // Method that returns the side of the octagon
    public double getSide() {

        return side;
    }

    // Method that returns the parameter of the octagon
    public double getParameter() {
        double param;   // Parameter

        param = side * 8;
        return param;
    }

    // Method that returns the area of the octagon
    public double getArea() {
        double area;    // Area

        area = (2 + 4/Math.sqrt(2)) * side * side;
        return area;
    }

    @Override
    // Overridden method that compares two octagons and returns their difference
    public int compareTo(Octagon o) {
        int diff;   // Difference Integer

        diff = (int)(this.getArea() - o.getArea());
        return diff;
    }

    // Method that clones the specified octagon, and returns it
    public static Octagon clone(Octagon o) {

        return new Octagon(o.side);
    }

    @Override
    public Octagon clone() {
        try {

            return (Octagon) super.clone();
        } catch (CloneNotSupportedException e) {

            throw new AssertionError();
        }
    }
}
