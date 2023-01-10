import java.lang.StringBuilder

// ---- CONSTRUCTORS ----
// Creates an empty string builder with default capacity 16
public StringBuilder() {}

// Creates an empty string builder with the specified capacity
public StringBuilder(int capacity) {}

// Constructs a string builder with the specified string
public StringBuilder(String s) {}


// ---- METHODS ----
// Appends the char array into the string builder
public StringBuilder append(char[] data) {}

// Appends a subarray into the string builder
public StringBuilder append(char[] data, int start, int end) {}

// Appends a primitive type value into the string (A primitive type can be an int, double, boolean, ...)
public StringBuilder append(PrimitiveType x) {}

// Deletes characters from the string builder from start to end exclusive
public StringBuilder delete(int start, int end) {}

// Deletes a character at the specified index
public StringBuilder deleteCharAt(int index) {}

// Inserts the subarray of the data in the specified index of the string builder
public StringBuilder insert(int index, char[] data, int subStart, int length) {}

// Inserts data into the string builder at the specified index
public StringBuilder insert(int index, char[] data) {}

// Converts the value into a string, and inserts it into the specified index of the string builder
// (A primitive type can be an int, double, boolean, ...)
public StringBuilder insert(int index, PrimitiveType value) {}

// Inserts a given string into the specified index of the string builder
public StringBuilder insert(int index, String s) {}

// Uses the given string to replace the characters from start to end exclusive
public StringBuilder replace(String s, int start, int end) {}

// Reverses the characters in the builder
public StringBuilder reverse() {}

// Sets a new character at the specified index of the builder
public void setCharAt(int index, char ch) {}

// Returns a string object from the string builder
public String toString() {}

// Returns the capacity of the string builder
public int capacity() {}

// Returns the character at the specified index
public char charAt(int index) {}

// Returns the number of characters in the builder
public int length() {}

// Sets a new length in the builder
public void setLength(int newLength) {}

// Returns the substring starting at startIndex
public String substring(int startIndex) {}

// Returns the substring from startIndex to endIndex-1
public String substring(int startIndex, int endIndex) {}

// Reduces the storage size used for the string builder
public void trimToSize() {}