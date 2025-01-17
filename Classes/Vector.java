import java.util.Vector;
import java.util.List;

public class Vector<E> implements List<E> {
  // ----- CONSTRUCTORS -----
  // Constructor that creates an empty vector with initial capacity 10
  public Vector() {}

  // Constructor that creates a vector from an existing collection
  public Vector(Collection <? extends E> c) {}

  // Constructor that creates a vector with specified initial capacity
  public Vector(int initialCapacity) {}

  // Constructor that creates a vector with specified initial capacity and increment
  public Vector(int initialCapacity, int increment) {}


  // ----- METHODS -----
  // Method that appends the element at the end of the vector object
  public void addElement(E o) {}

  // Method that returns the current capacity of the vector
  public int capacity() {}

// Method that copies the list elements into a given array
public void copyInto(Object[] arr) {}

// Method that returns an object at the specified index of the list
public void elementAt(int index) {}

// Method that returns an enumeration carrying the elements of the vector
public Enumeration<E> elements() {}

// Increases the capacity of the vector
public void ensureCapacity() {}

// Returns the first element of this vector
public E firstElement() {}

// Inserts the specified element at the specified position of the vector
public void insertElement(E obj, int index) {}

// Returns the last element of the vector
public E lastElement() {}

// Removes all the elements of the vector
public void removeAllElements() {}

// Removes the first matching element from the vector, and returns true if the object was removed
public boolean removeElement(E obj) {}

// Removes the element at the specified index
public boolean removeElementAt(int index) {}

// Sets a new given element at the specified index of the vector
public void setElementAt(E obj, int index) {}

// Sets the size of the vector
public void aetSize(int size) {}

// Trims the capacity of this vector to its size
public void trimToSize() {}
}
