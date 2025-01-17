import java.lang.String;

// ---- CONSTRUCTORS ----
//
// Creates a new string object from a given string
public String(String literal) {}

// Creates a new string object from a given array of characters
public String(char[] literal) {}


// ---- METHODS ----
//
// Returns true if the first string is equal to the second string, and false otherwise.
public boolean equals(String string2) {}

// Returns true if the first string is equal to the second string, and false otherwise. (Despite the case)
public boolean equalsIgnoreCase(String string2) {}

// Returns an integer that indicates whether the second string is less than, equal, or greater than the first string.
// The integer returned can be less than, equal to, or greater than zero.
public int compareTo(String string2) {}

// Returns an integer that indicates whether the second string is less than, equal, or greater than the first string. (Despite the case)
// The integer returned can be less than, equal to, or greater than zero.
public int compareToIgnoreCase(String string2) {}

// Returns true if the specified subregion matches, false otherwise
public boolean regionMatches(int index, String s1, int s1Index, int len) {}
public boolean regionMatches(boolean ignoreCase, int index, String s1, int s1Index, int len) {}

// Returns true if the string starts with the specified prefix
public boolean startsWith(String prefix) {}

// Returns true if the string ends with the specified suffix
public boolean endsWith(String suffix) {}

// Returns the length of the string
public int length() {}

// Returns the character at the specified index of the string
public char cahrAt(int index) {}

// Returns a new string in which the caller string is concatenated with the specified string
public String concat(String s1) {}

// Returns the substring of the string starting at the specified index
public String substring(int beginIndex) {}

// Returns the substring of the string from the beginnig index to the end index exclusive
public String substring(int beginIndex, int endIndex) {}

// Returns a new string with all cases converted to lower case
public String toLowerCase() {}

// Returns a new string with all cases converted to upper case
public String toUpperCase() {}

// Returns a new string with blank characters trimmed on both sides
public String trim() {}

// Returns a new string in which all matching characters in the string are replaced with the new character
public String replace(char oldChar, char newChar) {}

// Returns a new string where the old substring is replaced by the new substring
public String replaceFirst(String oldString, String newString) {}

// Returns a new string where all matching substrings are replaced by the new substring
public String replaceAll(String oldString, String newString) {}

// Returns an array of strings consisting where the substring are split by the specified delimiter
public String[] split(String delimiter) {}

// Returns the index of the specified character. Returns -1 if the specified character is not in the string
public int indexOf(char ch) {}

// Returns the index of the specified character starting from a given index. Returns -1 if the specified character is not in the string
public int indexOf(char ch, int fromIndex) {}

// Returns the index of the specified string. Returns -1 if the specified string is not in the string
public int indexOf(String str) {}

// Returns the index of the specified String starting from a given index. Returns -1 if the specified String is not in the string
public int indexOf(String str, int fromIndex) {}

// Returns the last index of the specified character. Returns -1 if the specified character is not in the string
public int lastIndexOf(char ch) {}

// Returns the last index of the specified character starting from a given index. Returns -1 if the specified character is not in the string
public int lastIndexOf(char ch, int fromIndex) {}

// Returns the last index of the specified string. Returns -1 if the specified string is not in the string
public int lastIndexOf(String str) {}

// Returns the last index of the specified String starting from a given index. Returns -1 if the specified String is not in the string
public int lastIndexOf(String str, int fromIndex) {}

// Returns a string consisting of the specified character
public static String valueOf(char ch) {}

// Returns a string consisting of the characters in the array
public static String valueOf(char[] data) {}

// Returns a string consisting of the double value
public static String valueOf(double value) {}

// Returns a string consisting of the float value
public static String valueOf(float value) {}

// Returns a string consisting of the integer value
public static String valueOf(int value) {}

// Retruns a string consisting of the long value
public static String valueOf(long value) {}

// Returns a string consisting of the boolean value
public static String valueOf(boolean value) {}
