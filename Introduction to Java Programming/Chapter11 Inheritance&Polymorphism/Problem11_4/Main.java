// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Inheritance and Polymorphism
//
// Problem 11.4 : Create a class called MyStack that extends ArrayList.
//                The MyStack class contains:
//                - isEmpty() that verifies if the stack is empty
//                - size() that returns the size of the stack
//                - peek() that returns the first element of the stack
//                - pop() that returns, and removes the first element of the stack
//                - push() that adds the new element at the beginning of the list
//                - search() that returns the first index of the object in the stack
//
//                Write a test program that prompts the user to enter five string values,
//                stores them in the stack object, and displays all the elements in the
//                stack.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);   // Scanner that reads user input
        MyStack strs    = new MyStack();            // MyStack object


        // Prompting the user to enter five strings
        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++) {
            String temp = input.next();

            strs.push(temp);
        }

        System.out.println();

        // Displaying the strings
        System.out.println(strs.size());
        for (int i = 0; i < strs.size(); i++)
            System.out.print(strs.pop() + " ");
    }
}