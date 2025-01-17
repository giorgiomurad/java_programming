import java.io.InputStream;


// Reads the next byte of data from the input stream
// The value of a byte is returned as an int value ranging from 0 to 255
// If no byte is available after reaching the end of the stream, -1 is returned
public int read() {}

// Takes a Byte array as parameter, reads the next bytes depending on the length of the given array, and returns the number of bytes read
// If the end of the input stream was reached, -1 is returned
public int read(byte[] b) {}

// Reads the next bytes from the input stream, and stores them in a given byte array, starting at the given offset of the array, and based on the given number of bytes to store in the array
// If the end of the input stream was reached, -1 is returned
public int read(byte[] b, int offset, int len) {}

// Returns the number of bytes that can be read from the input stream
public int available() {}

// Closes the input stream, and releases any system resource occupied by it
public void close() {}

// Skips and discards the given number of bytes, and returns the number of bytes skipped
public long skip(long n) {}

// Tests whether the input stream supports the two methods 'mark' and 'reset'
public boolean markSupported() {}

// Marks the current position in the input stream
public void mark(int readLimit) {}

// Repositions the stream to the position at the time the 'mark' method was last called
public void reset() {}