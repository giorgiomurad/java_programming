public class StackOfIntegers {
    private int[] elements;     // Array to store integers
    private int size;           // Number of integers in the stack


    // No-arg constructor that constructs a stack with the default capacity
    public StackOfIntegers() {

        this(16);
    }

    // Constructor that constructs a stack with the specified capacity value
    public StackOfIntegers(int capacity) {

        // If the entered capacity is 0, the stack is constructed with capacity 16
        if (capacity == 0)
            elements = new int[16];

        // Otherwise, the stack is constructed based on the specified capacity
        else
            elements = new int[capacity];
    }



    // Method that returns true if the stack is empty
    public boolean empty() {

        return (size == 0);
    }


    // Method that returns the first integer in the stack
    public int peek() {

        return elements[0];
    }


    // Method that stores the integer into the top of the stack
    public void push(int element) {
        // 1) Incrementing Size
        size++;

        // 2) Checking if the stack requires more space to store the new element
        //    If yes, a newly formed array of a bigger capacity is assigned to the object's array
        if (size == elements.length) {
            int[] copy = new int[size * 2];

            for (int i = 0; i < size; i++)
                copy[i] = elements[i];

            elements = copy;
        }

        // 3) Making space for the new integer to be added as the first element of the stack
        for (int i = size; i > 0; i--)
            elements[i] = elements[i-1];

        // 4) Adding the new integer value as the first element of the array
        elements[0] = element;
    }


    // Method that removes the integer at the top of the stack, and returns it
    public int pop() {
        int del;    // Integer deleted from the stack

        // If the stack is empty, a null value is returned with an error message
        if (empty()) {

            System.out.println("Stack Empty");
            return 0;
        }

        else {
            // 1) Assigning the first stack element to the variable
            del = elements[0];

            // 2) Removing the first value from the stack
            for (int i = 0; i < size; i++)
                elements[i] = elements[i+1];

            // 3) Decrementing the size, and returning the value of the removed value
            size--;
            return del;
        }
    }


    // Method that returns the size of the stack
    public int getSize() {

        return size;
    }
}
