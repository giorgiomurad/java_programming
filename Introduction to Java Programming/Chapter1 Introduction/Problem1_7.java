// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 1 : Introduction to Computers, Programs, and Java
//
// Problem 1.7 : pie can be computed using the following formula:
//
//                4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13
//
//               Write a program that displays the result of pie.
//
//
// Author : Giorgio Murad

public class Main {

    public static void main(String[] args) {

        //Displaying Result
        System.out.println(4 * (1 - 1/3.0 + 1/5.0 - 1/7.0 + 1/9.0 - 1/11.0 + 1/13.0));
    }
}