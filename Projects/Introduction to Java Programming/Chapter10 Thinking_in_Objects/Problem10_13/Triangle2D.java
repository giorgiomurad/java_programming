import java.awt.geom.Line2D;

public class Triangle2D {
    private MyPoint p1, p2, p3;         // Triangle Vertices
    private Line2D line1, line2, line3; // Triangle Sides

    // No-arg constructor that creates a default triangle
    public Triangle2D() {

        this(
                new MyPoint(0, 0),
                new MyPoint(1, 1),
                new MyPoint(2, 5)
        );
    }

    // Constructor that creates a triangle with specified points
    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {

        // Setting the three points
        setP1(p1);
        setP2(p2);
        setP3(p3);

        // Initializing line objects
        line1 = new Line2D.Double();
        line2 = new Line2D.Double();
        line3 = new Line2D.Double();

        // Setting the lines
        line1.setLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        line2.setLine(p2.getX(), p2.getY(), p3.getX(), p3.getY());
        line3.setLine(p3.getX(), p3.getY(), p1.getX(), p1.getY());
    }


    // Method that sets P1
    public void setP1(MyPoint p1) {

        this.p1 = p1;
    }

    // Method that sets P2
    public void setP2(MyPoint p2) {

        this.p2 = p2;
    }

    // Method that sets P3
    public void setP3(MyPoint p3) {

        this.p3 = p3;
    }

    // Method that returns P1
    public MyPoint getP1() {

        return p1;
    }

    // Method that returns P2
    public MyPoint getP2() {

        return p2;
    }

    // Method that returns P3
    public MyPoint getP3() {

        return p3;
    }

    // Method that returns the area of the triangle
    public double getArea() {
        double area;    // Area
        double semi;    // Semi-Parameter

        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);

        semi = (side1 + side2 + side3)/2;
        area = Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));

        return area;
    }

    // Method that returns the parameter of the triangle
    public double getParameter() {
        double param;   // Parameter

        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);

        param = side1 + side2 + side3;
        return param;
    }

    // Method that verifies if the specified point is inside the triangle
    public boolean contains(MyPoint p) {
        // Initializing local line objects
        Line2D line1 = new Line2D.Double();
        Line2D line2 = new Line2D.Double();
        Line2D line3 = new Line2D.Double();

        // Setting lines
        line1.setLine(p1.getX(), p1.getY(), p.getX(), p.getY());
        line2.setLine(p2.getX(), p2.getY(), p.getX(), p.getY());
        line3.setLine(p3.getX(), p3.getY(), p.getX(), p.getY());

        if (!line1.intersectsLine(this.line2))
            if (!line2.intersectsLine(this.line3))
                if (!line3.intersectsLine(this.line1))
                    return true;

        return false;
    }

    // Method that verifies if the specified triangle is inside this triangle
    public boolean contains(Triangle2D t) {

        return (this.contains(t.getP1()) && this.contains(t.getP2()) && this.contains(t.getP3()));
    }

    // Method that verifies if the specified triangle overlaps this triangle
    public boolean overlaps(Triangle2D t) {
        boolean overlaps = false;


        // First Way
        // If the second triangle contains any of the points of this triangle
        if (!this.contains(t) &&
                (t.contains(this.getP1()) || t.contains(this.getP2()) || t.contains(this.getP3())))
            overlaps = true;

        // Second Way
        // In case the second triangle does not contain any of this triangle's vertices
        // If any one side of this triangle intersects with any two sides of the second triangle
        else {
            if ((this.line1.intersectsLine(t.line1) && this.line1.intersectsLine(t.line2))
            ||  (this.line1.intersectsLine(t.line2) && this.line1.intersectsLine(t.line3))
            ||  (this.line1.intersectsLine(t.line3) && this.line1.intersectsLine(t.line1))
            ||  (this.line2.intersectsLine(t.line1) && this.line2.intersectsLine(t.line2))
            ||  (this.line2.intersectsLine(t.line2) && this.line2.intersectsLine(t.line3))
            ||  (this.line2.intersectsLine(t.line3) && this.line2.intersectsLine(t.line1))
            ||  (this.line3.intersectsLine(t.line1) && this.line3.intersectsLine(t.line2))
            ||  (this.line3.intersectsLine(t.line2) && this.line3.intersectsLine(t.line3))
            ||  (this.line3.intersectsLine(t.line3) && this.line3.intersectsLine(t.line1)))
                overlaps = true;
        }


        return overlaps;
    }
}
