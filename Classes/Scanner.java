import java.util.Scanner;

// ---- CONSTRUCTORS ----
// Creates a scanner reference that scans from the specified file
public Scanner(File source) {}

// Creates a scanner reference that scans from the specified string
public Scanner(String source) {}


// ---- METHODS ----
// Closes the scanner
public void close() {}

// Returns true if the scanner has more data to read
public boolean hasNext() {}

// Returns the next token as a string
public String next() {}

// Returns the next line that ends with a line-break as a single string
public String nextLine() {}

// Returns the next token as of type byte
public byte nextByte() {}

// Returns the next token as of type short
public short nextShort() {}

// Returns the next token as of type int
public int nextInt() {}

// Returns the next token as of type long
public long nextLong() {}

// Returns the next token as of type float
public float nextFloat() {}

// Returns the next token as of type double
public double nextDouble() {}

// Sets the scanners delimiting pattern, and returns the scanner
public Scanner useDelimiter(String pattern) {}