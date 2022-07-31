public class MyString1 {
    private char[] charArray;   // Object's array of characters


    // Constructor that takes an array of characters, and stores its values in the object's array
    public MyString1(char[] chars) {
        charArray = new char[chars.length];

        // Saving the characters to the object
        for (int i = 0; i < chars.length; i++)
            charArray[i] = chars[i];
    }

    // Method that returns the character at the specified index
    public char charAt(int index) {

        return charArray[index];
    }

    // Method that returns the length of the array
    public int length() {

        return charArray.length;
    }

    // Method that returns a substring of the initial string from begin to end exclusive
    public MyString1 substring(int begin, int end) {
        char[] subChar = new char[end-begin];


        // Saving values from the initial char array to the new char array
        for (int i = 0; i < subChar.length; i++)
            subChar[i] = charArray[begin+i];

        // Returning the new MyString1 object
        return new MyString1(subChar);
    }

    // Method that returns a new string with all characters converted to lowercase
    public MyString1 toLowerCase() {
        char[] lowChars = new char[charArray.length];   // Lower Case Array


        // Adding the lower case values to the new array
        for (int i = 0; i < lowChars.length; i++)
            lowChars[i] = Character.toLowerCase(charArray[i]);


        // Returning the array in a new MyString1 object
        return new MyString1(lowChars);
    }

    // Method that verifies whether the two MyString1 objects are equal or not
    public boolean equals(MyString1 s) {

        // Checking if both strings initially have the same length
        if (s.length() != length())
            return false;

        // Going through every character
        for (int i = 0; i < length(); i++)
            if (charArray[i] != s.charAt(i))
                return false;

        return true;
    }

    // Method that converts an integer into a string value
    public static MyString1 valueOf(int i) {
        int nbOfDigits = 0; // Number of Digits
        char[] valueOf;


        // Getting the integers number of digits
        int temp = i;
        do {
            temp /= 10;

            nbOfDigits++;
        } while (temp > 0);

        // Initializing a new char array
        valueOf = new char[nbOfDigits];
        for (int index = valueOf.length-1; index >= 0; index--) {
            temp = i % 10;

            i /= 10;
            valueOf[index] = (char)('0' + temp);
        }

        // Returning the new MyString1 object
        return new MyString1(valueOf);
    }
}
