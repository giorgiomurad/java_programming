// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 21 : Generics
//
// Problem 21.6 : (Maximum element in a two-dimensional array)
//                Write a generic method that returns the maximum element in a two-dimensional array.
//
//                public static <E extends Comparable<E>> E max(E[][] list)
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {

    }

    // Generic method that returns the maximum element of a two-dimensional array
    public static <E extends Comparable<E>> E max(E[][] list) {
        E temp;
        
        temp = max(list[0]);
        for (E[] i : list)
            if (temp.compareTo(max(i)) < 0)
                temp = max(i);

        return temp;
    }

    // Generic method that returns the maximum element of an array
    public static <E extends Comparable<E>> E max(E[] list) {
        E temp;

        temp = list[0];
        for (E i : list)
            if (temp.compareTo(i) < 0)
                temp = i;

        return temp;
    }
}