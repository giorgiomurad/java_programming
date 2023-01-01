public class Rational extends Number implements Comparable<Rational> {
    private long numerator;     // Numerator of the rational
    private long denominator;   // Denominator of the rational


    // Constructor that constructs a default Rational object
    public Rational() {

        this(0, 1);
    }

    // Constructor that constructs a Rational object with specified numerator and denominator
    public Rational(long numerator, long denominator) {

        setNumerator(numerator);
        setDenominator((denominator > 0)?denominator:1);
    }

    // Method that sets the numerator of the object
    public void setNumerator(long numerator) {

        this.numerator = numerator;
    }

    // Method that sets the denominator of the object
    public void setDenominator(long denominator) {

        this.denominator = denominator;
    }

    // Method that returns the numerator
    public long getNumerator() {

        return numerator;
    }

    // Method that returns the denominator
    public long getDenominator() {

        return denominator;
    }

    // Method that returns the addition of two rational numbers
    public Rational add(Rational rational) {
        long numerator2, denominator2;

        // Computing the new numerator and denominator values
        numerator2 = (numerator * rational.denominator) + (rational.numerator * denominator);
        denominator2 = denominator * rational.denominator;

        // Returning a new Rational object involving the two new values
        return new Rational(numerator2, denominator2);
    }

    // Method that returns the subtraction of two rational numbers
    public Rational subtract(Rational rational) {
        long numerator2, denominator2;

        // Computing the new numerator and denominator values
        numerator2 = (numerator * rational.denominator) - (rational.numerator * denominator);
        denominator2 = denominator * rational.denominator;

        // Returning a new Rational object involving the two new values
        return new Rational(numerator2, denominator2);
    }

    // Method that returns the multiplication of two rational numbers
    public Rational multiply(Rational rational) {
        long numerator2, denominator2;

        // Computing the new numerator and denominator values
        numerator2 = numerator * rational.numerator;
        denominator2 = denominator * rational.denominator;

        // Returning a new Rational object involving the two new values
        return new Rational(numerator2, denominator2);
    }

    // Method that returns the division of two rational numbers
    public Rational divide(Rational rational) {
        long numerator2, denominator2;

        // Computing the new numerator and denominator values
        numerator2 = numerator * rational.denominator;
        denominator2 = denominator * rational.numerator;

        // Returning a new Rational object involving the two new values
        return new Rational(numerator2, denominator2);
    }

    // Method that simplifies the rational number
    public Rational simplify() {
        int gcd = gcd(numerator, denominator);  // Greatest common divisor between the numerator and denominator
        long numerator2, denominator2;          // New numerator and denominator values

        numerator2 = numerator / gcd;           // Dividing the numerator by the gcd value
        denominator2 = denominator / gcd;       // Dividing the denominator by the gcd value

        // Returning a new Rational object involving the new numerator and denominator values
        return new Rational(numerator2, denominator2);
    }

    // ToString() Method
    public String toString() {

        if (denominator == 1)
            return numerator + "";
        else
            return numerator + " / " + denominator;
    }

    // Private method that returns the greatest common divisor between n and d
    private static int gcd(long n, long d) {
        int gcd;    // Greatest Common Divisor

        gcd = 0;
        for (int k = 1; k <= n && k <= d; k++)
            if (n % k == 0 && d % k == 0)
                gcd = k;

        return gcd;
    }



    @Override
    // Returning the rational value as data type integer
    public int intValue() {

        return (int) (longValue());
    }

    @Override
    // Returning the value as data type long
    public long longValue() {

        return numerator / denominator;
    }

    @Override
    // Returning the value as data type float
    public float floatValue() {

        return (float) (longValue());
    }

    @Override
    // Returning the value as data type double
    public double doubleValue() {

        return (double) (longValue());
    }

    @Override
    // Returning the difference between the two rationals
    public int compareTo(Rational o) {
        if ((subtract(o)).getNumerator() > 0)
            return 1;
        else if ((subtract(o)).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
