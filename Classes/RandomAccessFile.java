import java.io.RandomAccessFile;	// Import Statement for RandomAccessFile
import java.io.DataInput;			// Import Statement for the DataInput Interface
import java.io.DataOutput;			// Import Statement for the DataOutput Interface

// ------ CONSTRUCTORS ------
//
// Creates a RandomAccessFile stream for the specified file and mode ('r' for read, 'w' for write, and 'rw' for read and write)
public RandomAccessFile(File file, String mode) {}

// Creates a RandomAccessFile stream for the specified name of the file, mode
public RandomAccessFile(String filename, String mode) {}


// ------ METHODS ------
//
// Closes the stream, and releases any resource associated with it
public void close() {}

// Returns the offset, in bytes, from the beginning of the file to where the next 'read' or 'write' occurs
public long getFilePointer() {}

// Method that returns the length of the file
public long length() {}

// Method that reads the byte of data from the stream, and returns -1 at the end of the stream
public int read() {}

// Method that reads data from the stream up to the length of the given array of bytes
public int read(byte[] b) {}

// Method that reads data from the stream up to the given number of bytes to read to store them in the array of bytes, starting from the given offset of the array
public int read(byte[] b, int offset, int len) {}

// Method that sets the offset, in bytes, from the beginning of the stream to where the next 'read' or 'write' occurs
public void seek(long pos) {}

// Method that sets the new length for the file
public void setLength(long newLength) {}

// Method that skips through the given number of inputs
public int skipBytes(int number) {}

// Method that writes data from the array of bytes to the file
public void write(byte[] b) {}

// Method that writes the given number of bytes from the array of bytes into the file, starting from the given offset of the array
public void write(byte[] b, int offset, int len) {}