// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.14a : Write a program that passes an unspecified number of integers into the main method,
//                 and displays their sum.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
       int sum;


       sum = 0;
       for (int i = 0; i < args.length; i++) {
          
          sum += Integer.parseInt(args[i]);
       }

       System.out.println("The total sum is " + sum);
   }
}