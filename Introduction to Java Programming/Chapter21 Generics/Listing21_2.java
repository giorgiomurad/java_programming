// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Generics
//
// Listing 21.2 : Using generic types, define a generic method that prints all elements of an array
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        // Creating an integer array
        Integer[] nbs     = {1, 2, 3, 4, 5};
        String[] names    = {"Giorgio", "Sam", "Karen"};

        // Displaying the numbers and the names
        print(nbs);
        print(names);
    }

    // Generic method that prints all elements of an array
    public static <E> void print(E[] list) {

        for (E i : list)
            System.out.print(i + " ");
        System.out.println();
    }
}