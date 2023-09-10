import javan.util.Collection<E>;
import java.util.Iterator<E>;

public interface Collection<E> implements Iterator<E> {
    
    // Adds the element o the collection
    // Returns true if the operation was a success, and false otherwise
    public abstract boolean add(E o);

    // Adds all the elements of a given collection to the new collection
    // Under the condition every element of the old collection must either be of type E,
    // or a subclass of E.
    // True is returned if the operation was a success, and false otherwise
    public abstract boolean addAll(Collection<? extends E> collection);

    // Clears the collection of all its elements
    public abstract void clear();

    // Returns true if the specified object is in the collection. False otherwise
    public abstract boolean contains(Object obj);

    // Returns true if all the elements of the given collection are in this collection
    public abstract boolean containsAll(Collection<?> collection);

    // Returns true if this collection is equal to another collection
    public abstract boolean equals(Object obj);

    // Returns the hashcode for this collection
    public abstract int hashCode();

    // Returns true if this collection is empty
    public abstract boolean isEmpty();

    // Returns an iterator for the elements in this collection
    public abstract Iterator<E> iterator();

    // Removes the specified object from this collection
    public abstract boolean remove(Object obj);

    // Removes all the elements similar to the elements of the given collection from this collection
    public abstract boolean removeAll(Collection<?> collection);

    // Retains all the elements of the given collection into this collection
    public abstract boolean retainAll(Collection<?> collection);

    // Returns the size of the collection
    public abstract int size();

    // Returns an object array containing all the elements of the collection
    public abstract Object[] toArray();
}
