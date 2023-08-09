import java.util.Date;

public class GeometricObject implements Comparable<GeometricObject>{
    protected String color;     // Color of the object
    protected boolean filled;   // True if the shape is filled, false otherwise
    protected Date dateCreated; // Date the shape was created


    // No-arg constructor that creates an empty geometric object
    public GeometricObject() {

        this("", false);
    }

    // Constructor that creates a geometric object given the color, and whether it is filled or not
    public GeometricObject(String color, boolean filled) {

        setColor(color);
        setFilled(filled);
        dateCreated = new Date();
    }


    // Method that sets the color of the object
    public void setColor(String color) {

        this.color = color;
    }

    // Method that sets whether the shape is filled or not
    public void setFilled(boolean filled) {

        this.filled = filled;
    }

    // Method that returns the color of the object
    public String getColor() {

        return color;
    }

    // Method that returns true if the object is filled. False otherwise
    public boolean isFilled() {

        return filled;
    }

    // Method that returns the date that the object was created
    public Date getDateCreated() {

        return dateCreated;
    }

    // Method that returns the max of the two GeometricObject objects
    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {

        if (obj1.compareTo(obj2) >= 0)
            return obj1;

        else
            return obj2;
    }

    // toString method that outputs description of the geometric object
    public String toString() {

        return String.format("Date Created : %s" +
                        "\nColor \t\t : \t %s" +
                        "\nIs Filled \t : \t %b",
                dateCreated, color, filled);

    }

    @Override
    // Overridden method that returns the comparison with the specified GeometricObject object
    public int compareTo(GeometricObject o) {
        double diff;    // Difference

        if (this instanceof Circle) {

            diff = ((Circle) this).getArea() - ((Circle) o).getArea();
        }
        else {

            diff = ((Rectangle) this).getArea() - ((Rectangle) o).getArea();
        }

        return (int) diff;
    }
}
