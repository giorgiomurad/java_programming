import java.io.OutputStream;


// Writes the specified byte into the output stream
// It takes a parameter int and converts it to byte in the output stream
public void write(int b) {}

// Takes an array of bytes, and writes all the bytes from the array into the output stream
public void write(byte[] b) {}

// Takes an array of bytes, and writes a given number of bytes from the array into the output stream, starting from the given index of the array
public void write(byte[] b, int offset, int len) {}

// Closes the output stream, and releases any system resource occupied by it
public void close() {}

// Flushes the output stream
public void flush() {}