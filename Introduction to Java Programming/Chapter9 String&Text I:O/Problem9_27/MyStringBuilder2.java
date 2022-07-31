public class MyStringBuilder2 {
    private char[] myChars; // Object's array of characters


    // Constructor that constructs an empty string builder object
    public MyStringBuilder2() {

    }

    // Constructor that constructs a string builder object with an array of characters
    public MyStringBuilder2(char[] chars) {
        myChars = new char[chars.length];


        // Copying data from the parameter array to the object's array
        System.arraycopy(chars, 0, myChars, 0, chars.length);
    }

    // Constructor that constructs a string builder object with an initial string
    public MyStringBuilder2(String s) {

        // Transforming the string into an array of characters, and assigning it to the array
        myChars = s.toCharArray();
    }


    // Method that inserts a string at the specified index
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] newChars;    // New array of characters
        int size;           // New Size

        // Initializing the values of the local variables
        size     = myChars.length + s.myChars.length;
        newChars = new char[size];


        // 1. Storing characters from index zero till the given index
        int i;
        for (i = 0; i < offset; i++)
            newChars[i] = myChars[i];

        // 2. Filling the next elements with characters of the given object
        int j;
        for (j = 0; j < s.myChars.length; j++, i++)
            newChars[i] = s.myChars[j];

        // 3. Filling the rest of the character values into the new array
        for (; i < newChars.length; i++)
            newChars[i] = myChars[i-j];


        // Returning a new MyStringBuilder2 object
        return new MyStringBuilder2(newChars);
    }

    // Method that returns a new MyStringBuilder2 object with its string value reversed
    public MyStringBuilder2 reverse() {
        char[] newChars = new char[myChars.length];

        for (int i = 0, j = newChars.length-1; i < newChars.length; i++, j--)
            newChars[i] = myChars[j];

        System.out.println(new String(newChars));
        return new MyStringBuilder2(newChars);
    }

    // Method that returns the object's substring from the specified beginning index
    public MyStringBuilder2 substring(int begin) {
        char[] newChars = new char[myChars.length-begin];

        System.arraycopy(myChars, begin, newChars,0, newChars.length);

        return new MyStringBuilder2(newChars);
    }

    // Method that returns a new object with capital characters
    public MyStringBuilder2 toUpperCase() {
        char[] newChars = new char[myChars.length];

        for (int i = 0; i < newChars.length; i++)
            newChars[i] = Character.toUpperCase(myChars[i]);

        return new MyStringBuilder2(newChars);
    }
}
