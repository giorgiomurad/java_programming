// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 21 : Generics
//
// Problem 21.1 :  Revise the GenericStack class in Listing 21.1 to implement it using an array
// rather than an ArrayList. You should check the array size before adding a new element to the stack.
// If the array is full, create a new array that doubles the current array size and copy the elements
// from the current array to the new array.
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {

        // Creating a generic stack object of type String
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("Giorgio");
        stack1.push("Simon");
        stack1.push("Jacob");
        stack1.push("Angela");

        // Creating another generic stack object of type Integer
        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(35);
        stack2.push(60);
        stack2.push(90);
        stack2.push(350);
    }
}