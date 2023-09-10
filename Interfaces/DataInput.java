import java.io.DataInput;

public interface DataInput {

    // Reads a boolean from the input stream
    public abstract boolean readBoolean();

    // Reads a byte from the input stream
    public abstract byte readByte();

    // Reads a character from the input stream
    public abstract char readChar();

    // Reads a float value from the input stream
    public abstract float readFloat();

    // Reads a double value from the input stream
    public abstract double readDouble();

    // Reads an integer value from the input stream
    public abstract int readInt();

    // Reads a long value from the input stream
    public abstract long readLong();

    // Reads a short value from the input stream
    public abstract short readShort();

    // Reads a line of characters from the input stream
    public abstract String readLine();

    // Reads a string in UTF format
    public abstract String readUTF();
}