// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.) (Edited)
// Thinking in Objects
//
// Problem 10.14 : Design a class named MyDate that contains:
//                  - Data fields representing year, month and day
//                  - A no-arg constructor that creates a MyDate object with the current date
//                  - A constructor that creates a MyDate object with the specified elapse time since Jan. 1, 1970
//                  - A constructor that creates a MyDate object with the specified year, month, and day
//                  - Three get methods for the three data fields year, month, and day
//                  - setDate(long elapseTime) that sets a new date using the specified elapse time
//                  - toString() method that returns a string with day, month, and year in format XX-XXX-XXXX
//                  (You can use java.util.GregorianCalender to help with implementing the class)
//
//                  Write a test program that creates three MyDate objects. One for the current date, the second
//                  with a given elapse time (34355555133101L), and the third with a given day, month, and year
//                  (18 2 1996)
//                  The program should then display the day, month, and year of each object
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        MyDate current = new MyDate();                               // Current Date
        MyDate elapse  = new MyDate(34355555133101L);     // Elapse Date
        MyDate date    = new MyDate(1996, 2, 18);   // Third Date


        System.out.println("Date 1:");
        System.out.println(current);
        System.out.println();

        System.out.println("Date 2:");
        System.out.println(elapse);
        System.out.println();

        System.out.println("Date 3:");
        System.out.println(date);
    }
}