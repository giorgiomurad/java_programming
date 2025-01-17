import java.util.Queue;

import java.util.Collection;

public interface Queue<E> implements Collection<E> {

  // Method that inserts an element into the queue
  public boolean offer(E element) {}
  
  // Retrieves and removes the head of the queue
  // Returns null if the queue is empty
  public E poll() {}

  // Retrieves and removes the head of the queue
  // Throws an exception if the queue is empty
  public E remove() {}

  // Method that returns the head of the queue
  // Returns true if the queue is empty
  public E peek() {}

  // Method that returns the head of the queue
  // Throws an exception if the queue is empty
  public E element() {}
}