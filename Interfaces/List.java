import java.util.List;
import java.util.Collection;

public interface List<E> implements Collection<E> {

    // Adds the element at the specified element
    public abstract boolean add(int index, E element) {}

    // Adds all the elements of the collection into the list at the specified index
    public abstract boolean addAll(int index, Collection<? extends E> c) {}

    // Returns an element of the list from a specified index
    public abstract E get(int index) {}

    // Returns the index of the first matching element in the list
    public abstract int indexOf(E element) {}

    // Returns the index of the last matching element in the list
    public abstract int lastIndexOf(E element) {}

    // Returns the list iterator for the elements in the list
    public abstract ListIterator<E> listIterator() {}

    // Returns the list iterator for the elements in the list from a specified starting index
    public abstract ListIterator<E> listIterator(int startIndex) {}

    // Removes the element at the specified index
    public abstract E remove(int index) {}

    // Sets the element at the specified index
    public abstract E set(int index, E element) {}

    // Returns a sublist from the list from the starting index to the end index excluded
    public abstract List<E> subList(int fromIndex, int toIndex) {}
 }