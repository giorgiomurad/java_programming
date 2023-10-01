public class Complex {
    private double a;   // Real part of the complex number
    private double b;   // Imaginary part of the complex number


    // Constructor that creates a complex number with default value 0
    public Complex() {

        this(0);
    }

    // Constructor that creates a complex number with specified value for the real part, and imaginary set to zero
    public Complex(double a) {

        this(a, 0);
    }

    // Constructor that creates a complex number with the specified values for the real and imaginary parts
    public Complex(double a, double b) {

        setReal(a);
        setImaginary(b);
    }

    // Method that sets the real part of the complex number
    public void setReal(double a) {

        this.a = a;
    }

    // Method that sets the imaginary part of the complex number
    public void setImaginary(double b) {

        this.b = b;
    }

    // Method that returns the real part of the complex number
    public double getReal() {

        return a;
    }

    // Method that returns the imaginary part of the complex number
    public double getImaginary() {

        return b;
    }

    // Method that adds this complex number with the specified complex number, creating a new complex object,
    // and returning it.
    public Complex add(Complex complex) {
        double newA, newB;  // New values for the real and imaginary

        newA = a + complex.a;
        newB = b + complex.b;
        Complex temp = new Complex(newA, newB);

        return temp;
    }

    // Method that subtracts this complex number with the specified complex number, creating a new complex object,
    // and returning it.
    public Complex subtract(Complex complex) {
        double newA, newB;  // New values for the real and imaginary

        newA = a - complex.a;
        newB = b - complex.b;
        Complex temp = new Complex(newA, newB);

        return temp;
    }

    // Method that multiplies this complex number with the specified complex number, creating a new complex object,
    // and returning it.
    public Complex multiply(Complex complex) {
        double newA, newB;  // New values for the real and imaginary

        newA = (a * complex.a) - (b * complex.b);
        newB = (b * complex.a) + (a * complex.b);
        Complex temp = new Complex(newA, newB);

        return temp;
    }

    // Method that divides this complex number with the specified complex number, creating a new complex object,
    // and returning it.
    public Complex divide(Complex complex) {
        double newA, newB;  // New values for the real and imaginary

        newA = ((a * complex.a) + (b * complex.b))/((complex.a * complex.a) + (complex.b * complex.b));
        newB = ((b * complex.a) - (a * complex.b))/((complex.a * complex.a) + (complex.b * complex.b));
        Complex temp = new Complex(newA, newB);

        return temp;
    }

    // Method that returns the absolute value of the complex number
    public double abs() {
        double abs;     // Absolute Value

        abs = Math.sqrt(a*a + b*b);
        return abs;
    }

    // toString Method
    public String toString() {

        if (b < 0)
            return String.format("%.2f - %.2fi", a, Math.abs(b));
        else
            return String.format("%.2f + %.2fi", a, b);
    }
}
