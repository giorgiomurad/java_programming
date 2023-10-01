// Fan Class
public class Fan {
    private static final int SLOW   = 1;    // Slow Speed
    private static final int MEDIUM = 2;    // Medium Speed
    private static final int FAST   = 3;    // Fast Speed

    private boolean on;     // On or Off
    private int speed;      // Fan Speed
    private double radius;  // Fan Radius
    private String color;   // Fan Color



    // No-arg constructor that creates a default fan
    public Fan() {

        setSpeed(SLOW);
        setRadius(5);
        setColor("Blue");
    }

    // Constructor that creates a fan with specified radius and color
    public Fan(double newRadius, String newColor) {

        setSpeed(SLOW);
        setRadius(newRadius);
        setColor(newColor);
    }


    // Method that turns the fan on
    public void turnOn() {

        on = true;
    }

    // Method that sets the fan's speed
    public void setSpeed(int newSpeed) {

        if (on) {
            switch (newSpeed) {
                case 1:
                    speed = SLOW;
                    break;

                case 2:
                    speed = MEDIUM;
                    break;

                case 3:
                    speed = FAST;
                    break;

                default:
            }
        }
    }

    // Method that sets the fan's radius
    public void setRadius(double newRadius) {

        radius = newRadius;
    }

    // Method that sets the fan's color
    public void setColor(String newColor) {

        color = newColor;
    }

    // Method that turns the fan off
    public void turnOff() {

        on = false;
    }

    // Method that returns the fan's speed
    public int getSpeed() {

        return speed;
    }

    // Method that returns the fan's radius\
    public double getRadius() {

        return radius;
    }

    // Method that returns the fan's color
    public String getColor() {

        return color;
    }

    // Method that returns the fan's description
    public String toString() {
        String result = "";

        if (on) {

            result = String.format("Speed \t %d" +
                    "\nRadius \t %.2f" +
                    "\nColor \t %s",
                    speed, radius, color);
        }
        else {

            result = String.format("Fan is off" +
                    "\nRadius \t %.2f" +
                    "\nColor \t %s",
                    radius, color);
        }

        return result;
    }
}
