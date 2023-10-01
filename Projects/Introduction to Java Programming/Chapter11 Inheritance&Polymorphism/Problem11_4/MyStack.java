import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    // Constructor for the MyStack object
    public MyStack() {
        super();
    }


    // Method that returns true if the stack is empty
    public boolean isEmpty() {

        return super.isEmpty();
    }

    // Method that returns the size of the stack
    public int size() {

        return super.size();
    }

    // Method that returns the first element of the stack
    public Object peek() {

        return super.get(0);
    }

    // Method that returns, and removes the first element from the stack
    public Object pop() {

        return super.remove(0);
    }

    // Method that adds the new object to the stack
    public void push(Object obj) {
        if (super.isEmpty()){

            super.add(obj);
        }
        else {
            int newSize = super.size() + 1;
            Object[] temp = new Object[newSize];

            temp[0] = obj;
            for (int i = 1; i <= super.size(); i++)
                temp[i] = super.get(i-1);

            super.clear();
            for (Object o : temp)
                super.add(o);
        }
    }

    // Method that returns the first index of the object in the stack
    public int search(Object obj) {

        return super.indexOf(obj);
    }
}
