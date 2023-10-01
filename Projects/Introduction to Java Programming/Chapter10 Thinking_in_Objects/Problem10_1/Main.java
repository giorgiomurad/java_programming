// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.) (Edited)
// Thinking in Objects
//
// Problem 10.1 : Design a class named Time. The class includes:
//                  - Data fields: hour, minute, and second
//                  - No-arg constructor that creates a time object for the current time
//                  - A constructor that creates a time object with the specified elapse time
//                    since midnight of Jan 1, 1970, in milliseconds.
//                  - A constructor that constructs a time object with the specified hour, minute,
//                    and second.
//                  - A method named setTime(long elapseTime) that sets a new time for the object.
//                  - A toString() method that returns a string that includes the object's hour,
//                    minute, and second values.
//
//                  A test program should create three different Time objects, and display their
//                  results.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        // Creating three different time objects
        Time t1 = new Time();
        Time t2 = new Time(567890);
        Time t3 = new Time(6, 45, 15);


        // Display hours, minutes, and seconds for each time object
        System.out.println("Time 1:");
        System.out.println(t1);
        System.out.println();

        System.out.println("Time 2:");
        System.out.println(t2);
        System.out.println();

        System.out.println("Time 3:");
        System.out.println(t3);
    }
}