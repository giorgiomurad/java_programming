public class MyStringBuilder1 {
    private String myString;


    // Constructor that initializes the object with the given string value
    public MyStringBuilder1(String s) {

        myString = s;
    }

    // Method that returns a new MyStringBuilder1 object with the appended string value
    public MyStringBuilder1 append(MyStringBuilder1 s1) {
        String temp;

        temp = myString.concat(s1.myString);
        return new MyStringBuilder1(temp);
    }

    // Method that returns a new object with the appended integer value
    public MyStringBuilder1 append(int i) {
        String temp1, temp2;

        temp1 = String.valueOf(i);
        temp2 = myString.concat(temp1);

        return new MyStringBuilder1(temp2);
    }

    // Method that returns the length of the object
    public int length() {

        return myString.length();
    }

    // Method that returns the character at the given index
    public char charAt(int index) {

        return myString.charAt(index);
    }

    // Method that returns a new object with all characters set to lowercase
    public MyStringBuilder1 toLowerCase() {
        char[] characters = new char[myString.length()];
        String s;


        for (int i = 0; i < myString.length(); i++) {
            char temp = myString.charAt(i);

            characters[i] = Character.toLowerCase(temp);
        }
        s = new String(characters);

        return new MyStringBuilder1(s);
    }

    // Method that returns the substring of the initial object with the given begin and end integers
    public MyStringBuilder1 substring(int begin, int end) {
        char[] characters = new char[end-begin];
        String s;

        for (int i = begin, j = 0; i < end; i++, j++)
            characters[j] = myString.charAt(i);

        s = new String(characters);
        return new MyStringBuilder1(s);
    }

    // Method that returns the string of the object
    public String toString() {

        return myString;
    }
}
