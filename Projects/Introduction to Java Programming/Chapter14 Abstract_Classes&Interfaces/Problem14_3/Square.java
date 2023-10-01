public class Square extends GeometricObject implements Colorable{
    private double side;    // Length of each square side


    // Constructor that constructs a default square with side 1.0
    public Square() {

        this(1.0);
    }

    // Constructor that constructs a square object with the specified side value
    public Square(double side) {

        this(side, "", false);
    }

    // Constructor that constructs a square object with specified side value, color, and filled
    public Square(double side, String color, boolean filled) {

        super(color, filled);
        setSide(side);
    }

    // Method that sets the side of the square
    public void setSide(double side) {

        this.side = side;
    }

    // Method that returns the side of the square
    public double getSide() {

        return side;
    }

    @Override
    // Interface method that prints how to color the square
    public void howToColor() {

        System.out.println("Color all the four sides of the square.");
    }
}
