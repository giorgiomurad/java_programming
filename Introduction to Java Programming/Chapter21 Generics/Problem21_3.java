// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 21 : Generics
//
// Problem 21.3 : (Generic Selection Sort) Implement the following method using selection sort:
//
//                public static <E extends Comparable<E>> void selectionSort(E[] list)
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {

    }

    // Generic method that sorts the list of objects
    public static <E extends Comparable<E>> void selectionSort(E[] list) {
        E temp;

        for (int i = 0; i < list.length-1; i++) {
            for (int j = 1 + i; j < list.length; j++) {
                if (list[i].compareTo(list[j]) < 0) {
                    temp    = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}