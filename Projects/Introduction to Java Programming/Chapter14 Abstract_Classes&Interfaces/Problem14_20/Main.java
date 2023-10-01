// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Abstract Classes & Interfaces
//
// Problem 14.20 : Write a program that runs from the command prompt.
//                 The program should represent a calculator for rational numbers.
//                 The user inputs the operation of two rational numbers (1/2 + 1/3), and the program
//                 displays the result (5/6).
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        String n1 = args[0];    // First Number
        String op = args[1];    // Operator
        String n2 = args[2];    // Second Number


        // Creating the first rational object
        String[] numbers1 = n1.split("/");
        long value11 = Long.parseLong(numbers1[0]);
        long value12 = Long.parseLong(numbers1[1]);
        Rational r1 = new Rational(value11, value12);

        // Creating the second rational object
        String[] numbers2 = n2.split("/");
        long value21 = Long.parseLong(numbers2[0]);
        long value22 = Long.parseLong(numbers2[1]);
        Rational r2 = new Rational(value21, value22);


        // Executing the operation
        Rational result = switch(op) {
            case "+" -> r1.add(r2);
            case "-" -> r1.subtract(r2);
            case "*" -> r1.multiply(r2);
            case "/" -> r1.divide(r2);
            default -> new Rational();
        };

        // Printing result
        System.out.printf("%s \t %s \t  %s \t = \t %s \n", r1, op, r2, result.simplify());
    }
}