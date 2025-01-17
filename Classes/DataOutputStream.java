import java.io.DataOutputStream;	// Import statement for the DataOutputStream class
import java.io.DataOutput;			// Import statement for the DataOutput Interface


public class DataOutputStream extends FilterOutputStream implements DataOutput {
	// ------ CONSTRUCTOR ------
	//
	// Creates a DataOutputStream for a particular OutputStream object
	public DataOutputStream(OutputStream output) {}


	@Override
	// Method that writes a boolean into the output stream
	public void writeBoolean(boolean b) {}

	@Override
	// Method that writes a byte into the ouptut stream, taking an integer argument and converting it to a byte
	public void writeByte(int v) {}

	@Override
	// Method that writes a sequence of bytes into the output stream
	public void writeBytes(String s) {}

	@Override
	// Method that writes a character into the output stream
	public void writeChar(char c) {}

	@Override
	// Method that writes a sequence of characters into the ouput stream
	public void writeChars(String s) {}

	@Override
	// Method that writes a float value into the output stream
	public void writeFloat(float f) {}

	@Override
	// Method that writes a double value into the output stream
	public void writeDouble(double d) {}

	@Override
	// Method that writes an int value into the output stream
	public void writeInt(int i) {}

	@Override
	// Method that writes a long value into the output stream
	public void writeLong(long l) {}

	@Override
	// Method that writes a short value into the output stream
	public void writeShort(short s) {}

	@Override
	// Method that writes a string in UTF format into the output stream
	public void writeUTF(String s) {}
}