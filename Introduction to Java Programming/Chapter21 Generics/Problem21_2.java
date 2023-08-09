// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 21 : Generics
//
// Problem 21.2 : (Generic Binary Search) Implement the following method using binary search:
//
//                  public static <E extends Comparable> int binarySearch(E[] list, E key)
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {

    }

    // Binary search method that locates the object in an array of objects, and returns
    // the index.
    // If the object was not found, the method returns -1
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int position;

        position = -1;
        for (int i = 0; i < list.length; i++)
            if (list[i].compareTo(key) == 0)
                position = i;

        return position;
    }
}