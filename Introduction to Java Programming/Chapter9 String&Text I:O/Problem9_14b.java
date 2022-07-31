// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.14b : Write a program that passes an unspecified number of integers delimited by one space
//				   in a string, and displays their total.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
      String[] values = args[0].split(" ");
      int sum;


      sum = 0;
      for (int i = 0; i < values.length; i++) {
          
         sum += Integer.parseInt(values[i]);
      }

      System.out.println("The total sum is " + sum);
   }
}