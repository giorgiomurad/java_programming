import java.util.LinkedList;

public class LinkedList<E> {

    // Constructor that creates an empty linked list
    public LinkedList() {}

    // Constructor that creates a linked list from an existing collection
    public LinkedList(Collection<? extends E> c) {}


    // Method that adds an object to the head of the list
    public void addFirst(E o) {}

    // Method that adds an object to the tail of the list
    public void addLast(E o) {}

    // Method that returns the first element
    public E getFirst() {}

    // Method that returns the last element
    public E getLast() {}

    // Method that removes the first element
    public E removeFirst() {}

    // Method that removes the last element
    public E removeLast() {}
}