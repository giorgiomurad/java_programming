import java.util.ArrayList;


public class ArrayList<E> {
    private int size;       // Number of elements in the list
    private int capacity;   // Capacity of the list


    // Constructor that creates an empty ArrayList object
    public ArrayList() {}

    // Constructs an empty array list with specified initial capacity
    public ArrayList(int initialCapacity) {}

    // Constructs an array list from an existing collection
    public ArrayList(Collection<? extends E> c) {}


    // Trims the lists capacity to its current size
    public void trimToSize() {}
    
    // Method that appends the new object to the end of the list
    public void add(Object obj) {}

    // Method that adds the new object at the specified index of the list
    public void add(Object obj, int index) {}

    // Method that removes all of the elements in the list
    public void clear() {}

    // Method that returns true if the specified object is in the list, and false otherwise
    public boolean contains(Object obj) {}

    // Method that returns the object at the specified index of the list
    public Object get(int index) {}

    // Method that returns the index of the first matching object in the list
    public int indexOf(Object obj) {}

    // Method that returns true if the list is empty, and false otherwise
    public boolean isEmpty() {}

    // Method that returns the index of the last matching object in the list
    public int lastIndexOf(Object obj) {}

    // Method that removes the specified object from the list
    public Object remove(Object obj) {}

    // Method that returns the number of elements in the list
    public int size() {}

    // Method that removes the object at the specified index of the list
    public Object remove(int index) {}

    // Method that sets an object at the specified index of the list
    public Object set(int index, Object obj) {}
}
