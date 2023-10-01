public class ArrayList {
    Object[] arr;   // Array of Class
    int capacity;   // Capacity of Array
    int size;       // Number of elements in the array


    // Constructor that creates an empty array list object
    public ArrayList() {

        size = 0;
        capacity = 15;
        arr = new Object[15];
    }

    // Method that returns true if the array list is empty, and false otherwise
    public boolean isEmpty() {

        return (size == 0);
    }

    // Method that adds the object into the list
    public void add(Object o) {

        if (isFull())
            increaseCapacity();

        arr[size] = o;
        size++;
    }

    // Method that adds the object into the specified index in the list
    public void add(int index, Object o) {

        if (isFull())
            increaseCapacity();

        if (index < size) {
            for (int i = size-1; i > index; i--)
                arr[i] = arr[i-1];

            arr[index] = o;
            size++;
        }
        else {

            System.out.println("Out of Bounds.");
        }
    }

    // Method that clears the list from all of its contents
    public void clear() {
        Object[] nArr = new Object[capacity];

        arr = nArr;
    }

    // Method that returns true if the object is in the list, false otherwise
    public boolean contains(Object o) {

        for (Object obj : arr)
            if (obj.equals(o))
                return true;

        return false;
    }

    // Method that returns the object at the specified index
    public Object get(int index) {

        if (index < size)
            return arr[index];

        else {
            System.out.println("Impossible.");

            return null;
        }
    }

    // Method that returns the index of the first matching object
    public int indexOf(Object o) {

        for (int i = 0; i < size; i++)
            if (arr[i].equals(o))
                return i;

        return -1;
    }

    // Method that returns the index of the last matching object
    public int lastIndexOf(Object o) {

        for (int j = size-1; j > 0; j++)
            if (arr[j].equals(o))
                return j;

        return -1;
    }

    // Method that removes the specified object from the list
    public void remove(Object o) {
        int index = indexOf(o);

        for (int i = index; i < size-1; i++)
            arr[i] = arr[i+1];

        size--;
    }

    // Method that returns the number of elements in the list
    public int size() {

        return size;
    }

    // Method that removes the object at the specified index
    public void remove(int index) {

        for (int i = index; i < size-1; i++)
            arr[i] = arr[i+1];

        size--;
    }

    // Method that sets the object at the specified index
    public Object set(int index, Object o) {

        if (index < size) {
            arr[index] = o;

            return o;
        }

        else {
            System.out.println("Out of Bounds.");

            return null;
        }
    }

    // Method that returns true if the list is full, false otherwise
    private boolean isFull() {

        return (size == capacity);
    }

    // Method that increases the capacity of the array without deleting its elements
    private void increaseCapacity() {
        Object[] old = new Object[size];

        for (int i = 0; i < size; i++)
            old[i] = arr[i];

        arr = new Object[capacity*2];
        for (int i = 0; i < old.length; i++)
            arr[i] = old[i];

        capacity *= 2;
    }
}
