import java.lang.Comparable;

public interface Comparable {
    
    // Method that compares this object to another object, and returns an integer:
    //              - Zero if the two objects are equal
    //              - More than zero depending on how much the contents of the other object are greater than this object
    //              - Less than zero depending on how much the contents of the other object are less than this object
    public abstract int compareTo(Object obj);
}