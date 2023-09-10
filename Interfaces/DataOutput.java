import java.io.DataOutput;

public interface DataOutput {

    // Writes the boolean into the output stream
    public abstract void writeBoolean(boolean value);

    // Writes the eight low-order bits into the output stream
    public abstract void writeByte(int value);

    // Writes the lower byte of characters into the output stream
    public abstract void writeBytes(String s);

    // Writes the character into the output stream
    public abstract void writeChar(char value);

    // Writes every character in the string into the output stream, two bytes per character
    public abstract void writeChars(String s);

    // Writes the float value into the output stream
    public abstract void writeFloat(float value);

    // Writes the double value into the output stream
    public abstract void writeDouble(double value);

    // Writes the integer value into the output stream
    public abstract void writeInt(int value);

    // Writes the long value into the output stream
    public abstract void writeLong(long value);

    // Writes the short value into the output stream
    public abstract void writeShort(short value);

    // Writes a string in UTF format into the output stream
    public abstract void writeUTF(String str);
}