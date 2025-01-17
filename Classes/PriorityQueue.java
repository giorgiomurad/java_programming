import java.util.PriorityQueue;


public class PriorityQueue<E> implements Queue<E> {
  // No-arg constructor that creates a default priority queue with initial capacity 11
  public PriorityQueue() {}

  // Constructor that creates a default priority queue with specified initial capacity
  public PriorityQueue(int initialCapacity) {}

  // Constructor that creates a priority queue with the given collection
  public PriorityQueue(Collection<? extends E> collection) {}

  // Constructor that creates a priority queue with specified initial capacity and comparator
  public PriorityQueue(int initialCapacity, Comparator<? super E> comparator) {}
}