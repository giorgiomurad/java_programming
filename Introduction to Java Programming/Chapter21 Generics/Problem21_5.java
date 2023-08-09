// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 21 : Generics
//
// Problem 21.5 : (Maximum element in an array)
//                Implement the following method that returns the maximum element in an array.
//
//                public static <E extends Comparable<E>> E max(E[] list)
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {

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