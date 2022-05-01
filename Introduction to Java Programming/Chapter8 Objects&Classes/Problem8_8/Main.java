// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.) (Edited)
// Objects & Classes
//
// Problem 8.8 : Design a class that represents a fan.
//               The class includes:
//                  - Three constants: SLOW(1), MEDIUM(2), and HIGH(3) to denote fan speed
//                  - Data field that specifies the fans speed.                 (SLOW by default)
//                  - Data field that specifies whether the fan is on or off.   (Off by default)
//                  - Data field that specifies the radius of the fan           (5 by default)
//                  - Data field that specifies the color of the fan.           (Blue by default)
//                  - Accessor and mutator methods for all data fields.
//                  - A no-arg constructor that creates a default fan.
//                  - A constructor that creates a fan with specified radius and color.
//                  - A toString() method that returns a string containing all information of the fan.
//                    If the fan is on, the returned string would describe the fan's current speed, radius,
//                    and color. Otherwise, the returned string would only describe the fan's radius and color.
//
//               Write a program that creates two fan objects. The first fan should have radius 10, color yellow,
//               and assigned maximum speed. The second fan should be assigned medium speed, have radius 5, color
//               blue, and turned off.
//               The program should display information of the two fan's by invoking their toString() methods.
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {
        // Creating two fan objects
        Fan f1 = new Fan();
        Fan f2 = new Fan();


        // Modifying the first fan object
        f1.turnOn();
        f1.setSpeed(3);
        f1.setRadius(10);
        f1.setColor("Yellow");

        // Modifying the second fan object
        f2.turnOn();
        f2.setSpeed(2);
        f2.setRadius(5);
        f2.setColor("Blue");
        f2.turnOff();


        // Displaying the details of f1
        System.out.println("Fan 1:\n" + f1.toString());

        System.out.println();

        // Displaying the details of f2
        System.out.println("Fan 2:\n" + f2.toString());
    }
}