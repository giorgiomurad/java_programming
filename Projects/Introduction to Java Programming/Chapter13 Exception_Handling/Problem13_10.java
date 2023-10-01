// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Exception Handling
//
// Problem 13.10 : Write a program that causes the JVM to throw an OutOfMemoryError error, which is
//                 to be handled by the program before it is terminated.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        int[] integers;     // Array of Integers

        try {
            integers = new int[500000000];

        } catch (Error err) {

            System.out.println("Array length too large for the memory to handle.");
        } finally {

            System.out.println("Program Closed");
        }
    }
}