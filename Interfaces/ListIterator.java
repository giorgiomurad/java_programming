import java.util.ListIterator;
import java.util.Iterator;

public interface ListIterator<E> implements Iterator<E> {
     
     // Adds the given object to the list
     public abstract void add(E o) {}

     // Returns true if the list iterator has one or more elements when traversing backwards
     public abstract boolean hasPrevious() {}

     // Returns the index of the next element
     public abstract int nextIndex() {}

     // Returns the previous element in this iterator
    public abstract E previous() {}

    // Returns the index of the previous element in this iterator
    public abstract int previousIndex() {}

    // Replaces the last element, returned by previous() or next(), with the new given element
    public abstract void set(E o) {}
}