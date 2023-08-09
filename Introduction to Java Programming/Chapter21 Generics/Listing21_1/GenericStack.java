import java.util.ArrayList;

public class GenericStack<E> {
    private ArrayList<E> arrayList;


    // Constructor that initializes the generic stack object
    public GenericStack() {

        arrayList = new ArrayList<E>();
    }


    // Method that returns the size of the stack object
    public int getSize() {

        return arrayList.size();
    }

    // Method that returns true if the stack is empty
    // Otherwise, false is returned
    public boolean isEmpty() {

        return arrayList.isEmpty();
    }

    // Method that returns the top element in the stack
    public E peek() {

        return arrayList.get(getSize() - 1);
    }

    // Method that adds an element into the stack
    public void push(E obj) {

        arrayList.add(obj);
    }

    // Method that removes the top element of the stack, and returns it
    public E pop() {
        E del = peek();
        arrayList.remove(del);

        return del;
    }
}