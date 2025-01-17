import java.io.DataInputStream;		// Import statement of the DataInputStream class
import java.io.DataInput;			// Import statement of the DataInput interface


public class DataInputStream extends FilterInputStream implements DataInput {
	// ------ CONSTRUCTOR ------
	//
	// Creates a DataInputStream for a particular InputStream object
	public DataInputStream(InputStream input) {}


	@Override
	// Overridden method that reads a Boolean from the input stream
	public boolean readBoolean() {}

	@Override
	// Overridden method that reads a Byte from the input stream
	public byte readByte() {}

	@Override
	// Overridden method that reads a character from the input stream
	public char readChar() {}

	@Override
	// Overridden method that reads a float from the input stream
	public float readFloat() {}

	@Override
	// Overridden method that reads a double from the input stream
	public double readDouble() {}

	@Override
	// Overridden method that reads an int from the input stream
	public int readInt() {}

	@Override
	// Overridden method that reads a float from the input stream
	public float readLong() {}

	@Override
	// Overridden method that reads a short from the input stream
	public short readShort() {}

	@Override
	// Overridden method that reads a line of characters from the input stream
	public String readLine() {}

	@Override
	// Overridden method that reads a string in UTF format
	public String readUTF() {}
}