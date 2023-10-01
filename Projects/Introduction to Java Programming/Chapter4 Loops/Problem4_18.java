// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 4 : Loops
//
// Problem 4.18 : Using nested loops, write a program that displays the following patterns:
//                Pattern I     Pattern II      Pattern III     Pattern IV
//                1             1 2 3 4 5 6               1     1 2 3 4 5 6
//                1 2           1 2 3 4 5               2 1       1 2 3 4 5
//                1 2 3         1 2 3 4               3 2 1         1 2 3 4
//                1 2 3 4       1 2 3               4 3 2 1           1 2 3
//                1 2 3 4 5     1 2               5 4 3 2 1             1 2
//                1 2 3 4 5 6   1               6 5 4 3 2 1               1
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {


        // Displaying Pattern I
        System.out.println("Pattern I:");
        for (int i = 1; i <= 6; i++) {
           for (int j = 1; j <= i; j++) {

               System.out.print(j + " ");
           }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Displaying Pattern II
        System.out.println("Pattern II:");
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Displaying Pattern III
        System.out.println("Pattern III:");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {

                System.out.print("  ");
            }

            for (int k = i; k > 0; k--) {

                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Displaying Pattern VI
        System.out.println("Pattern VI:");
        for (int i = 6; i > 0; i--) {
            for (int j = 6; j > i; j--) {

                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++){

                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}