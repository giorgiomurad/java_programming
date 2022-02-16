// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 4 : Loops
//
// Problem 4.19 : Using a nested for-loop, Write a program that displays the following pyramid:
//
//                                              1
//                                          1   2   1
//                                      1   2   4   2   1
//                                  1   2   4   8   4   2   1
//                              1   2   4   8  16   8   4   2   1
//                          1   2   4   8  16  32  16   8   4   2   1
//                      1   2   4   8  16  32  64  32  16   8   4   2   1
//                  1   2   4   8  16  32  64 128  64  32  16   8   4   2   1
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {
        int temp;       // Temporary Variable
        int rows = 8;   // Number of Rows


        // Displaying Pyramid
        for (int i = 1; i <= rows; i++) {
            temp = 1;

            for (int j = rows; j > i; j--) {

                System.out.printf("%3s ", " ");
            }

            for (int k = 1; k <= i; k++) {

                System.out.printf("%3d ", temp);
                temp *= 2;
            }

            temp /= 2;
            for (int z = i - 1; z > 0; z--) {

                temp /= 2;
                System.out.printf("%3d ", temp);
            }
            System.out.println();
        }
    }
}