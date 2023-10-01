public class MyString2 {
    private String myString;


    // Constructor that takes a string value as parameter to assign it to the
    // variable of the object
    public MyString2(String s) {

        myString = s;
    }

    // Method that compares two strings
    public int compare(String s) {

        if (myString.length() == s.length()) {

            for (int i = 0; i < s.length(); i++)
                if (myString.charAt(i) != s.charAt(i))
                    return (int)(myString.charAt(i)-s.charAt(i));
        }
        else {
            int temp = Math.min(myString.length(), s.length());

            for (int i = 0; i < temp; i++)
                if (myString.charAt(i) != s.charAt(i))
                    return (int)(myString.charAt(i)-s.charAt(i));

            return (myString.length()-s.length());
        }

        return 0;
    }

    // Method that returns the substring of the string
    public MyString2 substring(int begin) {
        int length = myString.length()-begin;
        char[] sub = new char[length];


        // Filling the array of characters
        for (int i = 0, j = begin; i < sub.length; i++, j++)
            sub[i] = myString.charAt(j);

        // Returning the new string
        String s = new String(sub);
        return new MyString2(s);
    }

    // Method that returns the same string, but with all characters capitalized
    public MyString2 toUpperCase() {
        char[] chars = new char[myString.length()];

        for (int i = 0; i < chars.length; i++)
            chars[i] = Character.toUpperCase(myString.charAt(i));

        return new MyString2(new String(chars));
    }

    // Method that creates a char array out of the string, and returns it
    public char[] toChars() {
        char[] chars = new char[myString.length()];

        for (int i = 0; i < chars.length; i++)
            chars[i] = myString.charAt(i);

        return chars;
    }

    // Method that returns the boolean value as a string
    public static MyString2 valueOf(boolean b) {
        String s;

        s = (b)?"true":"false";
        return new MyString2(s);
    }
}
