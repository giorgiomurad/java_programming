// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.18 : Write a program that can display the following table:
//                  a   |   b   |   a^b
//                  1   |   2   |   1
//                  2   |   3   |   8
//                  3   |   4   |   81
//                  4   |   5   |   1024
//                  5   |   6   |   15625
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int exp; // a exponent b


        // Printing Table
        System.out.println("a   |   b   |   a^b");

        a   = 1;
        b   = 2;
        exp = (int)(Math.pow(a, b));   // exp = 1
        System.out.println(a + "   |   " + b + "   |   " + exp);

        a   = b++;                     // a = 2, b = 3
        exp = (int)(Math.pow(a, b));   // exp = 8
        System.out.println(a + "   |   " + b + "   |   " + exp);

        a   = b++;                     // a = 3, b = 4
        exp = (int)(Math.pow(a, b));   // exp = 81
        System.out.println(a + "   |   " + b + "   |   " + exp);

        a   = b++;                     // a = 4, b = 5
        exp = (int)(Math.pow(a, b));   // exp = 1024
        System.out.println(a + "   |   " + b + "   |   " + exp);

        a   = b++;                     // a = 4, b = 5
        exp = (int)(Math.pow(a, b));   // exp = 15625
        System.out.println(a + "   |   " + b + "   |   " + exp);

    }
}