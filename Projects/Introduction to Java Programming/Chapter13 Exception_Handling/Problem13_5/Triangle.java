public class Triangle  extends GeometricObject{
    private double side1;   // Side 1
    private double side2;   // Side 2
    private double side3;   // Side 3


    // No-arg constructor that creates a default triangle
    public Triangle() throws IllegalTriangleException {

        this(1.0, 1.0, 1.0);
    }

    // A constructor that creates a triangle with specified sides
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {

        super();
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);

        if (
                side1 + side2 > side3
                || side1 + side3 > side2
                || side2 + side3 > side1
        )
            throw new IllegalTriangleException(
                    "The sum of any two sides cannot be greater than the " +
                    "other sides.");
    }


    // Method that sets the value for side1
    public void setSide1(double side1) {

        this.side1 = side1;
    }

    // Method that sets the value for side2
    public void setSide2(double side2) {

        this.side2 = side2;
    }

    // Method that sets the value for side3
    public void setSide3(double side3) {

        this.side3 = side3;
    }

    // Method that computes the area of the triangle, and returns its value
    public double getArea() {
        double area;    // Area of the triangle
        double semi;    // Semi-Parameter


        // Computing the semi-parameter and the area
        semi = (side1 + side2 + side3) / 2;
        area = Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));

        // Returning the area
        return area;
    }

    // Method that computes the parameter of the triangle, and returns the value
    public double getParameter() {
        double param;   // Parameter


        // Computing of the triangle, and returning its value
        param = side1 + side2 + side3;
        return param;
    }

    // Method that returns the value of side 1
    public double getSide1() {

        return side1;
    }

    // Method that returns the value of side 2
    public double getSide2() {

        return side2;
    }

    // Method that returns the value of side 3
    public double getSide3() {

        return side3;
    }

    // toString() method that outputs the description of the triangle
    public String toString() {

        return super.toString() + String.format("\nSide 1 \t\t : \t %.2f" +
                                                "\nSide 2 \t\t : \t %.2f" +
                                                "\nSide 3 \t\t : \t %.2f" +
                                                "\nArea \t\t : \t %.2f" +
                                                "\nParameter \t : \t %.2f",
                                                side1, side2, side3, getArea(), getParameter());
    }
}
