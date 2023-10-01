public class MyInteger {
    private final int value;      // Integer value of the object


    // Constructor that creates an object with the specified integer value
    public MyInteger(int value) {

        this.value = value;
    }

    // Method that returns the value
    public int getValue() {

        return value;
    }

    // Method that verifies if the object's value is even
    public boolean isEven() {

        return (value % 2 == 0);
    }

    // Method that verifies if the object's value is odd
    public boolean isOdd() {

        return (value % 2 == 1);
    }

    // Method that verifies if the object's value is prime
    public boolean isPrime() {
        int n = 2;

        while (n < value) {

            if (value % n == 0)
                return false;
            n++;
        }
        return true;
    }

    // Method that verifies if the specified integer is even
    public static boolean isEven(int integer) {

        return (integer % 2 == 0);
    }

    // Method that verifies if the specified integer is odd
    public static boolean isOdd(int integer) {

        return (integer % 2 == 1);
    }

    // Method that verifies if the specified integer is prime
    public static boolean isPrime(int integer) {
        int n = 2;

        while (n < integer) {

            if (integer % n == 0)
                return false;
            n++;
        }
        return true;
    }

    // Method that verifies if the value of the specified MyInteger object is even
    public static boolean isEven(MyInteger obj) {
        int val = obj.getValue();

        return (val % 2 == 0);
    }

    // Method that verifies if the value of the specified MyInteger object is odd
    public static boolean isOdd(MyInteger obj) {
        int val = obj.getValue();

        return (val % 2 == 1);
    }

    // Method that verifies if the value of the specified MyInteger object is prime
    public static boolean isPrime(MyInteger obj) {
        int n = 2;

        while (n < obj.getValue()) {

            if (obj.getValue() % n == 0)
                return false;
            n++;
        }
        return true;
    }

    // Method that determines if the specified integer is equal to the object's value
    public boolean equals(int integer) {

        return (value == integer);
    }

    // Method that determines if the value of the specified MyInteger object is equal to the object's value
    public boolean equals(MyInteger obj) {
        int val = obj.getValue();

        return (value == val);
    }

    // Method that converts a character array into a single integer value
    public static int parseInt(char[] chars) {
        int integer;

        integer = 0;
        for (char i : chars) {
            int temp;

            temp = i - '0';
            integer = integer * 10 + temp;
        }

        return integer;
    }

    // Method that converts a string into a single integer value
    public static int parseInt(String s) {
        int integer;

        integer = 0;
        for (char i : s.toCharArray()) {
            int temp;

            temp = i - '0';
            integer = integer * 10 + temp;
        }

        return integer;
    }
}
