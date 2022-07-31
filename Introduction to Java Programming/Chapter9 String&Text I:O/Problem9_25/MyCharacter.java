public class MyCharacter {
    private char myCharacter;


    // Constructor that initializes the object
    public MyCharacter(char character) {

        myCharacter = character;
    }


    // ----- METHODS -----
    //
    // Method that returns the character of the object
    public char charValue() {

        return myCharacter;
    }

    // Method that returns an integer comparing two characters
    public int compareTo(MyCharacter value) {
        char compete = value.charValue();

        return (int)(myCharacter - compete);
    }

    // Method that verifies whether two characters are equal or not
    public boolean equal(MyCharacter value) {

        return (compareTo(value) == 0);
    }

    // Method that checks if the given character represents a digit or not
    public static boolean isDigit(char value) {
        int digit = (int)(value - '0');

        return (digit >= 0 && digit < 10);
    }

    // Method that checks if the given character represents a letter or not
    public static boolean isLetter(char value) {

        return (value >= 'A' && value <= 'z');
    }

    // Method that returns if the character is a letter or a digit, false otherwise
    public static boolean isLetterOrDigit(char value) {

        return (isDigit(value) || isLetter(value));
    }

    // Method that returns true if the character is lower case
    public static boolean isLowerCase(char value) {

        return (value >= 'a' && value <= 'z');
    }

    // Method that returns true if the character is upper case
    public static boolean isUpperCase(char value) {

        return (value >= 'A' && value <= 'Z');
    }

    // Method that returns the character in lower case
    public static char toLowerCase(char value) {

        if (isLowerCase(value))
            return value;
        else {
            int diff  = value - 'A';
            int first = 'a';

            return (char)(diff + first);
        }
    }

    // Method that returns the character in upper case
    public static char toUpperCase(char value) {

        if (isUpperCase(value))
            return value;
        else {
            int diff  = value - 'a';
            int first = 'A';

            return (char)(diff + first);
        }
    }
}
