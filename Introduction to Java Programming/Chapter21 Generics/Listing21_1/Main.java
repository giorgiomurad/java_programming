// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Generics
//
// Listing 21.1 : Create a custom stack class called GenericStack that can generalize any element type with
//                a generic type.
//
//
// Author : Giorgio Murad

class Main {
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