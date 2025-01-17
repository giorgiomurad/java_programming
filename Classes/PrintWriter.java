import java.io.PrintWriter

// ---- CONSTRUCTORS ----
// Creates a PrintWriter object for the specified file
public PrintWriter(File file) {}

// Creates a PrintWriter object for the specified string
public PrintWriter(String fileName) {}


// ---- METHODS ----
// Deletes all contents in the file
public void flush() {}

// Prints a string into the file
public void print(String toPrint) {}

// Prints a character into the file
public void print(char toPrint) {}

// Prints an int into the file
public void print(int toPrint) {}

// Prints a long into the file
public void print(long toPrint) {}

// Prints a float into the file
public void print(float toPrint) {}

// Prints a double into the file
public void print(double toPrint) {}

// Prints a boolean into the file
public void print(boolean toPrint) {}

// Prints a full line followed by a line break in the file
public void println(String statement) {}

// Prints a given format in the file
public void printf(String format, /* values */) {}

// Closes the file when finished with it
public void close() {}