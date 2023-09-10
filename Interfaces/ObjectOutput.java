import java.io.ObjectOutput;

public interface ObjectOutput {

    // Wrties the object into the output stream
    public abstract void writeObject(Object obj);
}