import java.util.Date;

public class GeometricObject{
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

    // toString method that outputs description of the geometric object
    public String toString() {

        return String.format("Date Created : %s" +
                        "\nColor \t\t : \t %s" +
                        "\nIs Filled \t : \t %b",
                dateCreated, color, filled);

    }
}
