public class GenericStack<E> {
    private E[] myArray;
    private int capacity;
    private int size;


    // Constructor that initializes the generic stack object
    public GenericStack() {

        size    = 0;
        capacity = 10;
        myArray = (E[]) new Object[10];
    }


    // Method that returns the size of the stack object
    public int getSize() {

        return size;
    }

    // Method that returns true if the stack is empty
    // Otherwise, false is returned
    public boolean isEmpty() {

        return (size == 0);
    }

    // Method that returns true if the stack is full
    // Otherwise, false is returned
    public boolean isFull() {

        return (size == capacity);
    }

    // Method that returns the top element in the stack
    public E peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack.");

            return null;
        }
        else {
            E first;

            first = (E) myArray[0];
            return first;
        }
    }

    // Method that adds an element into the stack
    public void push(E obj) {
        if (isFull()) {
            capacity *= 2;
            E[] newArray = (E[]) new Object[capacity];

            System.arraycopy(myArray, 0, newArray, 0, size);
            myArray = newArray;
        }

        myArray[size++] = obj;
    }

    // Method that removes the top element of the stack, and returns it
    public E pop() {
        if (!isEmpty()) {
            E popped = myArray[0];
            E[] newArray = (E[]) new Object[capacity];

            System.arraycopy(myArray, 1, newArray, 0, size);
            size--;

            myArray = newArray;
            return popped;
        }
        else {
            System.out.println("Empty Stack");

            return null;
        }
    }
}