import java.util.Iterator<E>;

// Returns true if the current element is followed by another element
public abstract boolean hasNext();

// Returns the next element from this iterator
public abstract E next();

// Removes the last element obtained using the 'next' method
public abstract void remove();